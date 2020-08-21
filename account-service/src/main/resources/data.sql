-- when we add a data.sql file in src/main/resources folder,
-- h2 database will automatically use this script at startup to populate the database.

DROP TABLE IF EXISTS account;
DROP TABLE IF EXISTS item;
DROP TABLE IF EXISTS saving;



CREATE TABLE account (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  lastSeen datetime NOT NULL,
  note VARCHAR(250) DEFAULT NULL
);

CREATE TABLE item (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  account_id int not null,
  title VARCHAR(250) NOT NULL,
  amount decimal(10,2)  NOT NULL,
  currency VARCHAR(250) DEFAULT NULL,
  period VARCHAR(250) DEFAULT NULL,
  icon VARCHAR(250) DEFAULT NULL
);


CREATE TABLE saving (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  account_id int not null,
  amount decimal(10,2)  not null,
  currency VARCHAR(250) NOT NULL,
  interest decimal(10,2)  NOT NULL,
  deposit TINYINT DEFAULT NULL,
  capitalization TINYINT DEFAULT NULL
);
