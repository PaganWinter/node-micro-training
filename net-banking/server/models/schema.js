var mongoose = require('mongoose')

var customerSchema = mongoose.Schema({
  id: {
    type: Number,
    unique: true
  },
  name: String,
  email: String,
  phone: String
})
var accountSchema = mongoose.Schema({
  num: {
    type: Number,
    unique: true
  },
  type: String,
  balance: Number,
  customerRef: [{
    type: mongoose.Schema.Types.ObjectId,
    ref: 'customer'
  }]
})
var customerModel = mongoose.model('customer', customerSchema)
var accountModel = mongoose.model('account', accountSchema)

module.exports = {
  CustomerModel: customerModel,
  AccountModel: accountModel
}



