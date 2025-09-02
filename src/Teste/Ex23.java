package Teste;

public class Ex23 {
public static void main(String[] args) {

double salario = 1.000;
int i;
double aumento = 0.015;

for (i = 1; i <= 7; i++) {

    salario = salario * (aumento + 1);

}
System.out.println("Seu salário em 2025 eh: " + salario);






}
}
