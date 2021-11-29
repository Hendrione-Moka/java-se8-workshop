package javadatetime;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.UUID;

public class InstantTest {

  public static void main(String[] args) {
    Instant instant = Instant.now();
    ZonedDateTime dateTime = ZonedDateTime.ofInstant(instant, ZoneId.of("UTC"));
    System.out.println(dateTime);
    OffsetDateTime offsetDateTime = OffsetDateTime
        .ofInstant(instant, ZoneId.ofOffset("UTC", ZoneOffset.ofHoursMinutes(3,30)));
    System.out.println(offsetDateTime);
    System.out.println(instant);
    System.out.println(instant.toEpochMilli());
    //UUID
    System.out.println(UUID.randomUUID());
  }

}
