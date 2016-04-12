console.log('channel.js');

vote_app.factory('ChannelFactory', function($http, $location){
	var factory = {};
	var channel = [];

	factory.index = function(callback) {
		$http.get('/channels')
		.then(function(output){
			console.log('*********************');
			console.log(output.data);
			callback(output.data);
		})
	}

	factory.create = function(info, callback){
		$http.post('/channels', info)
		.then(function(output){
			callback(output);
		})
	}

	factory.update = function(info, callback){
		// console.log(info);
		$http.put('/channel', info)
		.then(function(output){
			callback(output);
		})
	}

	factory.delete = function(info, callback){
		// console.log("THIS IS THE ID");
		// console.log(info);
		$http.post('/channel/delete', info)
		.then(function(output){
			callback(output);
		})
	}

	factory.show = function(callback){
		// console.log($location.path);
		$http.get($location.path())
		.then(function(output){
			callback(output);
		})
	}

	return factory;
})