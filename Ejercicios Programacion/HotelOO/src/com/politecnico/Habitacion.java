package com.politecnico;

import java.util.Scanner;

public class Habitacion {
    //ESTADO
    final static int SUITE = 1;
    final static int SIMPLE = 2;
    final static int DOBLE = 3;

    private Cliente[] cliente;
    private String fechaEntrada;

    //COMPORTAMIENTO
    public Habitacion(int clientes, String fechaEntrada){
        cliente = new Cliente[clientes];
        this.fechaEntrada = fechaEntrada;
    }

    public Habitacion(String fechaEntrada){
        cliente = new Cliente[5];
        this.fechaEntrada = fechaEntrada;
    }

    public void getCliente(){
        // Devuelve el cliente
        for (Cliente c : cliente) {
            System.out.println(c);
        }
    }

    public boolean habitacionesLlenas(){
        for (Cliente c : cliente) {
            if (c == null) return true;
        }
        return false;
    }

    public void asignarClientes(Cliente clienteAasignar) {
        // Asigna un cliente a la habitración
        // - Devuelve true si se puedo asignar el cliente
        // - Devuelve false si la habitación ya está ocupada
        for (Cliente c : cliente) {
            if (c == null) c = clienteAasignar;
        }
    }

    public void asignarHabitaciones(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué habitación desea asignar: " + sc.nextInt());
        switch (sc){
            case 1 ->"Ha asignado la habitación " + getSuite();
            case 2 ->"Ha asignado la habitación " + getSimple();
            case 3 ->"Ha asignado la habitación " + getDoble();
        }
    }

    public String getFechaEntrada(){
        /*Devuelve la fecha de entrada. Cuando no hay fecha de entrada porque la habitación
        no ha sido reservada, devuelve null*/
        if (fechaEntrada == null) {
            System.out.println("La habitación no ha sido reservada");
        }
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada){
        //Asigna una fecha de entrada
        this.fechaEntrada = fechaEntrada;
    }

    public boolean liberarHabitacion(){
        //El cliente y la fecha pasan a ser null
        return cliente.toString() == null && getFechaEntrada() == null;
    }

    @Override
    public String toString() {
        return cliente.toString() + " fecha de entrada: " + fechaEntrada;
    }

    public int getSuite(){
        return SUITE;
    }

    public int getSimple(){
        return SIMPLE;
    }

    public int getDoble(){
        return DOBLE;
    }
}
