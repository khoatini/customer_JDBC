CREATE DATABASE IF NOT EXISTS Customerdb;
USE Customerdb;

create table customer (
	code int auto_increment,
    name varchar(255) not null,
    address varchar(255) not null,
    email varchar(255) not null,
    primary key (code)
);
