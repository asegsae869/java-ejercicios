package Vista;

import Modelo.Serie;
import Modelo.Videojuego;

public class Main {
    //Estado
    private static Serie[] series;
    private static Videojuego[] videojuegos;

    public static void main(String[] args) {
        series = new Serie[5];
        videojuegos = new Videojuego[5];

        series[0] = new Serie("Juego de Tronos", "George R.R.Martin");
        series[1] = new Serie("Los Simpsons", "Humor", "Matt Groening", 25);
        series[2] = new Serie("Padre de Familia", "Humor", "Seth MacFarlane", 12);
        series[3] = new Serie("Breaking Bad", "Thriller", "Vince Gilligan", 5);
        series[4] = new Serie();

        videojuegos[0] = new Videojuego("Assasins Creed 2", "Aventura", "EA", 30);
        videojuegos[1] = new Videojuego("Good of War 3", "Santa Mónica");
        videojuegos[2] = new Videojuego("Super Mario 3DS", "Plataforma", "Nintendo", 30);
        videojuegos[3] = new Videojuego();
        videojuegos[4] = new Videojuego("Final Fantasy X", "Rol", "Square Enix", 200);

        //entregamos algunos videojuegos y series
        series[0].entregar();
        series[2].entregar();
        videojuegos[4].entregar();
        videojuegos[2].entregar();

        contarYdevolver();
        masTiempo();

    }

    //Método auxilar para contar los entregados y devolvemos
    public static void contarYdevolver(){
        int entregados = 0;

        /*
         * Recorremos un bucle hasta la longitud de series porque es la misma de videojuegos (da igual cual recorrer en este caso)
         * si serie o videojuego es entregado se incrementa el contador y se devuleven.
         */
        for (int i = 0; i < series.length; i++){
            if (series[i].esEntregado())
                entregados++;
                series[i].devolver();
            if (videojuegos[i].esEntregado())
                entregados++;
                videojuegos[i].devolver();
        }

        /*for (Serie i: series) { ATENCION!!! ESTO NO PODRÍA UTILIZARLO PORQUE TAMBIÉN TENDRÍA QUE DEVOLVER VIDEOJUEGOS
            if (i.esEntregado())
                entregados++;
                i.devolver();
        }*/
    }

    //Método para el videojuego con mas horas estimadas y serie con más temporadas (mostrar con toString())
    public static void masTiempo(){
        //creo dos objetos con la primera posición del array
        Serie serieMayor = series[0];
        Videojuego videojuegoMayor = videojuegos[0];

        /*
        recorro el array con un for y uso el método compareTo(Object a)
        el cual ya está definido en cada clase (Solo hay que comparar)
         */
        for (int i = 0; i < series.length; i++){
            if (series[i].compareTo(serieMayor) == 1){
                serieMayor = series[i];
                System.out.println(serieMayor);
            }
            if (videojuegos[i].compareTo(videojuegoMayor) == 1){
                videojuegoMayor = videojuegos[i];
                System.out.println(videojuegoMayor);
            }
        }
    }
}
