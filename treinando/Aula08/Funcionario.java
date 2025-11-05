public class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;

    public Funcionario(){
        this.cargo = "Assistente";
    }

    public Funcionario(int cracha, float salario, String cargo){
        this.cracha = cracha;
        this.salario = salario;
        this.cargo = cargo;
    }

    public int getCracha(){
        return this.cracha;
    }
    public float getSalario(){
        return this.salario;
    }
    public String getCargo(){
        return this.cargo; 
    }
    public void setCracha(int cracha){
        this.cracha = cracha;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }

    public float calcularAumento(float percentual){
        float aumento = (this.salario * percentual) / 100;
        this.salario += aumento;
        return this.salario;
    }

    public String calculaAumento(int anos){
        int soma = anos * 150;
        this.salario += soma;
        return "Novo salário após " + anos + " anos: R$ " + this.salario;
    }
}
