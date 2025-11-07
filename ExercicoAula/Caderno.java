import java.util.Scanner;

public class Caderno extends Produto {
    private int qtdfolhas;
    private String tamanho;
    private String tipo;
    private boolean capaDura;

    public Caderno() {
        super("", 0);
    }

    public Caderno(String marca, float valor, int qtdfolhas, String tamanho, String tipo, boolean capaDura) {
        super(marca, valor);
        this.qtdfolhas = qtdfolhas;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.capaDura = capaDura;
    }

    public int getQtdfolhas() {
        return qtdfolhas;
    }

    public void setQtdfolhas(int qtdfolhas) {
        this.qtdfolhas = qtdfolhas;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getCapaDura() {
        return capaDura;
    }

    public void setCapaDura(boolean capaDura) {
        this.capaDura = capaDura;
    }

    @Override
    public void cadastro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite a marca do caderno: ");
        this.setMarca(scanner.nextLine());

        System.out.print("Digite o valor do caderno: ");
        this.setValor(scanner.nextFloat());

        System.out.print("Digite a quantidade de folhas do caderno: ");
        this.setQtdfolhas(scanner.nextInt());

        System.out.print("Digite o tamanho do caderno: ");
        this.setTamanho(scanner.next());

        System.out.print("Digite o tipo do caderno: ");
        this.setTipo(scanner.next());

        System.out.print("O caderno tem capa dura? (true/false): ");
        this.setCapaDura(scanner.nextBoolean());

    }

    public String consulta() {
        return "-------------- Caderno ----------------" +
               "\nMarca: " + this.getMarca() +
               "\nValor: " + this.getValor() +
               "\nQuantidade de Folhas: " + this.getQtdfolhas() +
               "\nTamanho: " + this.getTamanho() +
               "\nTipo: " + this.getTipo() +
               "\nCapa Dura: " + this.getCapaDura()  + "\n" +
                "--------------------------------------";
    }          
}   
