package chapter3.CreatingDateInJava7AndEarlier;

import java.util.Calendar;
import java.util.Date;

public class OldWay {
    public static void main(String[] args) {
        Date date = new Date(2015, Calendar.JANUARY, 1);
        System.out.println(date);
        System.out.println(date.getYear());
    }
}
