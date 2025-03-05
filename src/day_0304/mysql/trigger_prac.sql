use ssgdb;

create table if not exists testTbl (id int, txt varchar(10));
insert into testtbl values (1, '레드벨벳');
insert into testtbl values (2, '잇지');
insert into testtbl values (3, '블랙핑크');

select * from testTbl;

drop trigger if exists testTrg;

delimiter //
create trigger testTrg
    after delete
    on testTbl
    for each row
begin
    set @msg = '가수 그룹이 삭제됨';
end //
delimiter ;

set @msg = '';
insert into testTbl values(4, '마마무');
select @msg;
update testTbl set txt = '블핑' where id = 3;
select @msg;
delete from testTbl where id = 4;
select @msg;

use shopdb;

drop table buytbl;

drop table backup_userTbl;
create table backup_userTbl(
    userID char(8) not null primary key,
    name varchar(10) not null,
    birthYear int not null,
    addr char(2) not null,
    mobile1 char(3),
    mobile2 char(8),
    height smallint,
    mDate date,
    modType char(2),
    modDate date,
    modUser varchar(256)
);

drop trigger if exists backUserTbl_UpdateTrg;

delimiter //
create trigger backUserTbl_UpdateTrg
    after update
    on usertbl
    for each row
begin
    insert into backup_usertbl values(old.userid, old.name, old.birthYear,
                                      old.addr, old.mobile1, old.mobile2, old.height, old.mDate,
                                      '수정', curdate(), current_user());
end //
delimiter ;

drop trigger if exists backUserTbl_deleteTrg;
delimiter //
create trigger backUserTbl_deleteTrg
    after delete
    on usertbl
    for each row
begin
    insert into backup_userTbl values (old.userid, old.name, old.birthYear,
                                       old.addr, old.mobile1, old.mobile2, old.height, old.mDate,
                                       '삭제', curdate(), current_user());
end //
delimiter ;

update usertbl set addr = '몽고' where userid = 'JKW';
delete from usertbl where height >= 177;

select * from backup_userTbl;

truncate table usertbl;

drop trigger if exists userTbl_insertTrg;
delimiter //
create trigger userTbl_insertTrg
    after insert
    on usertbl
    for each row
begin
    signal sqlstate '45000'
        set message_text = '데이터의 입력을 시도했습니다. 귀하의 정보가 서버에 기록되었습니다.';
end //
delimiter ;

insert into usertbl values('ABC', '에이비씨', 1977, '서울', '011', '11111111', 181, '2019-12-25');

drop trigger if exists userTbl_BeforeInsertTrg;
delimiter //
create trigger userTbl_BeforeInsertTrg
    before insert
    on usertbl
    for each row
begin
    if new.birthYear < 1900 then
        set new.birthYear = 0;
    elseif new.birthYear > year(curdate()) then
        set new.birthYear = year(curdate());
    end if;
end //
delimiter ;

insert into usertbl values
                        ('AAA', '에이', 1877, '서울', '011', '11112222', 181, '2022-12-25');
insert into usertbl values
                        ('BBB', '비이', 2977, '경기', '011', '11113333', 171, '2019-3-25');

select * from usertbl;

show triggers from shopdb;
drop trigger userTbl_BeforeInsertTrg;

use triggerDB;
drop table orderTbl;
drop table prodTbl;
drop table deliverTbl;


create table orderTbl (
    orderNo int auto_increment primary key,
    userid varchar(5),
    prodName varchar(5),
    orderAmount int
);

create table prodTbl (
    prodName varchar(5),
    account int
);

create table deliverTbl (
    deliverNo int auto_increment primary key,
    prodName varchar(5),
    account int unique
);

insert into prodTbl values ('사과', 100);
insert into prodTbl values ('배', 100);
insert into prodTbl values ('귤', 100);

drop trigger if exists orderTrg;
delimiter //
create trigger orderTrg
    after insert
    on orderTbl
    for each row
begin
    update prodTbl set account = account - new.orderAmount
        where prodName = new.prodName;
end //
delimiter ;

drop trigger if exists prodTrg;
delimiter //
create trigger prodTrg
    after update
    on prodTbl
    for each row
begin
    declare orderAmount int;
    set orderAmount = old.account - new.account;
    insert into deliverTbl(prodName, account)
        values (new.prodName, orderAmount);
end //
delimiter ;

insert into orderTbl values (null, 'John', '배', 5);

select * from orderTbl;
select * from prodTbl;
select * from deliverTbl;

alter table deliverTbl change prodName productName varchar(5);
select * from deliverTbl;

insert into orderTbl values (null, 'DANG', '사과', 9);

select * from orderTbl;
select * from prodTbl;
select * from deliverTbl;