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
import model.Cargo;


public class CargoDAO extends DAO {
    private static CargoDAO instance = new CargoDAO();
    public static CargoDAO getInstance() {
        return instance;
    }
    private CargoDAO() {};

    public List<Cargo> obterCargos()
            throws ClassNotFoundException, SQLException {
        Connection conexao = null;
        Statement st = null;
        List<Cargo> cargos = new ArrayList<Cargo>();
        Cargo cargo = null;
        try{
            conexao = BD.getInstance().getConexao();
            st = conexao.createStatement();
            ResultSet rs= st.executeQuery("select * from cargo");
            while (rs.next()) {
                cargo = instanciarCargo(rs);
                cargos.add(cargo);
            }
                
        }finally {
            closeResources(conexao,st);
        }
        return cargos;
    }
    public Cargo obterCargo(int codCargo) throws ClassNotFoundException, SQLException{
     Connection conexao = null;
     Statement comando = null;
     Cargo cargo = null;
     try{
         conexao = BD.getInstance().getConexao();
         comando = conexao.createStatement();
         ResultSet rs= comando.executeQuery("select * from cargo where idCargo = "+ codCargo);
         rs.first();
         cargo = instanciarCargo(rs);
         
     }
     finally{
         closeResources(conexao, comando);
         
     }
     return cargo;
        
    }
    

    private Cargo instanciarCargo(ResultSet rs) throws SQLException{
        Cargo cargo = new Cargo(rs.getInt("idCargo"),
        rs.getString("nomeCargo"));
        //curso.setMatriculaProfessorCoordenador(rs.getInt("professorCoordenador"));
        return cargo;
    }

   public void gravar(Cargo cargo) throws SQLException, ClassNotFoundException {
       Connection conexao = null;
       PreparedStatement comando = null;
   try {
    conexao = BD.getInstance().getConexao();
    comando = conexao.prepareStatement("insert into cargo(idCargo, NomeCargo) values(?,?)");
    comando.setInt(1, cargo.getIdCargo());
    comando.setString(2, cargo.getNomeCargo());
    // if (curso.getCoordenador() == null ) {
    // comando.setNull(3, Types.INTEGER);
    // } else {
    // comando.setInt(3, curso.getCoordenador().getMatricula());
    // }
    comando.executeUpdate();
}finally{
       closeResources(conexao, comando);
   }
}
}
