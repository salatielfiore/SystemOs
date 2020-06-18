package br.com.SystemOs.dal;

import br.com.SystemOs.model.Cliente;
import br.com.SystemOs.view.TelaCliente;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class ClienteDal {

    private Connection conn;
    private PreparedStatement statement;
    private Statement st;
    private ResultSet rs;
    private String sql;
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    public ClienteDal() {
        conn = new ConnectionFactory().getConexao();
    }

    public void inserir(Cliente cliente) {
        sql = "INSERT INTO tbcliente(nomecli,endcli,"
                + "numcasacli,bairrocli,cidadecli,estadocli,"
                + "fonecli,emailcli) VALUES(?,?,?,?,?,?,?,?)";

        try {
            statement = conn.prepareStatement(sql);

            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getEndereco());
            statement.setInt(3, cliente.getNumero());
            statement.setString(4, cliente.getBairro());
            statement.setString(5, cliente.getCidade());
            statement.setString(6, cliente.getEstado());
            statement.setString(7, cliente.getTelefone());
            statement.setString(8, cliente.getEmail());
            statement.execute();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar um usuario: " + e);
        }
    }

    public void alterar(Cliente cliente) {

        sql = "UPDATE tbcliente SET nomecli = ?,"
                + "endcli = ?,numcasacli = ?,"
                + "bairrocli = ?,cidadecli = ?,"
                + "estadocli = ?,fonecli = ?,"
                + "emailcli = ? WHERE idcli = ?";

        try {
            statement = conn.prepareStatement(sql);

            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getEndereco());
            statement.setInt(3, cliente.getNumero());
            statement.setString(4, cliente.getBairro());
            statement.setString(5, cliente.getCidade());
            statement.setString(6, cliente.getEstado());
            statement.setString(7, cliente.getTelefone());
            statement.setString(8, cliente.getEmail());
            statement.setInt(9, cliente.getCodigo());
            statement.execute();
            statement.close();

        } catch (NumberFormatException | SQLException e) {
            throw new RuntimeException("Erro ao criar um usuario: " + e);
        }
    }

    public void excluir(int idcliente) {
        sql = "DELETE FROM tbcliente WHERE idcli = " + idcliente;

        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "permissão recusada, "
                    + "exite dados desse cliente em outra tabela");
        }
    }

    public ArrayList<Cliente> listarTodos(String sql_escolha) {
        sql = sql_escolha;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setCodigo(rs.getInt("idcli"));
                cliente.setNome(rs.getString("nomecli"));
                cliente.setEndereco(rs.getString("endcli"));
                cliente.setNumero(rs.getInt("numcasacli"));
                cliente.setBairro(rs.getString("bairrocli"));
                cliente.setCidade(rs.getString("cidadecli"));
                cliente.setEstado(rs.getString("estadocli"));
                cliente.setTelefone(rs.getString("fonecli"));
                cliente.setEmail(rs.getString("emailcli"));

                listaClientes.add(cliente);

            }

        } catch (SQLException e) {
        }
        return listaClientes;
    }

    public void ultimoCampo() {
        Cliente cliente = new Cliente();
        sql = "SELECT * FROM tbcliente WHERE idcli LIKE (SELECT MAX(idcli) FROM tbcliente)";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                if (rs.last()) {
                    cliente.setCodigo(rs.getInt("idcli"));
                    cliente.setNome(rs.getString("nomecli"));
                    cliente.setTelefone(rs.getString("fonecli"));
                    cliente.setEndereco(rs.getString("endcli"));
                    cliente.setNumero(rs.getInt("numcasacli"));
                    cliente.setBairro(rs.getString("bairrocli"));
                    cliente.setCidade(rs.getString("cidadecli"));
                    cliente.setEstado(rs.getString("estadocli"));
                    cliente.setEmail(rs.getString("emailcli"));
                    
                    TelaCliente.valor(cliente);
                }

            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }

    }
    
    public void gerarRelatorio(){
        try {
            JasperPrint print = JasperFillManager.fillReport("C:/reports/cliente.jasper", null,conn);
            JasperViewer.viewReport(print, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum Cliente");
        }
    }

}
