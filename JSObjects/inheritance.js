function Member(id, name, addr) {
  this.id = id;
  this.name = name;
  this.addr = addr;
}
Member.fee = 200;
Member.prototype.getName = function() {
  return this.name
}
Member.prototype.getAddr = function() {
  return this.addr
}
var mem1 = new Member(1, "John", "Blore")
console.log(mem1.getName(), mem1)
console.log(Member.fee)
//mem1.fee = 666
//console.log(mem1)

function GoldMember(id, name, addr, discount) {
  Member.call(this, id, name, addr) // super
  this.discount = discount
}
GoldMember.prototype = new Member() // extends

var gmem1 = new GoldMember(2, "Jane", "Bombay", 2000)
console.log(gmem1)
console.log(gmem1.getAddr())

/************************************/

class MemberClass {
  constructor(id, name, addr) {
    this.id = id,
    this.name = name,
    this.addr = addr
  }
  get getAddr() {
    return this.addr
  }
  set setAddr(value) {
    this.addr = value
  }
}
var mem2 = new MemberClass(30, "Tom", "Chennai")
console.log(mem2)
mem2.setAddr = "Pune"
console.log(mem2)

class GoldMemberClass extends MemberClass {
  constructor(id, name, addr) {
    super(id, name, addr)
    this.discount = 100
  }
}
var gmem2 = new GoldMemberClass(20, "Gold Tom", "Vashi")
console.log(gmem2)
console.log(gmem2.getAddr)
gmem2.setAddr = "Tcr"
console.log(gmem2.getAddr)


