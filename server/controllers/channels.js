console.log('channels.js');

var mongoose = require('mongoose');
var Channel = mongoose.model('Channel', []);
var User = mongoose.model('User', []);

module.exports = (function(){
	return {
		index: function(req, res){
			Channel.find({})
			.populate('_user')
			.exec(function(err, results){
				if(err){
					console.log(err);
				} else {
					res.json(results);
				}
			})
		},
		show: function(req, res){
			Channel.findOne({_id: req.params.id}, function(err, results){
				if(err){
					console.log(err);
				} else {
					// console.log(results);
					res.json(results);
				}
			})
		},
		create: function(req, res){
			
			var channel = new Channel(req.body);
			channel.save(function(err){
				if(err){
					console.log(err);
				} else {
					res.json(channel);
				}
			});
			
		},
		// delete: function(req, res){
		// 	console.log("THISISTHEBODY");
		// 	console.log(req.body);
		// 	Game.remove({_id: req.body._id}, function(err, results){
		// 		if(err){
		// 			console.log(err);
		// 		} else {
		// 			res.json(results);
		// 		}
		// 	})
		// },
		// update: function(req, res){
		// 	// console.log(req.body);
		// 	Game.findOne({_id: req.body.game._id}, function(err, results){
		// 		if(err){
		// 			console.log(err);
		// 		} else {
		// 			// console.log("FIRST");
		// 			if(results.user1._user == req.body.user._id){
		// 				// console.log("SECOND");
		// 				results.user1.answer = req.body.answer;
		// 			} else {
		// 				// console.log("THIRD");
		// 				results.userA.answer = req.body.answer;
		// 				// console.log(results.userA);
		// 				// console.log(results.user1);
		// 			}

					
		// 			results.save(function(err){
		// 				if(err){
		// 					console.log(err);
		// 				} else {
		// 					// console.log("**************************************");
		// 					// console.log(results);
		// 					if(results.user1.answer && results.userA.answer){
		// 						// console.log("FOURTH");

		// 						var points = table[results.user1.answer][results.userA.answer];
		// 						User.findOne({_id: results.user1._user}, function(err, user){
		// 							// console.log("FIFTH");
		// 							// console.log(points);
		// 							// console.log(user.score);
		// 							user.score -= points;
		// 							console.log(results._id);
		// 							user._games.push(results._id);
		// 							console.log(user._games);
		// 							user.save(function(err){
		// 								if(err){
		// 									console.log(err);
		// 								}
		// 								// console.log("SIXTH");
		// 								// console.log(user);
		// 							})
		// 						})
		// 						User.findOne({_id: results.userA._user}, function(err, user){
		// 							// console.log("SEVENTH");
		// 							// console.log(points);
		// 							// console.log(user.score);
		// 							user.score += points;
		// 							user._games.push(results._id);
		// 							// console.log(user.score);
		// 							user.save(function(err){
		// 								if(err){
		// 									console.log(err);
		// 								}
		// 								// console.log("EIGTH");
		// 								// console.log(user);
		// 							})
		// 						})
		// 					}
		// 					console.log("NINTH");
		// 					res.json(results);
		// 				}
		// 			})
		// 		}
		// 	})
		// }
	}
})()