import java.util.Date;

public class AutomovilCEI {
    private String matricula;
    private int maxBateria;
    private String descripcion;
    private Date fechaMat;
    private int nivelBateria;
    private boolean servicio;

    public AutomovilCEI(String NMatricula, int NmaxBateria, String NDescripcion, Date NFechaMat, int NNivelBateria){
        this.matricula = NMatricula;
        this.maxBateria = NmaxBateria;
        this.descripcion = NDescripcion;
        this.fechaMat = NFechaMat;

        if (nivelBateria < maxBateria) this.nivelBateria = NNivelBateria;
        if (nivelBateria > maxBateria * (10/100)) this.servicio = true; //calcular el 10% de la batería
    }

    public int utilizarEnergia(){
        if (servicio) nivelBateria = getNivelBateria() - 1000; //1mAh
        return nivelBateria;
    }

    public int regargarEnergia(){
        if (servicio) nivelBateria = getNivelBateria() + 1000;
        return nivelBateria;
    }

    //para sacar el porcentaje multiplicamos el nivel de la bateria por 100 y se lo dividimos al máximo de la batería
    public int getPorcentajeBateria(){
        int porcentaje;
        porcentaje = (getNivelBateria() * 100) / getMaxBateria();
        return porcentaje;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getMaxBateria() {
        return maxBateria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaMat() {
        return fechaMat;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public boolean isServicio() {
        return servicio;
    }
}
