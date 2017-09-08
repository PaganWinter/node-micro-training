var https = require('https')

https.get('https://www.quandl.com/api/v3/datasets/OPEC/ORB.json', (resp) => {
  let data = '';

  resp.on('data', (chunk) => {
    data += chunk;
  });

  resp.on('end', () => {
    data = JSON.parse(data).dataset.data
    console.log(data);
    data.forEach((item) => {
      console.log(item[0], item[1])
    })
  });
}).on("error", (err) => {
  console.log("Error: " + err.message);
});