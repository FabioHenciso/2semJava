package P.O.O;

public class ContaBancaria {

    //Variaveis de classe
    static int totalContas = 0;
    static final double TX_MANUT = 12;

    // VARIAVEL DE INSTANCIA

    public String titular;
    public String numero;
    public double saldo;

    // metodos construtores
    // sobrecarga de metodos constutores
    public ContaBancaria(){
        this("Sem titular", "0000", 0);
    }
    public ContaBancaria(String titular, String numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        totalContas++;
    }

    public void depositar(double x){
        if(x >= 0){
            this.saldo += x;
            System.out.println("Depositado com sucesso");
        }
    }

    public void saque( double x){
        if( x >= 0 && x <= this.saldo){
            this.saldo -= x;
            System.out.println("Saque efetuado com sucesso");
        }

    }
    public void mostra(){
        //This representa o objeto que chama o metodo
        System.out.println( " Titular: " + this.titular+
                " Número: " + this.numero +
                " Saldo: " + this.saldo);
    }
}