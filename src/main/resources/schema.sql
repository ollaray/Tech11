DROP TABLE IF EXISTS users;
  
CREATE TABLE users(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL,
  password VARCHAR(25) DEFAULT NULL,
  birth_date timestamp
);

-- INSERT INTO users (first_name, last_name, email, password, birth_date) VALUES
--   ('Lokesh', 'Gupta', 'abc@gmail.com', sysdate()),
--   ('Deja', 'Vu', 'xyz@email.com',sysdate()),
--   ('Caption', 'America', 'cap@marvel.com', sysdate());