'use strict';

var monApp = angular.module('monApp', ['ngRoute' ,'userService']);
monApp.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.
            when('/user/new', {templateUrl:'views/NewUser.html', controller:NewUserController}).
            otherwise({redirectTo:'/user/new'});
}]);