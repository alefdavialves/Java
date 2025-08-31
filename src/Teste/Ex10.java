package Teste;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
Scanner scanf = new Scanner (System.in);

        int nota;

        System.out.println("Digite sua nota: ");
        nota = scanf.nextInt();

        if (nota > 6 && nota <= 10) {

            System.out.println ("Passou com a nota " + nota);

        }

        else if (nota > 10) {

            System.out.println ("Digite uma nota menor que 10");


        }

        if (nota < 6) {

            System.out.println ("O aluno devera fazer a substituitiva");
        }

    }
}