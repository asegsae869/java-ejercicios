package com.politecnico;

public class Factura {
    //ESTADO
    Cliente cliente;
    Habitacion habitacion;
    String textoFactura;
    int numeroDias;

    //COMPORTAMIENTO
    public Factura(Cliente cliente, int numeroDias) throws Exception {
        cliente = new Cliente("Andrés","Segura Sáez","77998877A","ES123456789123456789123");
        cliente = new Cliente();
    }

    public String generarFactura(){
                /*
         Genera una cadena de texto correspondiente a la factura y la almacena en textoFactura.
         Una factura puede ser algo como:
         */
        return textoFactura = """
                ====================================
                         CLIENTE: Carlos Antúnez
                         HABITACIÓN OCUPADA: 110
                         DIAS DE ESTANCIA: 5
                         TIPO DE HABITACIÓN: Simple
                         TOTAL A PAGAR: 300€
                ====================================""";
    }
}
