package com.bloemer.api.introducaoaclases.modificadorestatico.carro;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 230;// o static pertence a clase! independente do objeto!

    //CONSTRUTOR SERVE PARA INICIALIZAR A VARIAVEL AQUI DENTRO DOS ()
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {

    }

    public void imprime(){
        System.out.println("------------------------------------");
        System.out.println("Marca :"+this.nome);
        System.out.println("velocidade maxima: "+this.velocidadeMaxima);
        System.out.println("velocidade limite: "+ velocidadeLimite);//FAZ PARTE DA CLASE,NAO PRECISO USAR O THIS

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
