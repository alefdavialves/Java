package Teste;
import java.util.Scanner;

public class Ex09 {

    public static void main (String[] args) {
        Scanner scanf = new Scanner(System.in);
        int num;

        System.out.println ("Digite um numero: ");

        num = scanf.nextInt();

        if (num == 10) {

            System.out.println ("O numero eh igual a 10!");

        }

        else {

            System.out.println ("O numero era 10!");
        }

    }
}
