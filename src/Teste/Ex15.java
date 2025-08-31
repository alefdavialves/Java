package Teste;

import java.util.Scanner;

public class Ex15 {
    public static void main (String[] args) {
        Scanner scanf = new Scanner(System.in);

System.out.println("Calculadora com Switch");
System.out.println("Selecione \n + -> Adição \n - -> Subtração \n * -> Multiplicação \n / -> Divisão");

String operacao;
float num1, num2, resultado;

operacao = scanf.nextLine();

System.out.println("Digite o primeiro numero");
num1 = scanf.nextFloat();

System.out.println("Digite o segundo numero");
num2 = scanf.nextFloat();


switch (operacao) {

    case "+":
    resultado = num1 + num2;
    System.out.println("Adição \n Resultado:" + resultado);
    break;

    case "-":
    resultado = num1 - num2;
    System.out.println("Subtração \n Resultado:" + resultado);
    break;

    case "*":
    resultado = num1 * num2;
    System.out.println("Multiplicaçao \n Resultado:" + resultado);
    break;

    case "/":
    resultado = num1 / num2;
    System.out.println("Divisão \n Resultado:" + resultado);

    default:
        System.out.println("Operação inválida");

}


    }
}
