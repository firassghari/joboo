'use strict';

angular.module('userService', ['ngResource']).
        factory('User', function ($resource) {
            return $resource('rest/user/:id', {}, {
                'save': {method: 'POST'},
                'list': {method: 'GET'},
                'up': {method: 'PUT'}
            });
        });