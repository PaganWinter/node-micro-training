var customers =  [
  {
    id: 1,
    name: "Tom"
  },
  {
    id: 2,
    name: "Dick"
  },
  {
    id: 3,
    name: "Harry"
  },
];
var abc = 123;

var printName = function(cust) {
    console.log(cust.name)
}

module.exports = {
  customers: customers,
  abc: abc,
  printName: printName
}
