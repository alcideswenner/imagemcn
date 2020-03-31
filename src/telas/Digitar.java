package telas;

import imagemcn.dados.Registro;
import imagemcn.dados.RegistroDao;
import imagemcn.dados.Scrol;
import imagemcn.dados.Usuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author centr
 */
public class Digitar extends javax.swing.JDialog {

    DefaultTableModel model;
    String consultas[] = {"CARDIOLOGISTA", "GASTRO", "GINECOLOGISTA", "", "ORTOPEDISTA", "PEDIATRA", "PROCTOLOGISTA"};
    String exames[] = {"ELETROCARDIOGRAMA", "MAMOGRAFIA", "RADIOGRAFIA", "ULTRASSONOGRAFIA"};
    String[] UBS = new String[]{"AFONSO CUNHA", "ANIL", "BONFIM", "BURITI", "CENTRO DE IMAGEM", "DANIEL GUANABARA", "DUQUE BACELAR", "MONTE ALEGRE", "QUIABOS", "SANTA MARIA", "SANTO ANTONIO", "SAO FRANCISCO", "SAO JUDAS TADEU", "SARNEY", "URGENCIA"};

    public Digitar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        profissionalCombo.setVisible(false);
        profissionalLabel.setVisible(false);
        desabilitaHabilitaCampos(false);
        System.out.println(geraData());
        data.setText(geraData());
        setLocationRelativeTo(this);
        configCampos();
        listar();

