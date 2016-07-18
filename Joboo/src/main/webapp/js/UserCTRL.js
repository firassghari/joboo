'use strict';

function NewUserController($scope, $location, User) {
    $scope.submit = function () {
        User.save($scope.user, function (user) {
            $location.path('/');
        });
    };