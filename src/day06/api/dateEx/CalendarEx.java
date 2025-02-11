package day06.api.dateEx;

import java.util.Calendar;

public class CalendarEx {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        String week1 = "";
        if (week == 1) {
            week1 = "Sunday";
        } else if (week == 2) {
            week1 = "Monday";
        } else if (week == 3) {
            week1 = "Tuesday";
        } else if (week == 4) {
            week1 = "Wednesday";
        } else if (week == 5) {
            week1 = "Thursday";
        } else if (week == 6) {
            week1 = "Friday";
        } else if (week == 7) {
            week1 = "Saturday";
        }
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int ampm = calendar.get(Calendar.AM_PM);
        String ampm1 = "";
        if (ampm == 0) {
            ampm1 = "AM";
        } else if (ampm == 1) {
            ampm1 = "PM";
        }
        System.out.printf("%s-%s-%s (%s) %s:%s:%s (%s)", year, month, day, week1, hour, minutes, second, ampm1);

//        String[] available = TimeZone.getAvailableIDs();
//        for (String s : available) {
//            System.out.println(s);
//        }
    }
}
