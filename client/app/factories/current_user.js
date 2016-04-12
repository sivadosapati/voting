console.log('current_user.js');

vote_app.factory('CurrentFactory', function($http, $location){
	var factory = {};
	var current_user;
	factory.setCurrentUser = function(user){
		current_user = user;
	}

	factory.getCurrentUser = function(){
		if(current_user == null){
			$location.path('/');
		}
		return current_user;
	}

	factory.logout = function(){
		current_user = {};
	}

	return factory;
})