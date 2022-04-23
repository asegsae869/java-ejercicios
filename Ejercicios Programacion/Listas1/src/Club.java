import java.util.*;

public class Club {
    Socio[] s;

    public Club(int tamanhoArray){
        s = new Socio[tamanhoArray];
    }

    public void alta(String nombre){
        for (Socio i: s){
            if (!Objects.equals(nombre, i.getNombre())) nombre = i.getNombre();
        }
    }

    public void baja(String nombre){
        for (Socio i : s){
            if (Objects.equals(nombre, i.getNombre())) nombre = null;
        }
    }

    public void modificaciones(double nuevaCantidad, String nombre){
        for (Socio i : s){
            if (nombre.equals(i.getNombre())) i.setCuota(nuevaCantidad);
        }
    }

    public void apellidos(String apellidos){
        for (Socio i : s){
            if (apellidos.equals(i.getApellidos())) System.out.println(i.getApellidos());
        }
    }

    //FILTRA SEGUN LOS APELLIDOS¿?¿?¿? - DEBE SACAR EL ARRAYLIST COMPLETO por orden alfabetico
    public void listado() {
        for (Socio i : s) {
            System.out.println(i.toString());
        }
        /**
         * Collections.sort() - para ArrayList
         *
         *
         *
         * int[] arrDesc = Arrays.stream(arr).boxed()
         *     .sorted(Collections.reverseOrder())
         *     .mapToInt(Integer::intValue)
         *     .toArray();
         *
         * System.out.println(Arrays.toString(arrDesc));
         */

    }
}
