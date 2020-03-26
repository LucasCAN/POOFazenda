package poofazenda;

import java.util.Scanner;

/**
 * @author Lucas Carvalho Alves Nogueira
 */
public class POOFazenda {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        try {

            System.out.println("\nMenu - Escolha Tipo de animal: " + "\n1)Aves" + "\n2)Mamíferos" + "\n0)Finalizar");

            int menu = scan.nextInt();            
            //scan.nextLine();
            while (menu != 0) {
                switch (menu) {
                    case 1:
                        menuAves();
                        break;
                    case 2:
                        menuMamiferos();
                        break;
                    case 0:
                        System.out.println("Fim! ");
                        break;
                    default:
                        System.out.println("Inválido! ");
                }
                System.out.println("\nMenu - Caracteristicas dos Animais : " + "\n1)Aves" + "\n2)Mamíferos" + "\n0)Finalizar");

                menu = scan.nextInt();
                scan.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Menu aves para selecionar animal
     * @throws Exception
     */
    public static void menuAves() throws Exception {
        System.out.println();

        System.out.println("Menu Aves: " + "\n1)Pato" + "\n2)Galinha" + "\n0)Retornar");

        int opcao = scan.nextInt();
        scan.nextLine();

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    incluirPato();
                    break;
                case 2:
                    incluirGalinha();
                    break;
                case 0:
                    System.out.println("Retornar");
                    break;
                default:
                    System.out.println("Invalido! ");
            }
            System.out.println("Menu Aves: " + "\n1)Pato" + "\n2)Galinha" + "\n0)Retornar");

            opcao = scan.nextInt();
            scan.nextLine();
        }

    }

    /**
     * Menu Mamíferos para selecionar animal
     * @throws Exception
     */
    public static void menuMamiferos() throws Exception {
        System.out.println();

        System.out.println("Menu Mamíferos: " + "\n1)Vaca" + "\n2)Morcego" + "\n0)Retornar");

        int opcao = scan.nextInt();
        scan.nextLine();

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    incluirVaca();
                    break;
                case 2:
                    incluirMorcego();
                    break;
                case 0:
                    System.out.println("Retornar");
                    break;
                default:
                    System.out.println("Invalido! ");
            }
            System.out.println("Menu Mamíferos: " + "\n1)Vaca" + "\n2)Morcego" + "\n0)Retornar");

            opcao = scan.nextInt();
            scan.nextLine();
        }

    }

    /**
     * Metodo para adicionar um Pato
     * @throws Exception
     */
    public static void incluirPato() throws Exception {
        System.out.println();

        System.out.println("Caracteristicas do Pato: ");
        Pato pato = new Pato();
        System.out.println("Quantos anos ele tem?");
        pato.idade = scan.nextInt();

        System.out.println("Qual o tamanho do pato? (em centímetros)");
        pato.tamanho = scan.nextDouble();

        scan.nextLine();

        System.out.println("Qual a cor do pato?");
        pato.corPena = scan.nextLine();

        System.out.println(pato.toString());
        pato.somEmitido();
        pato.botarOvos();
        pato.voa();
        System.out.println();

    }

    /**
     * Metodo para adicionar uma Galinha
     * @throws Exception
     */
    public static void incluirGalinha() throws Exception {
        System.out.println();

        System.out.println("Caracteristicas da Galinha: ");
        Galinha galinha = new Galinha();
        System.out.println("Quantos anos ele tem?");
        galinha.idade = scan.nextInt();

        System.out.println("Qual o tamanho da Galinha? (em centímetros)");
        galinha.tamanho = scan.nextDouble();

        scan.nextLine();

        System.out.println("Qual a cor da Galinha?");
        galinha.corPena = scan.nextLine();

        System.out.println(galinha.toString());
        galinha.somEmitido();
        galinha.botarOvos();
        System.out.println();

    }

    /**
     * Metodo para adicionar uma Vaca
     * @throws Exception
     */
    public static void incluirVaca() throws Exception {
        System.out.println();

        System.out.println("Caracteristicas da Vaca: ");
        Vaca vaca = new Vaca();
        System.out.println("Quantos anos ele tem?");
        vaca.idade = scan.nextInt();

        System.out.println("Qual o tamanho da Vaca? (em metros)");
        vaca.tamanho = scan.nextDouble();

        scan.nextLine();

        System.out.println("Qual a cor da Vaca?");
        vaca.corPelo = scan.nextLine();

        System.out.println(vaca.toString());
        vaca.somEmitido();
        vaca.amamentam();
        System.out.println();

    }

    /**
     * Metodo para adicionar um Morcego
     * @throws Exception
     */
    public static void incluirMorcego() throws Exception {
        System.out.println();

        System.out.println("Caracteristicas do Morcego: ");
        Morcego morcego = new Morcego();
        System.out.println("Quantos anos ele tem?");
        morcego.idade = scan.nextInt();

        System.out.println("Qual o tamanho do Morcego? (em centímetros)");
        morcego.tamanho = scan.nextDouble();

        scan.nextLine();

        System.out.println("Qual a cor do Morcego?");
        morcego.corPelo = scan.nextLine();

        System.out.println(morcego.toString());
        morcego.somEmitido();
        morcego.amamentam();
        morcego.voa();
        System.out.println();
    }

}
