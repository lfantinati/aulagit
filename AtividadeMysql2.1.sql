 -- CREATE DATABASE db_generaton_game_online;

USE  db_generaton_game_online;

CREATE table tb_personagens(
id BIGINT AUTO_INCREMENT,
 nome VARCHAR(255) NOT NULL,
 forca int NOT NULL,
 velocidade int NOT NULL,
 habilidade varchar(255)not null,
 PRIMARY KEY (id)
);

CREATE table tb_classe (
id BIGINT AUTO_INCREMENT,
categoria varchar (255) not null,
poder varchar (255) not null,
 PRIMARY KEY (id)
);

select * from tb_personagens;
-- Insira na tabela tb_produtosa coluna categoria_id com a constraint/restrição Chave Estrangeira/Foreign Key:
-- Adicionando a nova coluna
ALTER TABLE tb_personagens ADD classe_id bigint;


-- Adicionando a constraint
 ALTER TABLE tb_personagens ADD CONSTRAINT fk_personagens_classe
 FOREIGN KEY (classe_id) REFERENCES tb_classe (id);
 
 SELECT * FROM tb_classe;
 
INSERT INTO tb_classe (categoria,poder)
VALUES ("Ogro","Fogo");

INSERT INTO tb_classe (categoria,poder)
VALUES ("Elfo","Magia");

INSERT INTO tb_classe (categoria,poder)
VALUES ("Anão","água");

INSERT INTO tb_classe (categoria,poder)
VALUES ("humano","terra");

INSERT INTO tb_classe (categoria,poder)
VALUES ("caçador","Arco e flecha");



INSERT INTO tb_personagens(
    nome, forca, velocidade, habilidade,classe_id
) values("sherek",80,15,"assustar", 1);

INSERT INTO tb_personagens(
    nome, forca, velocidade, habilidade,classe_id
) values("kratos", 100,60,"Destruir",4);

INSERT INTO tb_personagens(
    nome, forca, velocidade, habilidade,classe_id
) values("thory", 20, 20,"esquivar", 3);

INSERT INTO tb_personagens(
    nome, forca, velocidade, habilidade,classe_id
) values("kim",50,100,"judo", 4);

INSERT INTO tb_personagens(
    nome, forca, velocidade, habilidade,classe_id
) values("cris",60,40,"rastreador",5);

INSERT INTO tb_personagens(
    nome, forca, velocidade, habilidade,classe_id
) values("fhrodo",10,15,"fazerraiva", 2);

INSERT INTO tb_personagens(
    nome, forca, velocidade, habilidade,classe_id
) values("fiona",30,15,"odor",1);

INSERT INTO tb_personagens(
    nome, forca, velocidade, habilidade,classe_id
) values("small",95,90,"voar",2);

SELECT * FROM tb_personagens WHERE forca BETWEEN 30 AND 60;

select * from tb_personagens where forca > 60;

SELECT * FROM tb_personagens WHERE nome LIKE "c%";


 


SELECT nome, forca,velocidade,habilidade,poder,categoria from tb_personagens
INNER JOIN tb_classe ON tb_personagens.id = tb_classe.id;

SELECT nome, forca,velocidade,habilidade,poder,categoria from tb_personagens
INNER JOIN tb_classe ON tb_personagens.id = tb_classe.id where classe_id = 5;


































