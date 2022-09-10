package Exe_Matriz;
import java.util.Scanner;

public class Exe_01_preencher {
    public static void main(String[] args) {
        int[][] matInt = new int[3][4];
        // [3] = linha [4] = colunas;
        //Scanner ler = new Scanner(System.in);
        //Primeiro for para percorre a qtd de linha
        for (int linhas = 0; linhas < matInt.length; linhas++) {
            //Segundo for para percorrer a qtd de colunas
            for (int colunas = 0; colunas < matInt[linhas].length; colunas++) {
                    matInt[linhas][colunas] = linhas + colunas;
            }
        }
        // For para ler os valores da matriz, segue a mesma logica do primeiro for, percorrendo toda a matriz.
        for (int linhas = 0; linhas < matInt.length; linhas++) {
            for (int colunas = 0; colunas < matInt[linhas].length; colunas++) {
                System.out.print("|"+ matInt[linhas][colunas]);
            }
            //Esse println está dentro do primeiro for, para pular as linhas
            System.out.println("|");
        }

    }
}