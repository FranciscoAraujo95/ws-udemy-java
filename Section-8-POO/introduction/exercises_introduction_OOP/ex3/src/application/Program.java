package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student s = new Student(60);

        System.out.print("Enter name and student's grades: ");
        s.name = sc.nextLine();
        s.a = sc.nextDouble();
        s.b = sc.nextDouble();
        s.c = sc.nextDouble();

        System.out.println();
        System.out.println("FINAL GRADE = " + String.format("%.2f", s.finalGrade()));

        if (s.finalGrade() >= s.minimumGrade) {
            System.out.println("YOU PASSED!! CONGRATULATIONS!");
        } else {
            System.out.println("FAILED!! YOU'LL HAVE TO DO THE TEST AGAIN!");
            double missingPoint = s.minimumGrade - s.finalGrade();
            System.out.println("MISSING " + String.format("%.2f", missingPoint) + " POINTS");
        }

        sc.close();
    }
}
