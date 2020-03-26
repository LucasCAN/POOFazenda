package poofazenda;

/**
 * @author Lucas Carvalho Alves Nogueira
 */
public class Vaca extends Mamiferos {

    /**
     * Constructor Vaca 
     * @param idade
     * @param tamanho
     * @param corPelo
     */
    public Vaca(int idade, double tamanho, String corPelo) {
        super(idade, tamanho, corPelo);
    }

    public Vaca() {
        super(0, 0.0, "");
    }

    /**
     * Metodo para som emitido por uma vaca
     */
    public void somEmitido() {
        System.out.println("O som emitido pela vaca é um mugido");
    }

    /**
     *
     * * Método para retorno de uma string que representa o objeto
     * @return 
     */
    @Override
    public String toString() {
        return "\nAnimal: " + "Vaca"
                + "\nIdade: " + this.idade + " anos" 
                + "\nTamanho: " + this.tamanho + " m" 
                + "\nCor: " + this.corPelo +
                "\nCaracteristicas adicionais: ";
    }
}
