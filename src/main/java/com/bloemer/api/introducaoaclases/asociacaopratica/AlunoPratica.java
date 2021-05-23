package com.bloemer.api.introducaoaclases.asociacaopratica;

public class AlunoPratica {
    private String nome;
    private int idade;
    private String seminario;

    //faço os construtores

    public AlunoPratica(String nome, int idade, String seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public AlunoPratica() {
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

    public String getSeminario() {
        return seminario;
    }

    public void setSeminario(String seminario) {
        this.seminario = seminario;
    }

    public void print(){
        System.out.println("------------------------ RELATORIO ALUNO(A) -------------------------");
        System.out.println("NOME: "+this.nome);
        System.out.println("IDADE: "+this.idade);
        if(this.seminario!=null){
            System.out.println("SEMINARIO : "+this.seminario);
        }
        else{
            System.out.println("ALUNO NAO REGISTRADO EM NENHUM SEMINARIO");
        }
    }
}
