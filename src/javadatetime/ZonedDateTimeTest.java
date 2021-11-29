package javadatetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ZonedDateTimeTest {

  public static void main(String[] args) {
    ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
    System.out.println(now);

    ZonedDateTime of = ZonedDateTime
        .of(2021, 1, 30, 10, 30, 30, 0, ZoneId.of("Asia/Tokyo"));
    System.out.println(of);

    String textTime = "17/08/2021-14:14:35.798950 Asia/Tokyo";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss.SSSSSS z");
    ZonedDateTime zonedDateTime = ZonedDateTime.parse(textTime, formatter);
    System.out.println(zonedDateTime);

    ZoneOffset offset = ZoneOffset.ofHours(7);
    ZonedDateTime offsetDateTime = ZonedDateTime.now(ZoneId.ofOffset("UTC", offset));
    System.out.println(offsetDateTime);

    //aku naik dari jakarta
    //Tanggal : 20 November 2021 : 15:00 [Asia/Jakarta]
    //Tiba di Jepang : 20 November 2021 : 21:00 [Asia/Tokyo]
    ZonedDateTime berangkat = ZonedDateTime
        .of(2021, 11, 20, 15, 0,0,0,ZoneId.of("Asia/Jakarta"));
    ZonedDateTime tiba = ZonedDateTime
        .of(2021, 11, 20, 16, 30,0,0,ZoneId.ofOffset("GMT",
            ZoneOffset.ofHoursMinutes(5, 30)));

    long lamaTerbang = berangkat.until(tiba, ChronoUnit.HOURS);
    System.out.println(lamaTerbang);

    ZonedDateTime jamTokyo = berangkat.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
    System.out.println(jamTokyo);

  }

}
