package com.bloemer.api.introducaoaclases.asociacao.classes;

import com.bloemer.api.introducaoaclases.asociacao.classes.Aluno;
import com.bloemer.api.introducaoaclases.asociacao.classes.Local;
import com.bloemer.api.introducaoaclases.asociacao.classes.Professor;

public class Seminario {
    private String titulo;
    private Aluno[] aluno;
    private Professor professor;
    private Local local;

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void print() {
        System.out.println("------------------------------------------------------");
        System.out.println("                  RELATORIO SEMINARIOS                ");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Professor palestrante: " + this.professor.getNome());
        System.out.println("Alunos Participantes  ");
        if (this.aluno != null && this.aluno.length != 0) {
            for (Aluno aux : aluno) {
                System.out.println("Nome: " + aux.getNome());
                System.out.println("Idade: " + aux.getIdade());
            }
        } else
            System.out.println("Nenhum aluno registrado.");

        if (this.local != null)
            System.out.println("Local,rua: " + this.local.getRua() + " bairro: " + this.local.getBairro());
        else
            System.out.println("O local ainda não esta estabelecido. ");
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
