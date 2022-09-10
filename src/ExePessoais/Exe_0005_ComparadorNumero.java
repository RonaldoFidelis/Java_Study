package ExePessoais;
import java.util.Scanner;
import java.util.Arrays;

public class Exe_0005_ComparadorNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numOne;
        int numTwo;

        System.out.println("Digite o primerio n°: ");
        numOne = ler.nextInt();
        System.out.println("Digite o segundo n°: ");
        numTwo = ler.nextInt();

        if (numOne == numTwo){
            System.out.println("Iguais");
        }else {
            System.out.println("Diferente");
        }
    }
}
