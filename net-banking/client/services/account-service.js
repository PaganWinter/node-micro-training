AccountApp.service("AccountService", ['$http', function($http) {
  var addAccountPromise = function(account) {
    var addAccountResult = $http({
      url: "http://localhost:3000/accounts",
      method: "POST",
      data: account
    });
    addAccountResult.then(function(result) {
//      console.log("AccountService", result)
      return result
    }).catch(function(err) {
      console.error(err)
    })
    return addAccountResult
  }

  var getAccountListPromise = function() {
    var getAccountsResult = $http({
      url: "http://localhost:3000/accounts",
      method: "GET"
    });
    getAccountsResult.then(function(result) {
//      console.log("AccountService", result)
      return result
    }).catch(function(err) {
      console.error(err)
    })
    return getAccountsResult
  }

  return {
    getAddAccountPromise: addAccountPromise,
    getAccountListPromise: getAccountListPromise
  }
}])