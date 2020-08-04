package util;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;

public class DatabaseConnection {

    private Connection conexao = null;
    private final String DATABASE = "dbclientes";   //troque pelo nome do seu database
    private final String LOGIN = "root";      //usuário com acesso ao banco de dados (default: root)
    private final String PASSWORD = "";       //senha do usuário (default: '')
    private final String HOST = "127.0.0.1";  //se o mysql estiver rodando localmente, use "localhost" ou "127.0.0.1"

    public Connection getConnection() {

        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setServerName(HOST);
            ds.setDatabaseName(DATABASE);
            ds.setUser(LOGIN);
            ds.setPassword(PASSWORD);

            ds.setConnectTimeout(2000);

            conexao = ds.getConnection();
            System.out.println("CONECTADO AO DATABASE.");
        }
        catch (SQLException sqlerror) {
            System.out.println("FALHA NA CONEXÃO: " + sqlerror.getMessage());
        }

        return conexao;
    }

}