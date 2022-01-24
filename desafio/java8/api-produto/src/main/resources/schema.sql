DROP TABLE IF EXISTS produto;

create table produto (
    id varchar(9999)not null auto_increment,
    nome varchar(100) not null,
    categoria varchar(100) not null,
    preco double,
    primary key (id)
)