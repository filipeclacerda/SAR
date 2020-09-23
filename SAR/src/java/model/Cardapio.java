/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.CardapioDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Filipe Lacerda
 */
public class Cardapio {

    public static Cardapio obterCardapio(int codCardapio) throws ClassNotFoundException, SQLException{
        return CardapioDAO.getInstance().obterCardapio(codCardapio);
    }
    public static List<Cardapio> obterCardapios() throws ClassNotFoundException, SQLException {
        return CardapioDAO.getInstance().obterCardapios();
    }


    private int idCardapio;
    private String nomeCardapio;
    private float preco;

    public Cardapio(){
        super();
    }
    public Cardapio(int idCardapio, String nomeCardapio, float preco) {
        this.idCardapio = idCardapio;
        this.nomeCardapio = nomeCardapio;
        this.preco = preco;
    }


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
    public float getPreco() {
        return preco;
    }

    /**
     * @param Preco the Preco to set
     */
    public void setPreco(float Preco) {
        this.preco = Preco;
    }

}
