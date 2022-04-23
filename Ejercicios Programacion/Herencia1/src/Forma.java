public class Forma {
    private String color;
    private String nombreForma;
    //coordenada del centro de la forma (objeto Punto)
    private Punto punto;

    public Forma(String color, String nombreForma) {
        this.color = color;
        this.nombreForma = nombreForma;
        punto = new Punto(0,0);
    }

    public void imprimir(){
        System.out.println("El nombre de la forma es " + nombreForma + "\n" +
                            "El color es " + color + "\n" +
                            "La coordenada es " + "(" + punto.getX() + "," + punto.getY() + ")");
    }

    public String obtenerYcambiarColor(String nuevoColor){
        color = nuevoColor;
        return color;
    }

    public void moverForma(int x, int y){
        punto.setX(x);
        punto.setY(y);
    }
}
