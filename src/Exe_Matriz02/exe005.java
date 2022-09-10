package Exe_Matriz02;
// Menor e Maior valor.

public class exe005 {

    public static void main(String[] args) {
        int matriz [][] = new int[4][7];
        int maiorValor = 0;
        int menorValor = 0;
        int posLinha =0;

        for (int linha = 0; linha <= matriz.length -1; linha++){
            for (int coluna = 0; coluna <= matriz[linha].length -1; coluna++){
                matriz[linha][coluna] = linha + coluna;
            }
        }
        for (int x = 0; x<matriz.length;x++){
            for (int y = 0; y<matriz[x].length;y++){
                System.out.print(" | " + matriz[x][y]);
            }
            System.out.println(" |");
        }

        //For para achar o menor valor.
        for (int x = 0; x < matriz.length; x++){
            for (int y = 0; y <matriz[x].length;y++) {
                if(matriz[x][y] < menorValor){
                    menorValor = matriz[x][y];
                }
            }
        }

        //For para achar o maior valor
        for (int x = 0; x < matriz.length; x++){
            for (int y = 0; y <matriz[x].length;y++){
                if (maiorValor < matriz[x][y]){ //Como já declaramos a variavel maiorValor = 0
                    maiorValor = matriz[x][y]; //Todo valor que for maior que 0, vai ser atribuido a varivel.

                }
            }
        }
        System.out.println("O menor valor é: " + menorValor);
        System.out.println("O maior valor é: " + maiorValor);
    }
}
