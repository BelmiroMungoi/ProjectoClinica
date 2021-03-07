
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelBeans.BeansAgenda;
import modelBeans.ModelTable;
import modelConexao.ConexaoDb;
import modelDao.DaoAgenda;

/**
 *
 * @author Belmiro-Mungoi
 */
public class TelaAgendamento extends javax.swing.JFrame {
    ConexaoDb connect = new ConexaoDb();
    BeansAgenda agenda = new BeansAgenda();
    /**
     * Creates new form TelaAgendamento
     */
    public TelaAgendamento() {
        initComponents();
        exibirMedico();
    }

    public void exibirMedico() {
        connect.conexao();
        connect.executaSql("select * from medicos order by nome_medico");
        try {
            connect.rs.first();
            jComboBoxMed.removeAllItems();
            do {                
                jComboBoxMed.addItem(connect.rs.getString("nome_medico"));
            } while (connect.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir medicos"  + ex);
        }
        connect.desconectar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPesq = new javax.swing.JTextField();
        jButtonBus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePac = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxMed = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMotivo = new javax.swing.JTextField();
        jButtonFin = new javax.swing.JButton();
        jButtonCan = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Paciente:");

        jButtonBus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonBus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/procurar02.png"))); // NOI18N
        jButtonBus.setText("Buscar");
        jButtonBus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Turno:");

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º - Manha", "2º - Tarde", "3º - Noite" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTablePac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePac);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Medico:");

        jComboBoxMed.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBoxMed.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxMed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxMed.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Data:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Motivo:");

        jButtonFin.setText("Finalizar Agendamento");
        jButtonFin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFin.setEnabled(false);
        jButtonFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinActionPerformed(evt);
            }
        });

        jButtonCan.setText("Cancelar Agendamento");
        jButtonCan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCan.setEnabled(false);
        jButtonCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanActionPerformed(evt);
            }
        });

        jButton4.setText("Sair");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jDateChooser1.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxMed, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(109, 109, 109)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonBus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonFin)
                                .addGap(115, 115, 115)
                                .addComponent(jButtonCan)
                                .addGap(111, 111, 111)
                                .addComponent(jButton4))
                            .addComponent(jTextFieldMotivo))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton4, jButtonCan, jButtonFin});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonBus)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jComboBoxMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonCan)
                    .addComponent(jButton4)
                    .addComponent(jButtonFin))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton4, jButtonCan, jButtonFin});

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Agendamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(855, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusActionPerformed
        preencherTabela("select id_paciente, nome_paciente, bi_paciente, cell_paciente, nome_bairro, rua_paciente from paciente inner join bairro on pac_bairro = cod_bairro where nome_paciente like '%"+jTextFieldPesq.getText()+"%'");
    }//GEN-LAST:event_jButtonBusActionPerformed

    private void jTablePacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacMouseClicked
        try {
            String nome_pac = ""+jTablePac.getValueAt(jTablePac.getSelectedRow(), 1);
            connect.conexao();
            connect.executaSql("select * from paciente where nome_paciente = '" + nome_pac + "'");
            connect.rs.first();
            jTextFieldPesq.setText(connect.rs.getString("nome_paciente"));
            connect.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar paciente");
        }
        jComboBox1.setEnabled(true);
        jComboBoxMed.setEnabled(true);
        jDateChooser1.setEnabled(true);
        jButtonFin.setEnabled(true);
        jButtonCan.setEnabled(true);
    }//GEN-LAST:event_jTablePacMouseClicked

    private void jButtonFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinActionPerformed
        agenda.setNomePac(jTextFieldPesq.getText());
        agenda.setTurno((String) jComboBox1.getSelectedItem());
        agenda.setNomeMed((String) jComboBoxMed.getSelectedItem());
        agenda.setData(jDateChooser1.getDate());
        agenda.setMotivo(jTextFieldMotivo.getText());
        agenda.setStatus("Aberto");
        if(jTextFieldMotivo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo MOTIVO");
            jTextFieldMotivo.requestFocus();
        }else{
            DaoAgenda dao = new DaoAgenda();
            dao.salvar(agenda);
            dispose();
            jTextFieldPesq.setText("");
            jTextFieldMotivo.setText("");
            jDateChooser1.setDate(null);
            jComboBox1.setToolTipText(null);
            jComboBox1.setEnabled(!true);
            jComboBoxMed.setEnabled(!true);
            jDateChooser1.setEnabled(!true);
            jButtonFin.setEnabled(!true);
            jButtonCan.setEnabled(!true);
        }                  
    }//GEN-LAST:event_jButtonFinActionPerformed

    private void jButtonCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanActionPerformed
        jComboBox1.setEnabled(!true);
        jComboBoxMed.setEnabled(!true);
        jDateChooser1.setEnabled(!true);
        jButtonFin.setEnabled(!true);
        jButtonCan.setEnabled(!true);
        jTextFieldPesq.setText("");
        jTextFieldMotivo.setText("");  
        jDateChooser1.setDate(null);
    }//GEN-LAST:event_jButtonCanActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID","Nome","BI","Contacto","Bairro","Rua"}; 
        connect.conexao();
        connect.executaSql(sql);
        try {
            connect.rs.first();
            do {                
                dados.add(new Object[]{connect.rs.getInt("id_paciente"),
                    connect.rs.getString("nome_paciente"), connect.rs.getString("bi_paciente"),
                    connect.rs.getString("cell_paciente"), connect.rs.getString("nome_bairro"),
                    connect.rs.getString("rua_paciente")});
            } while (connect.rs.next());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tente Novamente");
            jTextFieldPesq.setText("");
            jTextFieldPesq.requestFocus();
        }
        
        ModelTable model = new ModelTable(dados, colunas);
        jTablePac.setModel(model);
        jTablePac.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTablePac.getColumnModel().getColumn(0).setResizable(false);
        jTablePac.getColumnModel().getColumn(1).setPreferredWidth(185);
        jTablePac.getColumnModel().getColumn(1).setResizable(false);
        jTablePac.getColumnModel().getColumn(2).setPreferredWidth(122);
        jTablePac.getColumnModel().getColumn(2).setResizable(false);
        jTablePac.getColumnModel().getColumn(3).setPreferredWidth(122);
        jTablePac.getColumnModel().getColumn(3).setResizable(false);
        jTablePac.getColumnModel().getColumn(4).setPreferredWidth(125);
        jTablePac.getColumnModel().getColumn(4).setResizable(false);
        jTablePac.getColumnModel().getColumn(5).setPreferredWidth(150);
        jTablePac.getColumnModel().getColumn(5).setResizable(false);
        jTablePac.getTableHeader().setReorderingAllowed(false);
        jTablePac.setAutoResizeMode(jTablePac.AUTO_RESIZE_OFF);
        jTablePac.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(TelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAgendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonBus;
    private javax.swing.JButton jButtonCan;
    private javax.swing.JButton jButtonFin;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxMed;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePac;
    private javax.swing.JTextField jTextFieldMotivo;
    private javax.swing.JTextField jTextFieldPesq;
    // End of variables declaration//GEN-END:variables
}
