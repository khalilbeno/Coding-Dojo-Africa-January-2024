const mongoose = require('mongoose');

const AuthorSchema = new mongoose.Schema({
    name: {
        type: String,
        required: [true, "{PATH} is required"],
        minlength: [2, "{PATH} must be at least 3 chars"],
    },

}, { timestamps: true });

module.exports.Author = mongoose.model('Author', AuthorSchema);