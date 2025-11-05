import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Pedido> listaDePedidos = new ArrayList<>();

        int opcao = -1;

        while(opcao !=0){

            System.out.println("\n===== SISTEMA DE PAPELARIA =====");
            System.out.println("1. Cadastrar um Pedido");
            System.out.println("2. Consultar Pedidos");
            System.out.println("0. Sair");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    Pedido pedido = new Pedido();
                    pedido.cadastro();
                    listaDePedidos.add(pedido);
                    System.out.println("Pedido cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("\n====== LISTA DE PEDIDOS ======");
                    for (Pedido p : listaDePedidos) {
                        System.out.println(p.consulta());
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}
