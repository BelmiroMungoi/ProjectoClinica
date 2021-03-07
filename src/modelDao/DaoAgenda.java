
package modelDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.BeansAgenda;
import modelConexao.ConexaoDb;

/**
 *
 * @author Belmiro-Mungoi
 */
public class DaoAgenda {
    BeansAgenda agenda = new BeansAgenda();
    ConexaoDb connect = new ConexaoDb();
    ConexaoDb conPac = new ConexaoDb();
    ConexaoDb conMed = new ConexaoDb();
    int codPac, codMed;
    
    public void salvar(BeansAgenda agenda) {
        buscaMedico(agenda.getNomeMed());
        buscaPaciente(agenda.getNomePac());
        connect.conexao();
        try {
            PreparedStatement pst = connect.con.prepareStatement("insert into agendar(cod_agenpac, agen_turno, cod_agenmed, agen_data, agen_motivo, agen_status) values(?, ?, ?, ?, ?, ?)");
            pst.setInt(1, codPac);
            pst.setString(2, agenda.getTurno());
            pst.setInt(3, codMed);
            pst.setDate(4, new java.sql.Date(agenda.getData().getTime()));
            pst.setString(5, agenda.getMotivo());
            pst.setString(6, agenda.getStatus());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Agendamento feito com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao finalizar\n"+e);
        }
        connect.desconectar();
    }
    
    public void buscaMedico(String nomeMed) {
        conMed.conexao();
        conMed.executaSql("select *from medicos where nome_medico = '"+nomeMed+"'");
        try {
            conMed.rs.first();
            codMed = conMed.rs.getInt("idmedico");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Medico nao encontrado!\n"+ex);
        }
        conMed.desconectar();
    }
    
    public int buscaCodMedico(String nomeMed) {
        conMed.conexao();
        conMed.executaSql("select *from medicos where nome_medico = '"+nomeMed+"'");
        try {
            conMed.rs.first();
            codMed = conMed.rs.getInt("idmedico");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Medico nao encontrado!\n"+ex);
        }
        conMed.desconectar();
    return codMed;    
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
    
    public void alterar(BeansAgenda agenda){
        connect.conexao();
         try {
            PreparedStatement pst = connect.con.prepareStatement("update agendar set agen_status = ? where cod_agenda = ?");
            pst.setString(1, agenda.getStatus());
            pst.setInt(2, agenda.getAgendaCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Paciente em Atendimento.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atender!\nErro: "+ e.getMessage());
        }
    }
    
    public BeansAgenda buscaAgendaCod(int cod) {
        BeansAgenda agen = new BeansAgenda();
        connect.conexao();
        connect.executaSql("select *from agendar inner join paciente on cod_agenpac = id_paciente inner join medicos on cod_agenmed = idmedico where cod_agenda = '"+cod+"'");
        try {
            connect.rs.first();
            agen.setNomePac(connect.rs.getString("nome_paciente"));
            agen.setNomeMed(connect.rs.getString("nome_medico"));
            agen.setMotivo(connect.rs.getString("agen_motivo"));
            agen.setPacNasc(connect.rs.getString("nasc_paciente"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar agendamento\n"+ex);
        }
        conMed.desconectar();
    return agen;
    }
}
