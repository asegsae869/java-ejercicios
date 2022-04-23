package Modelo;

public class AguaMineral extends Bebida {
    private String origen;

    public AguaMineral(int litros, int precio, String marca, String origen){
        super(litros, precio, marca);
        this.origen = origen;
    }

    public String getOrigen(){
        return origen;
    }

    public void setOrigen(String origen){
        this.origen = origen;
    }

    @Override
    public String toString() {
        return super.toString() + " origen = " + origen;
    }
}
