public class Producto {
    //ESTADO
    private String nombre;
    private int precio;

    //COMPORTAMIENTO
    //Constructor
    public Producto(String nNombre, int nPrecio){
        this.nombre = nNombre;
        this.precio = nPrecio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int calcular(int cantProducto){
        return precio * cantProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
