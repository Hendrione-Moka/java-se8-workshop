package javadatetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeTest {

  public static void main(String[] args) {
    LocalTime timeNow = LocalTime.now();
    System.out.println(timeNow);

    LocalTime timeOf = LocalTime.of(10, 30, 10);
    System.out.println(timeOf);

    String textTime = "17/08/2021-14:14:35.798950";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss.SSSSSS");
    LocalTime fromString = LocalTime.parse(textTime, formatter);
    System.out.println(fromString);

    LocalTime maxTime = LocalTime.MAX;
    LocalTime minTime = LocalTime.MIN;
    LocalTime noonTime = LocalTime.NOON;
    LocalTime midNightTime = LocalTime.MIDNIGHT;
    System.out.println(maxTime);
    System.out.println(minTime);
    System.out.println(noonTime);
    System.out.println(midNightTime);

    LocalTime currentTime = LocalTime.of(11,21,26);
    LocalTime nowPlus = currentTime.plusHours(1).plusMinutes(15);
    System.out.println(nowPlus);
    LocalTime truncated = nowPlus.truncatedTo(ChronoUnit.MINUTES);
    System.out.println(truncated);
    System.out.println(truncated.toSecondOfDay());
    System.out.println(truncated.toSecondOfDay()/60);
    LocalTime lunch = LocalTime.of(12,30);
    System.out.println(lunch.isAfter(currentTime));
    System.out.println(lunch.isBefore(currentTime));
    System.out.println(lunch.equals(currentTime));
    long range = currentTime.until(lunch, ChronoUnit.SECONDS);
    System.out.println(range);
  }

}
