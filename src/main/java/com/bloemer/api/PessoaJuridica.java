package com.bloemer.api;

public class PessoaJuridica extends Pessoa
{

    private int cnpj;// CRIO O DATO PARA USARLO

    // MODULO USADO PARA RETORNAR O DATO PARA LEITURA, FUNCAO TIPO INT NAO PASSO PARAMETRO

    public int getCnpj()
    {
        return cnpj;
    }

    // JA ESSA FUNCAO E USADA PARA INICIALIZAR, PASSO PARAMETRO

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
}
