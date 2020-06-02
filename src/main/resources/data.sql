
CREATE TABLE IF NOT EXISTS recepie (
recepie_id INTEGER(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100),
image VARCHAR(300),
description VARCHAR(4096)
);

CREATE TABLE IF NOT EXISTS product (
    product_id INTEGER(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR (100),
    barcode VARCHAR(32),
    amount INTEGER(10),
    unit VARCHAR(15)
);

CREATE TABLE IF NOT EXISTS recepie_products(
    id INTEGER (6),
    recepie_id INTEGER(6) ,
    product_id INTEGER(6) ,
    amount INTEGER(10)
);
