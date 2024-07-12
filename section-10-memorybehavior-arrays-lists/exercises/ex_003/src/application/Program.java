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

        double sumHeight = 0;
        double peopleUnderSixteen = 0;
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

        }

        System.out.print("Names of the people under sixteen: \n");
        for (Person person : people) {
            if (person.getAge() < 16) {
                System.out.printf("%s ", person);
                peopleUnderSixteen++;
            }
        }

        double avgHeight = sumHeight / people.length;
        double percentUnderSixteen = peopleUnderSixteen / people.length * 100;

        System.out.println();
        System.out.printf("Average height: %.2f", avgHeight);
        System.out.printf("\nPeople under sixteen years: %.1f, or %.2f%%", peopleUnderSixteen, percentUnderSixteen);
        System.out.println();

        sc.close();
    }
}
