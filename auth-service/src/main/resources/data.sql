-- when we add a data.sql file in src/main/resources folder,
-- h2 database will automatically use this script at startup to populate the database.

DROP TABLE IF EXISTS users;



CREATE TABLE users (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  username VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL
);
