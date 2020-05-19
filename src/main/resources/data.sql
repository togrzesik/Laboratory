DROP TABLE IF EXISTS recepie;
DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS recepie_products;

CREATE TABLE recepie (
	recepie_id INTEGER(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(100),
	image VARCHAR(300),
	description VARCHAR(4096)
);

CREATE TABLE product (
    product_id INTEGER(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR (100),
    barcode VARCHAR(32),
    amount INTEGER(10),
    unit VARCHAR(15)
);

CREATE TABLE recepie_products(
    recepie_id INTEGER(6) ,
    product_id INTEGER(6)
);

ALTER TABLE recepie_products ADD CONSTRAINT recepie_id  FOREIGN KEY (recepie_id) REFERENCES recepie(recepie_id) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE recepie_products ADD CONSTRAINT product_id  FOREIGN KEY (product_id) REFERENCES product(product_id) ON DELETE NO ACTION ON UPDATE NO ACTION;

INSERT INTO product VALUES (1, 'Mąka ziemniaczana','5900766000281', 500, 'g' );
INSERT INTO product VALUES (2, 'Filet z Kurczaka','5900766000000', 1, 'szt' );
INSERT INTO product VALUES (3, 'Ryż biały','5900977008779',4, 'woreczki' );


/*INSERT INTO movies VALUES (1, 'Piraci z Krzemowej Doliny', 'http://1.fwcdn.pl/po/30/02/33002/6988507.6.jpg',2000); */
