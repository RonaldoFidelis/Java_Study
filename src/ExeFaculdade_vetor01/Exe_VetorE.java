package ExeFaculdade_vetor01;

import java.util.Arrays;

public class Exe_VetorE {
    public static void main(String[] args) {
        int[] vetorA = new int[20];
        int[] vetorB = new int[20];

        for(int contador = 0; contador < vetorA.length; contador++) {
            vetorA[contador]= contador+1;
        }System.out.println("VetorA: " + Arrays.toString(vetorA));

        int inverter = vetorA.length - 1;
        for(int contB = 0; contB < vetorB.length; contB++) {
            vetorB[contB] = vetorA[inverter];
            inverter--;
        }System.out.println("VetorB:" + Arrays.toString(vetorB));
    }
}
