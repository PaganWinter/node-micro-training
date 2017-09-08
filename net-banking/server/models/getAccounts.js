require('./connection')

var getAccounts = function(custId) {
  var AccountModel = require('./schema').AccountModel
  var findPromise = AccountModel.find({}, {"__v": 0}).exec(function(err, result) {
    return result
  })
  return findPromise
}
module.exports = getAccounts

