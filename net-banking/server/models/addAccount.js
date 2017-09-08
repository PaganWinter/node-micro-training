require('./connection')

module.exports = function(acctData) {
  var addAccountPromise = new Promise(function(resolve, reject) {
    var AccountModel = require('./schema').AccountModel
    var CustomerModel = require('./schema').CustomerModel
    // Get primary key for customer (_id) from customer.id
    CustomerModel.findOne({customerRef: })

    var custPrimKeyId = ''

    acctData['_id'] = custPrimKeyId
    var acctObj = new AccountModel(acctData)

    acctObj.save(function(err, result) {
      if (err) reject(err)
      return resolve(result)
    })
  })
  return addAccountPromise
}
