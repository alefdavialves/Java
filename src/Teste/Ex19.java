package Teste;
import  java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

    int a, b;
    System.out.println("Digite o valor do limite inferior do intervalo");
    a = scanf.nextInt();

    System.out.println("Digite o valor do limite superior do intervalo");
    b = scanf.nextInt();

    a++;

while (a < b) {
    System.out.println(a + " ");
    a++;

    }
    }
}
