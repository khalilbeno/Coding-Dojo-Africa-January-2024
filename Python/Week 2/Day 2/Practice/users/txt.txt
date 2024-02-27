SELECT * FROM users.users;
INSERT INTO users (first_name, last_name,email) 
VALUES('mohamed', 'ben salem','mohamed@gmail.com'),('samir','ben ali','samir@gmail.com'),('ali','ben ahmed','ali@gmail.com');
 DELETE FROM users WHERE id>3;
 
 select * from users where  email='mohamed@gmail.com';
 select * from users where id=3;
 UPDATE users SET last_name = 'Pancakes' WHERE id = 3;
 delete from users where id=2;
 select * from users order by first_name;
 select * from users order by first_name desc;