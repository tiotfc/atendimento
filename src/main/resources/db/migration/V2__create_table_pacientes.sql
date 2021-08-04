CREATE TABLE pacientes (
    prontuario VARCHAR(255),
    id INTEGER NOT NULL,
    PRIMARY KEY (id)
);

alter table pacientes add foreign key (id) references pessoas(id);