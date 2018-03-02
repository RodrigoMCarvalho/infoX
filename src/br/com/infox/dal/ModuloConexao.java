package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {

    //método por responsável por estabelecer a conexão com o BD
    public static Connection conector() {
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }

}
