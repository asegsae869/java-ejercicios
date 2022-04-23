public class Rectangulo extends Forma{
    int ladoMenor, ladoMayor;

    public Rectangulo(String color, String nombreForma, int ladoMayor, int ladoMenor){
        super(color,nombreForma);
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }

    public int calcularArea(){
        return ladoMenor * ladoMayor;
    }

    public int calcularPerimetro(){
        return (2 * ladoMenor) + (2 * ladoMayor);
    }

    public void cambiarTamanho(int factorEscala){
        if (factorEscala == 2){
            ladoMayor = ladoMayor * 2;
            ladoMenor = ladoMenor * 2;
        } else if (factorEscala == 0.5){
            ladoMayor = ladoMayor / 2;
            ladoMenor = ladoMenor / 2;
        }
    }
}
