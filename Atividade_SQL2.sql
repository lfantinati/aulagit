use db_e_commerce;


CREATE DATABASE db_ecommerce;
USE db_ecommerce;
CREATE TABLE tb_ecommerce(
 id BIGINT AUTO_INCREMENT,
 nome VARCHAR(255) NOT NULL,
 preco INT NOT NULL,
 codigo INT NOT NULL,
 marca varchar (255) NOT NULL,
 especificacoes varchar(255),
 PRIMARY KEY (id)
);

SELECT * FROM tb_ecommerce;

INSERT INTO tb_ecommerce(nome,preco,codigo,marca,especificacoes)
VALUES ("Celular",8000,0548771514,"IPHONE","PRO-MAX");
INSERT INTO tb_ecommerce(nome,preco,codigo,marca,especificacoes)
VALUES ("Celular",1500,0544845,"SAMSUNG","S25");
INSERT INTO tb_ecommerce(nome,preco,codigo,marca,especificacoes)
VALUES ("Celular",2000,054824544,"XIAOMI","NOTE8");
INSERT INTO tb_ecommerce(nome,preco,codigo,marca,especificacoes)
VALUES ("Celular",1200,0548772454,"MOTOROLA","G_PLUS");
INSERT INTO tb_ecommerce(nome,preco,codigo,marca,especificacoes)
VALUES ("Celular",500,0548776554,"MOTOROLA","5plus");
INSERT INTO tb_ecommerce(nome,preco,codigo,marca,especificacoes)
VALUES ("Celular",2400,05482514,"LG","K8");
INSERT INTO tb_ecommerce(nome,preco,codigo,marca,especificacoes)
VALUES ("Celular",2200,05487625,"ZENFONE","MAX");
INSERT INTO tb_ecommerce(nome,preco,codigo,marca,especificacoes)
VALUES ("Celular",6000,05484114,"NOKIA","4200");



SELECT * FROM tb_ecommerce WHERE preco > 500;

SELECT * FROM tb_ecommerce WHERE preco < 500;

UPDATE tb_ecommerce SET preco = 400 , marca = "Positivo" WHERE id = 8;
