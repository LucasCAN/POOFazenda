package poofazenda;

/**
 * @author Lucas Carvalho Alves Nogueira
 */
public class Mamiferos extends Animais {

    public String corPelo;

    public Mamiferos(int idade, double tamanho, String corPelo) {
        super(idade, tamanho);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public void amamentam() {
        System.out.println("Amamentam.");
    }

}
