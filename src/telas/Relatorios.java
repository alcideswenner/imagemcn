/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import imagemcn.dados.RegistroDao;
import imagemcn.dados.TableModel;

public class Relatorios extends javax.swing.JDialog {

    public TableModel model;
    String consultas[] = {"CARDIOLOGISTA", "GASTRO", "GINECOLOGISTA", "", "ORTOPEDISTA", "PEDIATRA", "PROCTOLOGISTA"};
    String exames[] = {"ELETROCARDIOGRAMA", "MAMOGRAFIA", "RADIOGRAFIA", "ULTRASSONOGRAFIA"};
    boolean exame = false;
    boolean consulta = false;
    boolean mes = false;
    boolean ano = false;
    boolean cid = false;

    public Relatorios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        RegistroDao dao = new RegistroDao();

        model = new TableModel(dao.listar("SELECT * FROM REGISTROS"));
        jTable1.setModel(model);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(55);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(210);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(370);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(115);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(38);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(75);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(85);
        jTable1.getColumnModel().getColumn(10).setPreferredWidth(115);
        jTable1.getColumnModel().getColumn(11).setPreferredWidth(135);
        jTable1.getColumnModel().getColumn(12).setPreferredWidth(115);
        setLocationRelativeTo(this);
    }

    public String geraMes(String data) {
        String mes[] = data.split("/");
        return mes[1];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        exameRadio = new javax.swing.JRadioButton();
        escolhaCombo = new javax.swing.JComboBox<>();
        consultaRadio = new javax.swing.JRadioButton();
        profissionalLabel = new javax.swing.JLabel();
        mesCombo = new javax.swing.JComboBox<>();
        exame_consulta = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mesLabel = new javax.swing.JLabel();
        jlabel_prof = new javax.swing.JLabel();
        anoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        profissionalLabel1 = new javax.swing.JLabel();
        anoCombo = new javax.swing.JComboBox<>();
        cidCombo = new javax.swing.JComboBox<>();
        profissionalLabel2 = new javax.swing.JLabel();
        cidLabel = new javax.swing.JLabel();
        jlabel_prof1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nome_pesquisa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        qtd = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "SUS", "NOME", "DT.NASC.", "ID", "ENDEREÇO", "CIDADE", "UBS", "CONSULTA", "EXAME", "TIPO EXAME", "PROFISSIONAL", "DATA"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 133, 1122, 330));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        exameRadio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(exameRadio);
        exameRadio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exameRadio.setForeground(new java.awt.Color(255, 0, 0));
        exameRadio.setText("Exames");
        exameRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exameRadioActionPerformed(evt);
            }
        });

        escolhaCombo.setBackground(new java.awt.Color(3, 117, 186));
        escolhaCombo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        escolhaCombo.setForeground(new java.awt.Color(255, 0, 0));
        escolhaCombo.setBorder(null);
        escolhaCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                escolhaComboItemStateChanged(evt);
            }
        });
        escolhaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaComboActionPerformed(evt);
            }
        });

        consultaRadio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(consultaRadio);
        consultaRadio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        consultaRadio.setForeground(new java.awt.Color(255, 0, 0));
        consultaRadio.setText("Consultas");
        consultaRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaRadioActionPerformed(evt);
            }
        });

        profissionalLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profissionalLabel.setForeground(new java.awt.Color(255, 0, 0));
        profissionalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profissionalLabel.setText("Mês");

        mesCombo.setBackground(new java.awt.Color(3, 117, 186));
        mesCombo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        mesCombo.setForeground(new java.awt.Color(255, 0, 0));
        mesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        mesCombo.setBorder(null);
        mesCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesComboActionPerformed(evt);
            }
        });

        exame_consulta.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        exame_consulta.setForeground(new java.awt.Color(255, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText(">");

        mesLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        mesLabel.setForeground(new java.awt.Color(255, 0, 0));

        jlabel_prof.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jlabel_prof.setForeground(new java.awt.Color(255, 0, 0));
        jlabel_prof.setText(">");

        anoLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        anoLabel.setForeground(new java.awt.Color(255, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rela.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Relatórios");

        profissionalLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profissionalLabel1.setForeground(new java.awt.Color(255, 0, 0));
        profissionalLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profissionalLabel1.setText("Ano");

        anoCombo.setForeground(new java.awt.Color(255, 0, 0));
        anoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020" }));
        anoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoComboActionPerformed(evt);
            }
        });

        cidCombo.setForeground(new java.awt.Color(255, 0, 0));
        cidCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));
        cidCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidComboActionPerformed(evt);
            }
        });

        profissionalLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profissionalLabel2.setForeground(new java.awt.Color(255, 0, 0));
        profissionalLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profissionalLabel2.setText("Cid");

        cidLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cidLabel.setForeground(new java.awt.Color(255, 0, 0));

        jlabel_prof1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jlabel_prof1.setForeground(new java.awt.Color(255, 0, 0));
        jlabel_prof1.setText(">");

        jButton1.setText("IR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(escolhaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exameRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(consultaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(mesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(profissionalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(anoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(cidCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(profissionalLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profissionalLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(61, 61, 61)
                        .addComponent(exame_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)
                        .addComponent(mesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jlabel_prof)
                        .addGap(12, 12, 12)
                        .addComponent(anoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlabel_prof1)
                        .addGap(12, 12, 12)
                        .addComponent(cidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exameRadio)
                            .addComponent(consultaRadio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(escolhaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(profissionalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(profissionalLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(profissionalLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(anoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(exame_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(mesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlabel_prof)
                                .addComponent(anoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlabel_prof1)
                                .addComponent(cidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))))
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, -1, 97));

        nome_pesquisa.setBackground(new java.awt.Color(255, 153, 153));
        nome_pesquisa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nome_pesquisa.setBorder(null);
        nome_pesquisa.setOpaque(false);
        jPanel1.add(nome_pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 393, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Paciente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 390, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton2.setText("PESQUISAR");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        jLabel4.setText("Quantidade de resultados obtidos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(qtd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exameRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exameRadioActionPerformed
        if (escolhaCombo.getItemCount() == 0) {
            escolhaCombo.addItem("ELETROCARDIOGRAMA");
            escolhaCombo.addItem("MAMOGRAFIA");
            escolhaCombo.addItem("RADIOGRAFIA");
            escolhaCombo.addItem("ULTRASSONOGRAFIA");
        } else {
            escolhaCombo.removeAllItems();
            escolhaCombo.addItem("ELETROCARDIOGRAMA");
            escolhaCombo.addItem("MAMOGRAFIA");
            escolhaCombo.addItem("RADIOGRAFIA");
            escolhaCombo.addItem("ULTRASSONOGRAFIA");
        }
    }//GEN-LAST:event_exameRadioActionPerformed

    private void escolhaComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_escolhaComboItemStateChanged

    }//GEN-LAST:event_escolhaComboItemStateChanged

    private void escolhaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaComboActionPerformed
        if (escolhaCombo.getItemCount() == 4) {
            exame_consulta.setText(escolhaCombo.getSelectedItem().toString());
            exame = true;
        } else if (escolhaCombo.getItemCount() == 6) {
            exame_consulta.setText(escolhaCombo.getSelectedItem().toString());
            consulta = true;
        }

    }//GEN-LAST:event_escolhaComboActionPerformed

    private void consultaRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaRadioActionPerformed
        if (escolhaCombo.getItemCount() == 0) {
            escolhaCombo.addItem("CARDIOLOGISTA");
            escolhaCombo.addItem("GASTRO");
            escolhaCombo.addItem("GINECOLOGISTA");
            escolhaCombo.addItem("ORTOPEDISTA");
            escolhaCombo.addItem("PEDIATRA");
            escolhaCombo.addItem("PROCTOLOGISTA");
        } else {
            escolhaCombo.removeAllItems();
            escolhaCombo.addItem("CARDIOLOGISTA");
            escolhaCombo.addItem("GASTRO");
            escolhaCombo.addItem("GINECOLOGISTA");
            escolhaCombo.addItem("ORTOPEDISTA");
            escolhaCombo.addItem("PEDIATRA");
            escolhaCombo.addItem("PROCTOLOGISTA");
        }
    }//GEN-LAST:event_consultaRadioActionPerformed

    private void mesComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesComboActionPerformed
        mesLabel.setText(mesCombo.getSelectedItem().toString());
        mes = true;
    }//GEN-LAST:event_mesComboActionPerformed

    private void anoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoComboActionPerformed
        anoLabel.setText(anoCombo.getSelectedItem().toString());
        ano = true;

    }//GEN-LAST:event_anoComboActionPerformed

    private void cidComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidComboActionPerformed
        cidLabel.setText(cidCombo.getSelectedItem().toString());
        cid = true;
    }//GEN-LAST:event_cidComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RegistroDao dao = new RegistroDao();
        if (consulta == true && mes == true && ano == true && cid == true) {
            model = new TableModel(dao.listar("select * from registros where YEAR(str_to_date(data,'%d/%m/%Y'))='" + anoLabel.getText() + "' and consulta='" + exame_consulta.getText() + "' and MONTH(str_to_date(data,'%d/%m/%Y'))='" + mesLabel.getText() + "' and cidade='" + cidLabel.getText() + "'"));

        }

        if (exame == true && mes == true && ano == true && cid == true) {
            model = new TableModel(dao.listar("select * from registros where YEAR(str_to_date(data,'%d/%m/%Y'))='" + anoLabel.getText() + "' and exame='" + exame_consulta.getText() + "' and MONTH(str_to_date(data,'%d/%m/%Y'))='" + mesLabel.getText() + "' and cidade='" + cidLabel.getText() + "'"));

        }

        jTable1.setModel(model);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(55);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(210);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(370);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(115);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(38);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(75);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(85);
        jTable1.getColumnModel().getColumn(10).setPreferredWidth(115);
        jTable1.getColumnModel().getColumn(11).setPreferredWidth(135);
        jTable1.getColumnModel().getColumn(12).setPreferredWidth(115);
        qtd.setText(jTable1.getRowCount() + "");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RegistroDao dao = new RegistroDao();
        model = new TableModel(dao.listar("SELECT * FROM REGISTROS WHERE nome LIKE '%" + nome_pesquisa.getText() + "%'"));
        jTable1.setModel(model);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(55);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(210);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(370);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(115);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(38);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(75);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(85);
        jTable1.getColumnModel().getColumn(10).setPreferredWidth(115);
        jTable1.getColumnModel().getColumn(11).setPreferredWidth(135);
        jTable1.getColumnModel().getColumn(12).setPreferredWidth(115);

        qtd.setText("" + dao.contador("SELECT COUNT(*) FROM registros where nome LIKE '%" + nome_pesquisa.getText() + "%'"));
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Relatorios dialog = new Relatorios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anoCombo;
    private javax.swing.JLabel anoLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cidCombo;
    private javax.swing.JLabel cidLabel;
    private javax.swing.JRadioButton consultaRadio;
    private javax.swing.JComboBox<String> escolhaCombo;
    private javax.swing.JRadioButton exameRadio;
    private javax.swing.JLabel exame_consulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlabel_prof;
    private javax.swing.JLabel jlabel_prof1;
    private javax.swing.JComboBox<String> mesCombo;
    private javax.swing.JLabel mesLabel;
    private javax.swing.JTextField nome_pesquisa;
    private javax.swing.JLabel profissionalLabel;
    private javax.swing.JLabel profissionalLabel1;
    private javax.swing.JLabel profissionalLabel2;
    private javax.swing.JLabel qtd;
    // End of variables declaration//GEN-END:variables
}
