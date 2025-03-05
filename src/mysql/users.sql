use ssgdb;
drop table users;
select * from users;

create table users (
	userid   		varchar(50)	  	primary key, 
	username		varchar(50)	  	not null,
	userpassword	varchar(50)	  	not null,
	userage			numeric(3)		not null,
	useremail		varchar(50)	  	not null
);

insert into users(userid, username, userpassword, userage, useremail)
values ('ssgcom1', '신세계', '12345', '25', 'ssg1@gmail.com'),
       ('ssgcom2', '신수진', '12345', '28', 'ssg2@gmail.com');

