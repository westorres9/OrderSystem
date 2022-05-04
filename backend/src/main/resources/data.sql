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

INSERT INTO tb_request(moment, client_id, address_id) VALUES ( '2020-07-14T10:00:00Z', 1, 1);
INSERT INTO tb_request(moment, client_id, address_id) VALUES ( '2020-10-15T10:00:00Z', 2, 2);
INSERT INTO tb_request(moment, client_id, address_id) VALUES ( '2020-06-16T10:00:00Z', 2, 2);
INSERT INTO tb_request(moment, client_id, address_id) VALUES ( '2020-02-17T10:00:00Z', 3, 3);
INSERT INTO tb_request(moment, client_id, address_id) VALUES ( '2020-03-18T10:00:00Z', 3, 3);
INSERT INTO tb_request(moment, client_id, address_id) VALUES ( '2020-04-19T10:00:00Z', 4, 4);
INSERT INTO tb_request(moment, client_id, address_id) VALUES ( '2020-05-20T10:00:00Z', 5, 5);
INSERT INTO tb_request(moment, client_id, address_id) VALUES ( '2020-06-21T10:00:00Z', 6, 6);
INSERT INTO tb_request(moment, client_id, address_id) VALUES ( '2020-07-22T10:00:00Z', 7, 7);
INSERT INTO tb_request(moment, client_id, address_id) VALUES ( '2020-08-23T10:00:00Z', 8, 8);

INSERT INTO tb_payment(request_id, state) VALUES (1,1);
INSERT INTO tb_payment(request_id, state) VALUES (2,2);
INSERT INTO tb_payment(request_id, state) VALUES (3,3);
INSERT INTO tb_payment(request_id, state) VALUES (4,3);
INSERT INTO tb_payment(request_id, state) VALUES (5,2);
INSERT INTO tb_payment(request_id, state) VALUES (6,1);
INSERT INTO tb_payment(request_id, state) VALUES (7,2);
INSERT INTO tb_payment(request_id, state) VALUES (8,1);
INSERT INTO tb_payment(request_id, state) VALUES (9,3);
INSERT INTO tb_payment(request_id, state) VALUES (10,2);

INSERT INTO tb_ticket_payment(request_id, due_date, payment_date) VALUES (1,'2020-08-23T10:00:00Z','2020-09-23T10:00:00Z');
INSERT INTO tb_ticket_payment(request_id, due_date, payment_date) VALUES (2,'2020-07-20T10:00:00Z','2020-08-20T10:00:00Z');
INSERT INTO tb_ticket_payment(request_id, due_date, payment_date) VALUES (3,'2020-06-18T10:00:00Z','2020-07-18T10:00:00Z');
INSERT INTO tb_ticket_payment(request_id, due_date, payment_date) VALUES (4,'2020-05-16T10:00:00Z','2020-06-16T10:00:00Z');
INSERT INTO tb_ticket_payment(request_id,  due_date, payment_date) VALUES (5,'2020-04-14T10:00:00Z','2020-06-14T10:00:00Z');

INSERT INTO tb_card_payment(request_id, number_of_quotas) VALUES (6,1);
INSERT INTO tb_card_payment(request_id, number_of_quotas) VALUES (7,2);
INSERT INTO tb_card_payment(request_id, number_of_quotas) VALUES (8,3);
INSERT INTO tb_card_payment(request_id, number_of_quotas) VALUES (9,2);
INSERT INTO tb_card_payment(request_id, number_of_quotas) VALUES (10,6);

INSERT INTO tb_item_request(product_id, request_id,price, quantity, discount) VALUES (1,1,2000.0, 1, 100.0);
INSERT INTO tb_item_request(product_id, request_id,price, quantity, discount) VALUES (2,2,2499.0, 2, 249.0);
INSERT INTO tb_item_request(product_id, request_id,price, quantity, discount) VALUES (3,3,39.0, 10, 39.0);







