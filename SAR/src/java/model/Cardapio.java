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
public class Cardapio {

   
    private int idCardapio;
    private String nomeCardapio;
    private int preco;
    

    /**
     * @return the idCardapio
     */
    public int getIdCardapio() {
        return idCardapio;
    }

    /**
     * @param idCardapio the idCardapio to set
     */
    public void setIdCardapio(int idCardapio) {
        this.idCardapio = idCardapio;
    }

    /**
     * @return the NomeCardapio
     */
    public String getNomeCardapio() {
        return nomeCardapio;
    }

    /**
     * @param NomeCardapio the NomeCardapio to set
     */
    public void setNomeCardapio(String NomeCardapio) {
        this.nomeCardapio = NomeCardapio;
    }

    /**
     * @return the Preco
     */
    public int getPreco() {
        return preco;
    }

    /**
     * @param Preco the Preco to set
     */
    public void setPreco(int Preco) {
        this.preco = Preco;
    }

 
    
    
}
