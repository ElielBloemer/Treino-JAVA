package com.bloemer.api.introducaoaclases.asociacao.classes;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;//pq o aluno só pode estar em um seminario, crio get e set para seminario

    public Aluno(String nome, int idade) {//constructores
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {
    }

    public void print() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("                         RELATORIOS ALUNOS                    ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.seminario != null) {
            System.out.println("Seminario Inscrito: " + this.seminario.getTitulo());//Pq nao devo usar o seminario como this
            return;
        }
        System.out.println("Nao esta inscrito em nenhum seminario.");

    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
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