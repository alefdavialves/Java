package Teste;
import java.util.Scanner;
public class Ex12 {

    public static void main (String[] args) {

    Scanner scanf = new Scanner (System.in);
    String c;

System.out.println("Digite um numero: ");
c = scanf.nextLine();

if (c.equals("0")) System.out.println("ZERO");
else if (c.equals("1")) System.out.println("ONE");
else if (c.equals("2")) System.out.println("TWO");
else if (c.equals("3")) System.out.println("THREE");
else if (c.equals("4")) System.out.println("FOUR");
else if (c.equals("5")) System.out.println("FIVE");
else if (c.equals("6")) System.out.println("SIX");
else if (c.equals("7")) System.out.println("SEVEN");
else if (c.equals("8")) System.out.println("EIGHT");
else if (c.equals("9")) System.out.println("NINE");
else if (c.equals("10")) System.out.println("TEN");
else System.out.println("Maior que 10");




    }
}
