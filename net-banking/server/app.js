var express = require('express')
var app = express()
var bodyParser = require("body-parser")
var path = require('path')
var cors = require('cors')

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());
app.use(cors());

//app.use('/', express.static('../client/views'))
//app.get('/', function (req, res) { res.send('Hello World!') })
app.get('/', function(req, res) {
  res.sendfile(path.join(__dirname + '/../client/views/index.html'));
});
app.use('/static', express.static('../node_modules/angular'))
app.use('/static', express.static('../client'))


app.get('/customers', function (req, res) {
  console.log(req.body)
  var getCustomers = require('./models/getCustomers')
  var list = getCustomers()
  list.then(function(result) {
    res.set({'content-type': 'application/json'})
    res.json(result)
  }).catch(function() {
  })
})

app.post('/customers', function (req, res) {
  console.log(req.body)
  var addCustomer = require('./models/addCustomer')
  addCustomer(req.body, function(err, result) {
    if (err) {
      console.error(err)
      res.set({'content-type': 'application/json'})
      res.send(err.toString())
    } else {
      console.error(result)
      res.set({'content-type': 'application/json'})
      res.json(result)
    }
  })
})

app.get('/accounts', function (req, res) {
  console.log(req.body)
  var getAccounts = require('./models/getAccounts')
  var list = getAccounts()
  list.then(function(result) {
    res.set({'content-type': 'application/json'})
    res.json(result)
  }).catch(function() {
  })
})

app.post('/accounts', function (req, res) {
  console.log(req.body)
  var addAccount = require('./models/addAccount')
  addAccount(req.body).then(function(result) {
    console.log(result)
    res.set({'content-type': 'application/json'})
    res.json(result)
  }).catch(function(err) {
    console.error(err)
    res.set({'content-type': 'application/json'})
    res.send(err.toString())
  })
})

app.listen(3000, function () {
  console.log('Example app listening on port 3000!')
})