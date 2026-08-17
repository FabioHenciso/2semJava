package P.O.O;

public class Funcionario {
    private String Nome;

    private double Salario;
    private int CargaHorariaSemana;

    public Funcionario (String Nome, double Salario, int CargaHorariaSemana){

        this.setSalario(Salario);
        this.setNome(Nome);
        this.setCargaHorariaSemana(CargaHorariaSemana);
    }

    public void setNome(String nome) {
        if (nome.isEmpty() || nome.length()> 50) {
            System.out.println("Nome invalido");
        }
        else{
            this.Nome = nome;
        }

    }


    public void setSalario (double salario){

        if (salario < 0){

            System.out.println("Salario invalido");
        }
        else {
            this.Salario = salario;}


    }

    public void setCargaHorariaSemana(int cargaHorariaSemana) {

        if (cargaHorariaSemana < 1 || cargaHorariaSemana > 44){
            System.out.println("Carga horaria invalida ");
        }
        else {
            System.out.println("Carga horaria valida");
            this.CargaHorariaSemana = cargaHorariaSemana;
        }
    }

    //getters
    public String getNome(){return this.Nome;}
    public double getSalario(){return this.Salario;}

    public int getCargaHorariaSemana() {
        return this.CargaHorariaSemana;
    }

    public void exibirDados(){

        System.out.println("Nome: "+ this.Nome + "\n Salario: "
        + this.Salario + "\n Carga Horaria semanal: "+ this.CargaHorariaSemana);
    }
}
