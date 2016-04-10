User
{
	name:String,
	email:String,
	_channels:[{channel IDs}],
	votes:[{channel: id, vote_count: Number}],
}

Channel
{
	name: String,
	description: String,
	vote_limit: Number,
	_user: {reference user_id}

	question :
	[{
		title: String,
		description: String,
		_user: {reference user_id},
		votes:[{user: id, vote_count: Number}],

		solution:
		[{
			content: String,
			_user: {reference user_id},
			votes:[{user: id, vote_count: Number}]
		}]
	}]
}