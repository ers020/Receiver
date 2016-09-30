/**
 * Controller for main.html
 */

audits.controller("AuditCtrl", ["$scope", "$http", function($scope, $http){
	
	$http.get("http://localhost:7001/Receiver/api/audits").success(
			function(resp){
				$scope.audits = resp;
				$("#loading").hide();
				
				
			}
	);
}]);

