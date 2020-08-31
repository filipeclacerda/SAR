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
public class Despesa {

    

    
    private int idDespesa;
    private float valorDespesa;
    private float valorPago;
    private String dataVencimento;
    private String dataPagamento;
    private Funcionario funcionario;
    private TipoDespesa tipoDespesa;
  
    /**
     * @return the idDespesa
     */
    public int getIdDespesa() {
        return idDespesa;
    }

    /**
     * @param idDespesa the idDespesa to set
     */
    public void setIdDespesa(int idDespesa) {
        this.idDespesa = idDespesa;
    }

    /**
     * @return the valorDespesa
     */
    public float getValorDespesa() {
        return valorDespesa;
    }

    /**
     * @param valorDespesa the valorDespesa to set
     */
    public void setValorDespesa(float valorDespesa) {
        this.valorDespesa = valorDespesa;
    }

    /**
     * @return the valorPago
     */
    public float getValorPago() {
        return valorPago;
    }

    /**
     * @param valorPago the valorPago to set
     */
    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    /**
     * @return the dataVencimento
     */
    public String getDataVencimento() {
        return dataVencimento;
    }

    /**
     * @param dataVencimento the dataVencimento to set
     */
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    /**
     * @return the dataPagamento
     */
    public String getDataPagamento() {
        return dataPagamento;
    }

    /**
     * @param dataPagamento the dataPagamento to set
     */
    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
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
     * @return the tipoDespesa
     */
    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    /**
     * @param tipoDespesa the tipoDespesa to set
     */
    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }
   
   
}
