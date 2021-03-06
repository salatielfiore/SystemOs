package br.com.SystemOs.view;

import br.com.SystemOs.constantes.ICliente;
import br.com.SystemOs.dal.ClienteDal;
import br.com.SystemOs.model.Cliente;
import br.com.SystemOs.table.ClienteTableModel;
import br.com.SystemOs.toolbox.ToNumber;
import javax.swing.JOptionPane;

public class TelaCliente extends javax.swing.JInternalFrame implements ICliente.IConst {

    private static int codigo;
    private static String nome;
    private static String telefone;
    private static String email;
    private static String endereco;
    private static String numero;
    private static String bairro;
    private static String cidade;
    private static String estado;

    /**
     * Creates new form TelaCliente
     */
    public TelaCliente() {
        initComponents();
        
        txt_numero.setDocument(new ToNumber());

        ClienteDal cd = new ClienteDal();
        cd.ultimoCampo();
        obterValor();
        String sql = "SELECT * FROM tbcliente";
        tb_cliente.setModel(new ClienteTableModel(new ClienteDal().listarTodos(sql)));
        
        if ((txt_codigo.getText().equals("")) || (txt_codigo.getText().equals("0"))){
            btn_alterar.setEnabled(false);
            btn_excluir.setEnabled(false);
        }else{
            btn_alterar.setEnabled(true);
            btn_excluir.setEnabled(true);
        }
    }

    private void obterValor() {
        txt_codigo.setText(String.valueOf(codigo));
        txt_nome.setText(nome);
        txt_telefone.setText(telefone);
        txt_email.setText(email);
        txt_endereco.setText(endereco);
        txt_numero.setText(numero);
        txt_bairro.setText(bairro);
        txt_cidade.setText(cidade);
        txt_estado.setText(estado);

    }

