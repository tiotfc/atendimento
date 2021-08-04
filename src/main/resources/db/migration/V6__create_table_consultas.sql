CREATE TABLE consultas (
    id INTEGER AUTO_INCREMENT,
    data DATE,
    medico_fk INTEGER,
    paciente_fk INTEGER,
    PRIMARY KEY (id)
);

alter table consultas add foreign key (medico_fk) references medicos(id);
alter table consultas add foreign key (paciente_fk) references pacientes(id);