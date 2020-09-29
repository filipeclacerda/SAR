/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.CargoDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Filipe Lacerda
 */
public class Cargo {
    
        public static Cargo obterCargo(int codCargo) throws ClassNotFoundException, SQLException{
        return CargoDAO.getInstance().obterCargo(codCargo);
    }
     public static List<Cargo> obterCargos() throws ClassNotFoundException, SQLException {
        return CargoDAO.getInstance().obterCargos();
    }

   private int idCargo;
   private String nomeCargo;

   public Cargo(){
        super();
    }
    public Cargo(int idCargo, String nomeCargo) {
        this.idCargo = idCargo;
        this.nomeCargo = nomeCargo;
    }
    /**
     * @return the idCargo
     */
    public int getIdCargo() {
        return idCargo;
    }

    /**
     * @param idCargo the idCargo to set
     */
    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }
      /**
     * @return the nomeCargo
     */
    public String getNomeCargo() {
        return nomeCargo;
    }

    /**
     * @param nomeCargo the nomeCargo to set
     */
    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }
    
    public void gravar() throws SQLException, ClassNotFoundException {
    CargoDAO.getInstance().gravar(this);
}
}
