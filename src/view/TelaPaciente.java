
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import modelBeans.BeansPaciente;
import modelBeans.ModelTable;
import modelConexao.ConexaoDb;
import modelDao.DaoPaciente;

/**
 *
 * @author Belmiro-Mungoi
 */
public class TelaPaciente extends javax.swing.JFrame {
    ConexaoDb connect = new ConexaoDb();
    BeansPaciente model = new BeansPaciente();
    DaoPaciente control = new DaoPaciente();
    int flag = 0;
    
    public TelaPaciente() {
        initComponents();
        exibirBairro();
        preencherTabela("select id_paciente, nome_paciente, bi_paciente, cell_paciente, nome_bairro, rua_paciente from paciente inner join bairro on pac_bairro = cod_bairro order by nome_paciente");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldBI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCasa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldQuar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonSalvar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jTextFieldPesq = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePac = new javax.swing.JTable();
        jFormattedTextFieldNasc = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jFormattedTextFieldCell = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome:");

        jTextFieldNome.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Data de Nascimento:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("BI:");

        jTextFieldBI.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contacto:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Endereco:");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Rua:");

        jTextFieldRua.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Casa Nr:");

        jTextFieldCasa.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Quarteirao:");

        jTextFieldQuar.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Bairro:");

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldQuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSave.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

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

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconCancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSair.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/procurar02.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
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

