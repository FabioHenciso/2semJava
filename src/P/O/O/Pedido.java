package P.O.O;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    private int nro;
    private LocalDateTime data;
    private float valor;

    // vetor
    private ArrayList<ItemPedido> itens;

    public Pedido() {
        this(0, LocalDateTime.now());
    }

    public Pedido(int nro, LocalDateTime data) {
        this.setNro(nro);
        this.setData(data);
        this.valor = 0;
        this.itens = new ArrayList<ItemPedido>();
    }


    public void adicionaItemPedido(String produto, float valor, int qtde){
        this.itens.add(new ItemPedido(produto, valor, qtde));
        this.valor = this.valor + (valor * qtde);// altera valor do pedido
    }

    public void exibeItens(){
        System.out.println("Itens do pedido: ");
        for(ItemPedido itenPedido : this.itens){
            System.out.println("Produto: "+ ItemPedido.getPoduto() +
                    "Quantidade: "+ ItemPedido.getQtde()+
                    "");
        }
    }
    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
