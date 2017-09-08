require('./connection')

var getCustomers = function(custId) {
  var CustomerModel = require('./schema').CustomerModel
  var findPromise = CustomerModel.find({}, {"__v": 0}).exec(function(err, result) {
    return result
  })
  return findPromise
}
module.exports = getCustomers

