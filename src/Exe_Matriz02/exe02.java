package Exe_Matriz02;

import javax.imageio.ImageTranscoder;

public class exe02 {
    public static void main(String[] args) {
        int[][] matInt = new int[10][10];
        int linha2 = 1;
        int coluna4 = 3;
        int linha5 = 4;
        int linha8 = 7;
        int coluna10 = 9;


        for (int linha = 0; linha <= matInt.length - 1; linha++) {
            for (int coluna = 0; coluna <= matInt[linha].length - 1; coluna++) {
                matInt[linha][coluna] = linha + coluna;
            }
        }
        System.out.println("===========Matriz sem alteração===========");
        for (int linha = 0; linha < matInt.length; linha++) {
            for (int coluna = 0; coluna < matInt[linha].length; coluna++) {
                if (matInt[linha][coluna] >= 10) {
                    System.out.print(" |" + matInt[linha][coluna]);
                } else {
                    System.out.print(" | " + matInt[linha][coluna]);
                }
            }
            System.out.println(" |");
        }
        System.out.println("\n");
        System.out.println("==============Matriz alterada==============");


        //int diagonal[] = new int[matInt.length];
        for (int linha = 0; linha <= matInt.length -1;linha++){
            for (int coluna = 0; coluna <= matInt[linha].length -1;coluna++){
                matInt[linha][coluna] = linha + coluna;
                    for (int i = 0; i < 10; i++) {
                        int diagonalSeg = matInt[i][10 - 1 - i];
                        int lin8 = matInt[linha8][i];
                        int col10 = matInt[i][coluna10];

                        matInt[linha2][i] = lin8;
                        matInt[i][coluna4] = col10;
                        matInt[linha5][i] = col10;
                        matInt[i][i] = diagonalSeg;
                    }
            }
        }

        for (int linha = 0; linha < matInt.length; linha++) {
            for (int coluna = 0; coluna < matInt[linha].length; coluna++) {
                if (matInt[linha][coluna] >= 10) {
                    System.out.print(" |" + matInt[linha][coluna]);
                } else {
                    System.out.print(" | " + matInt[linha][coluna]);
                }
            }
            System.out.println(" |");
        }
    }
}
