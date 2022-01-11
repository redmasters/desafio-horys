DROP TABLE IF EXISTS usuario;

CREATE TABLE usuario (
    id integer not null auto_increment,
    nome varchar(100) not null,
    endereco varchar(200) not null,
    primary key (id)
);

DROP TABLE IF EXISTS produto;

create table produto (
    id integer not null auto_increment,
    nome varchar(100) not null,
    estoque integer,
    price double,
    primary key (id)

)