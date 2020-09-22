/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
      
    public void closeResources(Connection conexao, Statement st) {
        try {
            if (st != null) {
                st.close();
            }
            if (conexao != null) {
                conexao.close();
            }
        } catch (SQLException e) {
        }
    }

}
