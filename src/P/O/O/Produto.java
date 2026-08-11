package P.O.O;

import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);
    int compra = 0;

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
        System.out.println("Informe a quantidade de produtos da compra: ");
        compra = sc.nextInt();

        if (this.qtdEstoque > 0 && this.qtdEstoque > compra){

            this.qtdEstoque -= compra;
            System.out.println("Vendido");
        }
        else {
            System.out.println("Produto sem estoque duficiente");
        }

    }
    int repo = 0;
    public void repor(){
        System.out.println("Informe a quantidade de reposição: ");
        repo = sc.nextInt();
        this.qtdEstoque += repo;
        System.out.println("Estoque aumentado");
    }

    public void exibirDados(){
        System.out.println("\nNome: " + this.nome +
                "Preço: " + this.preco +
                "Quantidade em estoque: " + this.qtdEstoque);
    }

}
