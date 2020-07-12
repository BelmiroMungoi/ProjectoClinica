/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    }
}
