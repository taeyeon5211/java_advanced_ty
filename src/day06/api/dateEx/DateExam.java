package day06.api.dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

    public static void main(String[] args) {
        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1);
        System.out.println("=".repeat(20));

        SimpleDateFormat now1 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String strNow2 = now1.format(now);
        System.out.println(strNow2);
    }
}
