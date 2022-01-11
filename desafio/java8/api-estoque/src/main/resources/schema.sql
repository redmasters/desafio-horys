DROP TABLE IF EXISTS estoque;

create table estoque (
    id integer not null auto_increment,
    nome varchar(100) not null,
    categoria varchar(100) not null,
    codigo integer not null,
    primary key (id)
)