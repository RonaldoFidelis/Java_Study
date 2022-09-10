package Exe_Matriz02;

public class exe01 {
    public static void main(String[] args) {
         int[][] matIn = new int [3][4];
         int linha1 = 0; // Variavel referente a linha da matriz.
         int linha2 = 1;
         int linha3 = 2;

         //Laço de rep. para preencher a matriz
         for(int linhas = 0; linhas <= matIn.length -1; linhas++){
             for (int coluna = 0; coluna <= matIn[linhas].length -1; coluna++){
                    matIn[linhas][coluna] = linhas + coluna;
             }
         }

        System.out.println("\n"+"Matriz original:");
        for(int linha = 0; linha < matIn.length; linha++){
            for (int colunas = 0; colunas < matIn[linha].length; colunas++){
                System.out.print(" | " + matIn[linha][colunas]);
            }
            System.out.println(" |");
        }

        for(int linhas = 0; linhas <= matIn.length -1; linhas++){
            for (int coluna = 0; coluna <= matIn[linhas].length -1; coluna++){
                matIn[linhas][coluna] = linhas + coluna;
                    for (int i = 0; i <= matIn.length -1; i++){
                        int lin1 = matIn[linha1][i];
                        int lin3 = matIn[linha3][i];

                        matIn[linha2][i] = lin1;
                        matIn[linha1][i] = lin3;


                    }
            }
        }

        //Laço para exibir a matriz
        System.out.println("\n"+"Matriz invertida:");
         for(int linha = 0; linha < matIn.length; linha++){
             for (int colunas = 0; colunas < matIn[linha].length; colunas++){
                 System.out.print(" | " + matIn[linha][colunas]);
             }
             System.out.println(" |");
         }
    }
}
