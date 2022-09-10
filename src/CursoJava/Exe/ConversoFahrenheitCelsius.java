package CursoJava.Exe;
import java.util.Scanner;
public class ConversoFahrenheitCelsius {
    public static void main(String[] args) {
        // (F(valor)-32)*5/9=C
        Scanner Atribuir=new Scanner(System.in);

        float valorFah;
        float value = 32;
        float divNumOne = 5;
        float divNumTwo = 9;
        float div = divNumOne/divNumTwo;
        System.out.println("Temperatura: ");
        valorFah = Atribuir.nextFloat();
        float celsius = (valorFah - value)*div;
        System.out.println("Convertendo: " + celsius);


    }
}
