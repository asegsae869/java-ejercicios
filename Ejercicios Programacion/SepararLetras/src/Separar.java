public class Separar {
    private String texto;

    public Separar(String nTexto){
        this.texto = nTexto;
    }

    public void separarLetras(){
        char [] palabras = texto.toCharArray();
        for (char i : palabras){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Separar s = new Separar("hola");
        s.separarLetras();
    }
}
