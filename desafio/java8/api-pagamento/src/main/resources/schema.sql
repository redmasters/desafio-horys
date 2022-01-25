DROP TABLE IF EXISTS usuario;

CREATE TABLE usuario (
    id integer not null auto_increment,
    nome varchar(100) not null,
    endereco varchar(200) not null,
    primary key (id)
);