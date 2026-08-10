package P.O.O;

public class Produto {

    //variaveis de instancia
    public String nome;
    public double preco;
    public int qtdEstoque;

    //variavel de classe
    public static int totalProdutos;

    // metodos contrutores

    public Produto (){
        this("Produto sem nome", 0.0,  0 );
    }

    public Produto(String nome, double preco, int qtdEstoque){

        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        Produto.totalProdutos++;
    }
    // metodo de classe
    public static int getTotalProdutos(){
        return Produto.totalProdutos;
    }

    //metodos de instancia

    public void vender (){
        if (this.qtdEstoque > 0){
            this.qtdEstoque -= 1;
            System.out.println("Vendido");
        }
        else {
            System.out.println("Produto dem estoque duficiente");
        }

    }

    public void repor(){
        this.qtdEstoque ++;
        System.out.println("Estoque aumentado");
    }

    public void exibirDados(){
        System.out.println("\nNome: " + this.nome +
                "Preço: " + this.preco +
                "Quantidade em estoque: " + this.qtdEstoque);
    }

}
