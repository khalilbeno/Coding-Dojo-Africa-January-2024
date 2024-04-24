const { Product } = require("../models/product.model")

module.exports.findAll = (req, res) => {
    Product.find({})
        .then((obj) => res.json(obj))
        .catch((err) => res.json(err));
}

module.exports.createObj = (req, res) => {
    Product.create(req.body)
        .then((obj) => res.json(obj))
        .catch((err) => { res.status(400).json(err); console.log(req.body); });
}

module.exports.update = (req, res) => {
    Product.findOneAndUpdate({ _id: req.params.id }, req.body, { new: true, runValidators: true })
        .then((obj) => res.json(obj))
        .catch((err) => res.status(400).json(err));
}

module.exports.getOne = (req, res) => {
    Product.findOne({ _id: req.params.id })
        .then((obj) => res.json(obj))
        .catch((err) => res.json(err));
}

module.exports.delete = (req, res) => {
    Product.deleteOne({ _id: req.params.id })
        .then(obj => res.json(obj))
        .catch((err) => res.json(err));
};
