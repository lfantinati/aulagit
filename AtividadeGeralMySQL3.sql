

CREATE DATABASE db_rh;
USE db_rh;

CREATE TABLE tb_colaboradores(
 id BIGINT AUTO_INCREMENT,
 nome VARCHAR(255) NOT NULL,
 cargo varchar(255) NOT NULL,
 setor varchar(255) NOT NULL,
 salario INT,
 matricula INT,
 PRIMARY KEY (id)
);

SELECT * FROM tb_colaboradores;

INSERT INTO tb_colaboradores(nome,cargo,setor,salario,matricula) 
VALUES ("Edsom","Jogador","santos",2000,255255);

INSERT INTO tb_colaboradores(nome,cargo,setor,salario,matricula) 
VALUES ("Marcos","Jogador","Plameiras",5000,255552);

INSERT INTO tb_colaboradores(nome,cargo,setor,salario,matricula) 
VALUES ("Fabio","Jogador","Fluminense",1000,255552);

SELECT * FROM tb_colaboradores WHERE salario > 2000;

SELECT * FROM tb_colaboradores WHERE salario < 2000;

 
 
UPDATE tb_colaboradores SET setor = "Vasco"  WHERE id = 2;

UPDATE tb_colaboradores SET matricula = 255620 WHERE id = 3;


-------------------------------------------------------------------------------------------------

-- Atividade 2 MYSQL

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
VALUES ("Celular",8000,0548771514,"IPHONE","
PRO-MAX");

INSERT INTO tb_ecommerce(nome,preco,codigo,marca,especificacoes) 
VALUES ("Celular",1500,0544845,"SAMSUNG","
S25");
INSERT INTO tb_ecommerce(nome,preco,codigo,marca,especificacoes) 
VALUES ("Celular",2000,054824544,"XIAOMI","NOTE8");
INSERT INTO tb_ecommerce(nome,preco,codigo,marca,especificacoes) 
VALUES ("Celular",1200,0548772454,"MOTOROLA","
G_PLUS");
INSERT INTO tb_ecommerce(nome,preco,codigo,marca,especificacoes) 
VALUES ("Celular",500,0548776554,"MOTOROLA","
5plus");
INSERT INTO tb_ecommerce(nome,preco,codigo,marca,especificacoes) 
VALUES ("Celular",2400,05482514,"LG","
K8");
INSERT INTO tb_ecommerce(nome,preco,codigo,marca,especificacoes) 
VALUES ("Celular",2200,05487625,"ZENFONE","
MAX");
INSERT INTO tb_ecommerce(nome,preco,codigo,marca,especificacoes) 
VALUES ("Celular",6000,05484114,"NOKIA","
4200");

SELECT * FROM tb_ecommerce WHERE preco > 500;
SELECT * FROM tb_ecommerce WHERE preco < 500;

UPDATE tb_ecommerce SET preco = 1500  WHERE id = 2;
UPDATE tb_ecommerce SET preco = 2000 WHERE id = 3;
UPDATE tb_ecommerce SET preco = 1200 WHERE id = 4;
UPDATE tb_ecommerce SET preco = 500 WHERE id = 5;
UPDATE tb_ecommerce SET preco = 400 WHERE id = 6;
UPDATE tb_ecommerce SET preco = 2200 WHERE id = 7;
UPDATE tb_ecommerce SET preco = 6000 WHERE id = 8;



