/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import model.Despesa;


public class DespesaDAO extends DAO {
    private static DespesaDAO instance = new DespesaDAO();
    public static DespesaDAO getInstance() {
        return instance;
    }
    private DespesaDAO() {};

    public List<Despesa> obterDespesas()
            throws ClassNotFoundException, SQLException {
        Connection conexao = null;
        Statement st = null;
        List<Despesa> despesas = new ArrayList<Despesa>();
        Despesa despesa = null;
        try{
            conexao = BD.getInstance().getConexao();
            st = conexao.createStatement();
            ResultSet rs= st.executeQuery("select * from despesa");
            while (rs.next()) {
                despesa = instanciarDespesa(rs);
                despesas.add(despesa);
            }
                
        }finally {
            closeResources(conexao,st);
        }
        return despesas;
    }
    public Despesa obterDespesa(int codDespesa) throws ClassNotFoundException, SQLException{
     Connection conexao = null;
     Statement comando = null;
     Despesa despesa = null;
     try{
         conexao = BD.getInstance().getConexao();
         comando = conexao.createStatement();
         ResultSet rs= comando.executeQuery("select * from despesa where idDespesa = "+ codDespesa);
         rs.first();
         despesa = instanciarDespesa(rs);
         
     }
     finally{
         closeResources(conexao, comando);
         
     }
     return despesa;
        
    }

    private Despesa instanciarDespesa(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}