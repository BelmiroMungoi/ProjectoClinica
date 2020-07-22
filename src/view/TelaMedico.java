
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import modelBeans.ModelTable;
import modelConexao.ConexaoDb;
import modelDao.DaoMedico;
import modelBeans.ModeloMedico;

/**
 *
 * @author Belmiro-Mungoi
 */
public class TelaMedico extends javax.swing.JFrame {
    ModeloMedico modelo = new ModeloMedico();
    DaoMedico control = new DaoMedico();
    ConexaoDb connect = new ConexaoDb(); 
    int flag = 1;

    public TelaMedico() {
        initComponents();
        preencherTabela("select * from medicos order by nome_medico");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelEspec = new javax.swing.JLabel();
        jLabelBi = new javax.swing.JLabel();
        jLabelCrm = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldBi = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCrm = new javax.swing.JFormattedTextField();
        jComboBoxEspec = new javax.swing.JComboBox<>();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedico = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisa = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFielD = new javax.swing.JTextField();
        jLabelCadMedico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNome.setText("Nome: ");

        jLabelEspec.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEspec.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEspec.setText("Especialidade: ");

        jLabelBi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelBi.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBi.setText("Bilhete de Identidade:");

        jLabelCrm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCrm.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCrm.setText("Crm:");

        jTextFieldNome.setEnabled(false);

        jFormattedTextFieldBi.setToolTipText("Insira 13 Caracteres");
        jFormattedTextFieldBi.setEnabled(false);

        jFormattedTextFieldCrm.setToolTipText("Insira 10 Caracteres");
        jFormattedTextFieldCrm.setEnabled(false);

        jComboBoxEspec.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxEspec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anatomia Patologica", "Anestesiologia", "Cardiologia", "Cirugia Geral", "Dermatovenereologia", "Dermatologia", "Deontologia", "Doencas Infeciosas", "Estomatologia", "Ginecologia", "Oftamologia", "Ortopedia", "Pediatria", "Pneumologia", "Psiquiatria", "Radiologia", "Saude Publica", " ", " " }));
        jComboBoxEspec.setEnabled(false);

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconNew.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSave.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconEdit.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconCancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconDelete.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMedico);

