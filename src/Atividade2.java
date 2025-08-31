import java.util.Scanner;

public class Atividade2 {


    public static void main(String[] args) {


        class Aluno{
            String nome;
            int idade;

        }
        Scanner scanf = new Scanner (System.in);

        Aluno[] aluno = new Aluno[2];

        System.out.println("Nome 1: ");
        aluno[0].nome = scanf.nextLine();

        System.out.println("Idade 1: ");
        aluno[0].idade = scanf.nextInt();

        System.out.println("Nome 2: ");
        aluno[1].nome = scanf.nextLine();
        scanf.nextLine();

        System.out.println("Idade 2: ");
        aluno[1].idade = scanf.nextInt();

        System.out.println("Aluno 1: " + aluno[0].nome + ", " + aluno[0].idade);
        System.out.println("Aluno 2: " + aluno[1].nome + ", " + aluno[1].idade);


    }
}
