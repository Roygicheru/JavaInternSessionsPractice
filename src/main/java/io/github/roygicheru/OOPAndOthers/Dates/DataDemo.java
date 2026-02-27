package io.github.roygicheru.OOPAndOthers.Dates;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DataDemo {
    public static void main(String[] args) {
        System.out.println("--- 1. The Core 3 ---");
        System.out.println("Current Date: " + LocalDate.now());
        System.out.println("Current Time: " + LocalTime.now());
        System.out.println("Combined: " + LocalDateTime.now());

        System.out.println("\n--- 2. Time Travel (Math) ---");
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusDays(7);
        LocalDate lastDecade = today.minus(1, ChronoUnit.DECADES);

        System.out.println("Today: " + today);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("10 Years Ago: " + lastDecade);

        System.out.println("\n--- 3. Time Zones ---");
        ZonedDateTime localZone = ZonedDateTime.now();
        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("My Timezone: " + localZone);
        System.out.println("Tokyo Time: " + tokyoTime);
    }
}
