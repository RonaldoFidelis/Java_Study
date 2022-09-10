package ExePessoais;
import java.util.Scanner;

public class Exe_0001_HelloWorld {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Hello World");

        System.out.print("Digite seu nome: ");
        String name = leitor.nextLine();
        System.out.printf("Olá %s!", name); // Usei o printf para formata o %s(s= String)
    }
}
