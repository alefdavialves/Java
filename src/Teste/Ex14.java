package Teste;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

    Scanner scanf = new Scanner (System.in);

System.out.println("CALCULADORA EM JAVA");
System.out.println("Selecione");
System.out.println("+ -> ADIÇÃO");
System.out.println ("- -> SUBTRAÇÂO");
System.out.println ("* -> MULTIPLICACAO");
System.out.println ("/-> DIVISAO");

String operacao;
float num1, num2,resultado;

System.out.println("Digite a operacao: ");
operacao = scanf.nextLine();

System.out.println("Digite o primeiro numero: ");
num1 = scanf.nextFloat();

System.out.println("Digite o segundo numero: ");
num2 = scanf.nextFloat();

if (operacao.equals("+")){

    System.out.println("Adição num1 + num2");
    resultado = num1 + num2;
    System.out.println("Resultado: " + resultado);

}

else {
    if (operacao.equals("-")) {

    System.out.println("Subtração num1 - num2");
    resultado = num1 - num2;
    System.out.println("Resultado: " + resultado);

    }

else {
    if (operacao.equals("*")) {

    System.out.println("Multiplicação num1 * num2");
    resultado = num1 * num2;
    System.out.println("Resultado: " + resultado);

    }

    else{

        if  (operacao.equals("/")) {
    System.out.println("Divisao num1 / num2");
    resultado = num1 / num2;
    System.out.println("Resultado: " + resultado);


        }

        else {
            System.out.println("Operação não reconhecida");
        }

}
}
}
}
}
