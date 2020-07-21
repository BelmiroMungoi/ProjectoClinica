
package view;

import java.awt.Color;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import modelConexao.ConexaoDb;

/**
 *
 * @author Belmiro-Mungoi
 */
public class TelaLogin extends javax.swing.JFrame {
    ConexaoDb connect = new ConexaoDb();
    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        connect.conexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLogin = new javax.swing.JButton();
        jButtonLoginSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jButtonLogin.setBackground(new java.awt.Color(153, 153, 153));
        jButtonLogin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogin.setText("Acessar");
        jButtonLogin.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseExited(evt);
            }
        });
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin);
        jButtonLogin.setBounds(250, 170, 120, 40);

        jButtonLoginSair.setBackground(new java.awt.Color(153, 153, 153));
        jButtonLoginSair.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonLoginSair.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLoginSair.setText("Sair");
        jButtonLoginSair.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonLoginSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLoginSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonLoginSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonLoginSairMouseExited(evt);
            }
        });
        jButtonLoginSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLoginSair);
        jButtonLoginSair.setBounds(370, 170, 120, 40);

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Usuário:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 90, 70, 21);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 120, 60, 21);

        jTextFieldUsuario.setBackground(new java.awt.Color(222, 217, 217));
        jTextFieldUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(250, 80, 240, 30);

        jPasswordFieldSenha.setBackground(new java.awt.Color(222, 217, 217));
        jPasswordFieldSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(250, 110, 240, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo00.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 200, 200, 60);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoLogin02.png"))); // NOI18N
        jLabelFundoLogin.setText("Senha");
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 510, 260);

        setSize(new java.awt.Dimension(509, 259));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        try {
            connect.executaSql("select * from usuario where login ='"+jTextFieldUsuario.getText()+"'");
            connect.rs.first();
            if (connect.rs.getString("senha").equals(jPasswordFieldSenha.getText())) {
                TelaPrincipal tela = new TelaPrincipal(jTextFieldUsuario.getText());
                tela.setVisible(true);
                dispose();
            } else
                JOptionPane.showMessageDialog(null, "Senha ou Usuario Invalidos");
                jTextFieldUsuario.setText("");
                jPasswordFieldSenha.setText("");
                jTextFieldUsuario.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Senha ou Usuario Invalidos!\nErro: ");
            jTextFieldUsuario.setText("");
            jPasswordFieldSenha.setText("");
            jTextFieldUsuario.requestFocus();
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonLoginSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonLoginSairActionPerformed

    private void jButtonLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseEntered
        jButtonLogin.setBackground(new Color(235, 235, 235));
        jButtonLogin.setForeground(new Color(52, 0, 0));
    }//GEN-LAST:event_jButtonLoginMouseEntered

    private void jButtonLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseExited
        jButtonLogin.setBackground(new Color(153, 153, 153));
        jButtonLogin.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonLoginMouseExited

    private void jButtonLoginSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginSairMouseEntered
        jButtonLoginSair.setBackground(new Color(235, 235, 235));
        jButtonLoginSair.setForeground(new Color(52, 0, 0));
    }//GEN-LAST:event_jButtonLoginSairMouseEntered

    private void jButtonLoginSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginSairMouseExited
        jButtonLoginSair.setBackground(new Color(153, 153, 153));
        jButtonLoginSair.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonLoginSairMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonLoginSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
