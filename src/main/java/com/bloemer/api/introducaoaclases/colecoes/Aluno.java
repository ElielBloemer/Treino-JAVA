package com.bloemer.api.introducaoaclases.colecoes;

import java.io.Serializable;

public class Aluno implements Serializable {

    @Override
    public String toString() {
        return "{nome: " + nome + '\'' +
                ", idade: " + edade +
                ", matricula: " + matricula +
                ", rg: " + rg + '\'' +
                '}';
    }

    private String nome;
    private Integer edade;
    private Integer matricula;
    private String rg;

    //ja que fiz os construtores preciso fazer o construtor vazio
    public Aluno() {

    }

    public Aluno(String nome, Integer edade, Integer matricula, String rg) {
        this.nome = nome;
        this.edade = edade;
        this.matricula = matricula;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEdade() {
        return edade;
    }

    public void setEdade(Integer edade) {
        this.edade = edade;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
