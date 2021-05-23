package com.bloemer.api;

public class Navio extends Vehiculo{
    private int cantMotores;
    private int cantBotes;

    // quantidade de botes, quantidade de motor
    @Override
    public void percorrer()
    {
        String percorrer = " Modo de recorrido : Rios y Mares.";
        System.out.println(percorrer);
    }

   // hago el get para recibir el dato
    public int getCantMotores()
    {
        return cantMotores;
    }
   // hago el set para ler el dato
    public void setCantMotores(int cantMotores)
    {
        this.cantMotores = cantMotores;
    }

    public int getCantBotes() {
        return cantBotes;
    }

    public void setCantBotes(int cantBotes)
    {
        this.cantBotes = cantBotes;
    }

}
