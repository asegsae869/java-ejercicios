import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data;
        String[] palabras;
        int longitudString;
        String SEPARADOR = "\s";

        System.out.println("Introduzca la cadena: ");
        data = sc.next();
        //paso a int la longitud de la cadena
        longitudString = data.length();
        while (data){
            if (SEPARADOR)
        }
        /*String[] split = data.split("\s");
        for (String s : split) {
            System.out.println(s.toUpperCase().charAt(0) + s.substring(1, s.length()) + " -> " + longitudString);
            System.out.println(s.toUpperCase().charAt(0) + s.substring(1, s.length()) + " -> " + longitudString);
        }*/
    }
}
