'use strict';

var monApp = angular.module('monApp', ['ngRoute' ,'userService']);
monApp.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.
            when('/user/new', {templateUrl:'views/NewUser.html', controller:NewUserController}).when('/user/list', {
        templateUrl: 'views/ListUser.html',
        controller: ListUserController
    }).
            otherwise({redirectTo:'/user/new'});
}]);