
var app = angular.module('dm', ['ngRoute']);

    app.config(['$routeProvider', function ($routeProvider) {
    	
        var viewBase = '/mvc/app/dm/views/';
        
        $routeProvider
            .when('/list', {
                controller: 'dmCtrl',
                templateUrl: viewBase + 'dm/acceptanceManagement.html',
                controllerAs:'vm'
            })
            .when('/acceptanceManagementDetailF/:params', {
                controller: 'IsuCtrlDetailF',
                templateUrl: viewBase + 'dm/acceptanceManagementDetailF.html',
                controllerAs:'vm'
            })
            .otherwise({ redirectTo: '/list' });
        
    }]);