package com.bloemer.api.introducaoaclases.asociacao.classes;

public class Local {
    private String rua;
    private String bairro;
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public Local() {
    }

    public void print(){
        System.out.println("------------------------ RELATORIO LOCAL ----------------------------");
        System.out.println("Rua: "+this.rua);
        System.out.println("Bairro: "+this.bairro);
        System.out.println("Numero: "+this.num);
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
}
