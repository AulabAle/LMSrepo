CREATE TABLE products (
    id BIGINT auto_increment PRIMARY KEY,
    name VARCHAR(100),
    description VARCHAR(1000),
    price float check (price > 0)
);

CREATE TABLE variants(
    id BIGINT auto_increment PRIMARY KEY,
    attribute VARCHAR(100),
    value VARCHAR(100),
    product_id BIGINT REFERENCES products(id)
);
   
CREATE TABLE vendors (
    id BIGINT auto_increment PRIMARY KEY,
    nome VARCHAR(100)
);
   
CREATE TABLE product_vendor(
    product_id BIGINT REFERENCES products(id),
    vendors_id BIGINT REFERENCES vendors(id)
);
