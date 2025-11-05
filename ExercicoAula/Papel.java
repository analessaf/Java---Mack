import java.util.Scanner;

public class Papel extends Produto {
    private String cor;
    private String tipo;
    private float largura;
    private float altura;
    private int gramatura;
    private boolean pautado;

    public Papel() {
        super("", 0);
    }

    public Papel(String marca, float valor, String cor, String tipo, float largura, float altura, int gramatura, boolean pautado) {
        super(marca, valor);
        this.cor = cor;
        this.tipo = tipo;
        this.largura = largura;
        this.altura = altura;
        this.gramatura = gramatura;
        this.pautado = pautado;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public float getLargura(){
        return largura;
    }

    public void setLargura(float largura){
        this.largura = largura;
    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public int getGramatura(){
        return gramatura;
    }

    public void setGramatura(int gramatura){
        this.gramatura = gramatura;
    }

    public boolean getPautado(){
        return pautado;
    }

    public void setPautado(boolean pautado){
        this.pautado = pautado;
    }

    public void cadastro(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite a marca do papel: ");
        this.setMarca(scanner.nextLine());

        System.out.print("Digite o valor do papel: ");
        this.setValor(scanner.nextFloat());

        System.out.print("Digite a cor do papel: ");
        scanner.nextLine();
        this.setCor(scanner.nextLine());

        System.out.print("Digite o tipo do papel: ");
        this.setTipo(scanner.nextLine());

        System.out.print("Digite a largura do papel: ");
        this.setLargura(scanner.nextFloat());

        System.out.print("Digite a altura do papel: ");
        this.setAltura(scanner.nextFloat());

        System.out.print("Digite a gramatura do papel: ");
        this.setGramatura(scanner.nextInt());

        System.out.print("O papel é pautado? (true/false): ");
        this.setPautado(scanner.nextBoolean());

    }

    public String consulta(){
        return "-------------- Papel ---------------- " +
               "\nMarca: " + this.getMarca() +
               "\nValor: " + this.getValor() +
               "\nCor: " + this.getCor() +
               "\nTipo: " + this.getTipo() +
               "\nLargura: " + this.getLargura() +
               "\nAltura: " + this.getAltura() +
               "\nGramatura: " + this.getGramatura() +
               "\nPautado: " + this.getPautado() + "\n" +
               "--------------------------------------";
    }

}
