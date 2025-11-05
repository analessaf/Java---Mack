import java.util.ArrayList;

public class Cliente {
    private String cpf;
    private String nome;
    ArrayList<Compra> compras;

    public Cliente(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
        this.compra = new ArrayList<>()
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
