package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //ISO 8601
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now(); //Local date without minutes and seconds
        LocalDateTime d02 = LocalDateTime.now(); //Local date with minutes and seconds
        Instant d03 = Instant.now(); //Global date with minutes and seconds considering GMT from London

        LocalDate d04 = LocalDate.parse("1995-08-15");//Converting a String to an object Date
        LocalDateTime d05 = LocalDateTime.parse("1995-08-15T01:30:26");//Same thing from above
        Instant d06 = Instant.parse("1995-08-15T01:30:26Z");
        Instant d07 = Instant.parse("1995-08-15T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2005, 8, 15);
        LocalDateTime d11 = LocalDateTime.of(2005, 8, 15, 9, 35);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d08 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

        sc.close();
    }
}
