create database UBUNTU21;
USE UBUNTU21;
create table UbuntuTech(
Sno int primary key auto_increment not null,
 FirtsName varchar(255),
 LastName varchar(255),
 sex varchar(45),
 Address varchar(255),
 mobile int,
 email varchar(255));
 
 
 insert into UbuntuTech(FirtsName, LastName, sex, Address, mobile, email) values(
 "Alhaji", "kanu", "male", "makeni", 033333222, "a.kanu@ubuntuafrika.com" ); 
 
 create table UbuntuPost(
Sno int primary key auto_increment not null,
 FirtsName varchar(255),
 LastName varchar(255),
 sex varchar(45),
 Address varchar(255),
 mobile int,
 email varchar(255));
 

 
 insert into UbuntuPost(FirtsName, LastName, sex, Address, mobile, email) values(
 "Andrew", "Kamara", "male", "makeni", 033223222, "ojuku.kamara@ubuntuafrika.com" ); 
 
 
select * from UbuntuTech, UbuntuPost;
SELECT * FROM UbuntuTech WHERE name='kamara' AND email= 'a.kanu@ubuntuafrika.com';
 