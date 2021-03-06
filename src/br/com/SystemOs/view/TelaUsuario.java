package br.com.SystemOs.view;

import br.com.SystemOs.constantes.IUsuario;
import br.com.SystemOs.dal.UsuarioDal;
import br.com.SystemOs.model.Usuario;
import br.com.SystemOs.table.UsuarioTableModel;
import javax.swing.JOptionPane;

public class TelaUsuario extends javax.swing.JInternalFrame implements IUsuario.IConst {

    private static int iduser;
    private static String nome;
    private static String fone;
    private static String usuario;
    private static String senha;
    private static String cargo;
    private static String permissao;

    public TelaUsuario() {
        initComponents();

        UsuarioDal dal = new UsuarioDal();
        dal.ultimoCampo();
        obterValor();
        String sql = "SELECT * FROM tbusuario";
        tb_usuario.setModel(new UsuarioTableModel(new UsuarioDal().listarTodos(sql)));
        
        if ((txt_codigo.getText().equals("")) || (txt_codigo.getText().equals("0"))){
            btn_alterar.setEnabled(false);
            btn_excluir.setEnabled(false);
        }else{
            btn_alterar.setEnabled(true);
            btn_excluir.setEnabled(true);
        }
    }

    private void obterValor() {
        txt_codigo.setText(String.valueOf(iduser));
        txt_nome.setText(nome);
        txt_telefone.setText(fone);
        txt_usuario.setText(usuario);
        txt_senha.setText(senha);
        cb_cargo.setSelectedItem(cargo);
        cb_permissao.setSelectedItem(permissao);
    }

