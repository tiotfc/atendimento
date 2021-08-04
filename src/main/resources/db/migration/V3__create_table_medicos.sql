create table medicos (
       crm integer,
        especialidade varchar(255),
        id integer not null,
        primary key (id)
    );
alter table medicos 
       add constraint FKifreupa0eddbyx6a9g5s192f6 
       foreign key (id) 
       references pessoas
;