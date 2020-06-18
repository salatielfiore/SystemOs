package br.com.SystemOs.dal;


import br.com.SystemOs.model.Cliente;
import br.com.SystemOs.model.Os;
import br.com.SystemOs.view.TelaOs;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class OsDal {

    private Connection conn;
    private PreparedStatement statement;
    private Statement st;
    private ResultSet rs;
    private String sql;
    private ArrayList<Os> listaOS = new ArrayList<>();
    private int cod_user;

    public OsDal() {
        conn = new ConnectionFactory().getConexao();
    }

    public void inserir(Os os) {
        sql = "INSERT INTO tbos(tipo, situacao,descricao,equipamento,"
                + "defeito,servico,tecnico,valor,idcli,iduser) VALUES(?,?,?,?,?,?,?,?,?,?) ";

        try {
            statement = conn.prepareStatement(sql);

            statement.setString(1, os.getTipo());
            statement.setString(2, os.getSituacao());
            statement.setString(3, os.getDescricao());
            statement.setString(4, os.getEquipamento());
            statement.setString(5, os.getDefeito());
            statement.setString(6, os.getServico());
            statement.setString(7, os.getTecnico());
            statement.setString(8, os.getValor());
            statement.setInt(9, os.getCod_cliente());
            statement.setInt(10, cod_user);
            statement.execute();
            statement.close();
            ultimoCampo();
            
            conn.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void alterar(Os os) {
        sql = "UPDATE tbos SET tipo = ?,situacao = ?,"
                + "descricao = ?,equipamento = ?,"
                + "defeito = ?,servico = ?,tecnico = ?,"
                + "valor = ?,idcli = ? WHERE os = ? ";

        try {
            statement = conn.prepareStatement(sql);

            statement.setString(1, os.getTipo());
            statement.setString(2, os.getSituacao());
            statement.setString(3, os.getDescricao());
            statement.setString(4, os.getEquipamento());
            statement.setString(5, os.getDefeito());
            statement.setString(6, os.getServico());
            statement.setString(7, os.getTecnico());
            statement.setString(8, os.getValor());
            statement.setInt(9, os.getCod_cliente());
            statement.setInt(10, os.getCodigo());
            statement.execute();
            statement.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            throw new RuntimeException(e);
        }
    }

    public void excluir(int idOs) {
        sql = "DELETE FROM tbos WHERE os = " + idOs;

        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar um usuario: " + e);
        }
    }

    public ArrayList<Os> listarTodos(String sql_escolha) {

        sql = sql_escolha;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Os os = new Os();
                os.setCodigo(Integer.parseInt(rs.getString("os")));
                os.setData(rs.getString("data_os"));
                os.setTipo(rs.getString("tipo"));
                os.setSituacao(rs.getString("situacao"));
                os.setDescricao(rs.getString("descricao"));
                os.setEquipamento(rs.getString("equipamento"));
                os.setDefeito(rs.getString("defeito"));
                os.setServico(rs.getString("servico"));
                os.setTecnico(rs.getString("tecnico"));
                os.setValor(rs.getString("valor"));
                os.setCod_cliente(Integer.parseInt(rs.getString("idcli")));
                os.setCod_user(Integer.parseInt(rs.getString("iduser")));

                listaOS.add(os);

            }

        } catch (Exception e) {
        }
        return listaOS;
    }
    
    public void setCodUser(String user){
        sql = "SELECT iduser FROM tbusuario WHERE nome = ?";
        
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, user);
            rs = statement.executeQuery();
            if (rs.next()) {
                cod_user = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        
    }

    public void ultimoCampo() {
        Os os = new Os();
        sql = "SELECT * FROM tbos WHERE os LIKE (SELECT MAX(os) FROM tbos)";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                if (rs.last()) {
                    os.setCodigo(rs.getInt("os"));
                    os.setData(rs.getString("data_os"));
                    os.setTipo(rs.getString("tipo"));
                    os.setSituacao(rs.getString("situacao"));
                    os.setDescricao(rs.getString("descricao"));
                    os.setEquipamento(rs.getString("equipamento"));
                    os.setDefeito(rs.getString("defeito"));
                    os.setServico(rs.getString("servico"));
                    os.setTecnico(rs.getString("tecnico"));
                    os.setValor(rs.getString("valor"));
                    os.setCod_cliente(rs.getInt("idcli"));

                    TelaOs.valor(os);
                }

            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }
    public void valorCliente(String idcli) {
        
        
        sql = "SELECT nomecli,fonecli FROM tbcliente WHERE idcli =" + idcli;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("nomecli"));
                cliente.setTelefone(rs.getString("fonecli"));
                TelaOs.valor(cliente);
            }
            

        } catch (Exception e) {
        }
    }

   
      public void gerarRelatorio(){
        try {
            JasperPrint print = JasperFillManager.fillReport("C:/reports/servicos.jasper", null,conn);
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
        }
    }
      public void gerarRelatorio(JTextField txt_os){
        try {
            HashMap filtro = new HashMap();
            filtro.put("os",Integer.parseInt(txt_os.getText()));
            JasperPrint print = JasperFillManager.fillReport("C:/reports/os.jasper", filtro,conn);
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
        }
    }

}
