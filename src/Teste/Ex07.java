package Teste;

public class Ex07 {

    public static void main (String[] args) {

        //1

        int x, y, z;

        x = y = 10;
        z = ++x;
        x -=x;
        y++;

        System.out.println("x = " + x + ",y = " + y + ",z = " + z + "\n\n");

        //2
        int a = 14;
        int b = 3;
        float c;

        x = a / b;
        y = a % b;
        c = y / x;

        System.out.println("x = " + x + ",y = " + y + ",c = " + c + "\n\n");

        // Com x / y

        c = x = x / y;
        System.out.println("x = " + x + ",y = " + y + ",c = " + c + "\n\n");

        //3
        x = 7;

        if ((x > 5) || (x > 10)) {

            System.out.println("1a expressao eh verdadeira");
        }

        else {
        System.out.println("1a expressao eh falsa");

        }

    }

}
