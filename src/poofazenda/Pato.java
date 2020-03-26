package poofazenda;

/**
 * @author Lucas Carvalho Alves Nogueira
 */
public class Pato extends Aves implements Voar {

    /**
     * Constructor Pato
     * @param idade
     * @param tamanho
     * @param corPena
     */
    public Pato(int idade, double tamanho, String corPena) {
        super(idade, tamanho, corPena);
    }

    public Pato() {
        super(0, 0.0, "");
    }

    /**
     *
     */
    public void somEmitido() {
        System.out.println("O som emitido pelo pato é um grasnido.");
    }

    /**
     *
     * * Método para retorno de uma string que representa o objeto
     * @return 
     */
    @Override
    public String toString() {
        return "\nAnimal: " + "Pato"
                + "\nIdade: " + this.idade + " anos" 
                + "\nTamanho: " + this.tamanho + " cm" 
                + "\nCor: " + this.corPena +
                "\nCaracteristicas adicionais: ";
    }

    /**
     *
     */
    public void voa() {
        System.out.println("O pato pode voar.");
    }
}
