package poofazenda;

/**
 * @author Lucas Carvalho Alves Nogueira
 */
public class Aves extends Animais {

    public String corPena;

    public Aves(int idade, double tamanho, String corPena) {
        super(idade, tamanho);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    public void botarOvos(){
        System.out.println("Bota ovos.");
    }

}
