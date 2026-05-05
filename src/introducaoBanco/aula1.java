package introducaoBanco;

import java.sql.*;

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

    public static void insert(Connection conn, String nome, double preco, int estoque) throws SQLException {

        //cria sql
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

    public static void remove(Connection conn, int id) throws SQLException {

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

    public static void main(String[] args)  {




        String url = "jdbc:postgresql://localhost:5432/lojad";
        try {//tenta se conectar com o banco de dados
            Connection conn = DriverManager.getConnection(
                    url, "postgres", "fatec123*"

            );
            System.out.println("Conexao com sucesso");
            // cria a tabela produto
            criarTabela(conn);
            insert(conn, "placa de video", 1200, 32);
            consulta(conn);
            remove(conn);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco " + e.getMessage());
        }

    }


}
