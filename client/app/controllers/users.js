console.log('users.js');

vote_app.controller('UserController', function($scope, $location, UserFactory, CurrentFactory){



	$scope.addUser = function(){
		UserFactory.create($scope.new_user, function(data){
			
			$location.path('/channels/');
			CurrentFactory.setCurrentUser(data['data']);
			$scope.current_user = CurrentFactory.getCurrentUser();
		});
	}

	$scope.index = function(){

		UserFactory.index(function(data){
			$scope.users = data.data;
		})
	}
})