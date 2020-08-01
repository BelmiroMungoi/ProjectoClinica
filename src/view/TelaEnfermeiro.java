
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import modelBeans.BeansEnfermeiro;
import modelBeans.ModelTable;
import modelConexao.ConexaoDb;
import modelDao.DaoEnfermeiro;

/**
 *
 * @author Belmiro-Mungoi
 */
public class TelaEnfermeiro extends javax.swing.JFrame {
    ConexaoDb connect = new ConexaoDb();
    BeansEnfermeiro model = new BeansEnfermeiro();
    DaoEnfermeiro enfer = new DaoEnfermeiro();
    int flag = 0;
    /**
     * Creates new form TelaEnfermeiro
     */
    public TelaEnfermeiro() {
        initComponents();
        preencherTabela("select * from enfermeiro order by nome_enfer");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxArea = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldBI = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldCell = new javax.swing.JFormattedTextField();
        jTextFieldPesq = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEnfer = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID:");

        jTextFieldID.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome:");

        jTextFieldNome.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Area:");

        jComboBoxArea.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBoxArea.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maternidade", "Primeiros Socorros" }));
        jComboBoxArea.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Bilhete de Identidade:");

        jFormattedTextFieldBI.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cell:");

        try {
            jFormattedTextFieldCell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+258) #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCell.setEnabled(false);

        jButtonPesquisar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonPesquisar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/procurar02.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTableEnfer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableEnfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEnferMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEnfer);

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconNew.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
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

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconDelete.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
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

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSair.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconCancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonExcluir)
                            .addComponent(jButtonEditar)
                            .addComponent(jButtonCancelar)
                            .addComponent(jButtonSair)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldBI)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldCell, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxArea, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisar)
                        .addGap(59, 59, 59)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCancelar, jButtonEditar, jButtonExcluir, jButtonNovo, jButtonSair, jButtonSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldBI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldCell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jButtonSair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonCancelar, jButtonEditar, jButtonExcluir, jButtonNovo, jButtonSair, jButtonSalvar});

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cadastro de Enfermeiro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel6)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(855, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldNome.setEnabled(true);
        jComboBoxArea.setEnabled(true);
        jFormattedTextFieldBI.setEnabled(true);
        jFormattedTextFieldCell.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jTextFieldPesq.setEnabled(false);
        jTextFieldID.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldBI.setText("");
        jFormattedTextFieldCell.setText("");
        jTextFieldPesq.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NOME!!!");
            jTextFieldNome.requestFocus();
        } else if (jFormattedTextFieldBI.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo BI!!!");
            jFormattedTextFieldBI.requestFocus();
        } else if (jFormattedTextFieldCell.getText().equals("(+258)          ")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CELL!!!");
            jFormattedTextFieldCell.requestFocus();
        } else if (flag == 1) {
            model.setNomeEnfer(jTextFieldNome.getText());
            model.setAreaEnfer((String) jComboBoxArea.getSelectedItem());
            model.setBiEnfer(jFormattedTextFieldBI.getText());
            model.setCellEnfer(jFormattedTextFieldCell.getText());
            enfer.Salvar(model);
            jTextFieldPesq.setEnabled(true);
            jButtonPesquisar.setEnabled(true);
            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jTextFieldNome.setEnabled(!true);
            jComboBoxArea.setEnabled(!true);
            jFormattedTextFieldBI.setEnabled(!true);
            jFormattedTextFieldCell.setEnabled(!true);
            jTextFieldNome.setText("");
            jFormattedTextFieldBI.setText("");
            jFormattedTextFieldCell.setText("");
            jTextFieldPesq.setText("");
            preencherTabela("select * from enfermeiro order by nome_enfer");
        } else {
            model.setCod_enfer(Integer.parseInt(jTextFieldID.getText()));
            model.setNomeEnfer(jTextFieldNome.getText());
            model.setAreaEnfer((String) jComboBoxArea.getSelectedItem());
            model.setBiEnfer(jFormattedTextFieldBI.getText());
            model.setCellEnfer(jFormattedTextFieldCell.getText());
            enfer.editar(model);
            jTextFieldPesq.setEnabled(true);
            jButtonPesquisar.setEnabled(true);
            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jTextFieldNome.setEnabled(!true);
            jComboBoxArea.setEnabled(!true);
            jFormattedTextFieldBI.setEnabled(!true);
            jFormattedTextFieldCell.setEnabled(!true);
            jTextFieldNome.setText("");
            jFormattedTextFieldBI.setText("");
            jFormattedTextFieldCell.setText("");
            jTextFieldPesq.setText("");
            preencherTabela("select * from enfermeiro order by nome_enfer");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jComboBoxArea.setEnabled(true);
        jFormattedTextFieldBI.setEnabled(true);
        jFormattedTextFieldCell.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jTextFieldPesq.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int excluir = JOptionPane.showConfirmDialog(null, "Deseja excluir os dados?", "Atencao", JOptionPane.YES_NO_OPTION);
        if (excluir == JOptionPane.YES_OPTION){
            model.setCod_enfer(Integer.parseInt(jTextFieldID.getText()));
            enfer.excluir(model);
            jTextFieldPesq.setEnabled(true);
            jButtonPesquisar.setEnabled(true);
            jTextFieldNome.setEnabled(!true);
            jComboBoxArea.setEnabled(!true);
            jFormattedTextFieldBI.setEnabled(!true);
            jFormattedTextFieldCell.setEnabled(!true);
            jTextFieldNome.setText("");
            jFormattedTextFieldBI.setText("");
            jFormattedTextFieldCell.setText("");
            jTextFieldPesq.setText("");
            preencherTabela("select * from enfermeiro order by nome_enfer");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldPesq.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jTextFieldNome.setEnabled(!true);
        jComboBoxArea.setEnabled(!true);
        jFormattedTextFieldBI.setEnabled(!true);
        jFormattedTextFieldCell.setEnabled(!true);
        jTextFieldNome.setText("");
        jFormattedTextFieldBI.setText("");
        jFormattedTextFieldCell.setText("");
        jTextFieldPesq.setText("");
        preencherTabela("select * from enfermeiro order by nome_enfer");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        model.setPesquisa(jTextFieldPesq.getText());
        BeansEnfermeiro mod = enfer.pesquisar(model);
        jTextFieldID.setText(String.valueOf(mod.getCod_enfer()));
        jTextFieldNome.setText(mod.getNomeEnfer());
        jComboBoxArea.setSelectedItem(mod.getAreaEnfer());
        jFormattedTextFieldBI.setText(String.valueOf(mod.getBiEnfer()));
        jFormattedTextFieldCell.setText(String.valueOf(mod.getCellEnfer()));  
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldNome.setEnabled(!true);
        jComboBoxArea.setEnabled(!true);
        jFormattedTextFieldBI.setEnabled(!true);
        jFormattedTextFieldCell.setEnabled(!true);
        preencherTabela("select * from enfermeiro where nome_enfer like '%"+mod.getPesquisa()+"%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableEnferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEnferMouseClicked
        try {
            String nome_enfermeiro = ""+jTableEnfer.getValueAt(jTableEnfer.getSelectedRow(), 1);
            connect.conexao();
            connect.executaSql("select * from enfermeiro where nome_enfer = '" + nome_enfermeiro + "'");
            connect.rs.first();
            jTextFieldID.setText(String.valueOf(connect.rs.getInt("id_enfer")));
            jTextFieldNome.setText(connect.rs.getString("nome_enfer"));
            jComboBoxArea.setSelectedItem(connect.rs.getString("area_enfer"));
            jFormattedTextFieldBI.setText(connect.rs.getString("bi_enfer"));
            jFormattedTextFieldCell.setText(connect.rs.getString("cell_enfer"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados:\n" +ex.getMessage());                                                       
        }
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
        jTextFieldPesq.setEnabled(true);
        jTextFieldNome.setEnabled(!true);
        jComboBoxArea.setEnabled(!true);
        jFormattedTextFieldBI.setEnabled(!true);
        jFormattedTextFieldCell.setEnabled(!true);
        connect.desconectar();
    }//GEN-LAST:event_jTableEnferMouseClicked

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID","Nome","Area","BI","Cell"};
        connect.conexao();
        connect.executaSql(Sql);
        
        try {
            connect.rs.first();
            do {                
                dados.add(new Object[]{connect.rs.getInt("id_enfer"),
                    connect.rs.getString("nome_enfer"),connect.rs.getString("area_enfer"),
                    connect.rs.getString("bi_enfer"),connect.rs.getString("cell_enfer")});
            } while (connect.rs.next());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tente Novamente");
            jTextFieldPesq.setText("");
            jTextFieldPesq.requestFocus();
        }
        
        ModelTable model = new ModelTable(dados, colunas);
        jTableEnfer.setModel(model);
        jTableEnfer.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableEnfer.getColumnModel().getColumn(0).setResizable(false);
        jTableEnfer.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableEnfer.getColumnModel().getColumn(1).setResizable(false);
        jTableEnfer.getColumnModel().getColumn(2).setPreferredWidth(145);
        jTableEnfer.getColumnModel().getColumn(2).setResizable(false);
        jTableEnfer.getColumnModel().getColumn(3).setPreferredWidth(112);
        jTableEnfer.getColumnModel().getColumn(3).setResizable(false);
        jTableEnfer.getColumnModel().getColumn(4).setPreferredWidth(125);
        jTableEnfer.getColumnModel().getColumn(4).setResizable(false);
        jTableEnfer.getTableHeader().setReorderingAllowed(false);
        jTableEnfer.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableEnfer.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(TelaEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEnfermeiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxArea;
    private javax.swing.JFormattedTextField jFormattedTextFieldBI;
    private javax.swing.JFormattedTextField jFormattedTextFieldCell;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEnfer;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesq;
    // End of variables declaration//GEN-END:variables
}
