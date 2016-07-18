'use strict';

angular.module('userApp', ['userService']).
        config(['$routeProvider', function ($routeProvider) {
    $routeProvider.
            when('/user/new', {templateUrl:'views/NewUser.html', controller:NewUserController}).
            otherwise({redirectTo:'/user/new'});
}]);