CREATE TABLE enderecos (
    id INTEGER AUTO_INCREMENT,
    cidade VARCHAR(255),
    numero VARCHAR(255),
    rua VARCHAR(255),
    pessoa_id INTEGER,
    PRIMARY KEY (id)
);
    
 alter table enderecos add foreign key (pessoa_id) references pessoas(id);