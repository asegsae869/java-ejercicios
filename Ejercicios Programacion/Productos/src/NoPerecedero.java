public class NoPerecedero extends Producto{
    private String tipo;

    public NoPerecedero(String nombre, int precio, String nTipo){
        super(nombre, precio);
        this.tipo = nTipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int calcular(int cantidad){
        super.setPrecio(super.calcular(cantidad));
        return super.getPrecio();
    }

    @Override
    public String toString() {
        return super.toString() + " tipo = " + tipo;
    }
}
