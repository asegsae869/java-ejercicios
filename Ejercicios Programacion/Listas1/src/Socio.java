import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Socio implements Comparable{    //se debe implementar la interfaz Comparable para utiliazar Arrays.sort y ordenar la matriz por orden alfabetico
    private String nombre, apellidos;
    private LocalDate inscripcion;
    private double cuota;

    public Socio(String nombre, String apellidos, double cuota){
        this.nombre = nombre;
        this.apellidos = apellidos;
        inscripcion = LocalDate.now();
        this.cuota = cuota;
    }

    public Socio(){

    }

    public int compareTo(Object miObjeto){
        /**
         * --ORDENAMOS ALFABETICAMENTE POR APELLIDOS--
         *
         * numero negativo si el objeto a comparar es menor
         * numero postivo si el objeto a comparar es mayor
         * 0 si son iguales
          */

        Socio otroSocio = (Socio) miObjeto; //variable objeto denominada miObjeto de tipo Socio

                                        //((Socio) miObjeto) también es válido
        /*if (getApellidos().charAt(0) > otroSocio.getApellidos().charAt(0)) return 1;
        else if (getApellidos().charAt(0) < otroSocio.getApellidos().charAt(0)) return -1;
        else if (getApellidos().charAt(0) == otroSocio.getApellidos().charAt(0)) return 0;*/

        //HACER TERNARIA SERIA VALIDA¿?¿?¿? - COMPROBAR
        int resultado = 0;
        resultado = (getApellidos().charAt(0) > otroSocio.getApellidos().charAt(0)) ? 1 : -1;
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getInscripcion() {
        return inscripcion;
    }

    public double getCuota(){
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    @Override
    public String toString(){
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", inscripcion=" + inscripcion +
                ", cuota=" + cuota +
                '}';
    }
}
