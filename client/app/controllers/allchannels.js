console.log('allchannels.js');

vote_app.controller('AllChannelController', function($scope, ChannelFactory, UserFactory, CurrentFactory){
	$scope.current_user = CurrentFactory.getCurrentUser();
	console.log($scope.current_user);
	console.log("BROKED");
	$scope.channels = ChannelFactory.index();

	$scope.logout = function(){
		CurrentFactory.logout();
		$scope.current_user = {};
		$window.location.href = '#/';
	}
})