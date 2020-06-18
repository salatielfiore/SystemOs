
package br.com.SystemOs.table;

import br.com.SystemOs.constantes.ICliente;
import br.com.SystemOs.model.Cliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ClienteTableModel extends AbstractTableModel implements ICliente.IConst {
    private ArrayList<Cliente> lista;

    public ClienteTableModel(ArrayList<Cliente> lista) {
        this.lista = new ArrayList<>(lista);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Cliente cliente = lista.get(linhas);
        
        if(colunas == COL_CODIGO_CLIENTE){
            return cliente.getCodigo();
        }
        if(colunas == COL_NOME_CLIENTE){
            return cliente.getNome();
        }
        if(colunas == COL_ENDERECO_CLIENTE){
            return cliente.getEndereco();
        }
        if(colunas == COL_NUMERO_CLIENTE){
            return cliente.getNumero();
        }
        if(colunas == COL_BAIRRO_CLIENTE){
            return cliente.getBairro();
        }
        if(colunas == COL_CIDADE_CLIENTE){
            return cliente.getCidade();
        }
        if(colunas == COL_ESTADO_CLIENTE){
            return cliente.getEstado();
        }
        if(colunas == COL_TELEFONE_CLIENTE){
            return cliente.getTelefone();
        }
        if(colunas == COL_EMAIL_CLIENTE){
            return cliente.getEmail();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_CODIGO_CLIENTE){
            return "Codigo";
        }
        if(colunas == COL_NOME_CLIENTE){
            return "Nome";
        }
        if(colunas == COL_ENDERECO_CLIENTE){
            return "Endereço";
        }
        if(colunas == COL_NUMERO_CLIENTE){
            return "Numero";
        }
        if(colunas == COL_BAIRRO_CLIENTE){
            return "Bairro";
        }
        if(colunas == COL_CIDADE_CLIENTE){
            return "Cidade";
        }
        if(colunas == COL_ESTADO_CLIENTE){
            return "Estado";
        }
        if(colunas == COL_TELEFONE_CLIENTE){
            return "Telefone";
        }
        if(colunas == COL_EMAIL_CLIENTE){
            return "Email";
        }
        return "";
    }
}
