package introducaoBanco;

import java.sql.*;
        import java.util.Scanner;

public class VidAtiva_Bd {

    // =========================
    // CRIAÇÃO DAS TABELAS
    // =========================
    public static void criarTabelas(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();

        String jogadores = "CREATE TABLE IF NOT EXISTS jogadores (" +
                "id SERIAL PRIMARY KEY, " +
                "nome TEXT NOT NULL, " +
                "data_nascimento DATE, " +
                "posicao TEXT, " +
                "categoria TEXT, " +
                "telefone TEXT, " +
                "responsavel TEXT, " +
                "status TEXT DEFAULT 'Ativo')";

        String patrocinadores = "CREATE TABLE IF NOT EXISTS patrocinadores (" +
                "id SERIAL PRIMARY KEY, " +
                "nome_empresa TEXT NOT NULL, " +
                "responsavel TEXT, " +
                "telefone TEXT, " +
                "email TEXT, " +
                "tipo_apoio TEXT, " +
                "valor_apoio NUMERIC(10,2), " +
                "status TEXT DEFAULT 'Ativo')";

        String futurosJogos = "CREATE TABLE IF NOT EXISTS futuros_jogos (" +
                "id SERIAL PRIMARY KEY, " +
                "adversario TEXT NOT NULL, " +
                "data_jogo DATE NOT NULL, " +
                "horario TIME, " +
                "local_jogo TEXT, " +
                "categoria TEXT, " +
                "observacoes TEXT)";

        String futurosTreinos = "CREATE TABLE IF NOT EXISTS futuros_treinos (" +
                "id SERIAL PRIMARY KEY, " +
                "data_treino DATE NOT NULL, " +
                "horario TIME, " +
                "local_treino TEXT, " +
                "categoria TEXT, " +
                "responsavel_treino TEXT, " +
                "observacoes TEXT)";

        stmt.execute(jogadores);
        stmt.execute(patrocinadores);
        stmt.execute(futurosJogos);
        stmt.execute(futurosTreinos);

        stmt.close();
        System.out.println("Tabelas criadas/verificadas com sucesso!");
    }

    // =========================
    // CADASTRO DE JOGADORES
    // =========================
    public static void cadastrarJogador(Connection conn, Scanner sc) throws SQLException {
        String sql = "INSERT INTO jogadores (nome, data_nascimento, posicao, categoria, telefone, responsavel, status) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        System.out.print("Nome do jogador: ");
        ps.setString(1, sc.nextLine());

        System.out.print("Data de nascimento (AAAA-MM-DD): ");
        String dataNascimento = sc.nextLine();
        if (dataNascimento.isBlank()) {
            ps.setNull(2, Types.DATE);
        } else {
            ps.setDate(2, Date.valueOf(dataNascimento));
        }

        System.out.print("Posição: ");
        ps.setString(3, sc.nextLine());

        System.out.print("Categoria: ");
        ps.setString(4, sc.nextLine());

        System.out.print("Telefone: ");
        ps.setString(5, sc.nextLine());

        System.out.print("Responsável: ");
        ps.setString(6, sc.nextLine());

        System.out.print("Status (Ativo/Inativo): ");
        ps.setString(7, sc.nextLine());

        ps.executeUpdate();
        ps.close();

        System.out.println("Jogador cadastrado com sucesso!");
    }

    public static void consultarJogadores(Connection conn) throws SQLException {
        String sql = "SELECT * FROM jogadores ORDER BY nome";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("\n===== JOGADORES CADASTRADOS =====");
        while (rs.next()) {
            System.out.printf("ID: %d | Nome: %s | Nascimento: %s | Posição: %s | Categoria: %s | Telefone: %s | Responsável: %s | Status: %s%n",
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getDate("data_nascimento"),
                    rs.getString("posicao"),
                    rs.getString("categoria"),
                    rs.getString("telefone"),
                    rs.getString("responsavel"),
                    rs.getString("status"));
        }

        rs.close();
        stmt.close();
    }

    public static void removerJogador(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Digite o ID do jogador para remover: ");
        int id = Integer.parseInt(sc.nextLine());

        String sql = "DELETE FROM jogadores WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        int linhas = ps.executeUpdate();
        ps.close();

        if (linhas > 0) {
            System.out.println("Jogador removido com sucesso!");
        } else {
            System.out.println("ID não encontrado.");
        }
    }

