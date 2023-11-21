INSERT INTO products (name, description, price) VALUES
('Maglietta da corsa', 'maglietta per running base', 40),
('Pantaloncini da corsa', 'pantaloncini per running base', 30),
('Calze da corsa', 'calze dry-fit', 50),
('Maglietta da corsa nike', 'maglietta running nike', 100);


INSERT INTO variants (attribute, value, product_id) VALUES
('colore', 'bianco', 1),
('colore', 'nero', 1),
('taglia', 'S', 1),
('taglia', 'M', 1),
('colore', 'blu', 2),
('colore', 'nero', 2),
('taglia', 'S', 2),
('taglia', 'M', 2),
('colore', 'giallo', 3),
('colore', 'verde', 3),
('taglia', '40', 3),
('taglia', '39', 3),
('colore', 'arancione', 4),
('colore', 'lime', 4),
('taglia', 'S', 4),
('taglia', 'XL', 4);


INSERT INTO vendors (nome) VALUES
('sport spa'),
('aulab trial srl'),
('magliette spa');


INSERT INTO product_vendor (product_id, vendors_id ) VALUES
(1,3),
(2,1),
(2,2),
(1,3),
(1,2),
(4,3),
(4,1),
(3,1),
(3,2),
(3,3);