var app = angular.module('app', []);

app.controller('appController', function appController($scope) {
  $scope.message = 'hello world!';
});

app.filter('negative', function(){
    return function(x){
        return -1 * x;
    };
});