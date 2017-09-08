require('./connection')

module.exports = function(custData, callback) {
  var CustomerModel = require('./schema').CustomerModel
  var custObj = new CustomerModel(custData)

  custObj.save(function(err, result) {
    if (err) return callback(err)
    return callback(null, result)
  })
}
/*
var CustomerModel = require('./schema').CustomerModel
var custObj = new CustomerModel({
  id: 1234,
  name: "John Doe",
  email: "john.doe@example.com",
  phone: "+919820123456"
})

custObj.save(function(err, result) {
  if (err) return console.log("Error", err)
  console.log("Saved", result)
})
*/

