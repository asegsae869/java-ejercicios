public abstract class Empleado {
    //ESTADO
    private String nombre;
    private int edad, salario;

    private final int plus = 300;

    //COMPORTAMIENTO
    //Constructor
    public Empleado(String nNombre, int nEdad, int nSalario){
        this.nombre = nNombre;
        this.edad = nEdad;
        this.salario = nSalario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario(){
        return salario;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

    public int getPlus(){
        return plus;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", plus=" + plus +
                '}';
    }

    //Creo un método abstracto para llamarlas en las demás clases
    public abstract void plus();
}
