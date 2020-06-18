package br.com.SystemOs.constantes;

import br.com.SystemOs.model.Cliente;



public interface ICliente {

    interface IConst {

        static final int COL_CODIGO_CLIENTE = 0;
        static final int COL_NOME_CLIENTE = 1;
        static final int COL_ENDERECO_CLIENTE = 2;
        static final int COL_NUMERO_CLIENTE = 3;
        static final int COL_BAIRRO_CLIENTE = 4;
        static final int COL_CIDADE_CLIENTE = 5;
        static final int COL_ESTADO_CLIENTE = 6;
        static final int COL_TELEFONE_CLIENTE = 7;
        static final int COL_EMAIL_CLIENTE = 8;
    }
    
     interface IDefineValor {

        void setValor(Cliente cliente);
    }
}
