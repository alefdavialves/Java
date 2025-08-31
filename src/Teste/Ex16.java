package Teste;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
Scanner scanf = new Scanner(System.in);

String aluno;
int numAulas, numFaltas;
double media, frequencia, n1, n2, n3;

System.out.println("Digite o nome do aluno: ");
aluno = scanf.nextLine();

System.out.println("Digite a primeira nota: ");
n1 = scanf.nextDouble();

System.out.println("Digite a segunda nota: ");
n2 = scanf.nextDouble();

System.out.println("Digite a terceira nota: ");
n3 = scanf.nextDouble();

System.out.println ("Numero total de aulas: ");
numAulas = scanf.nextInt();

System.out.println("Numero total de faltas: ");
numFaltas = scanf.nextInt();

media = ((n1 * 1) + (n2 * 1) + (n3 * 2))/4;

frequencia = 100.0 - ((numFaltas * 100) / numAulas);

System.out.println("Aluno: " + aluno);
System.out.println("Média: " + media);
System.out.println("Frequencia: " + frequencia);

if (frequencia < 75.0) {
    System.out.println("O aluno " + aluno + "com media " + media + " teve uma frequencia de " + frequencia);
    System.out.println(" Portanto esta REPROVADO (Por falta ");
}

else {
    if (media >= 7.0) {
        System.out.println("O aluno " + aluno + " com media " + media + " teve uma frequencia de " + frequencia);
        System.out.println(" Portanto esta APROVADO ");

    }
    else {
        System.out.println("O aluno " + aluno + " com media " + media + " teve uma frequencia de " + frequencia);
        System.out.println(" Portanto esta REPROVADO (Por nota)");

    }

}


    }
}
