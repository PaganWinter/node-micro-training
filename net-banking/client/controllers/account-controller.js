AccountApp.controller("AccountController", ['$scope', 'CustomerService', 'AccountService', function($scope, CustomerService, AccountService) {
  $scope.addAccount = function(account) {
    console.log("Saving account", account)
    var addAccountPromise = AccountService.getAddAccountPromise(account)
    addAccountPromise.then(function(result) {
      console.log("Saved Account", result.data)
//      console.log("AccountController", result)

      var acctListPromise = AccountService.getAccountListPromise()
      acctListPromise.then(function(result) {
//        console.log("AccountController", result)
        $scope.accounts = result.data
      })
    })
  }

  var custListPromise = CustomerService.customerList()
  custListPromise.then(function(result) {
//    console.log("AccountController", result)
    $scope.status = "Got all Customers"
    $scope.customers = result.data
    $scope.custMap = {}
    for (var i in $scope.customers) {
      $scope.custMap[$scope.customers[i]['_id']] = $scope.customers[i]
    }
//    console.log($scope.custMap)
  })

  var acctListPromise = AccountService.getAccountListPromise()
  acctListPromise.then(function(result) {
//    console.log("AccountController", result)
    $scope.status = "Got all Accounts"
    $scope.accounts = result.data
  })

}]);
