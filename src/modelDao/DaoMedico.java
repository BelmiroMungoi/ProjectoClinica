
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
}
