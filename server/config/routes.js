console.log('routes.js');

var users = require('./../controllers/users.js');
var channels = require('./../controllers/channels.js');

module.exports = function(app){
	app.get('/', function(req, res){

	});

	app.get('/user/:id', function(req, res){
		users.show(req, res);
	});

	app.post('/users', function(req, res){
		users.create(req, res);
	})

	// app.put('/users', function(req, res){
	// 	users.update(req, res);
	// })

	app.get('/channel/:id', function(req, res){
		channels.show(req, res);
	})

	app.get('/users', function(req, res){
		users.index(req, res);
	})

	app.get('/channels'), function(req, res){
		channels.index(req, res);
	}

	app.post('/channels', function(req, res){
		channels.create(req, res);
	})

	app.put('/channels', function(req, res){
		channels.update(req, res);
	})

	// app.post('/channels/delete', function(req, res){
	// 	console.log("ROUTES DELETE");
	// 	console.log(req.body);
	// 	channels.delete(req, res);
	// })
};