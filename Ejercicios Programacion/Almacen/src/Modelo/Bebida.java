package Modelo;

public class Bebida {
    //ESTADO
    //Creamos esta variable para incrementar uno a uno cada bebida que crearemos
    private int idActual = 1;

    private int id, litros, precio;
    private String marca;

    //COMPORTAMIENTO
    //Constructor
    public Bebida(int nLitros, int nPrecio, String nMarca){
        this.id = idActual++;
        this.litros = nLitros;
        this.precio = nPrecio;
        this.marca = nMarca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Modelo.Bebida{" +
                "id=" + id +
                ", litros=" + litros +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
