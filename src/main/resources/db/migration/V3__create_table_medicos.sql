CREATE TABLE medicos (
    crm INTEGER,
    especialidade VARCHAR(255),
    id INTEGER NOT NULL,
    PRIMARY KEY (id)
);
alter table medicos add foreign key (id) references pessoas(id);