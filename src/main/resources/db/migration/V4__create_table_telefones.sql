CREATE TABLE telefone (
    id INTEGER AUTO_INCREMENT,
    ddd VARCHAR(255),
    numero VARCHAR(255),
    pessoa_id INTEGER,
    PRIMARY KEY (id)
);

alter table telefone 
add foreign key (pessoa_id) references pessoas(id);