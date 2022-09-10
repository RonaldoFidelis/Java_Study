package Exe_Matriz02;
import java.util.Scanner;
public class exe04 {
    public static void main(String[] args) {
        Scanner Atribuir = new Scanner(System.in);

        float[][] notas = new float[10][3];
        float notasAluno = 0;
        for (int linha = 0; linha <=notas.length -1; linha++){
            for (int coluna = 0; coluna <= notas[linha].length -1;coluna++){
                System.out.println("Digite sua nota: ");
                notas[linha][coluna] = Atribuir.nextFloat();
            }
        }
        for (int linha=0; linha < notas.length; linha++){
            for (int coluna=0; coluna < notas[linha].length; coluna++){
                if (notas[linha][coluna] >= 10) {
                    System.out.print(" |" + notas[linha][coluna]);
                } else {
                    System.out.print(" | " + notas[linha][coluna]);
                }
            }
            System.out.println(" |");
        }
    }
}
