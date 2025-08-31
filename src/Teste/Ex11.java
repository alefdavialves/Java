package Teste;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        int num;

        Scanner scanf = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num = scanf.nextInt();

        if (num == 10) {
            System.out.println("O numero digitado eh igual a 10!");
        }

        else {

            if (num >= 10) {
                System.out.println("O numero digitado eh maior que 10!");

            }

            else {
                System.out.println("O numero digitado eh menor que 10!");
            }

        }
    }
}
