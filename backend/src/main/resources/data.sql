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

INSERT INTO tb_state (name) VALUES ('SP');
INSERT INTO tb_state (name) VALUES ('MG');
INSERT INTO tb_state (name) VALUES ('RJ');
INSERT INTO tb_state (name) VALUES ('BA');

INSERT INTO tb_city (name,state_id) VALUES ('Ribeirao Preto', 1);
INSERT INTO tb_city (name,state_id) VALUES ('Suzano', 1);
INSERT INTO tb_city (name,state_id) VALUES ('Marília', 1);
INSERT INTO tb_city (name,state_id) VALUES ('Sorocaba', 1);
INSERT INTO tb_city (name,state_id) VALUES ('Uberlandia', 2);
INSERT INTO tb_city (name,state_id) VALUES ('Juiz de Fora', 2);
INSERT INTO tb_city (name,state_id) VALUES ('Contagem', 2);
INSERT INTO tb_city (name,state_id) VALUES ('Belo Horizonte', 2);
INSERT INTO tb_city (name,state_id) VALUES ('Rio de Janeiro', 3);
INSERT INTO tb_city (name,state_id) VALUES ('Angra dos Reis', 3);
INSERT INTO tb_city (name,state_id) VALUES ('Botafogo', 3);
INSERT INTO tb_city (name,state_id) VALUES ('Salvador', 4);
INSERT INTO tb_city (name,state_id) VALUES ('Porto Seguro', 4);



