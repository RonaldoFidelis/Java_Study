package ExePessoais;
import java.util.Arrays;
public class TesteJavaQuestao1 {

    static void linhaOrdenada(int[][] mat) {
        int[] vet = new int[mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int a = 0; a < mat[i].length; a++) {
                vet[a] = mat[i][a];
            }
            Arrays.sort(vet);
            for (int l = 0; l < mat[i].length; l++) {
                mat[i][l] = vet[l];
            }
        }
        System.out.println("\n" + "Matriz linha ordenada: ");
        for (int i = 0; i < mat.length; i++) {
            for (int a = 0; a < mat[i].length; a++) {
                System.out.print(mat[i][a] + "  ");
            }
            System.out.println();
        }
    }

    static void MatrizOriginal(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int a = 0; a < mat[i].length; a++)
                mat[i][a] = (int) (Math.random() * 10);
        }
        System.out.println("Matriz Original: ");
        for (int i = 0; i < mat.length; i++) {
            for (int a = 0; a < mat[i].length; a++) {
                System.out.print(mat[i][a] + "  ");
            }
            System.out.println();
        }
    }

    static void colunaOrdenada(int[][] mat) {
        int[] vet = new int[mat.length];

        for (int i = 0; i < mat[0].length; i++) {
            for (int a = 0; a <= mat[i].length; a++) {
                vet[a] = mat[a][i];
            }
            Arrays.sort(vet);
            for (int l = 0; l <= mat[i].length; l++) {
                mat[l][i] = vet[l];
            }
        }
        System.out.println("\n" + "Matriz coluna e linha ordenada: ");
        for (int i = 0; i < mat.length; i++) {
            for (int a = 0; a < mat[i].length; a++) {
                System.out.print(mat[i][a] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = new int[6][5];

        MatrizOriginal(mat);
        linhaOrdenada(mat);
        colunaOrdenada(mat);

    }
}
