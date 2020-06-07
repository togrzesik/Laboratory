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
    id INTEGER (6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    recepie_id INTEGER(6),
    product_id INTEGER(6),
    amount FLOAT(10)
);

-- ALTER TABLE recepie_products ADD CONSTRAINT recepie_id  FOREIGN KEY (recepie_id) REFERENCES recepie(recepie_id) ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ALTER TABLE recepie_products ADD CONSTRAINT product_id  FOREIGN KEY (product_id) REFERENCES product(product_id) ON DELETE NO ACTION ON UPDATE NO ACTION;

INSERT INTO product VALUES (1, 'Mąka ziemniaczana','5900766000281', 500, 'g' );
INSERT INTO product VALUES (2, 'Jajko','5900766000000', 1, 'szt.' );
INSERT INTO product VALUES (3, 'Pomidor','5900766000001', 1, 'szt.' );
INSERT INTO product VALUES (4, 'Ryż biały','5902481010941',4, 'paczk.' );
INSERT INTO product VALUES (5, 'Czosnek','5900977009534',1, 'ząb.' );

INSERT INTO recepie VALUES (1,'Szakszuka','https://www.kwestiasmaku.com/sites/v123.kwestiasmaku.com/files/jajka_w_pomidorach_01-1.jpg',
                        'Przygotować pomidory: sparzyć, obrać ze skórki, pokroić na ćwiartki, wykroić szypułki, miąższ pokroić w kosteczkę. Na niedużą patelnię (około 20 cm średnicy) włożyć masło lub wlać oliwę oraz starty czosnek, chwilę podsmażyć. Pomidory włożyć na patelnię, doprawić solą, pieprzem i przyprawami. Wymieszać i intensywnie smażyć na większym ogniu przez około 4 minuty, już bez mieszania (wówczas pomidory odparują i zachowają swoją strukturę, jeśli będziemy mieszać zrobi się przecier). Do podsmażonych pomidorów wbić jajka, doprawić solą. Przykryć i gotować przez około 3 minuty lub do czasu aż białka jajek będą ścięte. Podawać ze świeżą bazylią i bagietką.');


INSERT INTO recepie_products VALUES(1,1,2,3);
INSERT INTO recepie_products VALUES(2,1,3,1);
INSERT INTO recepie_products VALUES(3,1,5,1);

INSERT INTO recepie_products VALUES(4,2,1,0.6);