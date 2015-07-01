
	angular.module('dm').controller('dmCtrl', function ($scope,$location, $window, $timeout, dmService) {

        var vm = this;
        vm.datas = [];

        vm.navigate = function (url) {
            $location.path(url);
        };

        function init() {
        	//vm.searchData();
        }
        
        function acceptanceManagement() {
        	dmService.acceptanceManagement().then(
            
            function (data) {
            	console.log(data);
            },
            
            function (error) {
                $window.alert('Sorry, an error occurred: ' + error.data.message);
            });
        }

        vm.searchData= function(){
        	dmService.searchData().then(function (datas) {
                vm.datas = datas;

            }, function (error) {
                $window.alert('Sorry, an error occurred: ' + error.data.message);
            });
        };

        init();
    });
