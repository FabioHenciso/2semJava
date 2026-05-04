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
        System.out.println("Tabeka criada");
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

    public static void main(String[] args)  {




        String url = "jdbc:postgresql://localhost:5432/lojad";
        try {//tenta se conectar com o banco de dados
            Connection conn = DriverManager.getConnection(
                    url, "postgres", "fatec123*"

            );
            System.out.println("Conexao com sucesso");
            // cria a tabela produto
            criarTabela(conn);
            insert(conn, "mouse", 120, 3);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco " + e.getMessage());
        }

    }


}
