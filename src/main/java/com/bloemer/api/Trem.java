package com.bloemer.api;

public class Trem extends Vehiculo{//JUNTO ESSA CLASE COM A RAIZ USANDO O EXTENDS
    private int cantVagoes;
    private String tipoDeCarga;
    @Override
    public void percorrer()//
    {
        String recorrido = "Modo de recorrido : vias ferreas ";
        System.out.println(recorrido);
    }
    public int getCantVagoes(){ return  cantVagoes;}
    public void setCantVagoes(int cantVagoes){ this.cantVagoes=cantVagoes;}

    public String getTipoDeCarga(){ return tipoDeCarga;}
    public void setTipoDeCarga(String tipoDeCarga){this.tipoDeCarga=tipoDeCarga;}
}
