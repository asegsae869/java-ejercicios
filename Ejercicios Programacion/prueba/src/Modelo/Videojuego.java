package Modelo;

import Controlador.Entregable;

public class Videojuego implements Entregable {
    //ESTADO
    private String titulo, genero, companhia;
    private int horasEstimadas = 10;
    private boolean entregado;

    //COMPORTAMIENTO
    //Constructor por defecto
    public Videojuego(){

    }

    //Constructo con el titulo y horas estimadas. El resto por defecto
    public Videojuego(String nTitulo, int nHorasEstimadas){
        this.titulo = nTitulo;
        this.horasEstimadas = nHorasEstimadas;
        entregado = false;
    }

    public Videojuego(String nTitulo, String nCompanhia){
        this.titulo = nTitulo;
        this.companhia = nCompanhia;
    }

    public Videojuego(String nTitulo, String nGenero, String nCompanhia, int nHorasEstimadas){
        this.titulo = nTitulo;
        this.genero = nGenero;
        this.companhia = nCompanhia;
        this.horasEstimadas = nHorasEstimadas;
        entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    //usa los métodos de la interfaz Entregable
    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean esEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object a) {
        int resultado = -1;

        //casteo para usar los get
        Videojuego videojuego = (Videojuego) a;
        if (getHorasEstimadas() > ((Videojuego) a).getHorasEstimadas()) return 1;
        else if (getHorasEstimadas() == ((Videojuego) a).getHorasEstimadas()) return 0;

        return resultado;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", companhia='" + companhia + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                '}';
    }
}
