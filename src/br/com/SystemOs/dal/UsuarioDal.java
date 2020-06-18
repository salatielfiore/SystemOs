package br.com.SystemOs.dal;

import br.com.SystemOs.model.Usuario;
import br.com.SystemOs.view.TelaInicial;
import br.com.SystemOs.view.TelaUsuario;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UsuarioDal {

    private Connection conn;
    private PreparedStatement statement;
    private Statement st;
    private ResultSet rs;
    private String sql;
    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    private JFrame nova_tela;

    public UsuarioDal(JFrame tela) {
        conn = new ConnectionFactory().getConexao();
        nova_tela = tela;
    }

    public UsuarioDal() {
        conn = new ConnectionFactory().getConexao();
    }

    public void inserir(Usuario usuario) {
        sql = "INSERT INTO tbusuario(nome,fone,usuario,senha,cargo,permissao) VALUES(?,?,?,?,?,?)";

        try {
            statement = conn.prepareStatement(sql);

            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getFone());
            statement.setString(3, usuario.getUsuario());
            statement.setString(4, usuario.getSenha());
            statement.setString(5, usuario.getCargo());
            statement.setString(6, usuario.getPermissao());

            statement.execute();
            statement.close();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar um usuario: " + e);
        }
    }

    public void alterar(Usuario usuario) {
        sql = "UPDATE tbusuario SET nome = ?, fone = ?,"
                + " usuario = ?, senha = ?, cargo = ?, permissao = ? WHERE iduser = ?";

        try {
            statement = conn.prepareStatement(sql);

            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getFone());
            statement.setString(3, usuario.getUsuario());
            statement.setString(4, usuario.getSenha());
            statement.setString(5, usuario.getCargo());
            statement.setString(6, usuario.getPermissao());
            statement.setInt(7, usuario.getIduser());
            statement.execute();
            statement.close();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar um usuario: " + e);
        }
    }

    public void excluir(int iduser) {
        sql = "DELETE FROM tbusuario WHERE iduser = " + iduser;

        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();

        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "permissão recusada, "
                    + "exite dados desse Usuário em outra tabela");
        }
    }

    public ArrayList<Usuario> listarTodos(String sql_escolha) {
        sql = sql_escolha;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Usuario usuario = new Usuario();

                usuario.setIduser(rs.getInt("iduser"));
                usuario.setNome(rs.getString("nome"));
                usuario.setFone(rs.getString("fone"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setCargo(rs.getString("cargo"));
                usuario.setPermissao(rs.getString("permissao"));

                listaUsuarios.add(usuario);

            }

        } catch (Exception e) {
        }
        return listaUsuarios;
    }

    public void ultimoCampo() {
        Usuario usuario = new Usuario();
        sql = "SELECT * FROM tbusuario WHERE iduser LIKE (SELECT MAX(iduser) FROM tbusuario)";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                if (rs.last()) {
                    usuario.setIduser(rs.getInt("iduser"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setFone(rs.getString("fone"));
                    usuario.setUsuario(rs.getString("usuario"));
                    usuario.setSenha(rs.getString("senha"));
                    usuario.setCargo(rs.getString("cargo"));
                    usuario.setPermissao(rs.getString("permissao"));
                    
                    TelaUsuario.valor(usuario);
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void logar(JTextField user, JTextField senha, JLabel lbl_err) {
        if (conn != null) {
            Usuario usuario = new Usuario();

            usuario.setUsuario(user.getText().trim());
            usuario.setSenha(senha.getText().trim());

            sql = "SELECT * FROM tbusuario WHERE usuario = ? AND senha = ?";

            try {
                statement = conn.prepareStatement(sql);

                statement.setString(1, usuario.getUsuario());
                statement.setString(2, usuario.getSenha());

                rs = statement.executeQuery();

                if (rs.next()) {
                    String permissao = rs.getString(7);

                    TelaInicial principal = new TelaInicial();
                    principal.setVisible(true);

                    TelaInicial.lbl_nome.setText(rs.getString(2));

                    if (permissao.equals("todas as permissões")) {
                        TelaInicial.item_menu_usuario.setEnabled(true);
                        TelaInicial.menu_relatorio.setEnabled(true);
                    }

                    nova_tela.dispose();
                    conn.close();
                } else {
                    lbl_err.setVisible(true);
                    lbl_err.setText("*Usuario ou senha invalido");
                }

            } catch (HeadlessException | SQLException e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "sem conexão com o banco de dados");
        }

    }

}
