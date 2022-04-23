package com.politecnico;

public class Hotel {
    //ESTADO
    Habitacion[] habitaciones;
    //COMPORTAMIENTO
    public Hotel(int numeroPlantas, int numeroHabitaciones){
        //Crea array habitaciones
        habitaciones = new Habitacion[numeroHabitaciones];
    }

    public void reservarHabitacion(Habitacion habitacion, Cliente cliente){
        //Se le pasa una habitación y se le asigna el cliente
        for (Habitacion h: habitaciones) {
            h.asignarHabitaciones(cliente);
        }
        System.out.println("Se le ha asignado la habitacion " + + " al cliente: " + );
    }

    public Habitacion buscarHabitacionDisponible(int tipoDeHabitacion){
        /*se le pasa un número que representa el tipo de habitación:
            Habitacion.SUITE
            Habitacion.SIMPLE
            Habitacion.DOBLE
            Devuelve la habitación o null si no existe*/
        Habitacion habitacion = null;

        //he creado los getters de las habitaciones, una solución para este método
        if (tipoDeHabitacion == 1)
            habitacion.getSuite();
        else if (tipoDeHabitacion == 2)
            habitacion.getSimple();
        else if (tipoDeHabitacion == 3)
            habitacion.getDoble();
        return habitacion;
    }

    public String visualizarHotel(){
        /*Devuelve una cadena de texto con un resumen del estado de ocupación
        del hotel. La cadena devuelta podría ser algo como esto:

         ====================================
         Habitación 101 (Suite)
         ------------------------------------
         Ocupada por María Antúnez, con DNI 5555555D
         ====================================
         Habitación 102 (Doble)
         ------------------------------------
         No está ocupada
         ====================================
         ....*/
        return ("Habitación " + habitaciones.toString());
    }
}