import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agendaTelefonica = new Agenda(3);
        Contacto contacto;
        Scanner sc = new Scanner(System.in);

        int opcion;
        String nombre;
        int telefono;

        while (true){
            System.out.println("""
                    1. Añadir contacto
                    2. Listar contactos
                    3. Buscar contacto
                    4. Existe contacto
                    5. Eliminar contacto
                    6. Contactos disponibles
                    7. Agenda llena
                    8. Salir""");

            try{
                System.out.println("Escriba una de las opciones: ");
                opcion = sc.nextInt();

                switch (opcion){
                    case 1:
                        System.out.println("Escriba un nombre: ");
                        nombre = sc.next();
                        System.out.println("Escriba un telefono: ");
                        telefono = sc.nextInt();

                        contacto = new Contacto(nombre, telefono);
                        agendaTelefonica.agregarContacto(contacto);
                        break;
                    case 2:
                        agendaTelefonica.listarContactos();
                        break;
                    case 3:
                        System.out.println("Escriba un nombre: ");
                        nombre = sc.next();
                        agendaTelefonica.buscaContacto(nombre);
                        break;
                    case 4:
                        System.out.println("Escriba un nombre: ");
                        nombre = sc.next();

                        contacto = new Contacto(nombre);
                        if (agendaTelefonica.existe(contacto)) System.out.println("Existe contacto");
                        else System.out.println("No existe contacto");
                        break;
                    case 5:
                        System.out.println("Escriba un nombre: ");
                        nombre = sc.next();
                        if (agendaTelefonica.existe(nombre)) agendaTelefonica.eliminarContacto(nombre);
                        break;
                    case 6:
                        System.out.println("Hay " + agendaTelefonica.huecosLibres() + " contactos disponibles");
                        break;
                    case 7:
                        if (agendaTelefonica.agendaLlena()) System.out.println("Agenda llena");
                        else System.out.println("La agenda no está llena");
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("Solo numeros entre 1 y 8");
                }
            } catch (InputMismatchException e){
                System.out.println("Debes insertar un número");
                sc.nextInt();
            }
        }
    }
}
