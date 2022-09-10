package CursoJava.Exe;

public class Strings {
    public static void main(String[] args) {
        // Algumas funcções para Strings
        // Não é possivel reatribuir um valor a uma String.

        String name = "Nalldin";
        int idade = 12;
        double altura = 1.75;
        System.out.println(name.concat(" é lindo!")); // .concat serve para concatenar.
        System.out.println(name + "!!!"); /// Mesma coisa do .concat
        System.out.println(name.toUpperCase()); // Transforma em maisculo.
        System.out.println(name.toLowerCase()); // Transforma para minusculo.
        System.out.println(name.startsWith("Nalldin"));//Ele vai checar ser minha String inicia com a palavra que eu passei de parâmentro.
        System.out.println(name.length()); // Checa o tamanho da string
        System.out.println(name.toLowerCase().startsWith("nalddin")); // Ele checar se é oque está na minha string sem restrição de maiusculo ou minusculo.

        // Tipos de sout
        System.out.println("Pula linha");
        System.out.print("Não pula linha");
        System.out.printf("\n"+"Print formatado, ex.: %s",name); // %s para string
        System.out.printf("\n"+"Print formatado, ex.: %d",idade); // %d para inteiros
        System.out.printf("%nPrint formatado, ex.: %.2f", altura); // %f para tipo double, podemos definr tbm a qtd de casas decimais.
        //%n Serve para pular linha.

        //Também é possivel guarda uma string formatada dentro de uma varivel string.
        String frase = String.format("\n" + "A altura de %s é: %.2f",name,altura);
        System.out.println(frase);
    }
}
