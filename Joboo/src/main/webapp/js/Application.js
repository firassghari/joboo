'use strict';

var monApp = angular.module('monApp', ['ngRoute' ,'userService']);
monApp.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/user/new', {templateUrl: 'views/NewUser.html', controller: NewUserController})
        .when('/user/list', {
        templateUrl: 'views/ListUser.html',
        controller: ListUserController
        }).when('/user/list', {
        templateUrl: 'views/ListUser.html',
        controller: ListUserController
    }).when('/user/:id', {
        templateUrl: 'views/EditUser.html',
        controller: EditUserController
    })
        .otherwise({redirectTo: '/user/new'});
}]);