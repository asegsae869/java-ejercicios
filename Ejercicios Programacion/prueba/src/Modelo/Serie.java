package Modelo;

import Controlador.Entregable;

public class Serie implements Entregable {
    //Estado
    private String titulo, genero, creador;
    private int numTemporadas = 3;
    private boolean entregado;

    //Comportamiento
    //Constructor por defecto
    public Serie(){

    }

    //Constructor con el titulo y creador. El resto por defecto
    public Serie(String nTitulo, String nCreador){
        this.titulo = nTitulo;
        this.creador = nCreador;
        entregado = false;
    }

    //Constructor con todos los atributos, excepto de entregado
    public Serie(String nTitulo, String nGenero, String nCreador, int nNumTemporadas){
        this.titulo = nTitulo;
        this.genero = nGenero;
        this.creador = nCreador;
        this.numTemporadas = nNumTemporadas;
        entregado = false;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getGenero(){
        return genero;
    }

    public String getCreador(){
        return creador;
    }

    public int getNumTemporadas(){
        return numTemporadas;
    }

    public void setTitulo(String nTitulo){
        this.titulo = nTitulo;
    }

    public void setGenero(String nGenero){
        this.genero = nGenero;
    }

    public void setCreador(String nCreador){
        this.creador = nCreador;
    }

    public void setNumTemporadas(int nNumTemporadas){
        this.numTemporadas = nNumTemporadas;
    }

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
        int resultado = 0;

        //casteo el objeto a para poder trabajar con el en este caso uso el get
        Serie serie = (Serie) a;
        if (getNumTemporadas() > ((Serie) a).getNumTemporadas()) return 1;
        else if (getNumTemporadas() < ((Serie) a).getNumTemporadas()) return -1;

        return resultado;
    }

    @Override
    public String toString() {
        return "Modelo.Serie{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", entregado=" + entregado +
                '}';
    }
}
