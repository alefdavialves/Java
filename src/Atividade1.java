import java.util.Scanner;

public class Atividade1 {


public static void main(String[] args) {


class Aluno{
    String nome;
    int idade;

}
        Scanner scanf = new Scanner (System.in);

Aluno aluno1 = new Aluno();
Aluno aluno2 = new Aluno();

System.out.println("Nome 1: ");
aluno1.nome = scanf.nextLine();

System.out.println("Idade 1: ");
aluno1.idade = scanf.nextInt();

System.out.println("Nome 2: ");
aluno2.nome = scanf.nextLine();
scanf.nextLine();

System.out.println("Idade 2: ");
aluno2.idade = scanf.nextInt();

System.out.println("Aluno 1: " + aluno1.nome + ", " + aluno1.idade);
System.out.println("Aluno 2: " + aluno2.nome + ", " + aluno2.idade);


    }
}
