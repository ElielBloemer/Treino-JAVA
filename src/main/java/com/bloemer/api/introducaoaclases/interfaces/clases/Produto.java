package com.bloemer.api.introducaoaclases.interfaces.clases;

public class Produto implements Tributavel,Transportavel{
    private  String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;


    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", preco=" + preco +
                ", precoFinal com imposto =" + precoFinal +
                ", valorFrete=" + valorFrete +
                '}';
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override// reescrevo pq herdei metodos abstratos de uma interface, ja que por default todos os metodos sao abstratos...
    public void calcularImposto() {
        precoFinal = this.preco +( this.preco * IMPOSTO);

    }

    @Override
    public void calcularFrete() {
     this.valorFrete = this.preco/this.peso*0.1;
    }
}
