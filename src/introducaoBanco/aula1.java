package introducaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class aula1 {
    public static void main(String[] args){
        String url = "jdbc:postgres://localhost:5432/lojad";
        try {
            Connection conn = DriverManager.getConnection(
                    url, "postgres", "fatec123*"

            );
            System.out.println("Conexao com sucesso");
        }
        catch (SQLException e){
            System.out.println("Erro ao conectar com o banco " + e.getMessage());
        }

    }
}
