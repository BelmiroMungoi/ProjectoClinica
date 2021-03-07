
package modelDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.BeansConsulta;
import modelConexao.ConexaoDb;

/**
 *
 * @author Belmiro-Mungoi
 */
public class DaoConsulta {
    BeansConsulta consulta = new BeansConsulta();
    ConexaoDb connect = new ConexaoDb();
    ConexaoDb conPac = new ConexaoDb();
    int codPac;
    
    public void salvar(BeansConsulta consulta) {
        buscaPaciente(consulta.getNomePac());
        connect.conexao();
        try {
            PreparedStatement pst = connect.con.prepareStatement("insert into consulta(codagen_consulta, consulta_diag, consulta_obs) values(?, ?, ?)");
            pst.setInt(1, codPac);
            pst.setString(2, consulta.getDiaConsulta());
            pst.setString(3, consulta.getReceConsulta());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Consulta Finalizada! ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao finalizar\n"+e);
        }
        connect.desconectar();
    }
    
     public void buscaPaciente(String nomePac) {
        conPac.conexao();
        conPac.executaSql("select *from paciente where nome_paciente = '"+nomePac+"'");
        try {
            conPac.rs.first();
            codPac = conPac.rs.getInt("id_paciente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Paciente nao encontrado!\n"+ex);
        }
        conPac.desconectar();
    }
}
