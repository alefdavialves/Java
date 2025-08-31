import java.util.Scanner;


public class Atividade3 {
    public static void main(String[] args) {
Scanner scanf = new Scanner(System.in);

class Endereco {

String rua;
int numero;
}

class Aluno {
    String nome;
    int idade;
    Endereco endereco;

}

Aluno aluno = new Aluno();

System.out.println("Rua");
aluno.endereco.rua = scanf.nextLine();

System.out.println("Rua informada: " + aluno.endereco.rua);



    }
}
