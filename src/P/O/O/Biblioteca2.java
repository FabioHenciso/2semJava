package P.O.O;

import java.util.ArrayList;

public class Biblioteca2 {
    private String nome, endereco;

    private ArrayList<Livro2> livros;


    public Biblioteca2(){

        this("Sem nome", "Sem endereço");
    }

    public Biblioteca2 ( String nome, String endereco){

        this.setNome(nome); this.setEndereco(endereco);
        livros = new ArrayList<Livro2>();
    }
    //adiciona livro - agregação ( livro ja vem criado)
    public void adicionaLivro(Livro2 livro){
        this.livros.add(livro);
    }

    public void consultaAcervo(){
        //percorre o vetor de livros

        for(Livro2 livro : this.livros){ // para cada item do vetor livro
            System.out.println("Nome: "+ Livro2.getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void emprestar( String titulo){

        for(Livro2 livro : this.livros){

            if(Livro2.getTitulo().equals(titulo)){
                livro.emprestar();
            }
        }
    }
}
