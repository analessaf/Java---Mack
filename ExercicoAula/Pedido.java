import java.util.ArrayList;
import java.util.Scanner;

public class Pedido implements Manipulacao {
    private Data data;
    private Cliente cliente;
    private float totalpedido;
    private ArrayList<Produto> produtos;

    public Pedido(Data data, Cliente cliente) {
        this.data = data;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.totalpedido = 0;
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
        return totalpedido;
    }

    public void setTotalpedido(float totalpedido) {
        this.totalpedido = totalpedido;
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
        System.out.print("Digite a data do pedido (dd mm aaaa): ");
        
    }

    public String consulta() {
        return;
    }

    public void calculaTotalPedido(){

    }

}
