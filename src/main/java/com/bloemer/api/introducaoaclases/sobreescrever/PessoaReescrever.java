package com.bloemer.api.introducaoaclases.sobreescrever;

public class PessoaReescrever extends Object {
    private String nome;
    private int idade;

    @Override//notaçao usado para mostrar que sobreerescrevi um metodos
    public String toString() {
        System.out.println("-------------------------------------");
        System.out.println("   INFORMACAO NO METODO toString");
        return "Nome " + this.nome + ", idade " + this.idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
