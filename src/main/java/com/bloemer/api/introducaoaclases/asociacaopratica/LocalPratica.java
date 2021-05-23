package com.bloemer.api.introducaoaclases.asociacaopratica;

import com.bloemer.api.introducaoaclases.asociacao.classes.Seminario;

public class LocalPratica {
    private String rua;
    private String bairro;
    private int numero;
    private String seminarioQueSeDara;

    public LocalPratica(String rua, String bairro, int numero, String seminarioQueSeDara) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.seminarioQueSeDara = seminarioQueSeDara;
    }

    public LocalPratica() {
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSeminarioQueSeDara() {
        return seminarioQueSeDara;
    }

    public void setSeminarioQueSeDara(String seminarioQueSeDara) {
        this.seminarioQueSeDara = seminarioQueSeDara;
    }

    public void print() {
        System.out.println("-------------------------- RELATORIO LOCAL -------------------------------");
        System.out.println("RUA: " + this.rua);
        System.out.println("BAIRRO: " + this.bairro);
        System.out.println("NUMERO: "+this.numero);
        System.out.println("SEMINARIO QUE SE VAI DITAR: "+this.seminarioQueSeDara);
    }
}
