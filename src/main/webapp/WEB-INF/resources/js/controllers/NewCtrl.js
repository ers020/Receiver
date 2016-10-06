/**
 * 
 */
theAudits.controller("NewCtrlAudit", ["$scope", "$http", function($scope, $http){
	
	$http.get("http://localhost:7001/Receiver/api/audits").success(
			function(resp){
				$scope.theAudits = resp;
				
				
			}

	)
}]);