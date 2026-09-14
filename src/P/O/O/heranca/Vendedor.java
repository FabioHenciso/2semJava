package heranca;

public class Vendedor extends Funcionario
{

    private double totalVendas;

    public Vendedor(){
        this("Sem nome", 0, 0);
    }

    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    @Override
    public double calcularBonus (){

        return  this.totalVendas * 0.10; // 10% do total de vendas
    }

    @Override
    public void exibiDados(){
        super.exibiDados();
        System.out.println("\nBonus vendedor: " + (this.totalVendas * 0.10) );
    }
}