        try {
            jFormattedTextFieldNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldNasc.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ID:");

        jTextFieldID.setEnabled(false);

        try {
            jFormattedTextFieldCell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+258) #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCell.setEnabled(false);
        jFormattedTextFieldCell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCellActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSair)
                            .addComponent(jButtonCancelar)
                            .addComponent(jButtonExcluir)
                            .addComponent(jButtonEditar)
                            .addComponent(jButtonNovo)
                            .addComponent(jButtonSalvar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesq)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisar)
                                .addGap(78, 78, 78))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBI, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jFormattedTextFieldCell, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCancelar, jButtonEditar, jButtonExcluir, jButtonNovo, jButtonSair, jButtonSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextFieldNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldBI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldCell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPesquisar)
                            .addComponent(jTextFieldPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
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
                        .addComponent(jButtonSair)))
                .addGap(17, 17, 17))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastro de Paciente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(850, 681));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void exibirBairro() {
        connect.conexao();
        connect.executaSql("select * from bairro order by nome_bairro");
        try {
            connect.rs.first();
            jComboBox1.removeAllItems();
            do {                
                jComboBox1.addItem(connect.rs.getString("nome_bairro"));
            } while (connect.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir bairros" + ex);
        }
        connect.desconectar();
    }
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldNasc.setEnabled(true);
        jTextFieldBI.setEnabled(true);
        jFormattedTextFieldCell.setEnabled(true);
        jTextFieldRua.setEnabled(true);
        jTextFieldQuar.setEnabled(true);
        jTextFieldCasa.setEnabled(true);
        jComboBox1.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jTextFieldPesq.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldNome.setText("");
        jFormattedTextFieldNasc.setText("");
        jTextFieldBI.setText("");
        jFormattedTextFieldCell.setText("");
        jTextFieldRua.setText("");
        jTextFieldQuar.setText("");
        jTextFieldCasa.setText("");
        jTextFieldID.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NOME!!!");
            jTextFieldNome.requestFocus();
        } else if (jFormattedTextFieldNasc.getText().equals("  /  /    ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo NASCIMENTO!!!");
            jFormattedTextFieldNasc.requestFocus();
        } else if (jFormattedTextFieldCell.getText().equals("(+258)          ")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CELL!!!");
            jFormattedTextFieldCell.requestFocus();
        } else if (flag == 1) {
            model.setNome_pac(jTextFieldNome.getText());
            model.setNasc_pac(jFormattedTextFieldNasc.getText());
            model.setBi_pac(jTextFieldBI.getText());
            model.setCell_pac(jFormattedTextFieldCell.getText());
            model.setRua_pac(jTextFieldRua.getText());
            model.setQuar_pac(jTextFieldQuar.getText());
            model.setCasa_pac(jTextFieldCasa.getText());
            model.setBairro_pac((String) jComboBox1.getSelectedItem());
            //model.setCod_pac(Integer.parseInt(jTextFieldID.getText()));
            control.Salvar(model);
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldNasc.setEnabled(false);
            jTextFieldBI.setEnabled(false);
            jFormattedTextFieldCell.setEnabled(false);
            jTextFieldRua.setEnabled(false);
            jTextFieldQuar.setEnabled(false);
            jTextFieldCasa.setEnabled(false);
            jComboBox1.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jTextFieldPesq.setEnabled(true);
            jButtonPesquisar.setEnabled(true);
            jButtonNovo.setEnabled(true);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jTextFieldNome.setText("");
            jFormattedTextFieldNasc.setText("");
            jTextFieldBI.setText("");
            jFormattedTextFieldCell.setText("");
            jTextFieldRua.setText("");
            jTextFieldQuar.setText("");
            jTextFieldCasa.setText("");
            jTextFieldID.setText("");
            preencherTabela("select id_paciente, nome_paciente, bi_paciente, cell_paciente, nome_bairro, rua_paciente from paciente inner join bairro on pac_bairro = cod_bairro order by nome_paciente");
        } else {
            model.setNome_pac(jTextFieldNome.getText());
            model.setNasc_pac(jFormattedTextFieldNasc.getText());
            model.setBi_pac(jTextFieldBI.getText());
            model.setCell_pac(jFormattedTextFieldCell.getText());
            model.setRua_pac(jTextFieldRua.getText());
            model.setQuar_pac(jTextFieldQuar.getText());
            model.setCasa_pac(jTextFieldCasa.getText());
            model.setBairro_pac((String) jComboBox1.getSelectedItem());
            model.setCod_pac(Integer.parseInt(jTextFieldID.getText()));
            control.editar(model);
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldNasc.setEnabled(false);
            jTextFieldBI.setEnabled(false);
            jFormattedTextFieldCell.setEnabled(false);
            jTextFieldRua.setEnabled(false);
            jTextFieldQuar.setEnabled(false);
            jTextFieldCasa.setEnabled(false);
            jComboBox1.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jTextFieldPesq.setEnabled(true);
            jButtonPesquisar.setEnabled(true);
            jButtonNovo.setEnabled(true);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jTextFieldNome.setText("");
            jFormattedTextFieldNasc.setText("");
            jTextFieldBI.setText("");
            jFormattedTextFieldCell.setText("");
            jTextFieldRua.setText("");
            jTextFieldQuar.setText("");
            jTextFieldCasa.setText("");
            jTextFieldID.setText("");
            preencherTabela("select id_paciente, nome_paciente, bi_paciente, cell_paciente, nome_bairro, rua_paciente from paciente inner join bairro on pac_bairro = cod_bairro order by nome_paciente");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldNasc.setEnabled(true);
        jTextFieldBI.setEnabled(true);
        jFormattedTextFieldCell.setEnabled(true);
        jTextFieldRua.setEnabled(true);
        jTextFieldQuar.setEnabled(true);
        jTextFieldCasa.setEnabled(true);
        jComboBox1.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jTextFieldPesq.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int excluir = JOptionPane.showConfirmDialog(null, "Deseja excluir paciente?", "Atencao", JOptionPane.YES_NO_OPTION);
        if (excluir == JOptionPane.YES_OPTION) {
            model.setCod_pac(Integer.parseInt(jTextFieldID.getText()));
            control.excluir(model);
            jTextFieldNome.setEnabled(false);
        jFormattedTextFieldNasc.setEnabled(false);
        jTextFieldBI.setEnabled(false);
        jFormattedTextFieldCell.setEnabled(false);
        jTextFieldRua.setEnabled(false);
        jTextFieldQuar.setEnabled(false);
        jTextFieldCasa.setEnabled(false);
        jComboBox1.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jTextFieldPesq.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldNome.setText("");
        jFormattedTextFieldNasc.setText("");
        jTextFieldBI.setText("");
        jFormattedTextFieldCell.setText("");
        jTextFieldRua.setText("");
        jTextFieldQuar.setText("");
        jTextFieldCasa.setText("");
        jTextFieldID.setText("");
        preencherTabela("select id_paciente, nome_paciente, bi_paciente, cell_paciente, nome_bairro, rua_paciente from paciente inner join bairro on pac_bairro = cod_bairro order by nome_paciente");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(false);
        jFormattedTextFieldNasc.setEnabled(false);
        jTextFieldBI.setEnabled(false);
        jFormattedTextFieldCell.setEnabled(false);
        jTextFieldRua.setEnabled(false);
        jTextFieldQuar.setEnabled(false);
        jTextFieldCasa.setEnabled(false);
        jComboBox1.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jTextFieldPesq.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldNome.setText("");
        jFormattedTextFieldNasc.setText("");
        jTextFieldBI.setText("");
        jFormattedTextFieldCell.setText("");
        jTextFieldRua.setText("");
        jTextFieldQuar.setText("");
        jTextFieldCasa.setText("");
        jTextFieldID.setText("");
        jTextFieldPesq.setText("");
        preencherTabela("select id_paciente, nome_paciente, bi_paciente, cell_paciente, nome_bairro, rua_paciente from paciente inner join bairro on pac_bairro = cod_bairro order by nome_paciente");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        model.setPesquisa(jTextFieldPesq.getText());
        BeansPaciente mod = control.pesquisarPac(model);
        jTextFieldNome.setText(mod.getNome_pac());
        jFormattedTextFieldNasc.setText((mod.getNasc_pac()));
        jTextFieldBI.setText(mod.getBi_pac());
        jFormattedTextFieldCell.setText(mod.getCell_pac());
        jTextFieldID.setText(String.valueOf(mod.getCod_pac()));
        jTextFieldQuar.setText(mod.getQuar_pac());
        jTextFieldCasa.setText(mod.getCasa_pac());
        jComboBox1.setSelectedItem(mod.getBairro_pac());
        jTextFieldNome.setEnabled(false);
        jFormattedTextFieldNasc.setEnabled(false);
        jTextFieldBI.setEnabled(false);
        jFormattedTextFieldCell.setEnabled(false);
        jTextFieldRua.setEnabled(false);
        jTextFieldQuar.setEnabled(false);
        jTextFieldCasa.setEnabled(false);
        jComboBox1.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        preencherTabela("select id_paciente, nome_paciente, bi_paciente, cell_paciente, nome_bairro, rua_paciente from paciente inner join bairro on pac_bairro = cod_bairro where nome_paciente like '%"+mod.getPesquisa()+"%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTablePacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacMouseClicked
        try {
            String nome_pac = ""+jTablePac.getValueAt(jTablePac.getSelectedRow(), 1);
            connect.conexao();
            connect.executaSql("select * from paciente where nome_paciente = '" + nome_pac + "'");
            connect.rs.first();
            jTextFieldID.setText(String.valueOf(connect.rs.getInt("id_paciente")));
            jTextFieldNome.setText(connect.rs.getString("nome_paciente"));
            jFormattedTextFieldCell.setText(connect.rs.getString("cell_paciente"));        
            jFormattedTextFieldNasc.setText(String.valueOf(connect.rs.getInt("nasc_paciente")));
            jTextFieldBI.setText(connect.rs.getString("bi_paciente"));
            jTextFieldRua.setText(connect.rs.getString("rua_paciente"));
            jTextFieldQuar.setText(connect.rs.getString("quar_paciente"));
            jTextFieldCasa.setText(connect.rs.getString("casa_paciente"));
            ConexaoDb conPesq = new ConexaoDb();
            conPesq.conexao();
            conPesq.executaSql("select * from bairro where cod_bairro ="+connect.rs.getInt("pac_bairro"));
            conPesq.rs.first();
            jComboBox1.setSelectedItem(conPesq.rs.getString("nome_bairro"));
            conPesq.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados:\n" +ex.getMessage());                                                       
        }
        jTextFieldNome.setEnabled(false);
        jFormattedTextFieldNasc.setEnabled(false);
        jTextFieldBI.setEnabled(false);
        jFormattedTextFieldCell.setEnabled(false);
        jTextFieldRua.setEnabled(false);
        jTextFieldQuar.setEnabled(false);
        jTextFieldCasa.setEnabled(false);
        jComboBox1.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jTextFieldPesq.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        connect.desconectar();
    }//GEN-LAST:event_jTablePacMouseClicked

    private void jFormattedTextFieldCellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCellActionPerformed

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
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        }
        
        ModelTable model = new ModelTable(dados, colunas);
        jTablePac.setModel(model);
        jTablePac.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTablePac.getColumnModel().getColumn(0).setResizable(false);
        jTablePac.getColumnModel().getColumn(1).setPreferredWidth(170);
        jTablePac.getColumnModel().getColumn(1).setResizable(false);
        jTablePac.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTablePac.getColumnModel().getColumn(2).setResizable(false);
        jTablePac.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTablePac.getColumnModel().getColumn(3).setResizable(false);
        jTablePac.getColumnModel().getColumn(4).setPreferredWidth(110);
        jTablePac.getColumnModel().getColumn(4).setResizable(false);
        jTablePac.getColumnModel().getColumn(5).setPreferredWidth(120);
        jTablePac.getColumnModel().getColumn(5).setResizable(false);
        jTablePac.getTableHeader().setReorderingAllowed(false);
        jTablePac.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
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
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPaciente().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextFieldCell;
    private javax.swing.JFormattedTextField jFormattedTextFieldNasc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePac;
    private javax.swing.JTextField jTextFieldBI;
    private javax.swing.JTextField jTextFieldCasa;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesq;
    private javax.swing.JTextField jTextFieldQuar;
    private javax.swing.JTextField jTextFieldRua;
    // End of variables declaration//GEN-END:variables
}
