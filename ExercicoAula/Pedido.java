import java.util.ArrayList;
import java.util.Scanner;

public class Pedido implements Manipulacao {
    private Data data;
    private Cliente cliente;
    private float totalPedido;
    private ArrayList<Produto> produtos;

    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    public Data getData() {
        return data;
    }   

    public void setData(Data data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getTotalpedido() {
        return totalPedido;
    }

    public void setTotalpedido(float totalpedido) {
        this.totalPedido = totalpedido;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public void cadastro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Cadastro da Data do Pedido ---");
        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        this.data = new Data(dia, mes, ano);

        scanner.nextLine();

        System.out.println("\n----- Cadastro do Cliente -----");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        this.cliente = new Cliente(nome, cpf, telefone);


        boolean continuar = true;
        while (continuar) {
            System.out.println("\n----- Cadastro de Produtos -----");
            System.out.println("1 - Papel");
            System.out.println("2 - Caixa de Lápis");
            System.out.println("3 - Caderno");
            System.out.print("Escolha o tipo de produto: ");
            int opc = scanner.nextInt();
            scanner.nextLine();

            Produto p = null;

            switch (opc) {
                case 1:
                    p = new Papel();
                    p.cadastro();
                    break;
                case 2:
                    p = new CaixaLapis();
                    p.cadastro();
                    break;
                case 3:
                    p = new Caderno();
                    p.cadastro();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            produtos.add(p);

            System.out.print("Deseja adicionar outro produto? (s/n): ");
            String resp = scanner.nextLine();
            if (resp.equals("n")) continuar = false;
        }
        this.calculaTotalPedido();
    }

    @Override
    public String consulta() {
        
        String infoProdutos = "";
        for (Produto p : this.produtos) {
            infoProdutos += p.consulta();
            infoProdutos += "\n";
        }
        
        return "\n===== Consulta do Pedido =====\n" +
               "---------- Dados do Cliente ----------\n" +
               "Nome: " + this.cliente.getNome() + "\n" +
               "CPF: " + this.cliente.getCpf() + "\n" +
               "Telefone: " + this.cliente.getTelefone() + "\n" +
               "\n----------- Data do Pedido ----------\n" +
               "Data: " + data.getDia() + "/" + data.getMes() + "/" + data.getAno() + "\n" +
               "\n--------- Produtos Inclusos ---------\n" +
               infoProdutos + // <-- Aqui entra a string do loop
               "\n------------- Total Geral -------------\n" +
               "Valor Total (com 18% imposto): R$ " + totalPedido + "\n" +
               "=========================================\n";
                
    }

    public void calculaTotalPedido(){
        float custoTotal = 0;
        for (Produto p : this.produtos){
            custoTotal += p.getValor();
        }

        this.totalPedido = custoTotal + (custoTotal * 0.18f);
    }

}