    // =========================
    // CADASTRO DE PATROCINADORES
    // =========================
    public static void cadastrarPatrocinador(Connection conn, Scanner sc) throws SQLException {
        String sql = "INSERT INTO patrocinadores (nome_empresa, responsavel, telefone, email, tipo_apoio, valor_apoio, status) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        System.out.print("Nome da empresa/patrocinador: ");
        ps.setString(1, sc.nextLine());

        System.out.print("Responsável: ");
        ps.setString(2, sc.nextLine());

        System.out.print("Telefone: ");
        ps.setString(3, sc.nextLine());

        System.out.print("E-mail: ");
        ps.setString(4, sc.nextLine());

        System.out.print("Tipo de apoio (financeiro, material, serviços etc.): ");
        ps.setString(5, sc.nextLine());

        System.out.print("Valor estimado do apoio: ");
        String valor = sc.nextLine();
        if (valor.isBlank()) {
            ps.setNull(6, Types.NUMERIC);
        } else {
            ps.setDouble(6, Double.parseDouble(valor.replace(",", ".")));
        }

        System.out.print("Status (Ativo/Inativo/Em negociação): ");
        ps.setString(7, sc.nextLine());

        ps.executeUpdate();
        ps.close();

        System.out.println("Patrocinador cadastrado com sucesso!");
    }

    public static void consultarPatrocinadores(Connection conn) throws SQLException {
        String sql = "SELECT * FROM patrocinadores ORDER BY nome_empresa";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("\n===== PATROCINADORES CADASTRADOS =====");
        while (rs.next()) {
            System.out.printf("ID: %d | Empresa: %s | Responsável: %s | Telefone: %s | E-mail: %s | Tipo de apoio: %s | Valor: R$ %.2f | Status: %s%n",
                    rs.getInt("id"),
                    rs.getString("nome_empresa"),
                    rs.getString("responsavel"),
                    rs.getString("telefone"),
                    rs.getString("email"),
                    rs.getString("tipo_apoio"),
                    rs.getDouble("valor_apoio"),
                    rs.getString("status"));
        }

        rs.close();
        stmt.close();
    }

    public static void removerPatrocinador(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Digite o ID do patrocinador para remover: ");
        int id = Integer.parseInt(sc.nextLine());

        String sql = "DELETE FROM patrocinadores WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        int linhas = ps.executeUpdate();
        ps.close();

        if (linhas > 0) {
            System.out.println("Patrocinador removido com sucesso!");
        } else {
            System.out.println("ID não encontrado.");
        }
    }

    // =========================
    // CADASTRO DE FUTUROS JOGOS
    // =========================
    public static void cadastrarFuturoJogo(Connection conn, Scanner sc) throws SQLException {
        String sql = "INSERT INTO futuros_jogos (adversario, data_jogo, horario, local_jogo, categoria, observacoes) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        System.out.print("Adversário: ");
        ps.setString(1, sc.nextLine());

        System.out.print("Data do jogo (AAAA-MM-DD): ");
        ps.setDate(2, Date.valueOf(sc.nextLine()));

        System.out.print("Horário (HH:MM): ");
        String horario = sc.nextLine();
        if (horario.isBlank()) {
            ps.setNull(3, Types.TIME);
        } else {
            ps.setTime(3, Time.valueOf(horario + ":00"));
        }

        System.out.print("Local do jogo: ");
        ps.setString(4, sc.nextLine());

        System.out.print("Categoria: ");
        ps.setString(5, sc.nextLine());

        System.out.print("Observações: ");
        ps.setString(6, sc.nextLine());

        ps.executeUpdate();
        ps.close();

        System.out.println("Futuro jogo cadastrado com sucesso!");
    }

    public static void consultarFuturosJogos(Connection conn) throws SQLException {
        String sql = "SELECT * FROM futuros_jogos ORDER BY data_jogo, horario";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("\n===== FUTUROS JOGOS =====");
        while (rs.next()) {
            System.out.printf("ID: %d | Adversário: %s | Data: %s | Horário: %s | Local: %s | Categoria: %s | Obs: %s%n",
                    rs.getInt("id"),
                    rs.getString("adversario"),
                    rs.getDate("data_jogo"),
                    rs.getTime("horario"),
                    rs.getString("local_jogo"),
                    rs.getString("categoria"),
                    rs.getString("observacoes"));
        }

        rs.close();
        stmt.close();
    }

    public static void removerFuturoJogo(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Digite o ID do jogo para remover: ");
        int id = Integer.parseInt(sc.nextLine());

        String sql = "DELETE FROM futuros_jogos WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        int linhas = ps.executeUpdate();
        ps.close();

        if (linhas > 0) {
            System.out.println("Jogo removido com sucesso!");
        } else {
            System.out.println("ID não encontrado.");
        }
    }

