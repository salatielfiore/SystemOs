
package br.com.SystemOs.table;

import br.com.SystemOs.constantes.IUsuario;
import br.com.SystemOs.model.Usuario;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class UsuarioTableModel extends AbstractTableModel implements IUsuario.IConst {

   private ArrayList<Usuario> lista;

    public UsuarioTableModel(ArrayList<Usuario> lista) {
        this.lista = new ArrayList<>(lista);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Usuario usuario = lista.get(linhas);

        if (colunas == COL_CODIGO_USUARIO) {
            return usuario.getIduser();
        }
        if (colunas == COL_NOME_USUARIO) {
            return usuario.getNome();
        }
        if (colunas == COL_FONE_USUARIO) {
            return usuario.getFone();
        }
        if (colunas == COL_USER_USUARIO) {
            return usuario.getUsuario();
        }
        if (colunas == COL_SENHA_USUARIO) {
            return usuario.getSenha();
        }
        if (colunas == COL_CARGO_USUARIO) {
            return usuario.getCargo();
        }
        if (colunas == COL_PERMISSAO_USUARIO) {
            return usuario.getPermissao();
        }
        return "";
    }

    @Override
    public String getColumnName(int colunas) {
        if (colunas == COL_CODIGO_USUARIO) {
            return "Código";
        }
        if (colunas == COL_NOME_USUARIO) {
            return "Nome";
        }
        if (colunas == COL_FONE_USUARIO) {
            return "Telefone";
        }
        if (colunas == COL_USER_USUARIO) {
            return "Usuario";
        }
        if (colunas == COL_SENHA_USUARIO) {
            return "Senha";
        }
        if (colunas == COL_CARGO_USUARIO) {
            return "Cargo";
        }
        if (colunas == COL_PERMISSAO_USUARIO) {
            return "Permissão";
        }
        return "";
    }
}