    public static void valor(Cliente cliente) {
        codigo = cliente.getCodigo();
        nome = cliente.getNome();
        telefone = cliente.getTelefone();
        email = cliente.getEmail();
        endereco = cliente.getEndereco();
        numero = String.valueOf(cliente.getNumero());
        bairro = cliente.getBairro();
        cidade = cliente.getCidade();
        estado = cliente.getEstado();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        painel_descricao_usuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_bairro = new javax.swing.JTextField();
        txt_cidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        txt_telefone = new javax.swing.JFormattedTextField();
        txt_numero = new javax.swing.JTextField();
        painel_tabela_usuario = new javax.swing.JPanel();
        txt_pesquisar = new javax.swing.JTextField();
        cb_opcao = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_cliente = new javax.swing.JTable();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cliente");

        painel_descricao_usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Codigo");

        txt_codigo.setEnabled(false);

        txt_nome.setEnabled(false);

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        txt_endereco.setEnabled(false);

        jLabel6.setText("Email");

        txt_email.setEnabled(false);

        jLabel7.setText("Telefone");

        jLabel5.setText("Cidade");

        jLabel12.setText("Nº");

        jLabel13.setText("Bairro");

        txt_bairro.setEnabled(false);

        txt_cidade.setEnabled(false);

        jLabel14.setText("Estado");

        txt_estado.setEnabled(false);

        try {
            txt_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_telefone.setEnabled(false);

        txt_numero.setEnabled(false);

        javax.swing.GroupLayout painel_descricao_usuarioLayout = new javax.swing.GroupLayout(painel_descricao_usuario);
        painel_descricao_usuario.setLayout(painel_descricao_usuarioLayout);
        painel_descricao_usuarioLayout.setHorizontalGroup(
            painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_descricao_usuarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_descricao_usuarioLayout.createSequentialGroup()
                        .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nome)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painel_descricao_usuarioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_descricao_usuarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(painel_descricao_usuarioLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_cidade)
                    .addComponent(txt_endereco, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(txt_telefone))
                .addGap(18, 18, 18)
                .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_descricao_usuarioLayout.createSequentialGroup()
                        .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(12, 12, 12)
                        .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painel_descricao_usuarioLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        painel_descricao_usuarioLayout.setVerticalGroup(
            painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_descricao_usuarioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_descricao_usuarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14)
                            .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painel_descricao_usuarioLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        painel_tabela_usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pesquisarKeyReleased(evt);
            }
        });

        cb_opcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Telefone", "Email" }));

        tb_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_clienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_cliente);

        javax.swing.GroupLayout painel_tabela_usuarioLayout = new javax.swing.GroupLayout(painel_tabela_usuario);
        painel_tabela_usuario.setLayout(painel_tabela_usuarioLayout);
        painel_tabela_usuarioLayout.setHorizontalGroup(
            painel_tabela_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_tabela_usuarioLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(cb_opcao, 0, 153, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(painel_tabela_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        painel_tabela_usuarioLayout.setVerticalGroup(
            painel_tabela_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_tabela_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_tabela_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_opcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SystemOs/icons/add.png"))); // NOI18N
        btn_novo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_novo.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SystemOs/icons/Save.png"))); // NOI18N
        btn_salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salvar.setEnabled(false);
        btn_salvar.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SystemOs/icons/edit.png"))); // NOI18N
        btn_alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_alterar.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SystemOs/icons/delete.png"))); // NOI18N
        btn_excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_excluir.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        jLabel9.setText("Salvar");

        jLabel8.setText("Novo");

        jLabel11.setText("Excluir");

        jLabel10.setText("Alterar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(417, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(294, 294, 294))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(309, 309, 309)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(painel_descricao_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painel_tabela_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel8)))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 44, Short.MAX_VALUE)
                                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(91, 91, 91)))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(209, 209, 209)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(537, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(painel_descricao_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(painel_tabela_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_novo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_alterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel11))
                    .addGap(21, 21, 21)))
        );

        setBounds(0, 0, 760, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_pesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pesquisarKeyReleased
        // TODO add your handling code here:
        String valor = txt_pesquisar.getText().trim();
        String tipo = "";

        switch (cb_opcao.getSelectedIndex()) {
            case 0:
                tipo = "nomecli";
                break;
            case 1:
                tipo = "fonecli";
                break;
            case 2:
                tipo = "emailcli";

        }
        String sql = "SELECT * FROM tbcliente WHERE " + tipo + " LIKE '%" + valor + "%'  ";
        tb_cliente.setModel(new ClienteTableModel(new ClienteDal().listarTodos(sql)));
    }//GEN-LAST:event_txt_pesquisarKeyReleased

    private void tb_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_clienteMouseClicked
        // TODO add your handling code here:

        //ao clicar em um determinado valor na tabela preenche os campos de texto(TextView)
        txt_codigo.setText(tb_cliente.getValueAt(tb_cliente.getSelectedRow(), COL_CODIGO_CLIENTE).toString());
        txt_nome.setText(tb_cliente.getValueAt(tb_cliente.getSelectedRow(), COL_NOME_CLIENTE).toString());
        txt_endereco.setText(tb_cliente.getValueAt(tb_cliente.getSelectedRow(), COL_ENDERECO_CLIENTE).toString());
        txt_numero.setText(tb_cliente.getValueAt(tb_cliente.getSelectedRow(), COL_NUMERO_CLIENTE).toString());
        txt_bairro.setText(tb_cliente.getValueAt(tb_cliente.getSelectedRow(), COL_BAIRRO_CLIENTE).toString());
        txt_cidade.setText(tb_cliente.getValueAt(tb_cliente.getSelectedRow(), COL_CIDADE_CLIENTE).toString());
        txt_estado.setText(tb_cliente.getValueAt(tb_cliente.getSelectedRow(), COL_ESTADO_CLIENTE).toString());
        txt_telefone.setText(tb_cliente.getValueAt(tb_cliente.getSelectedRow(), COL_TELEFONE_CLIENTE).toString());
        txt_email.setText(tb_cliente.getValueAt(tb_cliente.getSelectedRow(), COL_EMAIL_CLIENTE).toString());

        btn_salvardesabilitado();
        desabilitarCampo();
    }//GEN-LAST:event_tb_clienteMouseClicked

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        limparCampo();
        habilitarCampo();
        btn_salvarHabilitado();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed

        if (txt_codigo.getText().equals("")) {
            //se o campo codigo estiver vazio insere um novo cliente

            Cliente cliente = new Cliente();
            ClienteDal clienteDal = new ClienteDal();

            if (txt_nome.getText().equals("")
                    || txt_endereco.getText().equals("")
                    || txt_numero.getText().equals("")
                    || txt_bairro.getText().equals("")
                    || txt_cidade.getText().equals("")
                    || txt_estado.getText().equals("")
                    || txt_telefone.getText().equals("")
                    || txt_email.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Exite campos vazio, preencha todos os campos");

            } else {

                cliente.setNome(txt_nome.getText());
                cliente.setEndereco(txt_endereco.getText());
                cliente.setNumero(Integer.parseInt(txt_numero.getText()));
                cliente.setBairro(txt_bairro.getText());
                cliente.setCidade(txt_cidade.getText());
                cliente.setEstado(txt_estado.getText());
                cliente.setTelefone(txt_telefone.getText());
                cliente.setEmail(txt_email.getText());

                clienteDal.inserir(cliente);
                String sql = "SELECT * FROM tbcliente";
                tb_cliente.setModel(new ClienteTableModel(new ClienteDal().listarTodos(sql)));
                //pega o codigo que acabou de ser criado passa para o campo de texto txt_codigo
                clienteDal.ultimoCampo();
                obterValor();

                btn_salvardesabilitado();

                desabilitarCampo();
            }
        } else {
            //altera o usuario
            if (txt_nome.getText().equals("")
                    || txt_endereco.getText().equals("")
                    || txt_numero.getText().equals("")
                    || txt_bairro.getText().equals("")
                    || txt_cidade.getText().equals("")
                    || txt_estado.getText().equals("")
                    || txt_telefone.getText().equals("")
                    || txt_email.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Exite campos vazio, preencha todos os campos");

            } else {
                Cliente cliente = new Cliente();
                ClienteDal clienteDal = new ClienteDal();

                cliente.setNome(txt_nome.getText());
                cliente.setEndereco(txt_endereco.getText());
                cliente.setNumero(Integer.parseInt(txt_numero.getText()));
                cliente.setBairro(txt_bairro.getText());
                cliente.setCidade(txt_cidade.getText());
                cliente.setEstado(txt_estado.getText());
                cliente.setTelefone(txt_telefone.getText());
                cliente.setEmail(txt_email.getText());
                cliente.setCodigo(Integer.parseInt(txt_codigo.getText()));

                clienteDal.alterar(cliente);
                String sql = "SELECT * FROM tbcliente";
                tb_cliente.setModel(new ClienteTableModel(new ClienteDal().listarTodos(sql)));

                btn_salvardesabilitado();
                desabilitarCampo();

            }
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        
            btn_salvarHabilitado();
            habilitarCampo();
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        ClienteDal clienteDal = new ClienteDal();
        int id = Integer.parseInt(txt_codigo.getText());
        int sair = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja Excluir",
                "Atenção", JOptionPane.YES_NO_OPTION);

        if (sair == JOptionPane.YES_OPTION) {
            clienteDal.excluir(id);
            String sql = "SELECT * FROM tbcliente";
            tb_cliente.setModel(new ClienteTableModel(new ClienteDal().listarTodos(sql)));
            limparCampo();
            clienteDal.ultimoCampo();
            obterValor();
            btn_salvardesabilitado();

        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_salvardesabilitado() {
        btn_novo.setEnabled(true);
        btn_alterar.setEnabled(true);
        btn_excluir.setEnabled(true);
        btn_salvar.setEnabled(false);
    }

    private void btn_salvarHabilitado() {
        btn_novo.setEnabled(false);
        btn_alterar.setEnabled(false);
        btn_excluir.setEnabled(false);
        btn_salvar.setEnabled(true);
    }

    private void limparCampo() {
        txt_codigo.setText("");
        txt_nome.setText("");
        txt_telefone.setText("");
        txt_email.setText("");
        txt_endereco.setText("");
        txt_numero.setText("");
        txt_bairro.setText("");
        txt_cidade.setText("");
        txt_estado.setText("");
    }

    private void habilitarCampo() {
        txt_nome.setEnabled(true);
        txt_telefone.setEnabled(true);
        txt_email.setEnabled(true);
        txt_endereco.setEnabled(true);
        txt_numero.setEnabled(true);
        txt_bairro.setEnabled(true);
        txt_cidade.setEnabled(true);
        txt_estado.setEnabled(true);
    }

    private void desabilitarCampo() {
        txt_nome.setEnabled(false);
        txt_telefone.setEnabled(false);
        txt_email.setEnabled(false);
        txt_endereco.setEnabled(false);
        txt_numero.setEnabled(false);
        txt_bairro.setEnabled(false);
        txt_cidade.setEnabled(false);
        txt_estado.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox<String> cb_opcao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painel_descricao_usuario;
    private javax.swing.JPanel painel_tabela_usuario;
    public static javax.swing.JTable tb_cliente;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_pesquisar;
    private javax.swing.JFormattedTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}
