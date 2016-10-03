/**
 * 
 */

angular.module("theAudits")
	.constant("userListActiveClass", "btn-primary")
	.constant("userListPageCount", 10)
	.controller("userListCtrl", function($scope, $filter, userListActiveClass, userListPageCount){
		var selectedUser = null;
		
		$scope.selectedPage = 1;
		$scope.pageSize = userListPageCount;
		
		$scope.selectUser = function (newUser){
			selectedUser = newUser;
			$scope.selectedPage = 1;
		}
		
		$scope.selectPage = function (newPage){
			$scope.selectedPage = newPage;
		}
		
		$scope.userFilterFn = function(theAudit){
			return selectedUser == null ||  theAudit.email == selectedUser;
		}
		
		$scope.getUserClass = function(user){
			return selectedUser == user ? userListActiveClass : "";
		}
		
		$scope.getPageClass = function(page){
			return $scope.selectedPage == page ? userListActiveClass : "";
		}
		
	});