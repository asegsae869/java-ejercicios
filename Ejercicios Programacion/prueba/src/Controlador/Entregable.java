package Controlador;

public interface Entregable {
    public default void entregar(){

    }

    public default void devolver(){

    }

    public default boolean esEntregado() {
        return false;
    }

    public default int compareTo(Object a) {
        return 0;
    }
}
