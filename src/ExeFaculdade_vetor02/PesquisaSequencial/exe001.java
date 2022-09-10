package ExeFaculdade_vetor02.PesquisaSequencial;
/*Este método consiste em realizar a busca
do elemento desejado através da
comparação com cada um dos elementos
da base de dados, na ordem em que estão
inseridos.*/

public class exe001 {

    public static int buscarValor (double v[], double procurado, int n){ //Pesquisa sequencia simples
        int i;
        boolean achou = false;

        for (i = 0; i < n; i++) {
            if (v[i] == procurado) {
            // Quando o valor de "i" for igual ao valor dentro do vetor e igual ao valora procurado
                achou = true;
                break; // Comando para parar o for
            }
        }
        //Comando para mostrar o valor.
        if (achou == true) { // Se a variavel achou for verdadeira
            return i; // retorna a posição onde encontrou a chave
        }
        else {
            return -1; // retorna -1 indicando que não achou a chave
        }
    }

    public static void main(String[] args) {
        int vetor [] = new int [10];

        for(int preencher = 0; preencher <= vetor.length -1; preencher++){
            vetor[preencher] = preencher + 1;
        }

    }
}
