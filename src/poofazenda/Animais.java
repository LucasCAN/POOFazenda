package poofazenda;

/**
 * @author Lucas Carvalho Alves Nogueira
 */
public class Animais {

    public int idade;
    public double tamanho;

    /**
     * Construtor Animais
     *
     * @param idade - Idade do animal
     * @param tamanho - Tamanho do animal
     */
    public Animais(int idade, double tamanho) {
        this.idade = idade;
        this.tamanho = tamanho;
    }

    /**
     * Sets e Gets
     *
     */
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }        

}
