package com.ocp.book.selikoff_boyarsky.practice_tests.chapter17;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

public class Question11 {
    public static void main(String[] args) {
        LocalDate montyPythonDay = LocalDate.of(2017, Month.MAY, 10);
        LocalDate aprilFools = LocalDate.of(2018, Month.APRIL, 1);
        Duration duration = Duration.ofDays(1);
        LocalDate result = montyPythonDay.minus(duration);
        System.out.println(result + " " + aprilFools.isBefore(result));
    }
}
