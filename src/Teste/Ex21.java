package Teste;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner (System.in);

int a, b, c;

System.out.println("Digite o valor inferior do intervalo: ");
a = scanf.nextInt();

System.out.println("Digite o valor superior do intervalo: ");
b = scanf.nextInt();

a++;

for (c = a; c < b; c++) {
    System.out.println(c);

}


    }

}
