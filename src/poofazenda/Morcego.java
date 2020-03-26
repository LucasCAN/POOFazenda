package poofazenda;

/**
 * @author Lucas Carvalho Alves Nogueira
 */
public class Morcego extends Mamiferos implements Voar {

    /**
     * Constructor Morcego
     *
     * @param idade
     * @param tamanho
     * @param corPelo
     */
    public Morcego(int idade, double tamanho, String corPelo) {
        super(idade, tamanho, corPelo);
    }

    public Morcego() {
        super(0, 0.0, "");
    }

    public void somEmitido() {
        System.out.println("O som emitido pelo morcego é um farfalho");
    }

    /**
     *
     * * Método para retorno de uma string que representa o objeto
     * @return 
     */
    @Override
    public String toString() {
        return "\nAnimal: " + "Morcego"
                + "\nIdade: " + this.idade + " anos"
                + "\nTamanho: " + this.tamanho + " cm"
                + "\nCor: " + this.corPelo
                + "\nCaracteristicas adicionais: ";
    }

    @Override
    public void voa() {
        System.out.println("O morcego pode voar.");
    }
}
