package ExeFaculdade_vetor02;

import java.util.Arrays;

public class vetorA {
    public static void primo(int[] numero) {
        for (int j = 2; j < numero.length; j++) {
            if (numero[j] % j == 0);
                //System.out.println(Arrays.toString(j));
        }
    }
    public static void main(String[] args) {
        int[] vA = new int[15];
        int cont = 0;


        for (cont = 0; cont < vA.length; cont++) {
            vA[cont] = cont + 1;
        }
        primo(vA);
        System.out.println(Arrays.toString(vA));
    }
}