console.log('user.js');

vote_app.factory('UserFactory', function($http, $location){
	var factory = {};

	factory.index = function(callback){
		$http.get('/users')
		.then(function(output){
			callback(output);
		})
	}

	factory.create = function(info, callback){
		$http.post('/users', info)
		.then(function(output){
			callback(output);
		})
	}

	factory.show = function(path, callback){
		// console.log("User Show fact");
		$http.get(path)
		.then(function(output){
			console.log(output);
			callback(output);
		})
	}

	return factory;
})