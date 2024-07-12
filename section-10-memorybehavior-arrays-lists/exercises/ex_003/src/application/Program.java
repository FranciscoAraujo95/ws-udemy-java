package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will you enter data? ");
        int n = sc.nextInt();

        Person[] people = new Person[n];
        Person[] names = new Person[n];

        double sumHeight = 0;
        double peopleUnderSixteen = 0;
        StringBuilder peopleName = new StringBuilder();
        for (int i = 0; i < people.length; i++) {

            System.out.printf("Data of person number:  %d\n", i + 1);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            System.out.println();

            people[i] = new Person(name, age, height);
            sumHeight += people[i].getHeight();

            if (people[i].getAge() < 16) {
                peopleUnderSixteen++;
                peopleName.append(people[i].getName()).append("\n");

            }

        }

        double avgHeight = sumHeight / people.length;
        double percentUnderSixteen = peopleUnderSixteen / people.length * 100;

        System.out.printf("Average height: %.2f", avgHeight);
        System.out.printf("\nPeople under sixteen years: %.1f, or %.2f%%", peopleUnderSixteen, percentUnderSixteen);
        System.out.println();
        System.out.print(peopleName);

        System.out.println();
        sc.close();
    }
}
