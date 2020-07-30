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

create table bairro (  
cod_bairro int primary key auto_increment,
nome_bairro varchar(50) not null
);

insert into bairro(nome_bairro) values ('Malhampsene');
select * from bairro;

create table paciente (
id_paciente int primary key auto_increment,
nome_paciente varchar(60) not null,
nasc_paciente varchar(20) not null,
bi_paciente varchar(15),
cell_paciente varchar(20) not null,
rua_paciente varchar(50),
quar_paciente varchar(50),
casa_paciente varchar(50),
pac_bairro int,
foreign key(pac_bairro) references bairro(cod_bairro)
); 

describe paciente;
select * from paciente;
delete from paciente where id_paciente = '4';

select id_paciente, nome_paciente, bi_paciente, cell_paciente, nome_bairro, rua_paciente from paciente inner join bairro on pac_bairro = cod_bairro order by nome_paciente;
