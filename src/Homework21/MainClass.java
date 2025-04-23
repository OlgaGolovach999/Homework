package Homework21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainClass {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru"));
        String formattedDate = currentDate.format(formatter1);
        System.out.println("Задача 1: " + formattedDate);

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter datePartFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru"));
        DateTimeFormatter timePartFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a", Locale.ENGLISH);
        String formattedDateTime = currentDateTime.format(datePartFormatter)
                + ", " + currentDateTime.format(timePartFormatter);
        System.out.println("Задача 2: " + formattedDateTime);

        String inputDateTime1 = "2023-03-19 : 10:12:24 AM";
        DateTimeFormatter parser1 = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a", Locale.ENGLISH);
        LocalDateTime parsedDateTime1 = LocalDateTime.parse(inputDateTime1, parser1);
        System.out.println("Задача 3: " + parsedDateTime1);

        String inputDateTime2 = "пн 20.03.23 г. время: 15:07:28";
        DateTimeFormatter parser2 = DateTimeFormatter.ofPattern("E dd.MM.yy 'г.' 'время:' HH:mm:ss", new Locale("ru"));
        LocalDateTime parsedDateTime2 = LocalDateTime.parse(inputDateTime2, parser2);
        System.out.println("Задача 4: " + parsedDateTime2);

        DateTimeFormatter ruFullDateFormatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", new Locale("ru"));
        DateTimeFormatter engTimeFormatterForTask5 = DateTimeFormatter.ofPattern("hh.mm.ss a", Locale.ENGLISH);
        String formattedDateTime5 = currentDateTime.format(ruFullDateFormatter)
                + " время: " + currentDateTime.format(engTimeFormatterForTask5);
        System.out.println("Задача 5: " + formattedDateTime5);
    }
}