public class Main {
    public static void main(String[] args) {
        Comercial comercial = new Comercial("DDR", 37, 100, 300);
        Repartidor repartidor = new Repartidor("Fernando", 26, 900, "zona 3");

        comercial.plus();
        repartidor.plus();

        System.out.println(comercial);
        System.out.println(repartidor);
    }
}
