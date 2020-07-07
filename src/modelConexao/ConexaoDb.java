
package modelConexao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Belmiro-Mungoi
 */
public class ConexaoDb {
    public Connection con;
    public Statement stm;
    public ResultSet rs;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/projectoclinica";
    private String user = "root";
    private String password = "";
    
    public void conexao(){
        try {
            System.setProperty("jdbc.Drivers", driver);  
            con = DriverManager.getConnection(url, user, password);
            //JOptionPane.showMessageDialog(null, "Conexao Efectuada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexao com a base de dados nao efectuada!\nErro: " + e.getMessage());
        }
    }
    
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Erro ao executar Sql:\n" + ex.getMessage());
        }
    }

    public void desconectar(){
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Desconexao efectuada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Desconexao nao efectuada!\nErro: "+ e.getMessage());
        }
    }
}
