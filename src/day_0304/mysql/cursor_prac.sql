use shopdb;

drop procedure if exists cursorProc;

delimiter $$
create procedure cursorProc()
begin
    declare userHeight int;
    declare cnt int default 0;
    declare totalHeight int default 0;

    declare endOfRow boolean default false;

    declare userCursor cursor for
        select height from usertbl;

    declare continue handler for
        not found set endOfRow = true;

    open userCursor;

    cursor_loop: LOOP
        FETCH userCursor into userheight;

        if endofrow then
            leave cursor_loop;
        end if;

        set cnt = cnt + 1;
        set totalHeight = totalHeight + userheight;
    end loop cursor_loop;

    select concat('고객 키의 평균 ==> ', (totalHeight / cnt));

    close userCursor;
end $$
delimiter ;

call cursorProc();

alter table usertbl add grade varchar(5);

drop procedure if exists gradeProc;

delimiter $$
create procedure gradeProc()
begin
    declare id varchar(10);
    declare hap bigint;
    declare userGrade char(5);

    declare endOfRow boolean default false;

    declare userCursor cursor for
    select U.userid, sum(price * amount)
        from buytbl B
            right outer join usertbl U
            on B.userid = U.userid
    group by U.userid, U.name;

    declare continue handler for
        not found set endOfRow = true;

    open userCursor;
    grade_loop: LOOP
        fetch userCursor into id, hap;
        if endOfRow then
            leave grade_loop;
        end if;

        case
            when (hap >= 1500) then set userGrade = '최우수고객';
            when (hap >= 1000) then set userGrade = '우수고객';
            when (hap >= 1) then set userGrade = '일반고객';
            else set userGrade = '유령고객';
        end case;

        update usertbl set grade = usergrade where userid = id;
    end loop grade_loop;

    close userCursor;
end $$
delimiter ;

call gradeProc();
select * from usertbl;