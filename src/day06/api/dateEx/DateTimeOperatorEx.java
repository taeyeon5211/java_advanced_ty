package day06.api.dateEx;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperatorEx {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println("현재시간 : " + now.format(dtf));

        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년 후 현재시간 : " + result1.format(dtf));

        LocalDateTime result2 = now.plusMonths(1);
        System.out.println("1달 후 현재시간 : " + result2.format(dtf));

        LocalDateTime result3 = now.plusDays(7);
        System.out.println("7일 후 현재시간 : " + result2.format(dtf));

        //LocalDateTime target = LocalDateTime.of(year, month, dayOfMonth, hour, minute, second);
        LocalDateTime startDateTime = LocalDateTime.of(2025, 2, 12, 0, 0, 0);
        System.out.println("시작일 : " + startDateTime.format(dtf));

        LocalDateTime endDateTime = LocalDateTime.of(2025, 2, 11, 0, 0, 0);
        System.out.println("종료일 : " + endDateTime.format(dtf));

        if (startDateTime.isBefore(endDateTime)) {
            System.out.println("진행중");
        } else if (startDateTime.isEqual(endDateTime)) {
            System.out.println("종료 합니다.");
        } else if (startDateTime.isAfter(endDateTime)) {
            System.out.println("종료 했습나다.");
        }
    }
}
