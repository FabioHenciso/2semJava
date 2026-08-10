package P.O.O;

public class ProdutoApp {

    public static void main (String[] args){

        //objetos

        Produto P1 = new Produto (" A ", 10.0,3);
        Produto P2 = new Produto (" B ", 20.0, 2);
        Produto P3 = new Produto ();

        P1.vender();
        P1.exibirDados();
        P1.repor();
        P1.exibirDados();

        P2.vender();
        P2.exibirDados();
        P2.repor();
        P2.exibirDados();

        P3.vender();
        P3.exibirDados();
        P3.repor();
        P3.exibirDados();

        System.out.println("Total de produtos: " + Produto.getTotalProdutos());
    }
}
