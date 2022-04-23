import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Club club = new Club(5);

        club.s[0] = new Socio("andres", "segura", 5600);
        club.s[1] = new Socio("miguel", "lopez", 5600);
        club.s[2] = new Socio("erika", "granero", 5600);
        club.s[3] = new Socio("monica", "martinez", 5600);
        club.s[4] = new Socio("blanca", "aguilar", 5600);

        Arrays.sort(club.s); //para usar Arrays.sort hay que utilizar un método compareTo(Object object)
        club.listado();

    }
}
