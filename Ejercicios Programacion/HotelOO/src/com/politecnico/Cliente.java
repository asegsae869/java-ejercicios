package com.politecnico;

public class Cliente {
    //ESTADO
    private String nombre, apellidos, NIF, cuentaBancaria;

    //COMPORTAMIENTO
    public Cliente(String nombre, String apellidos, String NIF, String cuentaBancaria) throws Exception {
        try {
            if (!nombre.isEmpty() && !apellidos.isEmpty() && !NIF.isEmpty() && !cuentaBancaria.isEmpty()){
                this.nombre = nombre;
                this.apellidos = apellidos;
                this.NIF = NIF;
                this.cuentaBancaria = cuentaBancaria;
            } else throw new Exception("Datos incorrectos, vuelva a introducirlos:");
        } catch (Exception e){
            System.out.println("Valor Erróneo");
        }
        /*
         El constructor no hace nada, porque hay que comprobar la idoneidad de
         los datos de la persona. Esto es algo que podríamos gestionar con excepciones
         */
    }

    public Cliente(){

    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public String getNIF(){
        return this.NIF;
    }

    public String getCuentaBancaria(){
        return this.cuentaBancaria;
    }

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){ //realiza la negación de la misma. Quiere decir que si nombre no está vacío devuelve true.
            this.nombre = nombre;
            return true;
        } else return false;
    }

    public boolean setApellidos(String apellidos){
        if (!apellidos.isEmpty()){
            this.apellidos = apellidos;
            return true;
        } else return false;
    }

    public boolean setNIF(String NIF){
        if (NIF.equals("[A-Z][0-9]{8}")){
            this.NIF = NIF;
            return true;
        } else return false;

        //return (NIF.equals("[A-Z][0-9]{8}"));
    }

    public boolean setCuentaBancaria(String cuentaBancaria){
        if (cuentaBancaria.equals("ES[0-9]{22}")){
            this.cuentaBancaria = cuentaBancaria;
            return true;
        } else return false;
    }

    @Override
    public String toString() { //toString()
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", NIF='" + NIF + '\'' +
                ", cuentaBancaria='" + cuentaBancaria + '\'' +
                '}';
    }
}
