package Teste;
import java.util.Scanner;

public class Ex18 {
    public static void main (String[] args) {
    Scanner scanf = new Scanner(System.in);

    int a, b;

    System.out.println("Digite o limite máximo inferior: ");
    a=scanf.nextInt();

    System.out.println("Digite o limite máximo superior: ");
    b=scanf.nextInt();

a++;

do {
    System.out.println(a);
    a++;

} while (a < b);


    }

}
