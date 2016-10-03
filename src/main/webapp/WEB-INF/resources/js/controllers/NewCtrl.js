/**
 * 
 */
theAudits.controller("NewCtrlAudit", ["$scope", "$http", function($scope, $http){
	
	$http.get("http://localhost:7001/ReceiverTest/api/audits").success(
			function(resp){
				$scope.theAudits = resp;
				
				
			}

	)
}]);