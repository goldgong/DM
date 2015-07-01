
	angular.module('dm').factory('dmService',function($http, $q) {
		
		var serviceBase = '/rest/', factory = {};

		factory.searchData = function(params) {
			return getPagedResource('dm/list');
		};

		function getPagedResource(baseResource) {
			
			var deferred = $q.defer();
			
			$http.get(serviceBase + baseResource).then(function(response) {
				if (response.status == 200) {
					var datas = response.data;
					deferred.resolve(datas);
				} else {
					deferred.reject('Error retrieving list of meals');
				}
			});
			
			return deferred.promise;
		}

		return factory;
	});
