
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

    public List<Cardapio> obterCardapio()
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

    private Cardapio instanciarCardapio(ResultSet rs) throws SQLException{
        Cardapio cardapio = new Cardapio(rs.getInt("idCardapio"),
        rs.getString("NomeCardapio"),
        rs.getFloat("Preco"));
        //curso.setMatriculaProfessorCoordenador(rs.getInt("professorCoordenador"));
        return cardapio;
    }

}
