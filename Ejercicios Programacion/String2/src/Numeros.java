public class Numeros {
    private String[] numeros;

    public Numeros() {
        numeros = new String[4];
    }

    public void agregarYleerNumeros() {
        for (String i : numeros) {
            i = String.valueOf((int) (Math.random() * 10));
            if (i.equals("3")) i = "E";
            System.out.print(i + "-");
        }
    }
}