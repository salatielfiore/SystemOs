package br.com.SystemOs.table;


import br.com.SystemOs.constantes.IOs;
import br.com.SystemOs.model.Os;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class OsTableModel extends AbstractTableModel implements IOs {

    private ArrayList<Os> lista;

    public OsTableModel(ArrayList<Os> lista) {
        this.lista = new ArrayList<>(lista);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 12;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Os os = lista.get(linha);

        if (coluna == COL_COD_OS) {
            return os.getCodigo();
        }
        if (coluna == COL_DATA_OS) {
            return os.getData();
        }
        if (coluna == COL_TIPO_OS) {
            return os.getTipo();
        }
        if (coluna == COL_SITUACAO_OS) {
            return os.getSituacao();
        }
        if (coluna == COL_DESCRICAO_OS) {
            return os.getDescricao();
        }
        if (coluna == COL_EQUIPAMENTO_OS) {
            return os.getEquipamento();
        }
        if (coluna == COL_DEFEITO_OS) {
            return os.getDefeito();
        }
        if (coluna == COL_SERVICO_OS) {
            return os.getServico();
        }
        if (coluna == COL_TECNICO_OS) {
            return os.getTecnico();
        }
        if (coluna == COL_VALOR_OS) {
            return os.getValor();
        }
        if (coluna == COL_COD_CLIENTE_OS) {
            return os.getCod_cliente();
        }
        if (coluna == COL_COD_USER_OS) {
            return os.getCod_user();
        }

        return "";
    }

    @Override
    public String getColumnName(int coluna) {
        if (coluna == COL_COD_OS) {
            return "Cod.Os";
        }
        if (coluna == COL_DATA_OS) {
            return "Data";
        }
        if (coluna == COL_TIPO_OS) {
            return "Tipo";
        }
        if (coluna == COL_SITUACAO_OS) {
            return "Situação";
        }
        if (coluna == COL_DESCRICAO_OS) {
            return "Descrição";
        }
        if (coluna == COL_EQUIPAMENTO_OS) {
            return "Equipamento";
        }
        if (coluna == COL_DEFEITO_OS) {
            return "Defeito";
        }
        if (coluna == COL_SERVICO_OS) {
            return "Serviço";
        }
        if (coluna == COL_TECNICO_OS) {
            return "Tecnico";
        }
        if (coluna == COL_VALOR_OS) {
            return "Valor";
        }
        if (coluna == COL_COD_CLIENTE_OS) {
            return "Cod Cliente";
        }
        if (coluna == COL_COD_USER_OS) {
            return "Cod Usuario";
        }

        return "";
    }

}
