package CursoJava.Exe;

public class TypePrimitiveVsObject {
    public static void main(String[] args) {
        String s = new String("Text");
        s = s.toUpperCase();
        System.out.println(s);

        //Wrappers são a versão objetos dos tipos.
        //Tudo em java é objeto, menos os tipos primitivos.
    }
}
