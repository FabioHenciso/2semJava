package P.O.O;

public class BibliotecaApp2 {

    public static void main(String [] args){

        Livro2 li1 = new Livro2 ("Java", "Deitel", "Campus", 2022);
        Livro2 li2 = new Livro2 ("C++", "Gustavo", "Novatec", 2023);
        Livro2 li3 = new Livro2 ("Python", "Carlos", "Bookman", 2021);

        //Cria biblioteca

        Biblioteca2 bi1 = new Biblioteca2("Bora pra cima", "Rua dos Programadores, 1001");

        bi1.adicionaLivro(li1);
        bi1.adicionaLivro(li2);
        bi1.adicionaLivro(li3);

        bi1.consultaAcervo();

    }
}
