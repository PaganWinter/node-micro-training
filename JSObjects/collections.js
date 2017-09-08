// Arrays
var arr = []
arr.push(10)
arr.push('hello')
arr.push(false)
arr.push(new Date())
arr.push(4.2)
arr.push(50)
arr[8] = [1,2,3]
arr[9] = {}
console.log(arr)

var arrNum = arr.filter((item) => (typeof item == 'number' ))
console.log('Numbers:', arrNum)

for (i in arr) {
  console.log(i, '=>', arr[i])
}

//arr.forEach((item) => console.log(item))

console.log('-------------------')
///////////////////////////////
// From

var arrCopy = Array.from(arr)
//console.log(arrCopy)

console.log('-------------------')
///////////////////////////////
// Spread operator
function process(...data) {
  console.log(data)
  console.log(data.join('*'))
}
process("abc")
process("a", "b", "c")
process(["a", "b", "c"], [1,2])
process(new Array("a", "b", "c"))
process()

c(1,2,3,'abc')

function c(...v) {
  console.log(...v)
}

console.log('-------------------')
///////////////////////////////
// Sets

var set1 = new Set([123, 123, 345, 567])
var set2 = new Set([222, 345, 555])
set2.add(222)
console.log(set1, set2)

var setUnion = new Set([...set1, ...set2])
console.log('setUnion', setUnion)

var setIntersect = new Set(
  [...set1].filter(x => set2.has(x))
)
console.log('setIntersect', setIntersect)

console.log('-------------------')
///////////////////////////////
// Maps
var map1 = new Map([
  ["key1", 123],
  ["key2", "abc"]
])
console.log(map1)
map1.set("cityKey", "mumbay")
console.log(map1)

for (var key of map1.keys()) {
  console.log(key)
}
for (var value of map1.values()) {
  console.log(value)
}
for (var [key, value] of map1.entries()) {
  console.log(key, value)
}

console.log('-------------------')

///////////////////////////////
