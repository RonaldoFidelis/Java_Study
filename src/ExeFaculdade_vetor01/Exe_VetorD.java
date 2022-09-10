package ExeFaculdade_vetor01;

import java.util.Arrays;

public class Exe_VetorD {
    public static void main(String[] args) {
        double[] vetorA = new double[15];
        double[] vetorB = new double[15];

        for(int cont = 0; cont < vetorA.length; cont++) {
            vetorA[cont]=cont+1;
        }
        System.out.println(Arrays.toString(vetorA));

        for(int contB = 0; contB < vetorB.length; contB++) {
            vetorB[contB] = Math.pow(vetorA[contB],2);
        }

        System.out.println(Arrays.toString(vetorB));
    }
}
