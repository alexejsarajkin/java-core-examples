package com.ocp.book.selikoff_boyarsky.practice_tests.chapter17;

import java.time.*;

public class Question13 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2017, Month.NOVEMBER, 5);
        LocalTime localTime = LocalTime.of(1, 0);
        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime z = ZonedDateTime.of(localDate, localTime, zone);
        for (int i = 0; i < 6; i++) z.plusHours(1);
        System.out.println(z.getHour());
    }
}
