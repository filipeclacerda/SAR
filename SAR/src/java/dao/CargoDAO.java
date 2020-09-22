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

    public List<Cargo> obterCargo()
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

    private Cargo instanciarCargo(ResultSet rs) throws SQLException{
        Cargo cargo = new Cargo(rs.getInt("idCargo"),
        rs.getString("nomeCargo"));
        //curso.setMatriculaProfessorCoordenador(rs.getInt("professorCoordenador"));
        return cargo;
    }

   
}
