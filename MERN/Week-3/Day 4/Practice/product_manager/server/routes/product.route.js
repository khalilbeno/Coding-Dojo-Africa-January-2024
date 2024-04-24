const ProductController = require('../controllers/product.controller');
module.exports = (app) => {
    app.get('/api/product', ProductController.findAll);
    app.post('/api/product/new', ProductController.createObj);
    app.put('/api/product/:id', ProductController.update);
    app.get('/api/product/:id', ProductController.getOne);
    app.delete('/api/product/:id', ProductController.delete);
}