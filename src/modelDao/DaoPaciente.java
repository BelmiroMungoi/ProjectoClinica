package modelDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelBeans.BeansPaciente;
import modelConexao.ConexaoDb;

/**
 *
 * @author Belmiro-Mungoi
 */
public class DaoPaciente {
    ConexaoDb connect = new ConexaoDb();
    ConexaoDb conBairro = new ConexaoDb();
    BeansPaciente model = new BeansPaciente();
    String nomeBairro;
    int cod_bairro;

    public void Salvar(BeansPaciente model){
        pesqBairro(model.getBairro_pac());
        connect.conexao();
        try {
            PreparedStatement pst = connect.con.prepareStatement("insert into paciente(nome_paciente, nasc_paciente, bi_paciente, cell_paciente, rua_paciente, quar_paciente, casa_paciente, pac_bairro) values(?, ?, ?, ?, ?, ?, ?, ?);");
            pst.setString(1, model.getNome_pac());
            pst.setString(2, model.getNasc_pac());
            pst.setString(3, model.getBi_pac());
            pst.setString(4, model.getCell_pac());
            pst.setString(5, model.getRua_pac());
            pst.setString(6, model.getQuar_pac());
            pst.setString(7, model.getCasa_pac());
            pst.setInt(8, cod_bairro);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Paciente Inserido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Os Dados nao foram inseridos!\nErro: " + ex);
        }
        connect.desconectar();
    }

    
    public void editar(BeansPaciente model) {
        pesqBairro(model.getBairro_pac());
        connect.conexao();
        try {
            PreparedStatement pst = connect.con.prepareStatement("update paciente set nome_paciente = ?, nasc_paciente = ?, bi_paciente = ?, cell_paciente = ?, rua_paciente = ?, quar_paciente = ?, casa_paciente = ?, pac_bairro = ? where id_paciente = ?");
            pst.setString(1, model.getNome_pac());
            pst.setString(2, model.getNasc_pac());
            pst.setString(3, model.getBi_pac());
            pst.setString(4, model.getCell_pac());
            pst.setString(5, model.getRua_pac());
            pst.setString(6, model.getQuar_pac());
            pst.setString(7, model.getCasa_pac());
            pst.setInt(8, cod_bairro);
            pst.setInt(9, model.getCod_pac());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados editados com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Os dados nao foram alterados!\nErro: "+ e.getMessage());
        }
        connect.desconectar();
    }
    
    public void excluir(BeansPaciente model) {
        connect.conexao();
        try {
            PreparedStatement pst = connect.con.prepareStatement("delete from paciente where id_paciente = ?");
            pst.setInt(1, model.getCod_pac());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Os dados nao foram exluidos!\nErro: "+ e.getMessage());
        }
        connect.desconectar();
    }
    
    public BeansPaciente pesquisarPac(BeansPaciente model) {
        //pesqBairro(model.getBairro_pac());
        connect.conexao();
        connect.executaSql("select * from paciente where nome_paciente like '%"+model.getPesquisa()+"%'");
        try {
            connect.rs.first();
            nomeBairro(connect.rs.getInt("pac_bairro"));
            model.setCod_pac(connect.rs.getInt("id_paciente"));
            model.setNome_pac(connect.rs.getString("nome_paciente"));
            model.setNasc_pac(connect.rs.getString("nasc_paciente"));
            model.setBi_pac(connect.rs.getString("bi_paciente"));
            model.setCell_pac(connect.rs.getString("cell_paciente"));
            model.setRua_pac(connect.rs.getString("rua_paciente"));
            model.setQuar_pac(connect.rs.getString("quar_paciente"));
            model.setCasa_pac(connect.rs.getString("casa_paciente"));
            model.setBairro_pac(nomeBairro);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Paciente nao cadastrado!"+e);
        }
        connect.desconectar();
        return model;
    }
            
    public void pesqBairro(String nome) {
        connect.conexao();
        connect.executaSql("select * from bairro where nome_bairro = '"+nome+"'");
        try {
            connect.rs.first();
            cod_bairro = connect.rs.getInt("cod_bairro");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar bairro!"+ ex);
        }
         connect.desconectar();
    }
    
    public void nomeBairro(int cod){
        conBairro.conexao();
        conBairro.executaSql("select * from bairro where cod_bairro =" +cod);
        try {
            conBairro.rs.first();
            nomeBairro = conBairro.rs.getString("nome_bairro");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar nome do bairro!"+ ex);
        }
        conBairro.desconectar();
    }
}
