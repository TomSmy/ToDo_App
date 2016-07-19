var express = require('express');
var app = express();
app.use(express.static(__dirname + '/app'));
app.get('/', function (req, res) {
    res.sendFile('app/index.html', {root: __dirname});
});


app.listen(3000, function () {
    console.log('OK!');
});