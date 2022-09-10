package ExeFaculdade_vetor01;
import java.util.Arrays;
public class Exe_VetorB {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        System.out.print("Vetor A:");
        for (int cont = 0; cont <= vetorA.length -1; cont++) {
            vetorA[cont] = cont + 3;
            System.out.print(" | "+vetorA[cont]);
        }
        System.out.println("\n"+"---------------------------------------------------");
        System.out.print("Vetor B:");
        for (int contB = 0; contB <= vetorB.length -1; contB++) {
            vetorB[contB] = contB +1;
            System.out.print(" | "+vetorB[contB]);
        }
        System.out.println("\n");
        for (int sub = 0; sub <= vetorC.length -1 ;sub++){
            vetorC[sub] = vetorA[sub] - vetorB[sub];
        }
        System.out.println(Arrays.toString(vetorC));
    }
}

