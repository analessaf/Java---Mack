public class Programa {
    public static void main(String[] args) {
        FolhaPagamento fp = new FolhaPagamento();
        fp.adicionarFuncionario(new Funcionario("Ana", 11000));
        fp.adicionarFuncionario(new FuncionarioComissionado("Gabriela", 1000, 7.5, 15000));
        fp.adicionarFuncionario(new FuncionarioProdutividade("Ju", 1000, 1.50,750));
        fp.listarFuncionarios();
    }
}
    