package ExeFaculdade_vetor01;

public class Exe_VetorA {
    public static void main(String[] args) {
        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        System.out.print("Vetor A:");
        for (int contA = 0;contA < vetorA.length-1; contA++) {
            vetorA[contA] = contA + 1;

            System.out.print(" | "+vetorA[contA]);
        }
        System.out.println("\n");
        System.out.print("Vetor B:");
        for (int contB = 0; contB <= vetorB.length-1; contB++) {
            vetorB[contB] = contB * 3;
            System.out.print(" | "+vetorB[contB]);
        }
    }
}