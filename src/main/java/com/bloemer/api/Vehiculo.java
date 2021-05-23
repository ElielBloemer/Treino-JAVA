package com.bloemer.api;

public abstract class Vehiculo implements ContratoVehiculo {
    // VOU CRIAR MINHA CLASE PAI
    //DEPOIS DECLARO AS VARIAVEIS

   private String nomePiloto;
   private int cantPasajeros;
   private int anoDeFabricao;
   private String tipoDeCombustivel;
   private String paisDeFabricacao;
   private String servicoABordo;

   //private String percorrido;
   @Override
    public void percorrer()
    {
      String percorrarPadrao = " PercorrerPadrao";
      System.out.println(percorrarPadrao);
    }


    public String getServicoABordo(){ return  servicoABordo;}
    public  void setServicoABordo(String servicoABordo){ this.servicoABordo = servicoABordo;}
    public String getPaisDeFabricacao()
    {
        return paisDeFabricacao;
    }
    public void setPaisDeFabricacao(String paisDeFabricacao)
    {
        this.paisDeFabricacao = paisDeFabricacao;
    }
    public String getTipoDeCombustivel()
    {
        return tipoDeCombustivel;
    }
    public void setTipoDeCombustivel(String tipoDeCombustivel)
    {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
    public int getCantPasajeros() // CRIO A FUNCAO PARA LER O DATO
    {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) //CRIO A FUNCAO PARA EDITAR O DATO
    {
        this.cantPasajeros = cantPasajeros;
    }

    public String getNomePiloto()//GET CRIO A FUNCAO PARA LER O DATO
    {
        return nomePiloto;
    }

   public void setNomePiloto(String nomePiloto)//SET CRIO A FUNCAO PARA EDITAR O DATO
   {
       this.nomePiloto = nomePiloto;
   }

   public int getAnoDeFabricao()
   {
       return anoDeFabricao;
   }

   public void setAnoDeFabricao(int anoDeFabricao)
   {
       this.anoDeFabricao = anoDeFabricao;
   }

    // quantidade de botes, quantidade de motor

}
