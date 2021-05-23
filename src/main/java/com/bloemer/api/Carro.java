package com.bloemer.api;

public class Carro extends Vehiculo{//JUNTO ESSA CLASE COM A RAIZ USANDO O EXTENDS

    private int placa;
    private String modeloCarro;
    private String manutencaoMensal;
    private int cantPortas;

   /* public void tipoDeRecorrido()
    {
        String recorrido = "Modo de recorrido : Ruas e Avenidas. ";
        System.out.println(recorrido);
    }*/
    @Override
    public void percorrer()
    {
        String percorrarPadrao = " Percorrer Ruas e Estradas.";
        System.out.println(percorrarPadrao);
    }

    public int getCantPortas(){ return  cantPortas;}
    public void  setCantPortas( int cantPortas){ this.cantPortas = cantPortas; }
    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getModeloCarro(){
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro){
        this.modeloCarro = modeloCarro;
    }

    public String getManutencaoMensal(){
        return manutencaoMensal;
    }

    public void setManutencaoMensal(String manutencaoMensal){
        this.manutencaoMensal = manutencaoMensal;
    }

}
