package ExePessoais;
import java.util.Scanner;

public class Exe_0002_Somar_Dois_Números {
    public static void main(String[] args) {
        Scanner Atribuição = new Scanner(System.in);

        System.out.println("Digite o primeiro nº:");
        int n1 = Atribuição.nextInt();

        System.out.println("Digite o segundo nº:");
        int n2 = Atribuição.nextInt();

        var somar = n1 + n2;
        System.out.printf("A soma de %s e %s é %s",n1, n2, somar);
    }
}
