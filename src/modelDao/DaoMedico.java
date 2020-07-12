
package modelDao;

import modelConexao.ConexaoDb;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.ModeloMedico;

/**
 *
 * @author Belmiro-Mungoi
 */
public class DaoMedico {
    ConexaoDb connect = new ConexaoDb();
    ModeloMedico modelo = new ModeloMedico();
    
    public void Salvar(ModeloMedico modelo){
        connect.conexao();
        try {
            PreparedStatement pst = connect.con.prepareStatement("insert into medicos(nome_medico, espec_medico, crm_medico, bi_medico) values(?, ?, ?, ?);");
            pst.setString(1, modelo.getNome());
            pst.setString(2, modelo.getEspec());
            pst.setInt(3, modelo.getCrm());
            pst.setString(4, modelo.getBi());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Os Dados nao foram inseridos!\nErro: " + ex);
        }
    }
    
     public void editar(ModeloMedico modelo){
        connect.conexao();
        try {
            PreparedStatement pst = connect.con.prepareStatement("update medicos set nome_medico = ?, espec_medico = ?, crm_medico = ?, bi_medico = ? where idmedico = ?");
            pst.setString(1, modelo.getNome());
            pst.setString(2, modelo.getEspec());
            pst.setInt(3, modelo.getCrm());
            pst.setString(4, modelo.getBi());
            pst.setInt(5, modelo.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados editados com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar:\n" + e.getMessage());
        }
        connect.desconectar();
    }   
     
    public void excluir(ModeloMedico modelo) {
        connect.conexao();
        try {
            PreparedStatement pst = connect.con.prepareStatement("delete from medicos where idmedico = ?");
            pst.setInt(1, modelo.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir dados:\n" + e.getMessage());
        }
        
        connect.desconectar();
    }
 
    public ModeloMedico pesquisaMed(ModeloMedico mod){
        connect.conexao();
        connect.executaSql("select * from medicos where nome_medico like '%"+mod.getPesquisa()+"%'");
        try {
            connect.rs.first();
            mod.setCod(connect.rs.getInt("idmedico"));
            mod.setNome(connect.rs.getString("nome_medico"));
            mod.setEspec(connect.rs.getString("espec_medico"));
            mod.setBi(connect.rs.getString("bi_medico"));
            mod.setCrm(connect.rs.getInt("crm_medico"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Medico nao cadastrado");
        }
        
        connect.desconectar();
        return mod;
    }
    


}
