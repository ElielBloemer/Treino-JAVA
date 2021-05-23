package com.bloemer.api.introducaoaclases.clases;

public class EstudanteExercicio {
    private String nome;
    private int idade;
    private float[] nota;

   /* public float somandoAlunoVarArgs(float num,float soma){
     //float soma=0;
        soma+=num;
     return soma;
    }

    public void mostrandoInfoAluno(float soma){
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        if((soma/3)>=6){
        System.out.println("media: "+(soma/3));
            System.out.println(" Aprovado");}
        else{
            System.out.println("media: " +(soma/3)+"\n Reprovado");
        }*/

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }

    /*public int getIdade(){
    return this.idade;
    }*/

    public void setNota(float[] nota){
        this.nota=nota;
    }

    public float[] getNota() {
        return this.nota;
    }

    public void mostrarAluno() {
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        for (float aux : nota) {
            System.out.println("notas: " + aux);
        }
    }

    public void tirarMedia() {
        float soma = 0;
        for (float aux : this.nota) {
            soma += aux;
        }
        System.out.println("metodo mostrar media ");
        double media = soma / nota.length;
        if (media >= 6) {
            System.out.println("media: " + media + "\nParabens Aprovado!");
        } else {
            System.out.println("media: " + media + "\nInfelizmente Reprovado");
        }
    }
}
