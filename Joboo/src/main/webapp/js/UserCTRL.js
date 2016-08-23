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