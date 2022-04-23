public class Repartidor extends Empleado{
    //ESTADO
    private String zona;

    //COMPORTAMIENTO
    //Constructor
    public Repartidor(String nombre, int edad, int salario, String nZona){
        super(nombre, edad, salario);
        this.zona = nZona;
    }

    public String getZona(){
        return zona;
    }

    public void setZona(String zona){
        this.zona = zona;
    }

    @Override
    public String toString(){
        return super.toString() + " zona = " + zona;
    }

    /**
     * si tiene menos de 25 y reparte en la “zona 3”, este recibirá el plus.
     */
    @Override
    public void plus() {
        if (super.getEdad() < 25 && getZona().equals("zona 3")){
            int nuevoSalario = super.getSalario() + super.getPlus();
            super.setSalario(nuevoSalario);
            System.out.println("Se le ha aplicado el plus a " + super.getNombre());
        } else System.out.println("No se han cumplido las condiciones asociadas para aplicar el plus a " + super.getNombre());
    }
}
