public class EliminarEspacios {
    private String texto;

    public EliminarEspacios(String EliminarEspacios){
        this.texto = EliminarEspacios;
    }

    public void eliminarEspacios(){
        texto = texto.replaceAll("\\s", "");
        System.out.println(texto);
    }

    public static void main(String[] args) {
        EliminarEspacios e = new EliminarEspacios("hola mundo");
        e.eliminarEspacios();
    }
}
