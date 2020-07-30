
package modelDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.BeansUsuario;
import modelConexao.ConexaoDb;

/**
 *
 * @author Belmiro-Mungoi
 */
public class DaoUsuario {
    ConexaoDb connect = new ConexaoDb();
    BeansUsuario modelo = new BeansUsuario();
    

    public void Salvar(BeansUsuario modelo){
        connect.conexao();
        try {
            PreparedStatement pst = connect.con.prepareStatement("insert into usuario(nome_usuario, login, senha, perfil) values(?, ?, ?, ?);");
            pst.setString(1, modelo.getUsuNome());
            pst.setString(2, modelo.getUsuLogin());
            pst.setString(3, modelo.getUsuSenha());
            pst.setString(4, modelo.getUsuPerfil());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario Inserido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Os Dados nao foram inseridos!\nErro: " + ex);
        }
        connect.desconectar();
    }
    
    public void editar(BeansUsuario modelo) {
        connect.conexao();
        try {
            PreparedStatement pst = connect.con.prepareStatement("update usuario set nome_usuario = ?,login = ?,senha = ?, perfil = ? where id_usuario = ?");
            pst.setString(1, modelo.getUsuNome());
            pst.setString(2, modelo.getUsuLogin());
            pst.setString(3, modelo.getUsuSenha());
            pst.setString(4, modelo.getUsuPerfil());
            pst.setInt(5, modelo.getUsuCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados editados com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Os nao foram alterados!\nErro: "+ e.getMessage());
        }
        connect.desconectar();
    }
    
    public void excluir(BeansUsuario modelo) {
        connect.conexao();
        try {
            PreparedStatement pst = connect.con.prepareStatement("delete from usuario where id_usuario = ?");
            pst.setInt(1, modelo.getUsuCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Os dados nao foram exluidos!\nErro: "+ e.getMessage());
        }
        connect.desconectar();
    }
    
    public BeansUsuario pesquisarUsu(BeansUsuario modelo) {
        connect.conexao();
        connect.executaSql("select * from usuario where nome_usuario like '%"+modelo.getPesquisa()+"%'");
        try {
            connect.rs.first();
            modelo.setUsuCod(connect.rs.getInt("id_usuario"));
            modelo.setUsuNome(connect.rs.getString("nome_usuario"));
            modelo.setUsuLogin(connect.rs.getString("login"));
            modelo.setUsuSenha(connect.rs.getString("senha"));
            modelo.setUsuPerfil(connect.rs.getString("perfil"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuario nao cadastrado!");
        }
        connect.desconectar();
        return modelo;
    } 
}
