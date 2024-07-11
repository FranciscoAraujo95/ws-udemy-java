package application;

import entities.Person;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

    public class Program {
        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.print("Number of loops: ");
            int n = sc.nextInt();
            Person[] person = new Person[n];

            double sumOfAges = 0.0;
            for (int i = 0; i < person.length; i++) {
                System.out.printf("Person %d\n", i + 1);
                System.out.print("Enter your name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Enter your age: ");
                int age = sc.nextInt();
                System.out.print("Enter your occupation: ");
                sc.nextLine();
                String occupation = sc.nextLine();
                System.out.print("Enter your weight: ");
                double weight = sc.nextDouble();
                System.out.print("Enter your height: ");
                double height = sc.nextDouble();
                System.out.println();
                double imc = weight / Math.pow(height, 2);

                person[i] = new Person(name, age, occupation, weight, height, imc);

                sumOfAges += person[i].getAge();

            }

            System.out.print(Arrays.toString(person));

            double averageAge = sumOfAges / person.length;
            System.out.printf("\nAverage of ages: %.2f", averageAge);

            sc.close();
        }
    }
