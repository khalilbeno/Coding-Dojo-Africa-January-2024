const mongoose = require('mongoose');

const ProductSchema = new mongoose.Schema({
    title: {
        type: String,
        required: [true, "{PATH} is required"],
        minlength: [2, "{PATH} must be at least 3 chars"],
    },
    price: {
        type: Number,
        required: [true, "{PATH} is required"],
    },
    description: {
        type: String,
        required: [true, "{PATH} is required"],
        minlength: [3, "{PATH} must be at least 3 chars"],
    }
}, { timestamps: true });

module.exports.Product = mongoose.model('Product', ProductSchema);