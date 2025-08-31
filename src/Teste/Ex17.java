package Teste;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

    int n, n1 = 0, x;
    int media = 0;

    System.out.println("Digite a quantidade de numeros: ");
    n = scanf.nextInt();

    while (n1 < n) {
        System.out.println("Entre com o numero " + (n1+1) + ": ");
        x = scanf.nextInt();

        media = media + x;

        n1++;
    }

    media = media / n;

    System.out.println("Media calculada: " + media);

    }
}
