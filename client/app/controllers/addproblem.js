console.log('addproblem.js');

vote_app.controller('AddProblemController', function($scope, ChannelFactory, UserFactory, CurrentFactory){
	$scope.current_user = CurrentFactory.getCurrentUser();
	
	$scope.addProblem = function(){
		$scope.problem._user = $scope.current_user;
		$scope.problem.channel_id = $scope.channel._id;
		ChannelFactory.update($scope.problem, function(data){
			$window.location.href = '#/channel/' + data.data._id;
			$scope.channel = data.data;
			$scope.current_user = CurrentFactory.getCurrentUser();
		})
	}

	$scope.logout = function(){
		CurrentFactory.logout();
		$scope.current_user = {};
		$window.location.href = '#/';
	}
})