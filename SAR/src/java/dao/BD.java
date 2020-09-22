/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BD {

    private static BD instance = new BD();

    public static BD getInstance() {
        return instance;
    }

    private BD() {
    }

    public Connection getConexao()
            throws ClassNotFoundException, SQLException {
        Connection conexao = null;
        Class.forName("com.mysql.jdbc.Driver");
        conexao = DriverManager.getConnection("jdbc:mysql://localhost/SAR", "root", "");
        return conexao;
    }
}
