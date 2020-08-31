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
public class Venda {
 
    private int idVenda;
    private int dataVenda;
    private ItemCardapio itemcardapio;
    private Funcionario funcionario;
    private Cardapio cardapio;
 /**
     * @return the idVenda
     */
    public int getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    /**
     * @return the dataVenda
     */
    public int getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(int dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the itemcardapio
     */
    public ItemCardapio getItemcardapio() {
        return itemcardapio;
    }

    /**
     * @param itemcardapio the itemcardapio to set
     */
    public void setItemcardapio(ItemCardapio itemcardapio) {
        this.itemcardapio = itemcardapio;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the cardapio
     */
    public Cardapio getCardapio() {
        return cardapio;
    }

    /**
     * @param cardapio the cardapio to set
     */
    public void setCardapio(Cardapio cardapio) {
        this.cardapio = cardapio;
    }
   
    
    
}
