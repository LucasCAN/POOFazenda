package poofazenda;

/**
 * @author Lucas Carvalho Alves Nogueira
 */
public class Galinha extends Aves {

    /**
     * Constructor Galinha
     * @param idade
     * @param tamanho
     * @param corPena
     */
    public Galinha(int idade, double tamanho, String corPena) {
        super(idade, tamanho, corPena);
    }

    public Galinha() {
        super(0, 0.0, "");
    }

    public void somEmitido() {
        System.out.println("O som emitido pela Galinha é um cacarejo");
    }

    /**
     *
     * * Método para retorno de uma string que representa o objeto
     * @return 
     */
    @Override
    public String toString() {
        return "\nAnimal: " + "Galinha"
                + "\nIdade: " + this.idade + " anos" 
                + "\nTamanho: " + this.tamanho + " cm" 
                + "\nCor: " + this.corPena +
                "\nCaracteristicas adicionais: ";
    }
}
