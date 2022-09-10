package ExePessoais;
import java.util.Scanner;

public class Exe_0003_Divisão {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("------DIVISÃO------");

        System.out.print("Digite o primeiro nº: ");
        Float n1 = leitor.nextFloat();
        System.out.print("Digite o primeiro nº: ");
        Float n2 = leitor.nextFloat();

        var div = n1 / n2;
        System.out.printf("A divisão de %s por %s é: %.f", n1, n2, div);
    }
}
