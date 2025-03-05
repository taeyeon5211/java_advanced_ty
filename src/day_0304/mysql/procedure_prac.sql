use shopdb;

select * from usertbl;
select * from buytbl;

-- 1.1 userTbl테이블을 대상으로 1개의 이름을 입력하여 해당 회원의 정보를 출력하는 프로시저를 작성하고 실행시키세요  '조관우' 회원의 정보를 출력하세요
drop procedure shopdbUserInfo;
delimiter $$
create procedure shopdbUserInfo(usertbl_name_input varchar(10))
begin
    select * from usertbl where name = usertbl_name_input;
end $$
delimiter ;

call shopdbUserInfo('조관우');
-- 1.2 userTbl 테이블  : 회원중 출생년도가 1970 이후 출생자이면서 키가 178 초과 인 회원의 정보를 출력하는 프로시저를 작성하고 실행시키세요
drop procedure shopdb1970After178Over;
delimiter $$
create procedure shopdb1970After178Over(usertbl_birthYear_input smallint, usertbl_height_input int)
begin
    select * from usertbl where birthYear > usertbl_birthYear_input and height > usertbl_height_input;
end $$
delimiter ;

call shopdb1970After178Over(1970, 178);

-- 1.3 usertbl 테이블 :  1980년 이후 출생자에게는 "고객님 건강보험 생애 전환 서비스 가입에 해당하지 않습니다." 1980년 이전 출생자들에게는 "고객님 건강보험 생애 전환 서비스 가입에 해당하오니 가입해 주시길 바랍니다." 출력하는 프로시저 작성
drop procedure if exists ifelseProc;
delimiter $$
create procedure ifelseProc(in username varchar(20))
begin
    declare bYear int;

    select birthYear into bYear from usertbl where name = username;
    if (bYear >= 1980) then
        select '고객님 건강보험 생애 전환 서비스 가입에 해당하지 않습니다.';
    else
        select '고객님 건강보험 생애 전환 서비스 가입에 해당하오니 가입해 주시길 바랍니다.';
    end if;
end $$
delimiter ;

call ifelseProc('은지원');
-- 1.4 while문을 활용하여 구구단을 문자열로 생성해서 테이블에 입력하는 프로시저를 작성해 보자
drop table if exists gugutbl;
create table gugutbl(txt varchar(100)); -- 구구단 저장용 테이블

drop procedure if exists whileProcgugu;

delimiter $$
create procedure whileProcgugu()
begin
    declare i int;
    declare j int;
    declare str varchar(100);

    set i = 2;

    while (i < 10) do
        set str = '';
        set j = 1;
        while (j < 10) do
            set str = concat(str, ' ', i, ' X ', j, ' = ', i * j);
            set j = j + 1;
            end while;
        set i = i + 1;
        insert into gugutbl values (str);
        end while;
end $$
delimiter ;

call whileProcgugu();
select * from gugutbl;

-- 1.4-1 1 ~ 100 까지 더하는 totalSum 출력포맷 '1-100의 합은 5050 입니다.'
drop procedure if exists totalSum;

delimiter $$
create procedure totalSum(input int)
begin
    declare sum int;
    declare i int;
    declare str varchar(150);

    set sum = 0;
    set i = 1;

    while (i <= input) do
        set sum = sum + i;
        set i = i + 1;
        end while;
    set str = concat('1-', input, ' 까지의 합은 ', sum, ' 입니다.');
    select str;
end $$
delimiter ;

call totalSum(100);

-- 1.5 DECARE~ HANDLER 를 이용해서 오류처리 구문을 추가해 보자 . ex) 1부터 숫자를 더하여 합계가 정수형(int)데이터 형식의 오버플로우가 발생하면 멈추고 오류처리를 해보자
drop procedure if exists totalSumHandler;

delimiter $$
create procedure totalSumHandler()
begin
    declare i int;
    declare result int;
    declare savePointResult int;

    declare exit handler for 1264
    begin
        select concat('INT 오버플로우 직전의 합계 ==> ', savePointResult);
        select concat('1+2+3+.....+', i, ' * 오버플로우');
    end ;

    set i = 1; -- 초기화
    set result = 0;

    while(true) do
        set savePointResult = result;
        set result = result + i;
        set i = i + 1;
        end while ;

end $$
delimiter ;

call totalSumHandler();
-- 1.6 현재 저장된 프로시저의 이름과 내용을 확인해 보자
use shopdb;
use information_schema;
select ROUTINE_NAME, ROUTINE_DEFINITION from information_schema.ROUTINES
where ROUTINE_SCHEMA = 'shopdb' and ROUTINE_TYPE = 'PROCEDURE';

-- 1.7 파라미터도 확인해 보자
select PARAMETER_MODE, PARAMETER_NAME, DTD_IDENTIFIER from information_schema.PARAMETERS
where SPECIFIC_NAME = 'ifelseProc';

-- 1.8 테이블 이름을 파라미터로 전달해 보자
use shopdb;
drop procedure if exists nameTableProc;

delimiter $$
create procedure nameTableProc(in tblname varchar(20))
    begin
        select * from tblname;
end $$
delimiter ;

-- call nameTableProc(usetbl);
-- 올바른 예
delimiter $$
create procedure nameTableProc(in tblname varchar(20))
    begin
        set @sqlQuery = concat('select * from ', tblname);
        prepare myQuery from @sqlQuery;
        EXECUTE myQuery;
        deallocate prepare myQuery;
end $$
delimiter ;

call nameTableProc('usertbl');

-- 1.9 배송담당자는 사용자의 정보를 접근할 수 있는 프로시저(delivProc)를 이용하여 사용자의 주소와 이름을 확인한다.
-- userID, name, addr, mobile1, mobile2 만 접근해서 사용자의 정보를 조회할 수 있는 deliProc 작성하세요.
-- 배송담당자는 사용자의 아이디로 회원의 정보를 접근할 수 있다.

drop procedure if exists delivProc;

delimiter $$
create procedure delivProc(in id varchar(20))
begin
    select userid, name, addr, mobile1, mobile2 from usertbl where userid = id;
end $$
delimiter ;

call delivProc('BBK');