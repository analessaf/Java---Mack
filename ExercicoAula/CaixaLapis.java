import java.util.Scanner;

public class CaixaLapis extends Produto{
    private int quantidade;
    private boolean colorido;
    private String graduacao;

    public CaixaLapis(String marca, float valor, int quantidade, boolean colorido, String graduacao) {
        super(marca, valor);
        this.quantidade = quantidade;
        this.colorido = colorido;
        this.graduacao = graduacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean getColorido() {
        return colorido;
    }

    public void setColorido(boolean colorido) {
        this.colorido = colorido;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    @Override
    public void cadastro(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a marca da caixa de lápis: ");
        this.setMarca(scanner.nextLine());

        System.out.print("Digite o valor da caixa de lápis: ");
        this.setValor(scanner.nextFloat());

        System.out.print("Digite a quantidade de lápis na caixa: ");
        this.setQuantidade(scanner.nextInt());

        System.out.print("A caixa é colorida? (true/false): ");
        this.setColorido(scanner.nextBoolean());

        System.out.print("Digite a graduação dos lápis: ");
        this.setGraduacao(scanner.nextLine());

        scanner.close();
    }
    public String consulta() {
        return "\n -------------- Caixa de Lápis ---------------- " +
               "\nMarca: " + this.getMarca() +
               "\nValor: " + this.getValor() +
               "\nQuantidade: " + this.getQuantidade() +
               "\nColorido: " + this.getColorido() +
               "\nGraduação: " + this.getGraduacao() + "\n" +
               "--------------------------------------";
    }
}
