package chapter3.formatingDatesAndTimes;
import java.time.*;
import java.time.format.*;
public class Test {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2020, Month.JANUARY, 9);
    LocalTime time = LocalTime.of(1, 1, 3);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
    System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
    System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    System.out.println(date);
    System.out.println(time);
    System.out.println(dateTime);
    DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    System.out.println(dateTime.format(shortDateTime));
    System.out.println(date.format(shortDateTime));
    //System.out.println(time.format(shortDateTime));// UnsupportedTemporalTypeException
    DateTimeFormatter f = DateTimeFormatter.ofPattern("d/M/yy h:m:s");
    System.out.println(dateTime.format(f));
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM dd yyyy");
    LocalDate date2 = LocalDate.parse("01 02 2015", f2);
    LocalTime time2 = LocalTime.parse("11:22");
    System.out.println(date2);
    System.out.println(time2);
  }
}
