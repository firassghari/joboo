'use strict';

function NewUserController($scope, $location, User) {
    $scope.submit = function () {
        User.save($scope.user, function (user) {
            $location.path('/');
        });

    }
}
function ListUserController($scope, $location, User) {
    $scope.users = User.query();
}
function EditUserController($scope, $location, User, $routeParams) {
    $scope.user = User.get({id: $routeParams.id}, function (user) {
    });
    $scope.submit = function () {
        User.save($scope.user, function (user) {
            $location.path('/');
        });
    }
}