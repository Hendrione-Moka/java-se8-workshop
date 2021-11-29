package javadatetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest {

  public static void main(String[] args) {
    LocalDateTime dateNow = LocalDateTime.now();
    System.out.println(dateNow);

    LocalDateTime dateOf = LocalDateTime.of(2021, 11, 20, 14, 48, 10);
    System.out.println(dateOf);

    String textTime = "17/08/2021-14:14:35.798950";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss.SSSSSS");
    LocalDateTime fromString = LocalDateTime.parse(textTime, formatter);
    System.out.println(fromString);

    LocalDateTime timePlus = dateNow.plusYears(1).plusDays(10);
    System.out.println(timePlus);

    System.out.println(timePlus.isBefore(dateNow));
    System.out.println(timePlus.isAfter(dateNow));
    long months = dateNow.until(timePlus, ChronoUnit.MONTHS);
    System.out.println(months);
    long months2 = ChronoUnit.MONTHS.between(dateNow, timePlus);
    System.out.println(months2);

    LocalDateTime from = LocalDateTime.of(2020, 1, 1, 10, 30, 30);
    LocalDateTime to = from.plusYears(5).plusMonths(3).plusHours(2).plusMinutes(30);

    Period jarak = Period.between(from.toLocalDate(), to.toLocalDate());
    Duration jarakTime = Duration.between(from.toLocalTime(), to.toLocalTime());
    System.out.println("Selisih:");
    System.out.println("Tahun :" + jarak.getYears());
    System.out.println("Bulan :" + jarak.getMonths());
    System.out.println("Hari :" + jarak.getDays());
    long seconds = jarakTime.getSeconds();
    long jam = jarakTime.toHours();
    System.out.println("Jam : " + jam);
    long menit = (seconds - (jam * 3600)) / 60;
    System.out.println("Menit : " + menit);
    long detik = seconds - (jam * 3600) - (menit * 60);
    System.out.println("Detik : " + detik);

    System.out.println("Jam : " + jarakTime.toHoursPart());
    System.out.println("Menit : " + jarakTime.toMinutesPart());
    System.out.println("Detik : " + jarakTime.toSecondsPart());
  }

}
