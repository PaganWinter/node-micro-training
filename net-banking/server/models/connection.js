var mongoose = require('mongoose')
var config = require('./config')

mongoose.connect(config.db.url, config.db.dbname, config.db.port)
var db = mongoose.connection;
db.on('error', console.error.bind(console, 'connection error:'));
db.once('open', function() {
  console.log("DB Connected")
});
