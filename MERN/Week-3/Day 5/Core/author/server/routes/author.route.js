const AuthorController = require('../controllers/author.controller');
module.exports = (app) => {
    app.get('/api/author', AuthorController.findAll);
    app.post('/api/author/new', AuthorController.createObj);
    app.put('/api/author/:id', AuthorController.update);
    app.get('/api/author/:id', AuthorController.getOne);
    app.delete('/api/author/:id', AuthorController.delete);
}