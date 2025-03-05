use shopdb;

set global log_bin_trust_function_creators = 1;

drop function if exists userFunc;
delimiter $$
create function userfunc(value1 int, value2 int)
    returns int
begin
    return value1 + value2;
end $$
delimiter $$

select userfunc(100, 200);

drop function if exists getAgeFunc;
delimiter $$
create function getAgeFunc(bYear int)
    returns int
begin
    declare age int;
    set age = YEAR(CURDATE()) - bYear;
    return age;
end $$
delimiter $$

select getAgeFunc(1999);
select getAgeFunc(1979) into @age1979;
select getAgeFunc(1989) into @age1989;
select concat('1979년과 1989년의 나이차 ==> ', (@age1979 - @age1989));
show create function getAgeFunc;

select userid, name, getAgeFunc(birthYear) as '만 나이' from usertbl;
drop function getAgeFunc;

