
package modelDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.BeansEnfermeiro;
import modelConexao.ConexaoDb;

/**
 *
 * @author Belmiro-Mungoi
 */
public class DaoEnfermeiro {
    ConexaoDb connect = new ConexaoDb();
    BeansEnfermeiro model = new BeansEnfermeiro();
    
    public void Salvar(BeansEnfermeiro model){
        connect.conexao();
        try {
            PreparedStatement pst = connect.con.prepareStatement("insert into enfermeiro(nome_enfer, area_enfer, bi_enfer, cell_enfer) values(?, ?, ?, ?);");
            pst.setString(1, model.getNomeEnfer());
            pst.setString(2, model.getAreaEnfer());
            pst.setString(3, model.getBiEnfer());
            pst.setString(4, model.getCellEnfer());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Os Dados nao foram inseridos!\nErro: " + ex);
        }
        connect.desconectar();
    }
    
    public void editar(BeansEnfermeiro model) {
        connect.conexao();
        try {
            PreparedStatement pst = connect.con.prepareStatement("update enfermeiro set nome_enfer = ?, area_enfer = ?, bi_enfer = ?, cell_enfer = ? where id_enfer = ?");
            pst.setString(1, model.getNomeEnfer());
            pst.setString(2, model.getAreaEnfer());
            pst.setString(3, model.getBiEnfer());
            pst.setString(4, model.getCellEnfer());
            pst.setInt(5, model.getCod_enfer());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados editados com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel editar!\nErro: " +e);
        }
        connect.desconectar();
    }
    
    public void excluir(BeansEnfermeiro model) {
        connect.conexao();
        try {
            PreparedStatement pst = connect.con.prepareStatement("delete from enfermeiro where id_enfer = ?");
            pst.setInt(1, model.getCod_enfer());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Nao foi possivel excluir!\nErro: "+ e);
        }
        connect.desconectar();
    }
    
    public BeansEnfermeiro pesquisar(BeansEnfermeiro model) {
        connect.conexao();
        try {
            connect.executaSql("select * from enfermeiro where nome_enfer like '%"+model.getPesquisa()+"%'");
            connect.rs.first();
            model.setCod_enfer(connect.rs.getInt("id_enfer"));
            model.setNomeEnfer(connect.rs.getString("nome_enfer"));
            model.setAreaEnfer(connect.rs.getString("area_enfer"));
            model.setBiEnfer(connect.rs.getString("bi_enfer"));
            model.setCellEnfer(connect.rs.getString("cell_enfer"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enfermeiro nao cadastrado"+e);
        }
        connect.desconectar();
        return model;
    }
    
}
