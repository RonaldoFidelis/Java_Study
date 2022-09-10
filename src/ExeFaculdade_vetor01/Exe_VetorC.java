package ExeFaculdade_vetor01;

import java.util.Arrays;

public class Exe_VetorC {
    public static void main(String[] args) {
        int[] vetorA = new int[5];
        int[] vetorB = new int[10];
        int[] vetorC = new int[vetorA.length + vetorB.length];

        for (int x = 0; x < vetorA.length; x++) {
            vetorA[x] = x + 1;
        }
        System.out.println(Arrays.toString(vetorA));

        for (int y = 0; y < vetorB.length; y++) {
            vetorB[y] = y + 6;
        }
        System.out.println(Arrays.toString(vetorB));

        for (int z = 0;z< vetorA.length;z++){
            vetorC[z]= vetorA[z];
        }
        for(int Cont = 0; Cont< vetorB.length;Cont++){
            vetorC[Cont + vetorA.length] = vetorB[Cont];
        }
        System.out.println(Arrays.toString(vetorC));
    }
}
