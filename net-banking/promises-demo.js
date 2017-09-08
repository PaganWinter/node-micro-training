require('./server/models/connection')

var addCustomer = function(custData) {
  var addCustPromise = new Promise(function(resolve, reject) {
    var CustomerModel = require('./server/models/schema').CustomerModel
    var custObj = new CustomerModel(custData)

    custObj.save(function(err, result) {
      if (err) reject(err)
      return resolve(result)
    })
  })
  return addCustPromise
}


var cust = {
  id: 12345678,
  name: "John Doe",
  email: "john.doe@example.com",
  phone: "+919820123456"
}
var custPro = addCustomer(cust)
custPro.then(function(result) {
  console.log(result)
}).catch(function(err) {
  console.error(err)
})
