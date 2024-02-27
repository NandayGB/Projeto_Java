package projeto_java;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("\u001B[35m-----------------------------------------------------");
            System.out.println("\u001B[35m                                                     ");
            System.out.println("\u001B[35m                  NANDAY PANELAS                     ");
            System.out.println("\u001B[35m                                                     ");
            System.out.println("\u001B[35m-----------------------------------------------------\u001B[0m");
            System.out.println("\n\u001B[34m============== Menu Principal ======================\u001B[0m");
            System.out.println("\u001B[34m            1 - Ver Catálogo de Produtos             ");
            System.out.println("\u001B[34m            2 - Adicionar Produto ao Carrinho        ");
            System.out.println("\u001B[34m            3 - Visualizar Carrinho de Compras       ");
            System.out.println("\u001B[34m            4 - Finalizar Compra                     ");
            System.out.println("\u001B[34m            5 - Sair                                 ");
            System.out.println("\u001B[34m                                                     ");
            System.out.println("\u001B[35m-----------------------------------------------------\u001B[0m");
            System.out.print("\u001B[34mOpção desejada: ");

            opcao = leia.nextInt();
            leia.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("\nVer Catálogo de Panelas\n\n");
                    // Implemente a lógica para exibir o catálogo de panelas
                    break;
                case 2:
                    System.out.println("\nAdicionar Panela ao Carrinho\n\n");
                    // Aqui ela adiciona a panela que ela deseja
                    break;
                case 3:
                    System.out.println("\nVisualizar Carrinho de Compras\n\n");
                    // Aqui ela verifica o carrinho de compras
                    break;
                case 4:
                    System.out.println("\nFinalizar Compra\n\n");
                    // Aqui a pessoa finaliza a compra 
                    break;
                case 5:
                    System.out.println("\nObrigado por escolher a NANDAY PANELAS!");
                    leia.close();
                    System.exit(0);
                 // Aqui Está o agradecimento
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }
}