package ExePessoais;
import java.util.Arrays;

public class TesteJavaQuestao2 {

    static void trocaElemento(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int menor = 10, guarda;

            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < menor) {
                    menor = mat[i][j];
                    guarda = mat[i][0];
                    mat[i][0] = menor;
                    mat[i][j] = guarda;
                }
            }
        }
    }

        public static void matrizOriginal(int[][] mat) {
            for (int i = 0; i < mat.length; i++) {
                for (int a = 0; a < mat[i].length; a++)
                    mat[i][a] = (int) (Math.random() * 10);
            }
            System.out.println("Matriz sem alteração: ");
            for (int i = 0; i < mat.length; i++) {
                for (int a = 0; a < mat[i].length; a++) {
                    System.out.print(mat[i][a] + "  ");
                }
                System.out.println();
            }

            System.out.println ("\n" + "Matriz com o menor elemento: ");
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j] + "  ");
                }System.out.println();
            }
        }


    static void colunaOrdenada(int[][] mat) {
        int[] vet = new int[mat.length];

        for (int i = 0; i < mat[0].length; i++) {
            for (int a = 0; a <= mat[i].length; a++) {
                vet[a] = mat[a][0];
            }
            Arrays.sort(vet);
            for (int l = 0; l <= mat[i].length; l++) {
                mat[l][0] = vet[l];
            }
        }
        System.out.println("\n" + "Matriz com menor valor coluna ordenada: ");
        for (int i = 0; i < mat.length; i++) {
            for (int a = 0; a < mat[i].length; a++) {
                System.out.print(mat[i][a] + "  ");
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
            int[][] mat = new int[6][5];

            matrizOriginal(mat);
            trocaElemento(mat);
            colunaOrdenada(mat);

        }

}
