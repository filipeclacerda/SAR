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
public class Produto {
   private int idProduto;
   private String nomeProduto;
   private String unidade;
   private int estoqueMax;
   private int estoqueMin;
    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the unidade
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * @param unidade the unidade to set
     */
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    /**
     * @return the estoqueMax
     */
    public int getEstoqueMax() {
        return estoqueMax;
    }

    /**
     * @param estoqueMax the estoqueMax to set
     */
    public void setEstoqueMax(int estoqueMax) {
        this.estoqueMax = estoqueMax;
    }

    /**
     * @return the estoqueMin
     */
    public int getEstoqueMin() {
        return estoqueMin;
    }

    /**
     * @param estoqueMin the estoqueMin to set
     */
    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }


}
