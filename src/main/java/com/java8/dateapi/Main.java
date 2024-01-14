package com.java8.dateapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        //LocalDate myDOB = LocalDate.of(1994,8,16);
        //LocalDate myDOB = LocalDate.parse("1994-08-16");
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        //LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.DAYS);
        Duration duration = Duration.between(dateNow, tomorrow);
        System.out.println(duration);
    }
}
