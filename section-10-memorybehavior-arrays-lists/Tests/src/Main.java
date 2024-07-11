import java.util.Locale;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of grades, than inform them right below: ");
            int n =  sc.nextInt();
            double[] vect = new double[n];

            double sum = 0.0;
            for (int i = 0; i < vect.length; i++) {
                vect[i] = sc.nextDouble();
                sum += vect[i];
            }

            double averageGrade = sum / n;
            System.out.printf("The average grade is %.2f%n", averageGrade);

            if (averageGrade >= 7) {
                if (averageGrade == 10) {
                    System.out.print("Passed with maximum grade! Congratulations!");
                } else {
                    System.out.print("You passed!");
                }
            } else if (averageGrade < 5) {
                System.out.print("You failed!");
            } else {
                System.out.print("You'll have to tray again!");
            }

            System.out.println();
            sc.close();

        }
    }