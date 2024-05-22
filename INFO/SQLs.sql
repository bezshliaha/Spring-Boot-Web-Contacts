CREATE TABLE IF NOT EXISTS contacts
( id INTEGER NOT NULL AUTO_INCREMENT,
  image VARCHAR(255) NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  alias VARCHAR(20) NOT NULL,
  PRIMARY KEY (id)
);


INSERT INTO
	contacts (image, first_name, last_name, alias)
VALUES
	('Person1.jpg', 'David', 'Apolskis', 'Tweener'),
    ('Person2.jpg', 'Benjamin', 'Franklin', 'C-Note'),
    ('Person3.jpg', 'Charles', 'Patoshik', 'Haywire'),
    ('Person4.jpg', 'Theodore', 'Bagwell', 'T-Bag'),
    ('Person5.jpg', 'Lincoln', 'Barrows', 'The Sink'),
    ('Person6.jpg', 'John', 'Abruzzi', 'None');