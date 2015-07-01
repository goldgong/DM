
	angular.module('dm').controller('dmCtrlDetailF', function ($scope,$routeParams,$location, $window, $timeout, dmService) {

        var vm = this;
        vm.datas = [];
        
        var params = $routeParams.params;

        vm.navigate = function (url) {
            $location.path(url);
        };

        function init() {
        	vm.searchDataDetailF();
        }
        
        vm.searchDataDetailF= function(){
        	dmService.searchDataDetailF(params).then(
            
            function (datas) {
            	vm.datas = datas;
            }, 
            
            function (error) {
                $window.alert('Sorry, an error occurred: ' + error.data.message);
            });
        };

        init();
    });
