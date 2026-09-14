package heranca;

public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario() {
        this("sem nome", 0);
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //calcula bonus
    public double calcularBonus (){

        return this.salario * 0.15; // 15%
    }
    public void exibiDados (){

        System.out.println( "Nome: " + this.nome
                + "\nSalario: " + this.salario
                + "\nBonus: " + this.calcularBonus()
                + "\nTotal a receber: " + (this.calcularBonus() + this.salario));
    }
}
