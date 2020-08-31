/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Filipe Lacerda
 */
public class TipoDespesa {
    private int idTipoDespesa;
    private String nomeDespesa;
    /**
     * @return the idTipoDespesa
     */
    public int getIdTipoDespesa() {
        return idTipoDespesa;
    }

    /**
     * @param idTipoDespesa the idTipoDespesa to set
     */
    public void setIdTipoDespesa(int idTipoDespesa) {
        this.idTipoDespesa = idTipoDespesa;
    }

    /**
     * @return the NomeDespesa
     */
    public String getNomeDespesa() {
        return nomeDespesa;
    }

    /**
     * @param NomeDespesa the NomeDespesa to set
     */
    public void setNomeDespesa(String NomeDespesa) {
        this.nomeDespesa = nomeDespesa;
    }
    
}
