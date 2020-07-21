
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import modelBeans.BeansUsuario;
import modelBeans.ModelTable;
import modelDao.DaoUsuario;
import modelConexao.ConexaoDb;

/**
 *
 * @author Belmiro-Mungoi
 */
public class TelaUsuario extends javax.swing.JFrame {
    BeansUsuario modelo = new BeansUsuario();
    DaoUsuario dao = new DaoUsuario();
    ConexaoDb connect = new ConexaoDb();
    int flag = 0;
    /**
     * Creates new form TelaUsuario
     */
    public TelaUsuario() {
        initComponents();
        preencherTabela("select * from usuario order by nome_usuario");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNomeUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxPerfil = new javax.swing.JComboBox<>();
        jTextFieldBusca = new javax.swing.JTextField();
        jButtonBusca = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUser = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(617, 456));

        jLabel4.setText("Nome:");

        jTextFieldNomeUser.setEnabled(false);

        jLabel5.setText("Login:");

        jTextFieldLogin.setEnabled(false);

        jLabel6.setText("Senha:");

        jLabel2.setText("Perfil:");

        jComboBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Recepcionista", " " }));
        jComboBoxPerfil.setEnabled(false);

        jButtonBusca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/procurar02.png"))); // NOI18N
        jButtonBusca.setText("Pesquisar");
        jButtonBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaActionPerformed(evt);
            }
        });

        jButtonNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconNew.png"))); // NOI18N
        jButtonNew.setText("Novo");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSave.png"))); // NOI18N
        jButtonSave.setText("Salvar");
        jButtonSave.setEnabled(false);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconEdit.png"))); // NOI18N
        jButtonEdit.setText("Editar");
        jButtonEdit.setEnabled(false);
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconDelete.png"))); // NOI18N
        jButtonDelete.setText("Excluir");
        jButtonDelete.setEnabled(false);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconCancel.png"))); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSair.png"))); // NOI18N
        jButtonOut.setText("Sair");
        jButtonOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOutActionPerformed(evt);
            }
        });

        jTableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUser);

        jLabel7.setText("ID:");

        jTextFieldID.setEnabled(false);

        jPasswordFieldSenha.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonBusca)
                            .addGap(68, 68, 68)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonOut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNew, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBusca))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOut))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastro de Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel1)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(850, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOutActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonOutActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        flag = 1;
        jTextFieldNomeUser.setEnabled(true);
        jTextFieldLogin.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jComboBoxPerfil.setEnabled(true);
        jButtonSave.setEnabled(true);
        jButtonCancel.setEnabled(true);
        jButtonDelete.setEnabled(false);
        jButtonBusca.setEnabled(false);
        jTextFieldBusca.setEnabled(false);
        jButtonNew.setEnabled(false);
        jButtonEdit.setEnabled(false);
        jTextFieldID.setText("");
        jTextFieldNomeUser.setText("");
        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if (jTextFieldNomeUser.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo NOME!!!");
            jTextFieldNomeUser.requestFocus();
        } else if (jTextFieldLogin.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo LOGIN!!!");
            jTextFieldLogin.requestFocus();
        } else if (jPasswordFieldSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo SENHA!!!");
            jPasswordFieldSenha.requestFocus();
        } else if (flag == 1){
            modelo.setUsuNome(jTextFieldNomeUser.getText());
            modelo.setUsuPerfil((String) jComboBoxPerfil.getSelectedItem());
            modelo.setUsuLogin(jTextFieldLogin.getText());
            modelo.setUsuSenha(jPasswordFieldSenha.getText());
            dao.Salvar(modelo);
            jTextFieldNomeUser.setText("");
            jTextFieldLogin.setText("");
            jPasswordFieldSenha.setText("");
            jTextFieldNomeUser.setEnabled(false);
            jComboBoxPerfil.setEnabled(false);
            jTextFieldLogin.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jButtonSave.setEnabled(false);
            jButtonNew.setEnabled(true);
            preencherTabela("select * from usuario order by nome_usuario");
            } else {
                modelo.setUsuCod(Integer.parseInt(jTextFieldID.getText()));
                modelo.setUsuNome(jTextFieldNomeUser.getText());
                modelo.setUsuPerfil((String) jComboBoxPerfil.getSelectedItem());
                modelo.setUsuLogin(jTextFieldLogin.getText());
                modelo.setUsuSenha(jPasswordFieldSenha.getText());
                dao.editar(modelo);
                jTextFieldID.setText("");
                jTextFieldNomeUser.setText("");
                jTextFieldLogin.setText("");
                jPasswordFieldSenha.setText("");
                jTextFieldNomeUser.setEnabled(false);
                jComboBoxPerfil.setEnabled(false);
                jTextFieldLogin.setEnabled(false);
                jPasswordFieldSenha.setEnabled(false);
                jButtonSave.setEnabled(false);
                jButtonNew.setEnabled(true);
                preencherTabela("select * from usuario order by nome_usuario");
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaActionPerformed
        modelo.setPesquisa(jTextFieldBusca.getText());
        BeansUsuario mod = dao.pesquisarUsu(modelo);
        jTextFieldID.setText(String.valueOf(mod.getUsuCod()));
        jTextFieldNomeUser.setText(mod.getUsuNome());
        jTextFieldLogin.setText(mod.getUsuLogin());
        jPasswordFieldSenha.setText(mod.getUsuSenha());
        jComboBoxPerfil.setSelectedItem(mod.getUsuPerfil());
        jButtonSave.setEnabled(false);
        jTextFieldID.setEnabled(false);
        jTextFieldNomeUser.setEnabled(false);
        jTextFieldLogin.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jComboBoxPerfil.setEnabled(false);
        jButtonSave.setEnabled(false);
        jButtonEdit.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonCancel.setEnabled(true);
        preencherTabela("select * from usuario where nome_usuario like '%"+mod.getPesquisa()+"%'");
    }//GEN-LAST:event_jButtonBuscaActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        flag = 2;
        jTextFieldNomeUser.setEnabled(true);
        jTextFieldLogin.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jComboBoxPerfil.setEnabled(true);
        jButtonSave.setEnabled(true);
        jButtonCancel.setEnabled(true);
        jButtonNew.setEnabled(false);
        jButtonEdit.setEnabled(false);
        jButtonDelete.setEnabled(false);
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int del = JOptionPane.showConfirmDialog(null, "Deseja exlcuir usuario?", "Atencao", JOptionPane.YES_NO_OPTION);
        if (del == JOptionPane.YES_OPTION) {
            modelo.setUsuCod(Integer.parseInt(jTextFieldID.getText()));
            dao.excluir(modelo);
            jTextFieldID.setText("");
            jTextFieldNomeUser.setText("");
            jTextFieldLogin.setText("");
            jPasswordFieldSenha.setText("");
            jTextFieldNomeUser.setEnabled(false);
            jComboBoxPerfil.setEnabled(false);
            jTextFieldLogin.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jButtonSave.setEnabled(false);
            jButtonEdit.setEnabled(false);
            jButtonDelete.setEnabled(false);
            jButtonNew.setEnabled(true);
            preencherTabela("select * from usuario order by nome_usuario");
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        jTextFieldID.setText("");
        jTextFieldNomeUser.setText("");
        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");
        jTextFieldBusca.setText("");
        jTextFieldNomeUser.setEnabled(false);
        jComboBoxPerfil.setEnabled(false);
        jTextFieldLogin.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jButtonSave.setEnabled(false);
        jButtonEdit.setEnabled(false);
        jButtonNew.setEnabled(true);   
        jButtonBusca.setEnabled(true);
        jTextFieldBusca.setEnabled(true);
        preencherTabela("select * from usuario order by nome_usuario");
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUserMouseClicked
        try {
            String nome_usuario = ""+jTableUser.getValueAt(jTableUser.getSelectedRow(), 1);
            connect.conexao();
            connect.executaSql("select * from usuario where nome_usuario = '" + nome_usuario + "'");
            connect.rs.first();
            jTextFieldID.setText(String.valueOf(connect.rs.getInt("id_usuario")));
            jTextFieldNomeUser.setText(connect.rs.getString("nome_usuario"));
            jComboBoxPerfil.setSelectedItem(connect.rs.getString("perfil"));
            jTextFieldLogin.setText(String.valueOf(connect.rs.getString("login")));
            jPasswordFieldSenha.setText(connect.rs.getString("senha"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados:\n" +ex.getMessage());                                                       
        }
        jButtonBusca.setEnabled(true);
        jButtonEdit.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jTextFieldBusca.setEnabled(true);
        jTextFieldID.setEnabled(false);
        jTextFieldNomeUser.setEnabled(false);
        jComboBoxPerfil.setEnabled(false);
        jTextFieldLogin.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jButtonSave.setEnabled(false);
        jButtonCancel.setEnabled(false);
        connect.desconectar();
    }//GEN-LAST:event_jTableUserMouseClicked

    public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID","Nome","Login","Senha","Perfil"}; 
        connect.conexao();
        connect.executaSql(sql);
        try {
            connect.rs.first();
            do {                
                dados.add(new Object[]{connect.rs.getInt("id_usuario"),
                    connect.rs.getString("nome_usuario"), connect.rs.getString("login"),
                    connect.rs.getString("senha"), connect.rs.getString("perfil")});
            } while (connect.rs.next());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tente Novamente");
            jTextFieldBusca.setText("");
            jTextFieldBusca.requestFocus();
            jButtonEdit.setEnabled(false);
            jButtonDelete.setEnabled(false);
        }
        
        ModelTable model = new ModelTable(dados, colunas);
        jTableUser.setModel(model);
        jTableUser.getColumnModel().getColumn(0).setPreferredWidth(45);
        jTableUser.getColumnModel().getColumn(0).setResizable(false);
        jTableUser.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableUser.getColumnModel().getColumn(1).setResizable(false);
        jTableUser.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTableUser.getColumnModel().getColumn(2).setResizable(false);
        jTableUser.getColumnModel().getColumn(3).setPreferredWidth(95);
        jTableUser.getColumnModel().getColumn(3).setResizable(false);
        jTableUser.getColumnModel().getColumn(4).setPreferredWidth(124);
        jTableUser.getColumnModel().getColumn(4).setResizable(false);
        jTableUser.getTableHeader().setReorderingAllowed(false);
        jTableUser.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableUser.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        connect.desconectar();
    }
    
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
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBusca;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonOut;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUser;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNomeUser;
    // End of variables declaration//GEN-END:variables
}
