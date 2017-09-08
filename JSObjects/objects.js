/* objects 1 */
var customerObj = new Object()
customerObj.id = 123
customerObj.name = "John Doe"

// console.log("Cust 1", customerObj)


/* objects 3 */
var cust3 = {
    id: 345,
    name: "Keyser Soze",
    dt1: new Date("2017-09-06"),
    dt2: new Date("06-09-2017"),
    dt3: new Date("06-09-2017")+6,
    getName: function() {
      return this.name
    }
}
 console.log("Cust 3", cust3, cust3.getName())
//console.log("Date:", cust3.dt.getFullYear(), cust3.dt.getMonth(), cust3.dt.getDate())

/* objects 2 */
function Customer(id, name) {
    this.id = id;
    this.name = name;
    var fee = 3000
    this.getId = function() {
        console.log("Fee", fee)
        return this.id
    }
    this.getFee = function() {
        return fee
    }
}
var custTest = new Customer(2, "Abc")
Customer.prototype.getName = function() {
    return this.name
}
var cust2 = new Customer(234, "Jane Doe")
console.log("Cust 2", cust2)
console.log(custTest.getId())
console.log(custTest.getFee())
console.log(custTest.getName())

/* objects 4 */
class BankTransaction {
  constructor() {
    this.id = 0,
    this.amount = 0,
    this.date = new Date()
  }
  get getAmount() {
    return this.amount
  }
  set setAmount(value) {
    this.amount = value
  }
}
var txn1 = new BankTransaction()
txn1.setAmount = 1000
console.log(txn1.getAmount)

/*
var data = require("./customersModule.js")
var custs = data.customers
console.log(custs)
console.log(data.abc)
data.printName(custs[1])
*/

