const express = require("express")
const cors = require("cors")
const app = express()
require("dotenv").config()

app.use(express.json(), express.urlencoded({ extended: true }), cors());



require("./config/mongoose.config")
const PORT = process.env.PORT

require("./routes/product.route")(app)

app.listen(PORT, () => {
    console.log(`Connecting to our server with success to this PORT : ${PORT}  🌴🌴🌴🌴`)
})