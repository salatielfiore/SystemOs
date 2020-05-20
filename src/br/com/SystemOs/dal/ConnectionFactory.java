
package br.com.SystemOs.dal;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    //metodo responsavel por estabelecer a conexão com o banco
    public Connection getConexao() {
        Connection connection = null;

        // Armazenando informações referente ao banco de dados
        String url = "jdbc:mysql://localhost:3306/dbsystemos";
        String user = "root";
        String pwd = "";

        // Estabelecendo a conexão com o banco
        try {
            return DriverManager.getConnection(url, user, pwd);
        } catch (Exception e) {
           return null;
        }
 
    }
}
