angular.module('dm').directive('dmList', function($compile) {

	return {
		restric:'ECMA',
		link : function(scope, element, attrs) {
			var listName = attrs["dmList"];

			scope.getContentUrl = function() {
				if (listName == 'mainList') {
					return 'mvc/app/dm/views/dm/acceptanceList.html';
					
				}else if(listName == 'detailListF'){
					return 'mvc/app/dm/views/dm/acceptanceDetailListF.html';
				}
			};

			var template = '<div ng-include="getContentUrl()"></div>';

			var linkFn = $compile(template);
			var content = linkFn(scope);
			
			element.append(content);
		}
	};
});