package heranca;

public class FuncionarioApp {
    public static void main( String [] args){

        Funcionario funcionario = new Funcionario("Breno", 3000);
        System.out.println("Dados funcionario Breno: ");
        funcionario.exibiDados();

        Gerente ge = new Gerente("Ana", 5000, 1000);
        System.out.println("\nDados da gerente Ana: ");
        ge.exibiDados();

        Vendedor ve = new Vendedor("Carlos", 4000, 50000);
        System.out.println("\nDados do vendedor Carlos: ");
        ve.exibiDados();
    }
}
