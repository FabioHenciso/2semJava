package introducaoBanco;

import java.sql.*;
import java.util.Scanner;

public class aula1 {
    public static void criarTabela(Connection conn) throws SQLException {

        String sql = "CREATE TABLE IF NOT EXISTS produtos (" +
                "id SERIAL PRIMARY KEY, " +
                "nome TEXT NOT NULL, " +
                "preco REAL NOT NULL, " +
                "estoque INTEGER DEFAULT 0)";

        //Cria objete de instrução SQL
        Statement stmt = conn.createStatement();
        stmt.execute(sql);//executa comando SQL
        System.out.println("Tabela criada");
        stmt.close();// fecha instrução SQL
    }

    public static void insert(Connection conn,Scanner sc) throws SQLException {

        //cria sql
        System.out.println("Informe Nome do produto: ");
        String nome = sc.next();
        System.out.println("Informe o preço do produto ");
        double preco = sc.nextDouble();
        System.out.println("Informe o estoque do produto ");
        int estoque = sc.nextInt();

        String sql = "INSERT INTO produtos (nome, preco, estoque) values ( ?, ?, ?)";

        // prepara uma instruçao SQL
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nome);//define o nome do produto
        ps.setDouble(2, preco);//define o preço do produto
        ps.setInt(3, estoque);//define estoque do produto
        ps.executeUpdate();// Executa o SQL
        System.out.println("Produto inserido com sucesso");
        ps.close();
    }

    public static void consulta(Connection conn) throws SQLException {
        //cria o comando SQL
        String sql = "SELECT * FROM produtos ORDER BY nome";
        Statement stmt = conn.createStatement();
        //executa a consulta no banco e armazena o resultado
        ResultSet rs = stmt.executeQuery(sql);
        while( rs.next()){
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            double preco = rs.getDouble("preco");
            int estoque = rs.getInt("estoque");
            // mostra os registros da consulta
            System.out.printf("[%d] %s - R$ %.2f (estoque: %d )%n",id,nome,preco,estoque);
        }
    }

    public static void remove(Connection conn,Scanner sc) throws SQLException {

        System.out.println("informe o id do produto");
        int id = sc.nextInt();

        String sql = "DELETE FROM produtos WHERE id = ? ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        int linhasAfetadas = ps.executeUpdate();
        ps.close();
        if (linhasAfetadas > 0){
            System.out.println("Produto removido");
        }
        else System.out.println("ID não encontrado");

    }
    public static void atualizarPreco(Connection con, Scanner sc) throws SQLException {
        System.out.println("Informe id do produto");
        int id = sc.nextInt();
        System.out.println("Informe novo preço");
        Double novoPreco = sc.nextDouble();
        String sql = "UPDATE produtos SET preco = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, novoPreco);
        ps.setInt(2, id);
        int linhasAfetadas = ps.executeUpdate();
        if (linhasAfetadas > 0){
            System.out.println("Preço atualizado com sucesso");
        }
        else {
            System.out.println("Produto não encontrado");
        }
    }

    public static void exibirmenu(){
        System.out.println("\nCRUD de produtos");
        System.out.println("1. Listar produtos");
        System.out.println("2. Inserir Produto");
        System.out.println("3. Atualizar preço");
        System.out.println("4. Remover produto");
        System.out.println("0. Sair");
        System.out.println("Opção: ");

    }
    public static void processarOpcao(Connection conn,Scanner sc,int opcao) throws SQLException {

        switch (opcao){
            case 1: consulta(conn); break;
            case 2: insert(conn, sc); break;
            case 3 : atualizarPreco(conn, sc); break;
            case 4: remove(conn, sc);break;
            case 0:
                System.out.println("Encerrando ...");break;
            default:
                System.out.println("Opção invalida");

        }


    }

    public static void main(String[] args)  {




        String url = "jdbc:postgresql://localhost:5432/lojad";
        try {//tenta se conectar com o banco de dados
            Connection conn = DriverManager.getConnection(
                    url, "postgres", "fatec123*"

            );
            System.out.println("Conexao com sucesso");
            // cria a tabela produto
            criarTabela(conn);
           // insert(conn, "placa de video", 1200, 32);
            //atualizapreco(conn, 2, 109);
            //consulta(conn);
            Scanner sc = new Scanner(System.in);
            int opcao = 1;
            do{
                exibirmenu();
                opcao = sc.nextInt();
                sc.nextLine();
                processarOpcao(conn, sc, opcao);
            }
            while (opcao!=0 );

           // remove(conn, 3);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco " + e.getMessage());
        }

    }


}
