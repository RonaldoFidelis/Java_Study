package ExePessoais;
import java.util.Scanner;
public class exe_0007_ProcrurandoValor {

    public static int buscarSequencial(int vetor[], int procurar, int qtdElementos){
        int i; // Como é um metodo do tipo "int" ele precisa de uma variavel para retorna.
        boolean achou = false; //Variavel logica.

        for (i=0;i<qtdElementos;i++){
            if (vetor[i] == procurar){
                achou=true;
                break;
            }
        }
        if (achou==true){
            return i;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int vetor[] = new int[10];
        int valorUsuario;
        int resposta; //Varivel para exibir o item pesquisado.
        Scanner atribuir = new Scanner(System.in);

        for (int i = 0; i <= vetor.length -1; i++){
            vetor[i] = i +1;
        }

        System.out.println("Digite um número inteiro que queira pesquisa: ");
        valorUsuario = atribuir.nextInt();

        resposta = buscarSequencial(vetor,valorUsuario,10);

        if (resposta != -1){
            System.out.println("O item pesquisado está na posição: " + resposta);
        }else {
            System.out.println("Item não encontrado:");
        }
    }
}
