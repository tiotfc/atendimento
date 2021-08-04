    create table pacientes (
       prontuario varchar(255),
        id integer not null,
        primary key (id)
    );
    alter table pacientes 
       add constraint FK2t6bbjk59sy4n47ws651hm1al 
       foreign key (id) 
       references pessoas;