CREATE DATABASE db_pizzaria_legal;

USE  db_pizzaria_legal;

CREATE table tb_pizza(
id BIGINT AUTO_INCREMENT,
 nome VARCHAR(255) NOT NULL,
 sabor varchar(255) NOT NULL,
 fatias int NOT NULL,
 preco int not null,
 PRIMARY KEY (id)
);

CREATE table tb_categoria (
id BIGINT AUTO_INCREMENT,
com_bordas varchar (255) not null,
sem_bordas varchar (255) not null,
 PRIMARY KEY (id)
);

select * from tb_pizza;
-- Insira na tabela tb_produtosa coluna categoria_id com a constraint/restrição Chave Estrangeira/Foreign Key:
-- Adicionando a nova coluna
ALTER TABLE tb_pizza ADD pizzas_id bigint;

 ALTER TABLE tb_pizza ADD CONSTRAINT fk_pizza_categoria
 FOREIGN KEY (pizzas_id) REFERENCES tb_categoria(id);
 
 SELECT * FROM tb_categoria;
 
 INSERT INTO tb_categoria (com_bordas,sem_bordas)
VALUES ("catupry","sem borda recheada");

INSERT INTO tb_categoria (com_bordas,sem_bordas)
VALUES ("chocolate","sem borda recheada");

INSERT INTO tb_categoria (com_bordas,sem_bordas)
VALUES ("quatro queijos","sem borda recheada");

INSERT INTO tb_categoria (com_bordas,sem_bordas)
VALUES ("cheeder","sem borda recheada");

INSERT INTO tb_categoria (com_bordas,sem_bordas)
VALUES ("banana","sem borda recheada");



INSERT INTO tb_pizza(
    nome, sabor, fatias, preco,pizzas_id
) values("portuguesa","salgada",8,40, 1);

INSERT INTO tb_pizza(
    nome, sabor, fatias, preco,pizzas_id
) values("calabresa","salgada",8,30,2);

INSERT INTO tb_pizza(
    nome, sabor, fatias, preco,pizzas_id
) values("mussarela","salgada",4,20,3);

INSERT INTO tb_pizza(
    nome, sabor, fatias, preco,pizzas_id
) values("bacon","salgada",6,30,4);

INSERT INTO tb_pizza(
    nome, sabor, fatias, preco,pizzas_id
) values("chocolate","doce",8,45,5);

INSERT INTO tb_pizza(
    nome, sabor, fatias, preco,pizzas_id
) values("nutella","doce",4,20, 2);

INSERT INTO tb_pizza(
    nome, sabor, fatias, preco,pizzas_id
) values("morango_chocolate","doce",8,50, 2);

INSERT INTO tb_pizza(
    nome, sabor, fatias, preco,pizzas_id
) values("nutella_banana","doce",8,20,2);



SELECT * FROM tb_pizza WHERE preco BETWEEN 30 AND 50;

select * from tb_pizza where preco > 30;

SELECT * FROM tb_pizza WHERE nome LIKE "m%";

SELECT nome,sabor,fatias,preco,com_bordas,sem_bordas from tb_pizza
INNER JOIN tb_categoria ON tb_pizza.id = tb_categoria.id;

SELECT nome,sabor,fatias,preco,com_bordas,sem_bordas from tb_pizza
INNER JOIN tb_categoria ON tb_pizza.id = tb_categoria.id where pizzas_id = 5;


 
 
 
 
 
  


