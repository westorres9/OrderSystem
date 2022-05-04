INSERT INTO tb_category (name) VALUES ('Livros');
INSERT INTO tb_category (name) VALUES ('Eletrônicos');
INSERT INTO tb_category (name) VALUES ('Informática');
INSERT INTO tb_category (name) VALUES ('Escritório');

INSERT INTO tb_product (name, price) VALUES ('Computador', 2000.0);
INSERT INTO tb_product (name, price) VALUES ('Smart TV', 2499.0);
INSERT INTO tb_product (name, price) VALUES ('O Senhor dos Anéis', 39.0);
INSERT INTO tb_product (name, price) VALUES ('Java como programar', 239.0);
INSERT INTO tb_product (name, price) VALUES ('Cadeira Gamer', 999.0);
INSERT INTO tb_product (name, price) VALUES ('Amazon Kindle', 399.0);
INSERT INTO tb_product (name, price) VALUES ('Macbook pro', 6700.0);

INSERT INTO tb_product_category (product_id, category_id) VALUES (1,3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (3,1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (4,1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (5,4);
INSERT INTO tb_product_category (product_id, category_id) VALUES (6,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (7,3);

INSERT INTO tb_client(name, email, phone) VALUES ('Wester Torres', 'wester@gmail.com', '99176-1899');
INSERT INTO tb_client(name, email, phone) VALUES ('Dayane Rosa', 'dayane@gmail.com', '99873-8659');
INSERT INTO tb_client(name, email, phone) VALUES ('Neuza Rosa', 'neuza@gmail.com', '98835-9284');
INSERT INTO tb_client(name, email, phone) VALUES ('Ronaldo Vieira', 'ronaldo@gmail.com', '99671-5099');
INSERT INTO tb_client(name, email, phone) VALUES ('Roseli Torres', 'roseli@gmail.com', '98431-2456');
INSERT INTO tb_client(name, email, phone) VALUES ('Paulo Antônio', 'paulo@gmail.com', '98443-6094');
INSERT INTO tb_client(name, email, phone) VALUES ('Forca tarefa', 'forcatarefa@gmail.com', '3229-2276');
INSERT INTO tb_client(name, email, phone) VALUES ('Grupo GPS', 'grupogpsseguranca@gmail.com', '3484-5090');
INSERT INTO tb_client(name, email, phone) VALUES ('Ferramac', 'ferramac@gmail.com', '3484-5090');
INSERT INTO tb_client(name, email, phone) VALUES ('Carrefour', 'carrefour@gmail.com', '3239-5700');
INSERT INTO tb_client(name, email, phone) VALUES ('BRF foods SA', 'brf@gmail.com', '3550-0530');




INSERT INTO tb_address(street, number, postal_code, client_id, city , state) VALUES ('Rua arca', 271, '38407-270',1 ,'Marília', 'SP');
INSERT INTO tb_address(street, number, postal_code, client_id, city , state) VALUES ('Rua arca', 271, '38407-270',2 ,'Ribeirao Preto', 'SP');
INSERT INTO tb_address(street, number, postal_code, client_id, city , state) VALUES ('Rua guapeva', 819, '38407-270',3 ,'Suzano', 'SP');
INSERT INTO tb_address(street, number, postal_code, client_id, city , state) VALUES ('Rua guapeva', 819, '38407-270',4 , 'Sorocaba', 'SP');
INSERT INTO tb_address(street, number, postal_code, client_id, city , state) VALUES ('Rua videira', 452, '38407-270',5 , 'Uberlandia', 'MG');
INSERT INTO tb_address(street, number, postal_code, client_id, city , state) VALUES ('Rua videira', 452, '38407-270',6 ,'Juiz de Fora','MG');
INSERT INTO tb_address(street, number, postal_code, client_id, city , state) VALUES ('Av. Dr. Arnaldo Godoy de Souza', 2085, '38412-096',7 ,'Rio de Janeiro', 'RJ');
INSERT INTO tb_address(street, number, postal_code, client_id, city , state) VALUES ('Av. Nicomedes Alves dos Santos', 255, '38411-106',8 ,'Angra dos Reis', 'RJ');
INSERT INTO tb_address(street, number, postal_code, client_id, city , state) VALUES ('Av. João Naves de Ávila', 1441, '38400-053',9 ,'Salvador','BA');
INSERT INTO tb_address(street, number, postal_code, client_id, city , state) VALUES ('Avenida Coronel Jose Teofilo Carneiro', 1001, '38401-344',10 , 'Porto Seguro', 'BA');







