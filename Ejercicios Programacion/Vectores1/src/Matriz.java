import java.util.Arrays;

public class Matriz {
     int[][] matriz;
     int[] columna;
    private static final int aleatorio = (int) (Math.random() * 3 + 2);

    public Matriz(){
        matriz = new int[aleatorio][aleatorio];
        columna = new int[aleatorio];
    }

    public int comproColumna(int[][] matriz, int[] columna){
        int aux = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            aux = (Arrays.equals(matriz[i], columna))?1:-1;
        }
        return aux;
    }
}
