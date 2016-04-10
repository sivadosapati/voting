console.log("partialRoutes.js");

var vote_app = angular.module('vote_app', ['ngRoute']);

vote_app.config(function($routeProvider){
	$routeProvider
	.when('/', {
		templateUrl: '/static/partials/login.html'
	})
	.when('/channel/new',{
		templateUrl: '/static/partials/new_channel.html'
	})
	.when('/channel/:id', {
		templateUrl: '/static/partials/channel.html'
	})
	.when('/channels', {
		templateUrl: '/static/partials/allchannels.html'
	})
	.when('/create', {
		templateUrl: '/static/partials/create.html'
	})
	// .when('/user/:id', {
	// 	templateUrl: '/static/partials/user.html'
	// })
	.when('/userlist', {
		templateUrl: '/static/partials/userlist.html'
	})
	.otherwise({
		redirectTo: '/'
	});
})