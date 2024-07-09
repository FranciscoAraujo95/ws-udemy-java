package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

/*
Implemente uma classe chamada “Aluno” que possua atributos para armazenar o nome, a matrícula e as notas de um aluno.
Adicione métodos para calcular a média das notas e verificar a situação do aluno (aprovado ou reprovado).
 */
public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter the name of the student: ");
        student.name = sc.nextLine();

        System.out.print("Enter registration of the student: ");
        student.registration = sc.nextInt();

        System.out.println("Enter the three grades of the student: ");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        double average = student.calculateAverage(student.grade1, student.grade2, student.grade3);

        System.out.println(student);

        sc.close();

    }
}
