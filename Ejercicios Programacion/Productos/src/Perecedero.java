public class Perecedero extends Producto{
    private int diasAcaducar;

    public Perecedero(String nombre, int precio, int nDiasAcaducar){
        super(nombre, precio);
        this.diasAcaducar = nDiasAcaducar;
    }

    public int getDiasAcaducar() {
        return diasAcaducar;
    }

    public void setDiasAcaducar(int diasAcaducar) {
        this.diasAcaducar = diasAcaducar;
    }

    public int calcular(int cantidadProducto){
        super.setPrecio(super.calcular(cantidadProducto));
        switch (diasAcaducar){
            case 1 -> super.setPrecio(super.getPrecio() / 4);
            case 2 -> super.setPrecio(super.getPrecio() / 3);
            case 3 -> super.setPrecio(super.getPrecio() / 2);
            default -> throw new IllegalArgumentException("Invalid day: " + diasAcaducar);
        }
        return super.getPrecio();
    }

    @Override
    public String toString() {
        return super.toString() + " dias a caducar = " + diasAcaducar;
    }
}
