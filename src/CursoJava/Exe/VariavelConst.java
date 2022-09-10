package CursoJava.Exe;
import java.util.Scanner;

public class VariavelConst {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        int num = 1;
        final int number = 3; // Const não pode ter valor alterado.

        System.out.println("Digite um valor para variavel:");
        num = Ler.nextInt();
        //number = 4;
        System.out.println("Varivel: "+num);
        System.out.println("Const: "+number);
    }
}
