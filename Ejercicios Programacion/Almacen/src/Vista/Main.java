package Vista;

import Controlador.Almacen;
import Modelo.AguaMineral;
import Modelo.Bebida;
import Modelo.BebidaAzucarada;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Bebida bebida;

        //hay un error lógico y no se reproduce la bebidaAzucarada porque al terminar el case 0 se corta
        /*for (int i = 0; i < 25; i++) {
            switch (i % 2) {
                case 0 -> almacen.agregarBebida(new AguaMineral(2, 5, "bezoya", "manantial1"));
                    /*bebida = new AguaMineral(2, 5, "bezoya", "manantial1");
                    almacen.agregarBebida(bebida);
                case 1 -> almacen.agregarBebida(new BebidaAzucarada(2, 10, "Coca Cola", 1, true));
            }
        }*/

       // almacen.agregarBebida(new AguaMineral(2,5,"bezoya", "manantial1"));
        almacen.agregarBebida(new BebidaAzucarada(2, 10, "Coca Cola", 1, true));


        //Muestro las bebidas
        almacen.mostrar();

        //Calculo el precio de todas las bebidas
        System.out.println("Precio de todas las bebidas: " + almacen.calcularPrecioTotal());

        //Elimino una bebida en concreto
        almacen.eliminarBebida(4);

        almacen.mostrar();

        System.out.println("Precio de todas las bebidas: " + almacen.calcularPrecioTotal() + "\n" +
                            "Precio de todas las bebidas de la marca bezoya: " + almacen.calcularPrecioMarca("bezoya") + "\n" +
                            "Calcular precio de la columna 0: " + almacen.calcularPrecioEstanteria(0));
    }
}
