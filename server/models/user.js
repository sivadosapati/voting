console.log('user.js');

var mongoose = require('mongoose');
var Schema = mongoose.Schema;

var UserSchema = new mongoose.Schema({
	name: {type: String, required: true, unique: true},
	_channels: [{type: Schema.Types.ObjectId, ref: 'Channel', default: []}],
	votes:[{channel: {type: Schema.Types.ObjectId, ref: 'Channel'}, vote_count: Number}],
})

mongoose.model('User', UserSchema);