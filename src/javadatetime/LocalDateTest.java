package javadatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class LocalDateTest {

  public static void main(String[] args) {
    //tanggal sekarang
    LocalDate now = LocalDate.now();
    System.out.println(now);
    //natal
    LocalDate natalTahunIni = LocalDate.of(2021, 12, 25);
    System.out.println(natalTahunIni);
    //String
    String tanggal = "30/01/2022";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//    DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
    LocalDate pakeString = LocalDate.parse(tanggal,formatter);
    System.out.println(pakeString);
    //tanggal sekarang + 1 bulan
    LocalDate nowPlus1Month = LocalDate.now().plusMonths(1).plusDays(1);
    System.out.println(nowPlus1Month);
    String dateFormat = nowPlus1Month.
        format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    System.out.println(dateFormat);
    String zoned = ZonedDateTime
        .now(ZoneId.of("America/Toronto"))
        .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)
            .withLocale(Locale.GERMANY));

    List<Locale> locales = Arrays.asList(Locale.getAvailableLocales());
    for(Locale locale : locales){
      String temp = ZonedDateTime
          .now(ZoneId.of("America/Toronto"))
          .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(locale));
      System.out.println(locale.toString() + " = " + temp);
    }
    System.out.println(zoned);

    //isBefore / isAfter
    LocalDate hendriBirthDay = LocalDate.of(1992,8,30);
    LocalDate hanifBirthDay = LocalDate.of(1995,6,15);
    System.out.println(hendriBirthDay.isBefore(hanifBirthDay));
    System.out.println(hendriBirthDay.isAfter(hanifBirthDay));
    System.out.println(hendriBirthDay.isLeapYear());
    LocalDate hendriBirthDayNextFriday = hendriBirthDay.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
    System.out.println(hendriBirthDayNextFriday);
    System.out.println(hendriBirthDay.getDayOfWeek());
    System.out.println(hendriBirthDay.getDayOfYear());
    System.out.println(hendriBirthDay.get(ChronoField.ALIGNED_WEEK_OF_YEAR));
    System.out.println(hendriBirthDay.getMonth());

    Period period = hendriBirthDay.until(hanifBirthDay);
    System.out.println("Selisih :");
    System.out.println("Tahun :" + period.getYears());
    System.out.println("Bulan :" + period.getMonths());
    System.out.println("Hari :" + period.getDays());
    long weeks = ChronoUnit.WEEKS.between(hendriBirthDay, hanifBirthDay);
    System.out.println(weeks);
    long days = ChronoUnit.DAYS.between(hendriBirthDay, hanifBirthDay);
    System.out.println(days);
//    Monday, December 20, 2021
//    Tuesday, December 21, 2021/

  }

}
