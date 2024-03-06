package com.TimeAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class App 
{
    public static void main( String[] args ) {
        // Exercise 1
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current LocalDate:" + currentDate);

        // Exercise 2
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Formatted LocalDate: " + formattedDate);

        // Exercise 3
        LocalDate lastMonday = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println("Last Monday: " + lastMonday);
        System.out.println("  Entire week:");
        for (int i = 0; i < 7; i++) {
            System.out.println("   " + lastMonday.plusDays(i).toString());
        }

        // Exercise 4
        LocalDate parsedDate = LocalDate.parse("2023-23-25");
        System.out.println("Parsed LocalDate: " + parsedDate);


        // Exercise 5
        LocalDate birthday = LocalDate.of(1995, 5, 8) ;
        Month month = birthday.getMonth();
        System.out.println("Month extracted from future date: " + month);

        // Exercise 6
        LocalDate futureDate = LocalDate.now().plusYears(10).minusMonths(10);
        Month  month = futureDate.getMonth();
        System.out.println("Month extracted from future date: " + month);


        // Exercise 7
        Period period = Period.between(birthday, futureDate);
        System.out.println("Elapsed period between birthday and future date: " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days ");


        // Exercise 8
        Period periodToAdd = Period.of(4, 7, 29);
        LocalDate futureDate2 = LocalDate.now().plus(periodToAdd);
        System.out.println("Future date after adding period: " + futureDate2);


        // Exercise 9
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current LocalTime: " + currentTime);


        // Exercise 10
        int nanoseconds = currentTime.getNano();
        System.out.println("Nanoseconds of current time: " + currentTime);

        // Exercise 11
        LocalTime parsedTime = LocalTime.parse("08:30:45");
        System.out.println("Parsed LocalTime: " + parsedTime);


        // Exercise 12
        DateTimeFormatter TimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(timeFormatter);
        System.out.println("Formatted LocalTime: " +formattedTime);


        // Exercise 13
        LocalDateTime dateTime = LocalDateTime.of(localDate.of(2018, 4, 5), LocalTime.of(10, 0));
        System.out.println("LocalDateTime: " + dateTime);


        // Exercise 14
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE d MMMM HH:mm");
        String formattedDateTime = dateTime.format(dateTimeFormatter);
        System.out.println("Formatted LocalDateTime: " + formattedDateTime);


        // Exercise 15
        LocalDateTime CombinedDateTime = LocalDateTime.of(LocalDateTime.of(2022, 9, 15), java.time.LocalTime.of(15, 30));
        System.out.println("Combined LocalDateTime: " + CombinedDateTime);


        // Exercise 16
        LocalDate extractedDate = combinedDateTime.toLocalDate();
        LocalDateTime extractedTime = combinedDateTime.toLocalTime();
        System.out.println("Extracted Date: " + extractedDate);
        System.out.println("     Extracted Date:    " + extractedTime);
    }
}
