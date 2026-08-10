package P.O.O;

public class Livro {

    //Variaveis de instancia
    public String titulo;
    public String autor;
    public boolean disponivel;

    //variavel de classe
    public static int totalLivros;

    // metodos construtores - sobrecarga

    public Livro(){

        this("sem titulo", "sem autor");
    }
    public Livro (String titulo, String autor){

        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        Livro.totalLivros++;
    }
    // metodo de classe
    public static int getTotalLivros(){
        return Livro.totalLivros;
    }

    //metodo de instancia
    public void emprestar(){
        if(this.disponivel){
            this.disponivel = false;
            System.out.println("Livro emprestado com sucesso");
        }
        else {
            System.out.println("Livro ja emprestado");
        }
    }
    public void devolver(){
            this.disponivel = true;
            System.out.println("Livro devolvido com sucesso");
    }

    public void exibirFicha(){
        System.out.println("\nTitulo :" + this.titulo +
                " Autor : " + this.autor +
                " Status: " + (this.disponivel ? " Disponivel": " Emprestado") );
    }

}
