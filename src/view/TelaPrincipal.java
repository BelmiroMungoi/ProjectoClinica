
package view;

import javax.swing.JOptionPane;
import modelConexao.ConexaoDb;

/**
 *
 * @author Belmiro-Mungoi
 */
public class TelaPrincipal extends javax.swing.JFrame {
    ConexaoDb conecta = new ConexaoDb();

    public TelaPrincipal(String user) {
        initComponents();
        jLabelUser.setText(user);
        conecta.conexao();
    }

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jLabelCadPainel = new javax.swing.JLabel();
        jLabelFundoLogo = new javax.swing.JLabel();
        jLabelBbmLogo = new javax.swing.JLabel();
        jButtonCadastroMedico = new javax.swing.JButton();
        jButtonCadastroEnfermeiro = new javax.swing.JButton();
        jButtonCadastroPaciente = new javax.swing.JButton();
        jButtonCadastroAdministrator = new javax.swing.JButton();
        jLabelAgenda = new javax.swing.JLabel();
        jButtonAgenda = new javax.swing.JButton();
        jLabelFundoPainel = new javax.swing.JLabel();
        jPanelPrincipal = new javax.swing.JPanel();
        jLabelSisGes = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jLabelUser = new javax.swing.JLabel();
        jLabelTelaPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCad = new javax.swing.JMenu();
        jMenuItemCadMedico = new javax.swing.JMenuItem();
        jMenuItemCadEnfermeiro = new javax.swing.JMenuItem();
        jMenuItemCadPaciente = new javax.swing.JMenuItem();
        jMenuItemCadAdmin = new javax.swing.JMenuItem();
        jMenuRela = new javax.swing.JMenu();
        jMenuFerra = new javax.swing.JMenu();
        jMenuItemFerraTela = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemOutra = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setForeground(new java.awt.Color(0, 0, 0));
        jInternalFrameBemVindo.setTitle("Bem-Vindo ao Sistema");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jLabelCadPainel.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabelCadPainel.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCadPainel.setText("Cadastros:");
        jInternalFrameBemVindo.getContentPane().add(jLabelCadPainel);
        jLabelCadPainel.setBounds(10, 40, 80, 27);

        jLabelFundoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconClinica2.png"))); // NOI18N
        jInternalFrameBemVindo.getContentPane().add(jLabelFundoLogo);
        jLabelFundoLogo.setBounds(700, 190, 270, 240);

        jLabelBbmLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo00.png"))); // NOI18N
        jInternalFrameBemVindo.getContentPane().add(jLabelBbmLogo);
        jLabelBbmLogo.setBounds(720, 130, 210, 100);

        jButtonCadastroMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadMedico.png"))); // NOI18N
        jButtonCadastroMedico.setToolTipText("Médicos");
        jButtonCadastroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroMedicoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonCadastroMedico);
        jButtonCadastroMedico.setBounds(10, 70, 160, 150);

        jButtonCadastroEnfermeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadEnfermeira.png"))); // NOI18N
        jButtonCadastroEnfermeiro.setToolTipText("Enfermeiros");
        jInternalFrameBemVindo.getContentPane().add(jButtonCadastroEnfermeiro);
        jButtonCadastroEnfermeiro.setBounds(170, 70, 160, 150);

        jButtonCadastroPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadPaciente.png"))); // NOI18N
        jButtonCadastroPaciente.setToolTipText("Pacientes");
        jInternalFrameBemVindo.getContentPane().add(jButtonCadastroPaciente);
        jButtonCadastroPaciente.setBounds(330, 70, 160, 150);

        jButtonCadastroAdministrator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadAdministrator.png"))); // NOI18N
        jButtonCadastroAdministrator.setToolTipText("Administratores");
        jButtonCadastroAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroAdministratorActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonCadastroAdministrator);
        jButtonCadastroAdministrator.setBounds(490, 70, 160, 150);

        jLabelAgenda.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabelAgenda.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAgenda.setText("Agenda:");
        jInternalFrameBemVindo.getContentPane().add(jLabelAgenda);
        jLabelAgenda.setBounds(10, 230, 60, 19);

        jButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page2.png"))); // NOI18N
        jButtonAgenda.setToolTipText("Ver Agenda");
        jInternalFrameBemVindo.getContentPane().add(jButtonAgenda);
        jButtonAgenda.setBounds(10, 260, 160, 150);

        jLabelFundoPainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoBrancoPainel.png"))); // NOI18N
        jInternalFrameBemVindo.getContentPane().add(jLabelFundoPainel);
        jLabelFundoPainel.setBounds(0, 40, 970, 390);

        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPrincipal.setLayout(null);
        jInternalFrameBemVindo.getContentPane().add(jPanelPrincipal);
        jPanelPrincipal.setBounds(6, 437, 51, 0);

        jLabelSisGes.setBackground(new java.awt.Color(222, 217, 217));
        jLabelSisGes.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabelSisGes.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSisGes.setText("Sistema de Gestao de: ");
        jInternalFrameBemVindo.getContentPane().add(jLabelSisGes);
        jLabelSisGes.setBounds(6, 0, 320, 35);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair da Tela Bem-vindo");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonSair);
        jButtonSair.setBounds(900, 0, 50, 40);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(0, 130, 970, 460);

        jLabelUser.setText("Usuario");
        getContentPane().add(jLabelUser);
        jLabelUser.setBounds(0, 100, 100, 30);

        jLabelTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoPrincipal02.png"))); // NOI18N
        getContentPane().add(jLabelTelaPrincipal);
        jLabelTelaPrincipal.setBounds(0, 0, 970, 590);

        jMenuBar1.setBackground(new java.awt.Color(222, 217, 217));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenuCad.setBackground(new java.awt.Color(222, 217, 217));
        jMenuCad.setForeground(new java.awt.Color(0, 0, 0));
        jMenuCad.setText("Cadastro");

        jMenuItemCadMedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCadMedico.setText("Médicos");
        jMenuItemCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMedicoActionPerformed(evt);
            }
        });
        jMenuCad.add(jMenuItemCadMedico);

        jMenuItemCadEnfermeiro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCadEnfermeiro.setText("Enfermeiros");
        jMenuCad.add(jMenuItemCadEnfermeiro);

        jMenuItemCadPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCadPaciente.setText("Pacientes");
        jMenuCad.add(jMenuItemCadPaciente);

        jMenuItemCadAdmin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCadAdmin.setText("Administratores");
        jMenuItemCadAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadAdminActionPerformed(evt);
            }
        });
        jMenuCad.add(jMenuItemCadAdmin);

        jMenuBar1.add(jMenuCad);

        jMenuRela.setBackground(new java.awt.Color(222, 217, 217));
        jMenuRela.setForeground(new java.awt.Color(0, 0, 0));
        jMenuRela.setText("Relatório");
        jMenuBar1.add(jMenuRela);

        jMenuFerra.setBackground(new java.awt.Color(222, 217, 217));
        jMenuFerra.setForeground(new java.awt.Color(0, 0, 0));
        jMenuFerra.setText("Ferramentas");

        jMenuItemFerraTela.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemFerraTela.setText("Tela Bem-Vindo");
        jMenuItemFerraTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFerraTelaActionPerformed(evt);
            }
        });
        jMenuFerra.add(jMenuItemFerraTela);

        jMenuBar1.add(jMenuFerra);

        jMenuAjuda.setBackground(new java.awt.Color(222, 217, 217));
        jMenuAjuda.setForeground(new java.awt.Color(0, 0, 0));
        jMenuAjuda.setText("Ajuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItem1);

        jMenuBar1.add(jMenuAjuda);

        jMenu1.setBackground(new java.awt.Color(222, 217, 217));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("Opções");

        jMenuItemOutra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemOutra.setText("Usar Outra Conta?");
        jMenuItemOutra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOutraActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemOutra);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(971, 611));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        conecta.desconectar();
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButtonCadastroMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroMedicoActionPerformed
        try {
            conecta.executaSql("select * from usuario where login = '"+jLabelUser.getText()+"'");
            conecta.rs.first();
            if (conecta.rs.getString("perfil").equals("Administrador")) {
                TelaMedico tela = new TelaMedico();
                tela.setVisible(true);
            } else
                JOptionPane.showMessageDialog(null, "Sem permissao para acessar");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sem permissao para acessar");
        }  
    }//GEN-LAST:event_jButtonCadastroMedicoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jMenuItemFerraTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFerraTelaActionPerformed
        jInternalFrameBemVindo.setVisible(true);
    }//GEN-LAST:event_jMenuItemFerraTelaActionPerformed

    private void jMenuItemCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMedicoActionPerformed
        try {
            conecta.executaSql("select * from usuario where login = '"+jLabelUser.getText()+"'");
            conecta.rs.first();
            if (conecta.rs.getString("perfil").equals("Administrador")) {
                TelaMedico tela = new TelaMedico();
                tela.setVisible(true);
            } else
                JOptionPane.showMessageDialog(null, "Sem permissao para acessar\nContacte o Administrator");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sem permissao para acessar\nContacte o Administrator");
        }   
    }//GEN-LAST:event_jMenuItemCadMedicoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaInfo tela = new TelaInfo();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButtonCadastroAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroAdministratorActionPerformed
        try {
            conecta.executaSql("select * from usuario where login = '"+jLabelUser.getText()+"'");
            conecta.rs.first();
            if (conecta.rs.getString("perfil").equals("Administrador")) {
                TelaUsuario tela = new TelaUsuario();
                tela.setVisible(true);
            } else
                JOptionPane.showMessageDialog(null, "Sem permissao para acessar\nContacte o Administrator");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sem permissao para acessar\nContacte o Administrator");
        }  
    }//GEN-LAST:event_jButtonCadastroAdministratorActionPerformed

    private void jMenuItemCadAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadAdminActionPerformed
        try {
            conecta.executaSql("select * from usuario where login = '"+jLabelUser.getText()+"'");
            conecta.rs.first();
            if (conecta.rs.getString("perfil").equals("Administrador")) {
                TelaUsuario tela = new TelaUsuario();
                tela.setVisible(true);
            } else
                JOptionPane.showMessageDialog(null, "Sem permissao para acessar\nContacte o Administrator");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sem permissao para acessar\nContacte o Administrator");
        }  
    }//GEN-LAST:event_jMenuItemCadAdminActionPerformed

    private void jMenuItemOutraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOutraActionPerformed
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemOutraActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JButton jButtonCadastroAdministrator;
    private javax.swing.JButton jButtonCadastroEnfermeiro;
    private javax.swing.JButton jButtonCadastroMedico;
    private javax.swing.JButton jButtonCadastroPaciente;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabelAgenda;
    private javax.swing.JLabel jLabelBbmLogo;
    private javax.swing.JLabel jLabelCadPainel;
    private javax.swing.JLabel jLabelFundoLogo;
    private javax.swing.JLabel jLabelFundoPainel;
    private javax.swing.JLabel jLabelSisGes;
    private javax.swing.JLabel jLabelTelaPrincipal;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCad;
    private javax.swing.JMenu jMenuFerra;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCadAdmin;
    private javax.swing.JMenuItem jMenuItemCadEnfermeiro;
    private javax.swing.JMenuItem jMenuItemCadMedico;
    private javax.swing.JMenuItem jMenuItemCadPaciente;
    private javax.swing.JMenuItem jMenuItemFerraTela;
    private javax.swing.JMenuItem jMenuItemOutra;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuRela;
    private javax.swing.JPanel jPanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
