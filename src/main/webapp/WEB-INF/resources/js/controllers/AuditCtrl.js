/**
 * Controller for main.html
 */

audits.controller("AuditCtrl", ["$scope", "$http", function($scope, $http){
	
	$http.get("http://localhost:7001/Receiver/api/audits").success(
			function(resp){
				console.log("It looks like we made it.");
				$scope.audits = resp;
				console.log(resp);
				$("#loading").hide();
				
				
			}
	);
}]);

