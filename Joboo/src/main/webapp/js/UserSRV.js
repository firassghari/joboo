'use strict';

angular.module('todoService', ['ngResource']).
        factory('User', function ($resource) {
            return $resource('rest/user/:id', {}, {
                'save': {method:'PUT'}
            });
        });