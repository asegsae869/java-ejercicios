public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[3];

        productos[0] = new Producto("producto 1",10);
        productos[1] = new Perecedero("producto 2", 20, 2);
        productos[2] = new NoPerecedero("producto 3", 30, "tipo 1");

        for (Producto p : productos){
            p.calcular(20);
            System.out.println(p);
        }
    }
}
