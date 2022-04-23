package Modelo;

public class BebidaAzucarada extends Bebida {
    private int porcentajeAzucar;
    private boolean promocion;

    public BebidaAzucarada(int litros, int precio, String marca, int nPorcentajeAzucar, boolean nPromocion){
        super(litros, precio, marca);
        this.porcentajeAzucar = nPorcentajeAzucar;
        this.promocion = nPromocion;
    }

    public int getPorcentajeAzucar(){
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(int porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public boolean getPromocion(){
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    @Override
    public int getPrecio(){
        if (getPromocion())
            return (int) (super.getPrecio() * 0.9);
        else return super.getPrecio();
    }

    @Override
    public String toString(){
        return super.toString() + " procentaje de azujar = " + porcentajeAzucar + " y promocion = " + promocion;
    }
}
