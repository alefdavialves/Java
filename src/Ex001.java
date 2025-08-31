import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {

        int idade;
        String nome;
        float altura;

        Scanner scanf = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = scanf.nextLine();

        System.out.println("Digite sua idade: ");
        idade = scanf.nextInt();

        System.out.println("Digite sua altura: ");
        altura = scanf.nextFloat();


        System.out.println("Seu nome eh: " + nome + "\n");
        System.out.println("Sua idade eh: " + idade+ "\n");
        System.out.println("Sua altura eh: " + altura);
    }

}
