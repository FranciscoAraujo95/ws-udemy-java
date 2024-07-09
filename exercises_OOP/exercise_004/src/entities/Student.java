package entities;

/*
Implemente uma classe chamada “Aluno” que possua atributos para armazenar o nome, a matrícula e as notas de um aluno.
Adicione métodos para calcular a média das notas e verificar a situação do aluno (aprovado ou reprovado).
 */
public class Student {

    //Attributes
    public String name, situation;
    public int registration;
    public double grade1, grade2, grade3;

    //Methods
    public double calculateAverage(double grade1, double grade2, double grade3) {
        return (grade1 + grade2 + grade3) / 3;
    }

    public String checkSituation() {
        double avg = calculateAverage(grade1, grade2, grade3);
        if (avg >= 7) {
            situation = "You passed!";
        } else if (avg < 5) {
            situation = "You failed!";
        } else {
            situation = "You'll have to try again!";
        }
        return situation;
    }

    public String toString() {
        return "\nName: "
                + name
                + ".\nRegistration: "
                + registration
                + ".\nAverage: "
                + String.format("%.2f", calculateAverage(grade1, grade2, grade3))
                + "\n"
                + checkSituation()
                + ".";
    }


}
