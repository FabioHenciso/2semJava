package P.O.O;

public class ItemPedido {
    private String produto;
    private float valor;
    private int qtde;


    public String getProduto() {
        return produto;
    }

    public ItemPedido() {
        this("Sem produto" , 0, 0);
    }

    public ItemPedido(String produto, float valor, int qtde) {
        this.produto = produto;
        this.valor = valor;
        this.qtde = qtde;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
}
