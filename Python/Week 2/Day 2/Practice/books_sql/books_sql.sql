SELECT * FROM books_shema.users;
INSERT INTO users (name) VALUES ("Jane Amsden"),("Emily Dixon"),("Theodore Dostoevsky"),("William Shapiro"),("Lao Xiu");
update users set name="Bill" where id=4;
SELECT * from books_shema.users
JOIN favorites on users.id = favorites.user_id
WHERE book_id = 3;
SELECT * from users
JOIN favorites on users.id = favorites.user_id
join books on books.id=favorites.book_id
WHERE books.id = 5;