    public static void valor(Usuario u) {
        iduser = u.getIduser();
        nome = u.getNome();
        fone = u.getFone();
        usuario = u.getUsuario();
        senha = u.getSenha();
        cargo = u.getCargo();
        permissao = u.getPermissao();
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
        jLabel6 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_senha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_permissao = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cb_cargo = new javax.swing.JComboBox<>();
        txt_telefone = new javax.swing.JFormattedTextField();
        painel_tabela_usuario = new javax.swing.JPanel();
        txt_pesquisar = new javax.swing.JTextField();
        cb_opcao = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_usuario = new javax.swing.JTable();
        btn_novo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btn_alterar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btn_excluir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Usuario");

        painel_descricao_usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Codigo");

        txt_codigo.setEnabled(false);

        txt_nome.setEnabled(false);

        jLabel2.setText("Nome");

        jLabel3.setText("Telefone");

        jLabel6.setText("Usuario");

        txt_usuario.setEnabled(false);

        jLabel7.setText("Senha");

        txt_senha.setEnabled(false);

        jLabel5.setText("Permissão");

        cb_permissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "todas as permissões", "permissão padrão" }));
        cb_permissao.setEnabled(false);

        jLabel12.setText("Cargo");

        cb_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnico em Informatica", "Atendente" }));
        cb_cargo.setEnabled(false);

        try {
            txt_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_telefone.setEnabled(false);

        javax.swing.GroupLayout painel_descricao_usuarioLayout = new javax.swing.GroupLayout(painel_descricao_usuario);
        painel_descricao_usuario.setLayout(painel_descricao_usuarioLayout);
        painel_descricao_usuarioLayout.setHorizontalGroup(
            painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_descricao_usuarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_descricao_usuarioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_descricao_usuarioLayout.createSequentialGroup()
                        .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_nome)
                                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40)
                .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_permissao, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(txt_telefone))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_descricao_usuarioLayout.setVerticalGroup(
            painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_descricao_usuarioLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(cb_permissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_descricao_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        painel_tabela_usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pesquisarKeyReleased(evt);
            }
        });

        cb_opcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Telefone", "Usuario" }));

        tb_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_usuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_usuario);

        javax.swing.GroupLayout painel_tabela_usuarioLayout = new javax.swing.GroupLayout(painel_tabela_usuario);
        painel_tabela_usuario.setLayout(painel_tabela_usuarioLayout);
        painel_tabela_usuarioLayout.setHorizontalGroup(
            painel_tabela_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_tabela_usuarioLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(cb_opcao, 0, 143, Short.MAX_VALUE)
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

        jLabel8.setText("Novo");

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SystemOs/icons/Save.png"))); // NOI18N
        btn_salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salvar.setEnabled(false);
        btn_salvar.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        jLabel9.setText("Salvar");

        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SystemOs/icons/edit.png"))); // NOI18N
        btn_alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_alterar.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        jLabel10.setText("Alterar");

        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SystemOs/icons/delete.png"))); // NOI18N
        btn_excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_excluir.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        jLabel11.setText("Excluir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(314, 314, 314)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(49, 49, 49)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 206, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painel_tabela_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painel_descricao_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_descricao_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addComponent(painel_tabela_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(33, 33, 33))
        );

        setSize(new java.awt.Dimension(760, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_pesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pesquisarKeyReleased
        // TODO add your handling code here:
        String pesquisar = txt_pesquisar.getText().trim();
        String tipo = "";

        switch (cb_opcao.getSelectedIndex()) {
            case 0:
                tipo = "nome";
                break;
            case 1:
                tipo = "fone";
                break;
            case 2:
                tipo = "usuario";

        }

        String sql = "SELECT * FROM tbusuario WHERE " + tipo + " LIKE '%" + pesquisar + "%'  ";
        tb_usuario.setModel(new UsuarioTableModel(new UsuarioDal().listarTodos(sql)));
    }//GEN-LAST:event_txt_pesquisarKeyReleased

    private void tb_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_usuarioMouseClicked
        // TODO add your handling code here:

        //ao clicar em um determinado valor na tabela preenche os campos de texto(TextView)
        txt_codigo.setText(tb_usuario.getValueAt(tb_usuario.getSelectedRow(), COL_CODIGO_USUARIO).toString());
        txt_nome.setText(tb_usuario.getValueAt(tb_usuario.getSelectedRow(), COL_NOME_USUARIO).toString());
        txt_telefone.setText(tb_usuario.getValueAt(tb_usuario.getSelectedRow(), COL_FONE_USUARIO).toString());
        txt_usuario.setText(tb_usuario.getValueAt(tb_usuario.getSelectedRow(), COL_USER_USUARIO).toString());
        txt_senha.setText(tb_usuario.getValueAt(tb_usuario.getSelectedRow(), COL_SENHA_USUARIO).toString());
        cb_cargo.setSelectedItem(tb_usuario.getValueAt(tb_usuario.getSelectedRow(), COL_CARGO_USUARIO).toString());
        cb_permissao.setSelectedItem(tb_usuario.getValueAt(tb_usuario.getSelectedRow(), COL_PERMISSAO_USUARIO).toString());

        btn_salvardesabilitado();
        desabilitarCampo();

    }//GEN-LAST:event_tb_usuarioMouseClicked

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed

        limparCampo();
        habilitarCampo();
        btn_salvarHabilitado();

    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed

        if (txt_codigo.getText().equals("")) {
            //se o campo codigo estiver vazio insere um novo usuario

            Usuario usuario = new Usuario();
            UsuarioDal usuarioDal = new UsuarioDal();

            if (txt_nome.getText().equals("")
                    || txt_telefone.getText().equals("")
                    || txt_usuario.getText().equals("")
                    || txt_senha.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Exite campos vazio, preencha todos os campos");

            } else {

                usuario.setNome(txt_nome.getText());
                usuario.setFone(txt_telefone.getText());
                usuario.setUsuario(txt_usuario.getText());
                usuario.setSenha(txt_senha.getText());

                usuario.setCargo(cb_cargo.getSelectedItem().toString());
                usuario.setPermissao(cb_permissao.getSelectedItem().toString());

                usuarioDal.inserir(usuario);

                //atualiza a tabela do usuario para mostrar o ultimo valor inserido
                String sql = "SELECT * FROM tbusuario";
                tb_usuario.setModel(new UsuarioTableModel(new UsuarioDal().listarTodos(sql)));

                //pega o codigo que acabou de ser criado passa para os campos da tela usuario
                usuarioDal.ultimoCampo();
                obterValor();

                btn_salvardesabilitado();

                desabilitarCampo();
            }
        } else {
            //altera o usuario
            if (txt_nome.getText().equals("")
                    || txt_telefone.getText().equals("")
                    || txt_usuario.getText().equals("")
                    || txt_senha.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Exite campos vazio, preencha todos os campos");

            } else {
                Usuario usuario = new Usuario();
                UsuarioDal usuarioDal = new UsuarioDal();

                //pega os valores dos campos de texto e passa para o objeto usuario
                usuario.setNome(txt_nome.getText());
                usuario.setFone(txt_telefone.getText());
                usuario.setUsuario(txt_usuario.getText());
                usuario.setSenha(txt_senha.getText());
                usuario.setIduser(Integer.parseInt(txt_codigo.getText()));

                usuario.setCargo(cb_cargo.getSelectedItem().toString());
                usuario.setPermissao(cb_permissao.getSelectedItem().toString());

                usuarioDal.alterar(usuario);
                String sql = "SELECT * FROM tbusuario";
                tb_usuario.setModel(new UsuarioTableModel(new UsuarioDal().listarTodos(sql)));

                btn_salvardesabilitado();
                desabilitarCampo();

            }
        }


    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        // TODO add your handling code here:
        btn_salvarHabilitado();
        habilitarCampo();
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        UsuarioDal usuarioDal = new UsuarioDal();
        int id = Integer.parseInt(txt_codigo.getText());
        int confirmar = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja excluir",
                "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirmar == JOptionPane.YES_OPTION) {
            usuarioDal.excluir(id);
            String sql = "SELECT * FROM tbusuario";
            tb_usuario.setModel(new UsuarioTableModel(new UsuarioDal().listarTodos(sql)));
            limparCampo();
            usuarioDal.ultimoCampo();
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
        txt_usuario.setText("");
        txt_senha.setText("");
        cb_cargo.setSelectedIndex(0);
        cb_permissao.setSelectedIndex(0);
    }

    private void habilitarCampo() {
        txt_nome.setEnabled(true);
        txt_telefone.setEnabled(true);
        txt_usuario.setEnabled(true);
        txt_senha.setEnabled(true);
        cb_cargo.setEnabled(true);
        cb_permissao.setEnabled(true);
    }

    private void desabilitarCampo() {
        txt_nome.setEnabled(false);
        txt_telefone.setEnabled(false);
        txt_usuario.setEnabled(false);
        txt_senha.setEnabled(false);
        cb_cargo.setEnabled(false);
        cb_permissao.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    public static javax.swing.JComboBox<String> cb_cargo;
    private javax.swing.JComboBox<String> cb_opcao;
    public static javax.swing.JComboBox<String> cb_permissao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    public static javax.swing.JTable tb_usuario;
    public static javax.swing.JTextField txt_codigo;
    public static javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_pesquisar;
    public static javax.swing.JTextField txt_senha;
    public static javax.swing.JFormattedTextField txt_telefone;
    public static javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

}
