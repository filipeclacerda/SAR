
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Cardapio;

public class CardapioDAO extends DAO {

    private static CardapioDAO instance = new CardapioDAO();

    public static CardapioDAO getInstance() {
        return instance;
    }

    private CardapioDAO() {
    }

    public List<Cardapio> obterCardapios()
            throws ClassNotFoundException, SQLException {
        Connection conexao = null;
        Statement st = null;
        List<Cardapio> cardapios = new ArrayList<Cardapio>();
        Cardapio cardapio = null;
        try {
            conexao = BD.getInstance().getConexao();
            st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from cardapio");
            while (rs.next()) {
                cardapio = instanciarCardapio(rs);
                cardapios.add(cardapio);
            }

        } finally {
            closeResources(conexao, st);
        }
        return cardapios;
    }
    public Cardapio obterCardapio(int codCardapio) throws ClassNotFoundException, SQLException{
     Connection conexao = null;
     Statement comando = null;
     Cardapio cardapio = null;
     try{
         conexao = BD.getInstance().getConexao();
         comando = conexao.createStatement();
         ResultSet rs= comando.executeQuery("select * from cardapio where idCardapio = "+ codCardapio);
         rs.first();
         cardapio = instanciarCardapio(rs);
         
     }
     finally{
         closeResources(conexao, comando);
         
     }
     return cardapio;
        
    }

    private Cardapio instanciarCardapio(ResultSet rs) throws SQLException{
        Cardapio cardapio = new Cardapio(rs.getInt("idCardapio"),
        rs.getString("NomeCardapio"),
        rs.getFloat("Preco"));
        //curso.setMatriculaProfessorCoordenador(rs.getInt("professorCoordenador"));
        return cardapio;
    }

}
