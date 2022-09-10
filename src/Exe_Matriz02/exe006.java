package Exe_Matriz02;
//Vetor invertido
import java.util.Random;
public class exe006 {

    public static void main(String[] args) {
        int vetor[] = new int[10];
        int temp = 0;
        Random gerar = new Random();

        for (int i = 0; i <= vetor.length - 1; i++) {
            vetor[i] = gerar.nextInt(10);
        }
        System.out.println("Vetor não invertido");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" | " + vetor[i]);
        }
        System.out.println("\n");
        System.out.println("Vetor invertido");
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    temp = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = temp;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" | " + vetor[i]);
        }
    }
}

