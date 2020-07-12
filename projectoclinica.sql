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

create table usuario(
id_usuario int primary key auto_increment,
nome_usuario varchar(50) not null,
login varchar(50) not null,
senha varchar(30) not null,
perfil varchar(50) not null
);

describe usuario;

select * from usuario;
delete from usuario where id_usuario = 1;


