CustomerApp.controller("CustomerController", ['$scope', '$http', 'CustomerService', function($scope, $http, CustomerService) {
  $scope.addCustomer = function(customer) {
    console.log(customer)
    var addCustPromise = $http({
      url: "http://localhost:3000/customers",
      method: "POST",
      data: customer
    });
    addCustPromise.then(function(result) {
      console.log(result)
      $scope.status = "Added Customer successfully"
      $scope.getCustomers()
    }).catch(function(err) {
      $scope.status = "Failed to add Customer"
      console.error(err)
    })
  }

/*
  CustomerService.customerList().then(function(result) {
    console.log("CustomerController", result)
    $scope.status = "Got all Customers"
    $scope.customers = result.data
  })
*/
  $scope.test = function(selectedCustomer) {
    console.log(selectedCustomer)
    $scope.customer = selectedCustomer
  }

  $scope.getCustomers = function() {
    var custListPromise = CustomerService.customerList()
    custListPromise.then(function(result) {
      console.log("CustomerController", result)
      $scope.status = "Got all Customers"
      $scope.customers = result.data
    })
/*
    var getCustPromise = $http({
      url: "http://localhost:3000/customers",
      method: "GET"
    });
    getCustPromise.then(function(result) {
      console.log(result)
      $scope.status = "Got all Customers"
      $scope.customers = result.data
    }).catch(function(err) {
      console.error(err)
      $scope.status = "Failed to get Customers"
    })
*/
  }
}]);
