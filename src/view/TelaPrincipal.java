
package view;

import javax.swing.JOptionPane;
import modelConexao.ConexaoDb;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Belmiro-Mungoi
 */
public class TelaPrincipal extends javax.swing.JFrame {
    ConexaoDb conecta = new ConexaoDb();
    TelaMedico tela = new TelaMedico();
    TelaUsuario tela2 = new TelaUsuario();
    TelaPaciente telaPac = new TelaPaciente();
    TelaEnfermeiro telaEnfer = new TelaEnfermeiro();
    TelaAgendamento telaAgen = new TelaAgendamento();

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
        jMenuItemRelMedico = new javax.swing.JMenuItem();
        jMenuItemRelEnfermeiro = new javax.swing.JMenuItem();
        jMenuItemRelPaciente = new javax.swing.JMenuItem();
        jMenuItemRelUsuario = new javax.swing.JMenuItem();
        jMenuItemCon = new javax.swing.JMenuItem();
        jMenuFerra = new javax.swing.JMenu();
        jMenuItemFerraTela = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemAgen = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemOutra = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrameBemVindo.setForeground(new java.awt.Color(255, 255, 255));
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
        jLabelFundoLogo.setBounds(720, 220, 270, 240);

        jLabelBbmLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo00.png"))); // NOI18N
        jInternalFrameBemVindo.getContentPane().add(jLabelBbmLogo);
        jLabelBbmLogo.setBounds(740, 170, 210, 100);

        jButtonCadastroMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadMedico.png"))); // NOI18N
        jButtonCadastroMedico.setToolTipText("Médicos");
        jButtonCadastroMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroMedicoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonCadastroMedico);
        jButtonCadastroMedico.setBounds(10, 70, 160, 170);

        jButtonCadastroEnfermeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadEnfermeira.png"))); // NOI18N
        jButtonCadastroEnfermeiro.setToolTipText("Enfermeiros");
        jButtonCadastroEnfermeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastroEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroEnfermeiroActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonCadastroEnfermeiro);
        jButtonCadastroEnfermeiro.setBounds(170, 70, 160, 170);

        jButtonCadastroPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadPaciente.png"))); // NOI18N
        jButtonCadastroPaciente.setToolTipText("Pacientes");
        jButtonCadastroPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroPacienteActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonCadastroPaciente);
        jButtonCadastroPaciente.setBounds(330, 70, 160, 170);

        jButtonCadastroAdministrator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadAdministrator.png"))); // NOI18N
        jButtonCadastroAdministrator.setToolTipText("Administratores");
        jButtonCadastroAdministrator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastroAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroAdministratorActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonCadastroAdministrator);
        jButtonCadastroAdministrator.setBounds(490, 70, 160, 170);

        jLabelAgenda.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabelAgenda.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAgenda.setText("Agendamento:");
        jInternalFrameBemVindo.getContentPane().add(jLabelAgenda);
        jLabelAgenda.setBounds(10, 260, 110, 19);

        jButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page2.png"))); // NOI18N
        jButtonAgenda.setToolTipText("Fazer Agendamento");
        jButtonAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonAgenda);
        jButtonAgenda.setBounds(10, 290, 160, 170);

        jLabelFundoPainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoBrancoPainel.png"))); // NOI18N
        jInternalFrameBemVindo.getContentPane().add(jLabelFundoPainel);
        jLabelFundoPainel.setBounds(0, 40, 1000, 440);

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
        jButtonSair.setBounds(940, 0, 50, 40);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(0, 120, 1000, 510);

        jLabelUser.setText("Usuario");
        getContentPane().add(jLabelUser);
        jLabelUser.setBounds(0, 60, 100, 20);

        jLabelTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoPrincipal02.png"))); // NOI18N
        getContentPane().add(jLabelTelaPrincipal);
        jLabelTelaPrincipal.setBounds(0, 0, 1000, 630);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenuCad.setBackground(new java.awt.Color(255, 255, 255));
        jMenuCad.setForeground(new java.awt.Color(0, 0, 0));
        jMenuCad.setText("Cadastro");

        jMenuItemCadMedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCadMedico.setText("Médicos");
        jMenuItemCadMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMedicoActionPerformed(evt);
            }
        });
        jMenuCad.add(jMenuItemCadMedico);

        jMenuItemCadEnfermeiro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCadEnfermeiro.setText("Enfermeiros");
        jMenuItemCadEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadEnfermeiroActionPerformed(evt);
            }
        });
        jMenuCad.add(jMenuItemCadEnfermeiro);

        jMenuItemCadPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCadPaciente.setText("Pacientes");
        jMenuItemCadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadPacienteActionPerformed(evt);
            }
        });
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

        jMenuRela.setBackground(new java.awt.Color(255, 255, 255));
        jMenuRela.setForeground(new java.awt.Color(0, 0, 0));
        jMenuRela.setText("Relatório");

        jMenuItemRelMedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemRelMedico.setText("Medico");
        jMenuItemRelMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelMedicoActionPerformed(evt);
            }
        });
        jMenuRela.add(jMenuItemRelMedico);

        jMenuItemRelEnfermeiro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemRelEnfermeiro.setText("Enfermeiro");
        jMenuItemRelEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelEnfermeiroActionPerformed(evt);
            }
        });
        jMenuRela.add(jMenuItemRelEnfermeiro);

        jMenuItemRelPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemRelPaciente.setText("Paciente");
        jMenuItemRelPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelPacienteActionPerformed(evt);
            }
        });
        jMenuRela.add(jMenuItemRelPaciente);

        jMenuItemRelUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemRelUsuario.setText("Usuario");
        jMenuItemRelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelUsuarioActionPerformed(evt);
            }
        });
        jMenuRela.add(jMenuItemRelUsuario);

        jMenuItemCon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCon.setText("Consulta");
        jMenuItemCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConActionPerformed(evt);
            }
        });
        jMenuRela.add(jMenuItemCon);

        jMenuBar1.add(jMenuRela);

        jMenuFerra.setBackground(new java.awt.Color(255, 255, 255));
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

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Agenda");

        jMenuItemAgen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAgen.setText("Agendamento");
        jMenuItemAgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgenActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAgen);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Agenda do Dia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Agenda do Medico");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenuAjuda.setBackground(new java.awt.Color(255, 255, 255));
        jMenuAjuda.setForeground(new java.awt.Color(0, 0, 0));
        jMenuAjuda.setText("Ajuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItem1);

        jMenuBar1.add(jMenuAjuda);

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("Opções");

        jMenuItemOutra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
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

        setSize(new java.awt.Dimension(1016, 688));
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
                if(tela == null){
                    tela = new TelaMedico();
                    tela.setVisible(true);
                } else{
                    tela.setVisible(true);
                }
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
                if(tela == null){
                    tela = new TelaMedico();
                    tela.setVisible(true);
                } else{
                    tela.setVisible(true);
                }
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
                if(tela2 == null){
                    tela2 = new TelaUsuario();
                    tela2.setVisible(true);
                } else{
                    tela2.setVisible(true);
                }
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
                if(tela2 == null){
                    tela2 = new TelaUsuario();
                    tela2.setVisible(true);
                } else{
                    tela2.setVisible(true);
                }
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

    private void jButtonCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroPacienteActionPerformed
        if(telaPac == null){
            telaPac = new TelaPaciente();
            telaPac.setVisible(true);
        } else{
            telaPac.setVisible(true);
        }
    }//GEN-LAST:event_jButtonCadastroPacienteActionPerformed

    private void jMenuItemCadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadPacienteActionPerformed
        if(telaPac == null){
            telaPac = new TelaPaciente();
            telaPac.setVisible(true);
        } else{
            telaPac.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemCadPacienteActionPerformed

    private void jButtonCadastroEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroEnfermeiroActionPerformed
        try {
            conecta.executaSql("select * from usuario where login = '"+jLabelUser.getText()+"'");
            conecta.rs.first();
            if (conecta.rs.getString("perfil").equals("Administrador")) {
                if(telaEnfer == null){
                    telaEnfer = new TelaEnfermeiro();
                    telaEnfer.setVisible(true);
                } else{
                    telaEnfer.setVisible(true);
                }
            } else
                JOptionPane.showMessageDialog(null, "Sem permissao para acessar");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sem permissao para acessar");
        } 
    }//GEN-LAST:event_jButtonCadastroEnfermeiroActionPerformed

    private void jMenuItemCadEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadEnfermeiroActionPerformed
        try {
            conecta.executaSql("select * from usuario where login = '"+jLabelUser.getText()+"'");
            conecta.rs.first();
            if (conecta.rs.getString("perfil").equals("Administrador")) {
                if(telaEnfer == null){
                    telaEnfer = new TelaEnfermeiro();
                    telaEnfer.setVisible(true);
                } else{
                    telaEnfer.setVisible(true);
                }
            } else
                JOptionPane.showMessageDialog(null, "Sem permissao para acessar");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sem permissao para acessar");
        }
    }//GEN-LAST:event_jMenuItemCadEnfermeiroActionPerformed

    private void jButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaActionPerformed
        if(telaAgen == null){
            telaAgen = new TelaAgendamento();
            telaAgen.setVisible(true);
        }else
            telaAgen.setVisible(true);
    }//GEN-LAST:event_jButtonAgendaActionPerformed

    private void jMenuItemAgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgenActionPerformed
        if(telaAgen == null){
            telaAgen = new TelaAgendamento();
            telaAgen.setVisible(true);
        }else
            telaAgen.setVisible(true);
    }//GEN-LAST:event_jMenuItemAgenActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaAgenda agen = new TelaAgenda();
        agen.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaAgenMedico agenda = new TelaAgenMedico();
        agenda.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItemRelMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelMedicoActionPerformed
        int imprimir = JOptionPane.showConfirmDialog(null, "Deseja fazer a impressao?","Atencao", JOptionPane.YES_NO_OPTION);
        if(imprimir == JOptionPane.YES_OPTION){
            String url ="C:/Users/Freeware Sys/Documents/NetBeansProjects/ProjectoClinica/reports/Medicos/Relatorio de Medico.jasper";
            
            JasperPrint jasper = null;
            try {
                jasper = JasperFillManager.fillReport(url, null, conecta.con);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, "Erro ao gerar relatorio\n"+e.getMessage());
            }
            JasperViewer view = new JasperViewer(jasper, false);
            view.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemRelMedicoActionPerformed

    private void jMenuItemRelEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelEnfermeiroActionPerformed
        int imprimir = JOptionPane.showConfirmDialog(null, "Deseja fazer a impressao?","Atencao", JOptionPane.YES_NO_OPTION);
        if(imprimir == JOptionPane.YES_OPTION){
            String url ="C:/Users/Freeware Sys/Documents/NetBeansProjects/ProjectoClinica/reports/Enfermeiros/Relatorio de Enfermeiro.jasper";
            
            JasperPrint jasper = null;
            try {
                jasper = JasperFillManager.fillReport(url, null, conecta.con);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, "Erro ao gerar relatorio\n"+e.getMessage());
            }
            JasperViewer view = new JasperViewer(jasper, false);
            view.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemRelEnfermeiroActionPerformed

    private void jMenuItemRelPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelPacienteActionPerformed
        int imprimir = JOptionPane.showConfirmDialog(null, "Deseja fazer a impressao?","Atencao", JOptionPane.YES_NO_OPTION);
        if(imprimir == JOptionPane.YES_OPTION){
            String url ="C:/Users/Freeware Sys/Documents/NetBeansProjects/ProjectoClinica/reports/Paciente/Relatorio de Pacientes.jasper";
            
            JasperPrint jasper = null;
            try {
                jasper = JasperFillManager.fillReport(url, null, conecta.con);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, "Erro ao gerar relatorio\n"+e.getMessage());
            }
            JasperViewer view = new JasperViewer(jasper, false);
            view.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemRelPacienteActionPerformed

    private void jMenuItemRelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelUsuarioActionPerformed
        int imprimir = JOptionPane.showConfirmDialog(null, "Deseja fazer a impressao?","Atencao", JOptionPane.YES_NO_OPTION);
        if(imprimir == JOptionPane.YES_OPTION){
            String url ="C:/Users/Freeware Sys/Documents/NetBeansProjects/ProjectoClinica/reports/Usuario/Relatorio de Usuario.jasper";
            
            JasperPrint jasper = null;
            try {
                jasper = JasperFillManager.fillReport(url, null, conecta.con);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, "Erro ao gerar relatorio\n"+e.getMessage());
            }
            JasperViewer view = new JasperViewer(jasper, false);
            view.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemRelUsuarioActionPerformed

    private void jMenuItemConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConActionPerformed
        int imprimir = JOptionPane.showConfirmDialog(null, "Deseja fazer a impressao?","Atencao", JOptionPane.YES_NO_OPTION);
        if(imprimir == JOptionPane.YES_OPTION){
            String url ="C:/Users/Freeware Sys/Documents/NetBeansProjects/ProjectoClinica/reports/Consulta/Relatorio da Consulta.jasper";
            
            JasperPrint jasper = null;
            try {
                jasper = JasperFillManager.fillReport(url, null, conecta.con);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, "Erro ao gerar relatorio\n"+e.getMessage());
            }
            JasperViewer view = new JasperViewer(jasper, false);
            view.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemConActionPerformed

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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCad;
    private javax.swing.JMenu jMenuFerra;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemAgen;
    private javax.swing.JMenuItem jMenuItemCadAdmin;
    private javax.swing.JMenuItem jMenuItemCadEnfermeiro;
    private javax.swing.JMenuItem jMenuItemCadMedico;
    private javax.swing.JMenuItem jMenuItemCadPaciente;
    private javax.swing.JMenuItem jMenuItemCon;
    private javax.swing.JMenuItem jMenuItemFerraTela;
    private javax.swing.JMenuItem jMenuItemOutra;
    private javax.swing.JMenuItem jMenuItemRelEnfermeiro;
    private javax.swing.JMenuItem jMenuItemRelMedico;
    private javax.swing.JMenuItem jMenuItemRelPaciente;
    private javax.swing.JMenuItem jMenuItemRelUsuario;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuRela;
    private javax.swing.JPanel jPanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
