console.log('allchannels.js');

vote_app.controller('AllChannelController', function($scope, ChannelFactory, UserFactory, CurrentFactory){
	$scope.current_user = CurrentFactory.getCurrentUser();
	$scope.channels = {test:"TESTING"};
	// console.log($scope.current_user);
	// console.log("BROKED");
	var all_user = function(){
		ChannelFactory.index(function(data){
			$scope.channels = data;
			console.log("SCOPE");
			console.log($scope);
		});
	}

	all_user();

	$scope.logout = function(){
		CurrentFactory.logout();
		$scope.current_user = {};
		$window.location.href = '#/';
	}
})