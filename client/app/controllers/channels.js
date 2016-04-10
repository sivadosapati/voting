console.log('channels.js');

vote_app.controller('ChannelController', function($scope, $location, $window, ChannelFactory, UserFactory, CurrentFactory){
	$scope.current_user = CurrentFactory.getCurrentUser();

	$scope.newChannel = function(){
		var info = {
			name: $scope.new_channel.name,
			description: $scope.new_channel.description,
			vote_count: $scope.new_channel.vote_count,
			_user: $scope.current_user._id,

		}
		
		ChannelFactory.create(info, function(data){

			// console.log(data.data);
			
			$window.location.href = '#/channel/' + data.data._id;
			$scope.channel = data.data;
			$scope.current_user = CurrentFactory.getCurrentUser();
		})
	}


	$scope.newProblem = function(problem){
		var info = {user: $scope.current_user, problem: problem, channel: $scope.channel}
		// console.log("CHOOSOPITION");
		ChannelFactory.update(info, function(data){
			// console.log("CHOOSOPITION2222222");
			$scope.channel = data.data;
		})
	}

	$scope.logout = function(){
		CurrentFactory.logout();
		$scope.current_user = {};
		$window.location.href = '#/';
	}

	var path = $location.path();
	if(path.substring(0,9) == '/channel/'){
		// $scope.channel._id = path.substring(7,path.length);
		ChannelFactory.show(function(data){
			$scope.channel = data.data;
			$scope.current_user = CurrentFactory.getCurrentUser();
		})
	} 


	if(path.substring(0,6) == '/user/'){
		// $scope.channel._id = path.substring(7,path.length);
		UserFactory.show(path, function(output){
			$scope.user = output.data;
		})
	} 
})