    // =========================
    // CADASTRO DE FUTUROS TREINOS
    // =========================
    public static void cadastrarFuturoTreino(Connection conn, Scanner sc) throws SQLException {
        String sql = "INSERT INTO futuros_treinos (data_treino, horario, local_treino, categoria, responsavel_treino, observacoes) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        System.out.print("Data do treino (AAAA-MM-DD): ");
        ps.setDate(1, Date.valueOf(sc.nextLine()));

        System.out.print("Horário (HH:MM): ");
        String horario = sc.nextLine();
        if (horario.isBlank()) {
            ps.setNull(2, Types.TIME);
        } else {
            ps.setTime(2, Time.valueOf(horario + ":00"));
        }

        System.out.print("Local do treino: ");
        ps.setString(3, sc.nextLine());

        System.out.print("Categoria: ");
        ps.setString(4, sc.nextLine());

        System.out.print("Responsável pelo treino: ");
        ps.setString(5, sc.nextLine());

        System.out.print("Observações: ");
        ps.setString(6, sc.nextLine());

        ps.executeUpdate();
        ps.close();

        System.out.println("Futuro treino cadastrado com sucesso!");
    }

    public static void consultarFuturosTreinos(Connection conn) throws SQLException {
        String sql = "SELECT * FROM futuros_treinos ORDER BY data_treino, horario";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("\n===== FUTUROS TREINOS =====");
        while (rs.next()) {
            System.out.printf("ID: %d | Data: %s | Horário: %s | Local: %s | Categoria: %s | Responsável: %s | Obs: %s%n",
                    rs.getInt("id"),
                    rs.getDate("data_treino"),
                    rs.getTime("horario"),
                    rs.getString("local_treino"),
                    rs.getString("categoria"),
                    rs.getString("responsavel_treino"),
                    rs.getString("observacoes"));
        }

        rs.close();
        stmt.close();
    }

    public static void removerFuturoTreino(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Digite o ID do treino para remover: ");
        int id = Integer.parseInt(sc.nextLine());

        String sql = "DELETE FROM futuros_treinos WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        int linhas = ps.executeUpdate();
        ps.close();

        if (linhas > 0) {
            System.out.println("Treino removido com sucesso!");
        } else {
            System.out.println("ID não encontrado.");
        }
    }

    // =========================
    // MENU PRINCIPAL
    // =========================
    public static void mostrarMenu() {
        System.out.println("\n========== PROJETO VIDATIVA ==========");
        System.out.println("1 - Cadastrar jogador");
        System.out.println("2 - Consultar jogadores");
        System.out.println("3 - Remover jogador");
        System.out.println("4 - Cadastrar patrocinador");
        System.out.println("5 - Consultar patrocinadores");
        System.out.println("6 - Remover patrocinador");
        System.out.println("7 - Cadastrar futuro jogo");
        System.out.println("8 - Consultar futuros jogos");
        System.out.println("9 - Remover futuro jogo");
        System.out.println("10 - Cadastrar futuro treino");
        System.out.println("11 - Consultar futuros treinos");
        System.out.println("12 - Remover futuro treino");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/VidAtiva";
        String usuario = "postgres";
        String senha = "fatec123*";

        Scanner sc = new Scanner(System.in);

        try {
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão com o banco realizada com sucesso!");

            criarTabelas(conn);

            int opcao;

            do {
                mostrarMenu();
                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {
                    case 1:
                        cadastrarJogador(conn, sc);
                        break;
                    case 2:
                        consultarJogadores(conn);
                        break;
                    case 3:
                        removerJogador(conn, sc);
                        break;
                    case 4:
                        cadastrarPatrocinador(conn, sc);
                        break;
                    case 5:
                        consultarPatrocinadores(conn);
                        break;
                    case 6:
                        removerPatrocinador(conn, sc);
                        break;
                    case 7:
                        cadastrarFuturoJogo(conn, sc);
                        break;
                    case 8:
                        consultarFuturosJogos(conn);
                        break;
                    case 9:
                        removerFuturoJogo(conn, sc);
                        break;
                    case 10:
                        cadastrarFuturoTreino(conn, sc);
                        break;
                    case 11:
                        consultarFuturosTreinos(conn);
                        break;
                    case 12:
                        removerFuturoTreino(conn, sc);
                        break;
                    case 0:
                        System.out.println("Sistema encerrado.");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }

            } while (opcao != 0);

            conn.close();
            sc.close();

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ou executar operação no banco: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}
