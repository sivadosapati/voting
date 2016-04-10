console.log('users.js');

var mongoose = require('mongoose');
var User = mongoose.model('User', []);

module.exports = (function(){
	return {
		index: function(req, res){
			User.find({}, function(err, results){
				if(err){
					console.log(err);
				} else {
					res.json(results);
				}
			})
		},
		show: function(req, res){
			// console.log(req);
			User.findOne({_id: req.params.id})
			.populate({
				path: '_channel',
				model: 'Channel'
				// populate: {
				// 	path: 'userA._user user1._user',
				// 	model: 'User'
				// },
				// populate: {
				// 	path: 'user1._user', 
				// 	model: 'User'
				// }
			})
			.exec(function(err, results){
				if(err){
					console.log(err);
				} else {
					res.json(results);
				}
			})
		},
		create: function(req, res){
			var user = new User(req.body);
			user.save(function(err){
				if(err){
					if (err.code == 11000){
						User.findOne({name: req.body.name}, function(err, results){
							res.json(results);
						})
					}
					console.log(err);
				} else {
					res.json(user);
				}
			})
		}
	}
})()