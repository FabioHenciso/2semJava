package P.O.O;

public class Livro2 {
    private String titulo, autor, editora;
    private int ano;
    private boolean disponivel;

    public Livro2(){
        this("Sem titulo", "Sem autor", "Sem editora", 0);
    }

    public Livro2(String titulo,String autor,String editora, int ano){

        this.setTitulo(titulo); this.setAutor(autor);
        this.setEditora(editora); this.setAno(ano);
        this.disponivel = true;
    }

    public String getTitulo(){

        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;

    }

    public  String getAutor(){

        return this.autor;
    }

    public void setEditora(String editora){

        this.editora = editora;

    }

    public String getEditora(){
        return this.editora;

    }

    public void setAno (int ano){
        this.ano = ano;

    }
    public int getAno(){

        return this.ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
