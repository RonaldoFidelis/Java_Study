package ExePessoais;

public class exe_0006_pesquiseSequencial {


    public static int buscaSequencial (int v[], int procurado, int qtdElementos) {
        int  i;
        boolean  achou = false;

        for (i = 0; i < qtdElementos; i++)  {
            if (v[i] == procurado)  {
                achou = true;
                break;
            }
        }
        if (achou == true) {
            return i;     // retorna a posição onde encontrou a chave
        }
        else {
            return -1;  // retorna -1 indicando que não achou a chave
        }
    }


    public static void main(String[] args) {

        int [] v = {27,19,37,15,20,17,21,12};
        int r;

        r = buscaSequencial(v, 17, 8);

        if(r != -1){
            System.out.println("O item pesquisado está presente na posição: " + (r+1));
        } else {
            System.out.println("O item pesquisado não está presente.");
        }
    }
}
