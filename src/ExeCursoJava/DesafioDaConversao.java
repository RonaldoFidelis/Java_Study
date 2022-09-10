package ExeCursoJava;
import java.util.Scanner;

public class DesafioDaConversao {
    public static void main(String[] args) {
        Scanner atribuir = new Scanner(System.in);

        System.out.println("Primeiro salario: ");
        String x = atribuir.nextLine().replace(",", ".");
        System.out.println("Segundo salario: ");
        String y = atribuir.nextLine().replace(",", ".");
        System.out.println("Terceiro salario: ");
        String z = atribuir.nextLine().replace(",", ".");


        double primeiro, segundo, terceiro, media;

        primeiro = Double.parseDouble(z);
        segundo = Double.parseDouble(z);
        terceiro = Double.parseDouble(z);

        media = (primeiro + segundo + terceiro) / 3;

        System.out.println("\n A média é: " + media);

    }
}
