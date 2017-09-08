require('./connection')

module.exports = function(acctData) {
  var addAccountPromise = new Promise(function(resolve, reject) {
    var AccountModel = require('./schema').AccountModel
    var CustomerModel = require('./schema').CustomerModel

    // Get primary key for customer (_id) from customer.id
    var custId = parseInt(acctData.customerId)
    CustomerModel.findOne({id: custId}, function(err, custRecordRef) {
      console.log("Found customer from custer.id", custRecordRef)

      var acctObj = new AccountModel({
        num: acctData.num,
        type: acctData.type,
        balance: acctData.balance,
        customerRef: custRecordRef
      })

      acctObj.save(function(err, result) {
        if (err) reject(err)
        return resolve(result)
      })
    })
  })
  return addAccountPromise
}
