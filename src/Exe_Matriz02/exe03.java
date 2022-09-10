package Exe_Matriz02;

public class exe03 {
    public static void main(String[] args) {
        int matrizM [][] = new int [2][2];
        int matrizR [][] = new int [2][2];
        int maiorNum = 0;


        System.out.println("=======Matriz M=======");
        for (int linha=0;linha <= matrizM.length -1; linha++){
            for(int coluna=0;coluna <= matrizM[linha].length -1; coluna++){
                matrizM[linha][coluna]= linha+coluna;
                if(maiorNum < matrizM[linha][coluna]){
                    maiorNum = matrizM[linha][coluna];
                    for(int linhaR = 0; linhaR <= matrizR.length -1; linhaR++){
                        for (int colunaR = 0; colunaR <= matrizR[linhaR].length -1;colunaR++){
                            int somaMat = linhaR + colunaR;
                            matrizR[linhaR][colunaR] = somaMat * maiorNum;
                        }
                    }
                }
            }
        }


        for (int linha=0; linha < matrizM.length; linha++){
            for (int coluna=0; coluna < matrizM[linha].length; coluna++){
                System.out.print(" | " + matrizM[linha][coluna]);
            }
            System.out.println(" |");
        }
        System.out.println("=======Matriz R=======");
        for (int linha=0; linha < matrizR.length; linha++){
            for (int coluna=0; coluna < matrizR[linha].length; coluna++){
                System.out.print(" | " + matrizR[linha][coluna]);
            }
            System.out.println(" |");
        }
    }
}
