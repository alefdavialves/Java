package Teste;

import java.util.Scanner;

public class Ex08 {

    public static void main (String[] args) {
        Scanner scanf = new Scanner(System.in);
        int num;

        System.out.println ("Digite um numero maior que 10: ");
        num = scanf.nextInt();

        if (num > 10) {

            System.out.println ("O seu numero eh maior que 10!!");

            num += num;

            System.out.println ("O dobro do seu numero eh " + num);

        }

        else {

            System.out.println ("Tem que ser maior que 10!");
        }




    }



}