        jButtonPesquisa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonPesquisa.setForeground(new java.awt.Color(0, 0, 0));
        jButtonPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/procurar02.png"))); // NOI18N
        jButtonPesquisa.setText("Pesquisar");
        jButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaActionPerformed(evt);
            }
        });

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSair.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID:");

        jTextFielD.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFielD, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelBi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldBi))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelEspec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxEspec, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCrm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldCrm))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Sair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPesquisa)
                                .addGap(86, 86, 86))
                            .addComponent(jScrollPane1))))
                .addGap(18, 18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFielD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome)
                            .addComponent(jComboBoxEspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEspec))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBi)
                            .addComponent(jFormattedTextFieldBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelCrm)
                        .addComponent(jFormattedTextFieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisa)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabelCadMedico.setFont(new java.awt.Font("Dialog", 3, 22)); // NOI18N
        jLabelCadMedico.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCadMedico.setText("Cadastro de Médico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabelCadMedico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCadMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(854, 571));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(!true);
        jComboBoxEspec.setEnabled(!true);
        jFormattedTextFieldBi.setEnabled(!true);
        jFormattedTextFieldCrm.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);   
        jButtonExcluir.setEnabled(false);
        jButtonPesquisa.setEnabled(true);
        jTextFieldPesquisa.setEnabled(true);
        jTextFielD.setText("");
        jTextFieldNome.setText("");
        jTextFieldPesquisa.setText("");
        jFormattedTextFieldBi.setText("");
        jFormattedTextFieldCrm.setText("");
        preencherTabela("select * from medicos order by nome_medico");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo NOME!!!");
            jTextFieldNome.requestFocus();
        } else if (jFormattedTextFieldBi.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo BI!!!");
            jFormattedTextFieldBi.requestFocus();
        } else if (jFormattedTextFieldCrm.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo CRM!!!");
            jFormattedTextFieldCrm.requestFocus();
        }
        if (flag == 1){
            modelo.setNome(jTextFieldNome.getText());
            modelo.setEspec((String) jComboBoxEspec.getSelectedItem());
            modelo.setCrm(Integer.parseInt(jFormattedTextFieldCrm.getText()));
            modelo.setBi(jFormattedTextFieldBi.getText());
            control.Salvar(modelo);
            jTextFieldNome.setText("");
            jFormattedTextFieldBi.setText("");
            jFormattedTextFieldCrm.setText("");
            jTextFieldNome.setEnabled(false);
            jComboBoxEspec.setEnabled(false);
            jFormattedTextFieldBi.setEnabled(false);
            jFormattedTextFieldCrm.setEnabled(false);
            jButtonSalvar.setEnabled(false);   
            preencherTabela("select * from medicos order by nome_medico");
        }else {
            modelo.setCod(Integer.parseInt(jTextFielD.getText()));
            modelo.setNome(jTextFieldNome.getText());
            modelo.setEspec((String) jComboBoxEspec.getSelectedItem());
            modelo.setBi(jFormattedTextFieldBi.getText());
            modelo.setCrm(Integer.parseInt(jFormattedTextFieldCrm.getText()));
            control.editar(modelo);
            jTextFielD.setText("");
            jTextFieldNome.setText("");
            jTextFieldPesquisa.setText("");
            jFormattedTextFieldBi.setText("");
            jFormattedTextFieldCrm.setText("");
            jTextFieldNome.setEnabled(false);
            jComboBoxEspec.setEnabled(false);
            jFormattedTextFieldBi.setEnabled(false);
            jFormattedTextFieldCrm.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            preencherTabela("select * from medicos order by nome_medico");
        }  
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldNome.setEnabled(true);
        jComboBoxEspec.setEnabled(true);
        jFormattedTextFieldBi.setEnabled(true);
        jFormattedTextFieldCrm.setEnabled(true);
        jTextFieldNome.setText("");
        jFormattedTextFieldBi.setText("");
        jFormattedTextFieldCrm.setText("");  
        jTextFieldPesquisa.setText("");
        jTextFielD.setText("");
        jTextFieldPesquisa.setEnabled(false);
        jButtonPesquisa.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
        modelo.setPesquisa(jTextFieldPesquisa.getText());
        ModeloMedico mod = control.pesquisaMed(modelo);
        jTextFielD.setText(String.valueOf(mod.getCod()));
        jTextFieldNome.setText(mod.getNome());
        jFormattedTextFieldBi.setText(String.valueOf(mod.getBi()));
        jFormattedTextFieldCrm.setText(String.valueOf(mod.getCrm()));
        jComboBoxEspec.setSelectedItem(mod.getEspec());
        jButtonSalvar.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jComboBoxEspec.setEnabled(false);
        jFormattedTextFieldBi.setEnabled(false);
        jFormattedTextFieldCrm.setEnabled(false);
        preencherTabela("select * from medicos where nome_medico like '%"+mod.getPesquisa()+"%'");
    }//GEN-LAST:event_jButtonPesquisaActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jComboBoxEspec.setEnabled(true);
        jFormattedTextFieldBi.setEnabled(true);
        jFormattedTextFieldCrm.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int excluir = JOptionPane.showConfirmDialog(null, "Deseja excluir os dados?", "Atencao", JOptionPane.YES_NO_OPTION);
        if (excluir == JOptionPane.YES_OPTION){
            modelo.setCod(Integer.parseInt(jTextFielD.getText()));
            control.excluir(modelo);
            jTextFielD.setText("");
            jTextFieldNome.setText("");
            jTextFieldPesquisa.setText("");
            jFormattedTextFieldBi.setText("");
            jFormattedTextFieldCrm.setText("");
            jTextFieldNome.setEnabled(false);
            jComboBoxEspec.setEnabled(false);
            jFormattedTextFieldBi.setEnabled(false);
            jFormattedTextFieldCrm.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            preencherTabela("select * from medicos order by nome_medico");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicoMouseClicked
        try {
            String nome_medico = ""+jTableMedico.getValueAt(jTableMedico.getSelectedRow(), 1);
            connect.conexao();
            connect.executaSql("select * from medicos where nome_medico = '" + nome_medico + "'");
            connect.rs.first();
            jTextFielD.setText(String.valueOf(connect.rs.getInt("idmedico")));
            jTextFieldNome.setText(connect.rs.getString("nome_medico"));
            jComboBoxEspec.setSelectedItem(connect.rs.getString("espec_medico"));
            jFormattedTextFieldCrm.setText(String.valueOf(connect.rs.getInt("crm_medico")));
            jFormattedTextFieldBi.setText(connect.rs.getString("bi_medico"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados:\n" +ex.getMessage());                                                       
        }
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonPesquisa.setEnabled(true);
        jTextFieldPesquisa.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jComboBoxEspec.setEnabled(false);
        jFormattedTextFieldBi.setEnabled(false);
        jFormattedTextFieldCrm.setEnabled(false);
        connect.desconectar();
    }//GEN-LAST:event_jTableMedicoMouseClicked
    
    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID","Nome","Especialidade","CRM","BI"};
        connect.conexao();
        connect.executaSql(Sql);
        
        try {
            connect.rs.first();
            do {                
                dados.add(new Object[]{connect.rs.getInt("idmedico"),
                    connect.rs.getString("nome_medico"),connect.rs.getString("espec_medico"),
                    connect.rs.getInt("crm_medico"),connect.rs.getString("bi_medico")});
            } while (connect.rs.next());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tente Novamente");
            jTextFieldPesquisa.setText("");
            jTextFieldPesquisa.requestFocus();
        }
        
        ModelTable model = new ModelTable(dados, colunas);
        jTableMedico.setModel(model);
        jTableMedico.getColumnModel().getColumn(0).setPreferredWidth(45);
        jTableMedico.getColumnModel().getColumn(0).setResizable(false);
        jTableMedico.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableMedico.getColumnModel().getColumn(1).setResizable(false);
        jTableMedico.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTableMedico.getColumnModel().getColumn(2).setResizable(false);
        jTableMedico.getColumnModel().getColumn(3).setPreferredWidth(95);
        jTableMedico.getColumnModel().getColumn(3).setResizable(false);
        jTableMedico.getColumnModel().getColumn(4).setPreferredWidth(124);
        jTableMedico.getColumnModel().getColumn(4).setResizable(false);
        jTableMedico.getTableHeader().setReorderingAllowed(false);
        jTableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableMedico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        connect.desconectar();
    }
    
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
            java.util.logging.Logger.getLogger(TelaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sair;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxEspec;
    private javax.swing.JFormattedTextField jFormattedTextFieldBi;
    private javax.swing.JFormattedTextField jFormattedTextFieldCrm;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBi;
    private javax.swing.JLabel jLabelCadMedico;
    private javax.swing.JLabel jLabelCrm;
    private javax.swing.JLabel jLabelEspec;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedico;
    private javax.swing.JTextField jTextFielD;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
