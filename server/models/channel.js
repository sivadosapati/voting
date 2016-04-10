console.log('channel.js');

var mongoose = require('mongoose');
var Schema = mongoose.Schema;

var ChannelSchema = new mongoose.Schema({
	name: String,
	description: String,
	vote_limit: Number,
	_user: {type: Schema.Types.ObjectId, ref: 'User'},

	question :
	[{
		title: String,
		description: String,
		_user: {type: Schema.Types.ObjectId, ref: 'User'},
		votes:[{_user: {type: Schema.Types.ObjectId, ref: 'User'}, vote_count: Number}],
		

		solution:
		[{
			content: String,
			_user: {type: Schema.Types.ObjectId, ref: 'User'},
			votes:[{_user: {type: Schema.Types.ObjectId, ref: 'User'}, vote_count: Number}]
			
		}]
	}]
})

mongoose.model('Channel', ChannelSchema);