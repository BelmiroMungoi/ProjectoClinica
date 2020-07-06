create database projectoclinica;

use projectoclinica;

create table medicos(
idmedico serial primary key auto_increment,
nome_medico varchar(50) not null,
espec_medico varchar(50) not null,
crm_medico integer not null,
bi_medico varchar(15) not null
);

describe medicos;

select * from medicos;
