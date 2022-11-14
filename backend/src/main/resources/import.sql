INSERT INTO CATEGORIA(nome) VALUES ('Informática');
INSERT INTO CATEGORIA(nome) VALUES ('Escritório');

INSERT INTO PRODUTO(nome, preco) VALUES ('Computador', 2000.00);
INSERT INTO PRODUTO(nome, preco) VALUES ('Computador', 2000.00);
INSERT INTO PRODUTO(nome, preco) VALUES ('Impressora', 800.00);
INSERT INTO PRODUTO(nome, preco) VALUES ('Mouse', 80.00);

INSERT INTO PRODUTO_CATEGORIA VALUES (1, 1);
INSERT INTO PRODUTO_CATEGORIA VALUES (2, 1);
INSERT INTO PRODUTO_CATEGORIA VALUES (2, 2);
INSERT INTO PRODUTO_CATEGORIA VALUES (3, 1);

INSERT INTO ESTADO(nome) VALUES ('Minas Gerais');
INSERT INTO ESTADO(nome) VALUES ('São Paulo');

INSERT INTO CIDADE(nome, estado_id) VALUES ('Uberlândia', 1);
INSERT INTO CIDADE(nome, estado_id) VALUES ('São Paulo', 2);
INSERT INTO CIDADE(nome, estado_id) VALUES ('Campinas', 2);

INSERT INTO CLIENTE(nome, email, cpf_ou_cnpj, tipo) VALUES ('Maria Silva', 'maria@gmail.com', '36478912377', 1);

INSERT INTO TELEFONE(cliente_id, telefones) VALUES (1, '27363323');
INSERT INTO TELEFONE(cliente_id, telefones) VALUES (1, '93838393');

INSERT INTO ENDERECO(logradouro, numero, complemento, bairro, cep, cliente_id, cidade_id) VALUES ('Rua Flores', '300', 'Apto 203', 'Jardim', '38220634', 1, 1);
INSERT INTO ENDERECO(logradouro, numero, complemento, bairro, cep, cliente_id, cidade_id) VALUES ('Avenida Matos', '105', 'Sala 800', 'Centro', '38777012', 1, 2);
