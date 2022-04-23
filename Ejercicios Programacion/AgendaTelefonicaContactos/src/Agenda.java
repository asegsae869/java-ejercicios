import java.sql.Struct;
import java.util.ArrayList;

public class Agenda {

    private Contacto[] contactos;

    //Se podrá crear de dos formas, indicándoles nosotros el tamaño o con un tamaño por defecto (10)
    public Agenda(int size){
        contactos = new Contacto[size];
    }

    public Agenda(){
        contactos = new Contacto[10];
    }

    public void agregarContacto(Contacto c){
        boolean encontrado = false;
        String aux;

        if (existe(c)) System.out.println("El contacto con ese nombre ya existe");
        else if (agendaLlena()) System.out.println("La agenda está llena, no se pueden meter más contactos");

        //es lo mismo que el foreach
        /*for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) contactos[i] = c;
            encontrado = true;
        }*/

        for (Contacto i : contactos) {
            if (i == null) i = c;
            encontrado = true;
        }

        //manejo una ternaria para que sea más vistoso y fácil
        aux = (encontrado)?"Se ha añadido":"No se ha podido añadir";
        System.out.println(aux);

    }

    public boolean existe(Contacto c){
        boolean aux = false;
        for (Contacto contacto : contactos){
            aux = contacto.equals(c); //aux = (contacto.equals(c))?true:false;
        }
        return aux;
    }

    //método auxiliar para saber si existe un contacto pasándole por parámetro un nombre
    public boolean existe(String nombre){
        for (Contacto c : contactos) {
            if (c != null && nombre.equalsIgnoreCase(c.getNombre())) return true;
        }
        return false;
    }

    public boolean agendaLlena(){
        for (Contacto c : contactos) {
            if (c == null) return true;
        }
        return false;
    }

    public void listarContactos(){
        /*for (int i = 0; i < contactos.length; i++){
            System.out.println(contactos[i]);
        }*/ //Funciona de las dos formas

        for(Contacto c : contactos){
            if (c != null) System.out.println(c); else System.out.println("No hay ningún contacto");
        }
    }

    public void buscaContacto(String nombre){
        /*for (int i = 0; i < contactos.length; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) System.out.println(contactos[i].getTelefono());
        }*/

        for(Contacto c : contactos){
            if (c.getNombre().equalsIgnoreCase(nombre)) System.out.println(c.getTelefono());
        }
    }

    public void eliminarContacto(Contacto c){
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i].equals(c) && contactos[i] != null) contactos[i] = null;
        }
    }

    //método auxiliar para eliminar un contacto pasándole por parámetro un nombre
    public void eliminarContacto(String nombre){
        boolean encontrado = true;
        String aux;

        for (Contacto c : contactos) {
            if (c != null && c.getNombre().equalsIgnoreCase(nombre)) c = null;
            encontrado = false;
        }

        aux = (!encontrado)?"Se ha eliminado":"No se ha podido eliminar";
        System.out.println(aux);
    }

    public int huecosLibres(){
        int contador = 0;

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) contador++; //controlo nulos y acumulo los nulos
        }
        return contador;
    }

}
