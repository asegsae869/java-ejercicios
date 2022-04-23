package Controlador;

import Modelo.Bebida;

public class Almacen {
    private final Bebida[][] estanterias;

    public Almacen(int filas, int columnas){
        estanterias = new Bebida[filas][columnas];
    }

    public Almacen(){
        estanterias = new Bebida[5][5];
    }

    //agregamos una bebida
    public void agregarBebida(Bebida b){
        for (int i = 0; i < estanterias.length; i++){
            for (int j = 0; j < estanterias[0].length; j++){
                if (estanterias[i][j] == null)
                    estanterias[i][j] = b;
            }
        }
    }

    //eliminar una bebida
    public void eliminarBebida(int idBebida){
        for (int i = 0; i < estanterias.length; i++){
            for (int j = 0; j < estanterias[0].length; j++){
                if (estanterias[i][j].getId() == idBebida)
                    estanterias[i][j] = null;
            }
        }
    }

    //Mostrar información: mostramos para cada bebida toda su información.
    public void mostrar(){
        for (int i = 0; i < estanterias.length; i++){
            for (int j = 0; j < estanterias[0].length; j++){
                if (estanterias[i][j] != null) //Controlamos los errores
                    System.out.println("fila: " + i + ", columna: " + j + " Bebida: " + estanterias[i][j].toString());
            }
        }
    }

    //Calcular precio de todas las bebidas: calcula el precio total de todos los productos del almacén.
    public int calcularPrecioTotal(){
        int precioTotal = 0;

        for (int i = 0; i < estanterias.length; i++){
            for (int j = 0; j < estanterias[0].length; j++){
                if (estanterias[i][j] != null)
                    precioTotal += estanterias[i][j].getPrecio();
            }
        }
        return precioTotal;
    }

    //Calcular el precio total de una marca de bebida: dada una marca, calcular el precio total de esas bebidas.
    public int calcularPrecioMarca(String marca){
        int precioTotal = 0;

        for (int i = 0; i < estanterias.length; i++){
            for (int j = 0; j < estanterias[0].length; j++){
                if (estanterias[i][j] != null)
                    if (estanterias[i][j].getMarca().equalsIgnoreCase(marca))
                        precioTotal += estanterias[i][j].getPrecio(); //acumulo el precio
            }
        }
        return precioTotal;
    }

    //Calcular el precio total de una estantería: dada una estantería (columna) calcular el precio total de esas bebidas.
     public int calcularPrecioEstanteria(int columna){
        int precioTotal = 0;

        if (columna >= 0 && columna < estanterias[0].length){
            for (int i = 0; i < estanterias.length; i++){
                if (estanterias[i][columna] != null)
                    precioTotal += estanterias[i][columna].getPrecio();
            }
        } else System.out.println("La columna debe estar entre 0 y " + estanterias[0].length);

        return precioTotal;
     }
}