        S_SUS.setMnemonic(KeyEvent.VK_ALT);
    }

    public void verificaCampos(String tipo) {

    }

    public void listar() {
        RegistroDao dao = new RegistroDao();
        model = (DefaultTableModel) jTable1.getModel();
        for (Registro r : dao.listar("SELECT * FROM registros")) {
            Object dados[] = {r.getCod(), r.getUsuario().getSus(), r.getUsuario().getNome(), r.getUsuario().getDn(), r.getUsuario().getEndereco(), r.getUsuario().getCidade(), r.getData(), r.getConsulta(), r.getExame(), r.getTipo_exame(), r.getProfisional()};
            model.addRow(dados);
        }
    }

    public void configCampos() {

        susText.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a)
                    throws BadLocationException {
                super.insertString(offs, str.toUpperCase(), a);
            }
        });
        nomeText.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a)
                    throws BadLocationException {
                super.insertString(offs, str.toUpperCase(), a);
            }
        });
        dnText.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a)
                    throws BadLocationException {
                super.insertString(offs, str.toUpperCase(), a);
            }
        });
        enderecoText.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a)
                    throws BadLocationException {
                super.insertString(offs, str.toUpperCase(), a);
            }
        });
        cidText.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a)
                    throws BadLocationException {
                super.insertString(offs, str.toUpperCase(), a);
            }
        });
        tipo_exameText.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a)
                    throws BadLocationException {
                super.insertString(offs, str.toUpperCase(), a);
            }
        });

    }

    static String opcoes(String[] escolhas) {
        String escolha = (String) JOptionPane.showInputDialog(
                null,
                "Escolha a UBS",
                "UBS",
                JOptionPane.PLAIN_MESSAGE,
                null,
                escolhas,
                escolhas[0]);
        return escolha;
    }

    public String geraData() {
        Calendar data = new GregorianCalendar();
        int dia = data.get(Calendar.DAY_OF_MONTH);
        int mes = (data.get(Calendar.MONTH) + 1);
        int ano = data.get(Calendar.YEAR);
        if (dia < 10 && mes < 10) {
            return "0" + dia + "/" + "0" + mes + "/" + ano;
        } else if (dia < 10) {
            return "0" + dia + "/" + "" + mes + "/" + ano;
        } else if (mes < 10) {
            return "" + dia + "/" + "0" + mes + "/" + ano;
        } else {
            return "" + dia + "/" + "" + mes + "/" + ano;
        }
    }

    public void desabilitaHabilitaCampos(boolean r) {
        susText.setEnabled(r);
        nomeText.setEnabled(r);
        dnText.setEnabled(r);
        enderecoText.setEnabled(r);
        cidText.setEnabled(r);
        tipo_exameText.setEnabled(r);
    }

    public void fazerBackup() {

    }

    public void limpaCampos() {
        susText.setText(null);
        nomeText.setText(null);
        dnText.setText(null);
        enderecoText.setText(null);
        cidText.setText(null);
        tipo_exameText.setText(null);
        susText.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        dnText.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        exameRadio = new javax.swing.JRadioButton();
        consultaRadio = new javax.swing.JRadioButton();
        escolhaCombo = new javax.swing.JComboBox<>();
        profissionalCombo = new javax.swing.JComboBox<>();
        profissionalLabel = new javax.swing.JLabel();
        exame_consulta = new javax.swing.JLabel();
        jlabel_prof = new javax.swing.JLabel();
        tipo_consulta_exame = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        profissional = new javax.swing.JLabel();
        data_escolhida = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        susText = new javax.swing.JFormattedTextField();
        nomeText = new javax.swing.JTextField();
        dnText = new javax.swing.JFormattedTextField();
        enderecoText = new javax.swing.JTextField();
        cidText = new javax.swing.JTextField();
        tipo_exameText = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        S_SUS = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(3, 117, 186));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastros");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Centro de Imagem");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, 1030, 23));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-calendário-35.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 36, -1));

        data.setBackground(new java.awt.Color(3, 117, 186));
        data.setBorder(null);
        data.setForeground(new java.awt.Color(255, 255, 255));
        try {
            data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data.setCaretColor(new java.awt.Color(255, 255, 255));
        data.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });
        jPanel2.add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 90, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 80, -1));

        exameRadio.setBackground(new java.awt.Color(3, 117, 186));
        buttonGroup1.add(exameRadio);
        exameRadio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exameRadio.setForeground(new java.awt.Color(255, 255, 255));
        exameRadio.setText("Exames");
        exameRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exameRadioActionPerformed(evt);
            }
        });
        jPanel2.add(exameRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, -1));

        consultaRadio.setBackground(new java.awt.Color(3, 117, 186));
        buttonGroup1.add(consultaRadio);
        consultaRadio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        consultaRadio.setForeground(new java.awt.Color(255, 255, 255));
        consultaRadio.setText("Consultas");
        consultaRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaRadioActionPerformed(evt);
            }
        });
        jPanel2.add(consultaRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 80, -1));

        escolhaCombo.setBackground(new java.awt.Color(3, 117, 186));
        escolhaCombo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
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
        jPanel2.add(escolhaCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, 30));

        profissionalCombo.setBackground(new java.awt.Color(3, 117, 186));
        profissionalCombo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        profissionalCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Regino", "Dra. Rosenilde", "Tec. Enfermagem", "Tec. Radiologia" }));
        profissionalCombo.setBorder(null);
        profissionalCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profissionalComboActionPerformed(evt);
            }
        });
        jPanel2.add(profissionalCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 62, 100, 29));

        profissionalLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profissionalLabel.setForeground(new java.awt.Color(255, 255, 255));
        profissionalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profissionalLabel.setText("Profissional");
        jPanel2.add(profissionalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 100, 30));

        exame_consulta.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        exame_consulta.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(exame_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 110, 20));

        jlabel_prof.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jlabel_prof.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_prof.setText(">");
        jPanel2.add(jlabel_prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        tipo_consulta_exame.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tipo_consulta_exame.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(tipo_consulta_exame, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 140, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(">");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        profissional.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        profissional.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(profissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 120, 20));

        data_escolhida.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        data_escolhida.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(data_escolhida, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, 80, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(3, 117, 186));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        susText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SUS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(3, 117, 186))); // NOI18N
        try {
            susText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.####.####.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        susText.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        susText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                susTextActionPerformed(evt);
            }
        });
        susText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                susTextKeyPressed(evt);
            }
        });
        jPanel3.add(susText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 45));

        nomeText.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nomeText.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(3, 117, 186)), "NOME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(3, 117, 186))); // NOI18N
        nomeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextActionPerformed(evt);
            }
        });
        nomeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeTextKeyPressed(evt);
            }
        });
        jPanel3.add(nomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 330, 45));

        dnText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DT.NASC.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(3, 117, 186))); // NOI18N
        try {
            dnText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dnText.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        dnText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dnTextKeyPressed(evt);
            }
        });
        jPanel3.add(dnText, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 80, 45));

        enderecoText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENDEREÇO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(3, 117, 186))); // NOI18N
        enderecoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enderecoTextKeyPressed(evt);
            }
        });
        jPanel3.add(enderecoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 200, 45));

        cidText.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cidText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(3, 117, 186))); // NOI18N
        cidText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidTextActionPerformed(evt);
            }
        });
        cidText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cidTextKeyPressed(evt);
            }
        });
        jPanel3.add(cidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 50, 45));

        tipo_exameText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO EXAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(3, 117, 186))); // NOI18N
        tipo_exameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_exameTextActionPerformed(evt);
            }
        });
        tipo_exameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tipo_exameTextKeyPressed(evt);
            }
        });
        jPanel3.add(tipo_exameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 200, 45));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(3, 117, 186));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 200, 20));

        S_SUS.setText("S\\SUS");
        S_SUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_SUSActionPerformed(evt);
            }
        });
        jPanel3.add(S_SUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTable1.setForeground(new java.awt.Color(3, 117, 186));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "SUS", "NOME", "DT.NASC.", "ENDEREÇO", "CID", "DATA", "CONSULTA", "EXAME", "TIPO EXAME", "PROFISSIONAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(20);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(35);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(35);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(35);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(175);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(8);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultaRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaRadioActionPerformed
        limpaCampos();
        profissionalCombo.setVisible(false);
        profissionalLabel.setVisible(false);
        desabilitaHabilitaCampos(false);
        tipo_exameText.setVisible(false);
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
        exame_consulta.setText("Consulta");
    }//GEN-LAST:event_consultaRadioActionPerformed

    private void susTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_susTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_susTextActionPerformed

    private void cidTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidTextActionPerformed

    }//GEN-LAST:event_cidTextActionPerformed
    public void escolheUbs() {

    }
    private void exameRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exameRadioActionPerformed
        limpaCampos();
        profissionalCombo.setVisible(true);
        profissionalLabel.setVisible(true);
        tipo_exameText.setVisible(true);
        desabilitaHabilitaCampos(false);
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
        exame_consulta.setText("Exame");
        jlabel_prof.setVisible(true);
        profissional.setVisible(true);
        profissionalCombo.requestFocus();
    }//GEN-LAST:event_exameRadioActionPerformed

    private void profissionalComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profissionalComboActionPerformed
        profissional.setText(profissionalCombo.getSelectedItem().toString());
        if (!profissionalCombo.getSelectedItem().toString().equals("")) {
            desabilitaHabilitaCampos(true);
        } else {
            desabilitaHabilitaCampos(false);
        }
        if (escolhaCombo.getSelectedItem().toString().equals("ELETROCARDIOGRAMA")) {
            tipo_exameText.setText("-");

        }
    }//GEN-LAST:event_profissionalComboActionPerformed

    private void escolhaComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_escolhaComboItemStateChanged

    }//GEN-LAST:event_escolhaComboItemStateChanged
    public void iniciar() {
        susText.requestFocus();
        S_SUS.setSelected(false);
    }
    private void escolhaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaComboActionPerformed
        if (escolhaCombo.getItemCount() == 4) {
            if (escolhaCombo.getSelectedItem().toString().equals("ELETROCARDIOGRAMA")) {
                tipo_exameText.setText("-");
            }

            jlabel_prof.setVisible(true);
            profissional.setVisible(true);
            tipo_consulta_exame.setText(escolhaCombo.getSelectedItem().toString());
            RegistroDao dao = new RegistroDao();
            model = (DefaultTableModel) jTable1.getModel();
            if (jTable1.getRowCount() == 0) {

            } else {
                model.setNumRows(0);
            }
            for (Registro r : dao.listar("SELECT * FROM registros WHERE data='" + data.getText() + "' and exame='" + escolhaCombo.getSelectedItem().toString() + "'")) {
                Object dados[] = {r.getCod(), r.getUsuario().getSus(), r.getUsuario().getNome(), r.getUsuario().getDn(), r.getUsuario().getEndereco(), r.getUsuario().getCidade(), r.getData(), r.getConsulta(), r.getExame(), r.getTipo_exame(), r.getProfisional()};
                model.addRow(dados);
            }
        } else if (escolhaCombo.getItemCount() == 6) {
            jlabel_prof.setVisible(false);
            profissional.setVisible(false);
            tipo_consulta_exame.setText(escolhaCombo.getSelectedItem().toString());
            desabilitaHabilitaCampos(true);
            RegistroDao dao = new RegistroDao();
            model = (DefaultTableModel) jTable1.getModel();
            if (jTable1.getRowCount() == 0) {

            } else {
                model.setNumRows(0);
            }
            for (Registro r : dao.listar("SELECT * FROM registros WHERE data='" + data.getText() + "' and consulta='" + escolhaCombo.getSelectedItem().toString() + "'")) {
                Object dados[] = {r.getCod(), r.getUsuario().getSus(), r.getUsuario().getNome(), r.getUsuario().getDn(), r.getUsuario().getEndereco(), r.getUsuario().getCidade(), r.getData(), r.getConsulta(), r.getExame(), r.getTipo_exame(), r.getProfisional()};
                model.addRow(dados);
            }
        }


    }//GEN-LAST:event_escolhaComboActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        data_escolhida.setText(data.getText());
        exameRadio.requestFocus();
        RegistroDao dao = new RegistroDao();
        model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getRowCount() == 0) {

        } else {
            model.setNumRows(0);
        }
        for (Registro r : dao.listar("SELECT * FROM registros WHERE data='" + data.getText() + "'")) {
            Object dados[] = {r.getCod(), r.getUsuario().getSus(), r.getUsuario().getNome(), r.getUsuario().getDn(), r.getUsuario().getEndereco(), r.getUsuario().getCidade(), r.getData(), r.getConsulta(), r.getExame(), r.getTipo_exame(), r.getProfisional()};
            model.addRow(dados);
        }
    }//GEN-LAST:event_dataActionPerformed

    private void tipo_exameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_exameTextActionPerformed

    }//GEN-LAST:event_tipo_exameTextActionPerformed
    int d = 0;

    public void AutoCompleta(String sus) {
        RegistroDao dao = new RegistroDao();
        for (Registro r : dao.listar("SELECT * FROM REGISTROS WHERE sus='" + sus + "'")) {
            nomeText.setText(r.getUsuario().getNome());
            dnText.setText(r.getUsuario().getDn());
            enderecoText.setText(r.getUsuario().getEndereco());
            cidText.setText(r.getUsuario().getCidade());
            d++;
        }
        if (d == 0) {
           
        }else{
             cidText.requestFocus();
        }
    }
    private void susTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_susTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            nomeText.requestFocus();
            AutoCompleta(susText.getText());

        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            if (tipo_exameText.isVisible()) {
                tipo_exameText.requestFocus();
            } else {
                cidText.requestFocus();
            }
        }
    }//GEN-LAST:event_susTextKeyPressed

    private void nomeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextActionPerformed

    private void nomeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            dnText.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            susText.requestFocus();
        }
    }//GEN-LAST:event_nomeTextKeyPressed

    private void dnTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dnTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            enderecoText.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            nomeText.requestFocus();
        }      // TODO add your handling code here:
    }//GEN-LAST:event_dnTextKeyPressed

    private void enderecoTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enderecoTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            cidText.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            dnText.requestFocus();
        }
    }//GEN-LAST:event_enderecoTextKeyPressed

    private void cidTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cidTextKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            enderecoText.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            if (tipo_exameText.isVisible()) {
                tipo_exameText.requestFocus();
            } else {
                susText.requestFocus();
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (susText.getText().length() != 18) {
                susText.requestFocus();
            }
            if (tipo_exameText.isVisible()) {

            } else {
                if (up == true) {
                    if (susText.getText().equals("") || nomeText.getText().equals("") || dnText.getText().equals("") || enderecoText.getText().equals("") || cidText.equals("")) {
                        susText.requestFocus();
                        JOptionPane.showMessageDialog(null, "Preencha os campos!");
                    } else {

                        String escolha = opcoes(UBS);
                        System.out.println("Selecionado: " + escolha);
                        RegistroDao dao = new RegistroDao();
                        Usuario u = new Usuario();
                        Registro r = new Registro();
                        u.setSus(susText.getText());
                        u.setNome(nomeText.getText());
                        u.setDn(dnText.getText());
                        u.setEndereco(enderecoText.getText());
                        u.setCidade(cidText.getText());
                        r.setUsuario(u);
                        r.setCod(cod);
                        r.setConsulta(escolhaCombo.getSelectedItem().toString());
                        r.setExame("NULL");
                        r.setData(data.getText());
                        r.setUbs(escolha);
                        r.setProfisional("NULL");
                        r.setTipo_exame("NULL");
                        System.out.println(dao.atualizar(r));
                        up = false;
                        jTable1.setSelectionBackground(new Color(0, 120, 215));
                        jTable1.setSelectionForeground(Color.white);
                        limpaCampos();
                        u.setSus(null);
                        u.setNome(null);
                        u.setDn(null);
                        u.setEndereco(null);
                        u.setCidade(null);
                        r.setUsuario(u);
                        r.setCod(0);
                        r.setConsulta(null);
                        r.setExame(null);
                        r.setData(null);
                        r.setUbs(escolha);
                        r.setProfisional(null);
                        r.setTipo_exame(null);
                        model = (DefaultTableModel) jTable1.getModel();
                        if (jTable1.getRowCount() == 0) {

                        } else {
                            model.setNumRows(0);
                        }
                        for (Registro r1 : dao.listar("SELECT * FROM registros WHERE data='" + data.getText() + "' and consulta='" + escolhaCombo.getSelectedItem().toString() + "'")) {
                            Object dados[] = {r1.getCod(), r1.getUsuario().getSus(), r1.getUsuario().getNome(), r1.getUsuario().getDn(), r1.getUsuario().getEndereco(), r1.getUsuario().getCidade(), r1.getData(), r1.getConsulta(), r1.getExame(), r1.getTipo_exame(), r1.getProfisional()};
                            model.addRow(dados);
                        }
                        iniciar();
                    }

                } else {
                    if (susText.getText().equals("") || nomeText.getText().equals("") || dnText.getText().equals("") || enderecoText.getText().equals("") || cidText.equals("")) {
                        susText.requestFocus();
                        JOptionPane.showMessageDialog(null, "Preencha os campos!");
                    } else {
                        String escolha = opcoes(UBS);
                        System.out.println("Selecionado: " + escolha);
                        RegistroDao dao = new RegistroDao();
                        Usuario u = new Usuario();
                        Registro r = new Registro();
                        u.setSus(susText.getText());
                        u.setNome(nomeText.getText());
                        u.setDn(dnText.getText());
                        u.setEndereco(enderecoText.getText());
                        u.setCidade(cidText.getText());
                        r.setUsuario(u);
                        r.setCod(0);
                        r.setConsulta(escolhaCombo.getSelectedItem().toString());
                        r.setExame("NULL");
                        r.setData(data.getText());
                        r.setUbs(escolha);
                        r.setProfisional("NULL");
                        r.setTipo_exame("NULL");
                        System.out.println(dao.salvar(r, "consulta"));
                        limpaCampos();
                        u.setSus(null);
                        u.setNome(null);
                        u.setDn(null);
                        u.setEndereco(null);
                        u.setCidade(null);
                        r.setUsuario(u);
                        r.setCod(0);
                        r.setConsulta(null);
                        r.setExame(null);
                        r.setData(null);
                        r.setUbs(escolha);
                        r.setProfisional(null);
                        r.setTipo_exame(null);
                        model = (DefaultTableModel) jTable1.getModel();
                        if (jTable1.getRowCount() == 0) {

                        } else {
                            model.setNumRows(0);
                        }
                        for (Registro r1 : dao.listar("SELECT * FROM registros WHERE data='" + data.getText() + "' and consulta='" + escolhaCombo.getSelectedItem().toString() + "'")) {
                            Object dados[] = {r1.getCod(), r1.getUsuario().getSus(), r1.getUsuario().getNome(), r1.getUsuario().getDn(), r1.getUsuario().getEndereco(), r1.getUsuario().getCidade(), r1.getData(), r1.getConsulta(), r1.getExame(), r1.getTipo_exame(), r1.getProfisional()};
                            model.addRow(dados);
                        }
                        iniciar();
                        Scrol.selectAndScroll(jTable1, jTable1.getRowCount() - 1);
                    }

                }

            }
        }
    }//GEN-LAST:event_cidTextKeyPressed

    private void tipo_exameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipo_exameTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            susText.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            cidText.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (up == true) {
                if (susText.getText().equals("") || nomeText.getText().equals("") || dnText.getText().equals("") || enderecoText.getText().equals("") || cidText.equals("") || tipo_exameText.getText().equals("")) {
                    susText.requestFocus();
                    JOptionPane.showMessageDialog(null, "Preencha os campos!");
                } else {
                    String escolha = opcoes(UBS);
                    System.out.println("Selecionado: " + escolha);
                    RegistroDao dao = new RegistroDao();
                    Usuario u = new Usuario();
                    Registro r = new Registro();
                    u.setSus(susText.getText());
                    u.setNome(nomeText.getText());
                    u.setDn(dnText.getText());
                    u.setEndereco(enderecoText.getText());
                    u.setCidade(cidText.getText());
                    r.setUsuario(u);
                    r.setCod(cod);
                    r.setConsulta("NULL");
                    r.setExame(escolhaCombo.getSelectedItem().toString());
                    r.setData(data.getText());
                    r.setUbs(escolha);
                    r.setProfisional(profissionalCombo.getSelectedItem().toString());
                    r.setTipo_exame(tipo_exameText.getText());
                    System.out.println(dao.atualizar(r));
                    up = false;
                    jTable1.setSelectionBackground(new Color(0, 120, 215));
                    jTable1.setSelectionForeground(Color.white);
                    limpaCampos();
                    u.setSus(null);
                    u.setNome(null);
                    u.setDn(null);
                    u.setEndereco(null);
                    u.setCidade(null);
                    r.setUsuario(u);
                    r.setCod(0);
                    r.setConsulta(null);
                    r.setExame(null);
                    r.setData(null);
                    r.setUbs(escolha);
                    r.setProfisional(null);
                    r.setTipo_exame(null);
                    model = (DefaultTableModel) jTable1.getModel();
                    if (jTable1.getRowCount() == 0) {

                    } else {
                        model.setNumRows(0);
                    }
                    for (Registro r1 : dao.listar("SELECT * FROM registros WHERE data='" + data.getText() + "' and exame='" + escolhaCombo.getSelectedItem().toString() + "'")) {
                        Object dados[] = {r1.getCod(), r1.getUsuario().getSus(), r1.getUsuario().getNome(), r1.getUsuario().getDn(), r1.getUsuario().getEndereco(), r1.getUsuario().getCidade(), r1.getData(), r1.getConsulta(), r1.getExame(), r1.getTipo_exame(), r1.getProfisional()};
                        model.addRow(dados);
                    }
                    iniciar();
                }

            } else {
                if (susText.getText().equals("") || nomeText.getText().equals("") || dnText.getText().equals("") || enderecoText.getText().equals("") || cidText.equals("") || tipo_exameText.getText().equals("")) {
                    susText.requestFocus();
                    JOptionPane.showMessageDialog(null, "Preencha os campos!");
                } else {

                    String escolha = opcoes(UBS);
                    System.out.println("Selecionado: " + escolha);
                    RegistroDao dao = new RegistroDao();
                    Usuario u = new Usuario();
                    Registro r = new Registro();
                    u.setSus(susText.getText());
                    u.setNome(nomeText.getText());
                    u.setDn(dnText.getText());
                    u.setEndereco(enderecoText.getText());
                    u.setCidade(cidText.getText());
                    r.setUsuario(u);
                    r.setCod(0);
                    r.setConsulta("NULL");
                    r.setExame(escolhaCombo.getSelectedItem().toString());
                    r.setData(data.getText());
                    r.setUbs(escolha);
                    r.setProfisional(profissionalCombo.getSelectedItem().toString());
                    r.setTipo_exame(tipo_exameText.getText());
                    System.out.println(dao.salvar(r, "exame"));
                    limpaCampos();
                    u.setSus(null);
                    u.setNome(null);
                    u.setDn(null);
                    u.setEndereco(null);
                    u.setCidade(null);
                    r.setUsuario(u);
                    r.setCod(0);
                    r.setConsulta(null);
                    r.setExame(null);
                    r.setData(null);
                    r.setUbs(escolha);
                    r.setProfisional(null);
                    r.setTipo_exame(null);
                    model = (DefaultTableModel) jTable1.getModel();
                    if (jTable1.getRowCount() == 0) {

                    } else {
                        model.setNumRows(0);
                    }
                    for (Registro r1 : dao.listar("SELECT * FROM registros WHERE data='" + data.getText() + "' and exame='" + escolhaCombo.getSelectedItem().toString() + "'")) {
                        Object dados[] = {r1.getCod(), r1.getUsuario().getSus(), r1.getUsuario().getNome(), r1.getUsuario().getDn(), r1.getUsuario().getEndereco(), r1.getUsuario().getCidade(), r1.getData(), r1.getConsulta(), r1.getExame(), r1.getTipo_exame(), r1.getProfisional()};
                        model.addRow(dados);
                    }
                    iniciar();
                    Scrol.selectAndScroll(jTable1, jTable1.getRowCount() - 1);
                }
            }
        }
    }//GEN-LAST:event_tipo_exameTextKeyPressed
    boolean up = false;
    int cod = 0;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (evt.getClickCount() == 1) {

            int linha = jTable1.getSelectedRow();
            int coluna = jTable1.getSelectedColumn();

            try {
                cod = Integer.valueOf(jTable1.getValueAt(linha, 0).toString());
                up = true;
                jTable1.setSelectionBackground(Color.ORANGE);
                jTable1.setSelectionForeground(Color.black);
            } catch (Exception e) {

            }
            String nome = jTable1.getValueAt(linha, 2).toString();
            String sus = jTable1.getValueAt(linha, 1).toString();
            String dn = jTable1.getValueAt(linha, 3).toString();
            String endereco = jTable1.getValueAt(linha, 4).toString();
            String cidade = jTable1.getValueAt(linha, 5).toString();
            String tipo_exame = jTable1.getValueAt(linha, 9).toString();
            nomeText.setText(nome);
            susText.setText(sus);
            dnText.setText(dn);
            enderecoText.setText(endereco);
            cidText.setText(cidade);
            tipo_exameText.setText(tipo_exame);
        } else if (evt.getClickCount() == 2) {
            int linha = jTable1.getSelectedRow();
            int coluna = jTable1.getSelectedColumn();

            try {
                cod = Integer.valueOf(jTable1.getValueAt(linha, 0).toString());
                up = true;
                jTable1.setSelectionBackground(Color.RED);
                jTable1.setSelectionForeground(Color.black);
                int d = JOptionPane.showConfirmDialog(this, "Deseja APAGAR?");
                if (d == JOptionPane.OK_OPTION) {
                    RegistroDao dao = new RegistroDao();
                    dao.deletar(cod);
                    limpaCampos();
                    if (exameRadio.isSelected()) {
                        if (jTable1.getRowCount() == 0) {

                        } else {
                            model.setNumRows(0);
                        }
                        for (Registro r1 : dao.listar("SELECT * FROM registros WHERE data='" + data.getText() + "' and exame='" + escolhaCombo.getSelectedItem().toString() + "'")) {
                            Object dados[] = {r1.getCod(), r1.getUsuario().getSus(), r1.getUsuario().getNome(), r1.getUsuario().getDn(), r1.getUsuario().getEndereco(), r1.getUsuario().getCidade(), r1.getData(), r1.getConsulta(), r1.getExame(), r1.getTipo_exame(), r1.getProfisional()};
                            model.addRow(dados);
                        }
                    } else {
                        if (jTable1.getRowCount() == 0) {

                        } else {
                            model.setNumRows(0);
                        }
                        for (Registro r1 : dao.listar("SELECT * FROM registros WHERE data='" + data.getText() + "' and consulta='" + escolhaCombo.getSelectedItem().toString() + "'")) {
                            Object dados[] = {r1.getCod(), r1.getUsuario().getSus(), r1.getUsuario().getNome(), r1.getUsuario().getDn(), r1.getUsuario().getEndereco(), r1.getUsuario().getCidade(), r1.getData(), r1.getConsulta(), r1.getExame(), r1.getTipo_exame(), r1.getProfisional()};
                            model.addRow(dados);
                        }
                    }
                } else {

                }
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void S_SUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_SUSActionPerformed
        susText.requestFocus();
        susText.setText("");

        nomeText.requestFocus();
        S_SUS.setMnemonic(KeyEvent.VK_ALT);
    }//GEN-LAST:event_S_SUSActionPerformed

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
            java.util.logging.Logger.getLogger(Digitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Digitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Digitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Digitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Digitar dialog = new Digitar(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox S_SUS;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cidText;
    private javax.swing.JRadioButton consultaRadio;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JLabel data_escolhida;
    private javax.swing.JFormattedTextField dnText;
    private javax.swing.JTextField enderecoText;
    private javax.swing.JComboBox<String> escolhaCombo;
    private javax.swing.JRadioButton exameRadio;
    private javax.swing.JLabel exame_consulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlabel_prof;
    private javax.swing.JTextField nomeText;
    private javax.swing.JLabel profissional;
    private javax.swing.JComboBox<String> profissionalCombo;
    private javax.swing.JLabel profissionalLabel;
    private javax.swing.JFormattedTextField susText;
    private javax.swing.JLabel tipo_consulta_exame;
    private javax.swing.JFormattedTextField tipo_exameText;
    // End of variables declaration//GEN-END:variables
}
