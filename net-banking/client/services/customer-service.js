CustomerApp.service("CustomerService", ['$http', function($http) {
  var customerListPromise = function() {
    var getCustPromise = $http({
      url: "http://localhost:3000/customers",
      method: "GET"
    });
    getCustPromise.then(function(result) {
//      console.log("CustomerService", result)
      return result
    }).catch(function(err) {
      console.error(err)
    })
    return getCustPromise
  }
  return {
    customerList: customerListPromise
  }
}])