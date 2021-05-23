package com.bloemer.api.introducaoaclases.sobrecargametodos.clases;

public class Estudante {
    private String nome;
    private String matricula;
    private double[] notas;
    private String dataMatricula;

    public Estudante(String nome,String matricula,double[] notas){//construtor
        this.nome=nome;
        this.matricula=matricula;
        this.notas=notas;
    }
    public Estudante(){//sobrecarga de metodo

    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Estudante(String nome, String matricula, double[] notas, String dataMatricula){
        this(nome, matricula, notas);
        this.dataMatricula= dataMatricula;
    }


    public void imprime(){
        System.out.println("nome: "+this.nome);
        System.out.println("matricula: "+this.matricula);
        for(double aux:notas){
            System.out.println("notas :"+aux);
        }
        System.out.println("data matricula: "+this.dataMatricula);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
