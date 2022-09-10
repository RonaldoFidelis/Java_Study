package ExePessoais;
import java.util.Scanner;

public class testeJava {
    public static void main(String[] args) {
        int matrizOriginal[][] = new int[6][5];
        int matrizMenorValor[][]=matrizOriginal;
        int menorValorLinha=matrizMenorValor[0][0];
        Scanner atribuir=new Scanner(System.in);
        for (int linha=0;linha<=matrizOriginal.length-1;linha++){
            for (int coluna=0;coluna<=matrizOriginal[linha].length-1;coluna++){
                System.out.print("Digite um número: ");
                matrizOriginal[linha][coluna]= atribuir.nextInt();
            }
        }
        System.out.println("Matriz Original:");
        for (int linha=0;linha<matrizOriginal.length;linha++){
            for (int coluna=0;coluna<matrizOriginal[linha].length;coluna++){
                System.out.print(" | "+matrizOriginal[linha][coluna]);
            }
            System.out.println("|");
        }
        System.out.println("");
        System.out.println("Matriz Secundaria:");

        for (int x=0;x<matrizMenorValor.length;x++){
            for (int y=0;y<matrizMenorValor[x].length;y++){
                if(matrizMenorValor[x][y] < menorValorLinha){
                    menorValorLinha = matrizMenorValor[x][y];
                }
            }
        }
        System.out.println("Menor valor linha: "+menorValorLinha);
        for (int linha=0;linha<matrizMenorValor.length;linha++){
            for (int coluna=0;coluna<matrizMenorValor[linha].length;coluna++){
                System.out.print(" | "+matrizMenorValor[linha][coluna]);
            }
            System.out.println("|");
        }
    }
}
