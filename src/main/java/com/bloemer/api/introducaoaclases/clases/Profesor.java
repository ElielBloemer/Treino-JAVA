package com.bloemer.api.introducaoaclases.clases;

public class Profesor {
    public String nome;
    public int matricula;
    public  String materia;
    public  String escola;

    public void imprimir(){
        System.out.println("--------------------------------------------------");
        System.out.println("                INFORMAÇAO   PROFESSOR             ");
        System.out.println("Nome: "+this.nome);
        System.out.println("escola: "+this.escola);
        System.out.println("Materia: "+this.materia);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("--------------------------------------------------");
    }
}
