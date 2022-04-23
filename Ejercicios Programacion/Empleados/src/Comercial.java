public class Comercial extends Empleado{
    //ESTADO
    private double comision;

    //COMPORTAMIENTO
    //Constructor
    public Comercial(String nombre, int edad, int salario, double nComision){
        super(nombre, edad, salario);
        this.comision = nComision;
    }

    public double getComision(){
        return this.comision;
    }

    public void setComision(double comision){
        this.comision = comision;
    }

    @Override
    public String toString(){
        return super.toString() + " comision = " + comision;
    }

    /**
     * si tiene más de 30 años y cobra una comisión de más de 200 euros, se le aplicara el plus.
     */

    @Override
    public void plus() {
        if (super.getEdad() > 30 && getComision() > 200){
            int nuevoSalario = super.getSalario() + super.getPlus();
            super.setSalario(nuevoSalario);
            System.out.println("Se le ha aplicado el plus a " + super.getNombre());
        } else System.out.println("No ha cumplido las condiciones asociadas para aplicar el plus a " + super.getNombre());
    }
}
