CREATE DATABASE bdprjRH;

USE bdprjRH;

CREATE TABLE gerente(
	id_gerente VARCHAR(10) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI NOT NULL,
	nome VARCHAR(50) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI NOT NULL,
	cpf VARCHAR(15) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI UNIQUE NOT NULL,
	CONSTRAINT pkid_gerente PRIMARY KEY(id_gerente));

CREATE TABLE funcionario(
	id_funcionario VARCHAR(10) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI NOT NULL,
	nome VARCHAR(50) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI NOT NULL,
	cpf VARCHAR(15) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI UNIQUE NOT NULL,
	gerente VARCHAR(20) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI NOT NULL,
	CONSTRAINT pkid_funcionario PRIMARY KEY(id_funcionario),
	CONSTRAINT fkid_gerente FOREIGN KEY(gerente) REFERENCES gerente(id_gerente));	

CREATE TABLE departamento(
	id_departamento VARCHAR(10) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI NOT NULL,
	nome VARCHAR(50) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI NOT NULL,
	cnpj VARCHAR(20) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI UNIQUE NOT NULL,
	CONSTRAINT pkid_departamento PRIMARY KEY(id_departamento));
