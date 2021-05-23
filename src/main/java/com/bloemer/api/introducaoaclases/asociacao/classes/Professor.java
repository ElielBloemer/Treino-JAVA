package com.bloemer.api.introducaoaclases.asociacao.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {//construtor
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {//construtor
    }

    public void print(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("                  RELATORIO PROFESSOR");
        System.out.println("Nome: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        if(this.seminarios!=null && this.seminarios.length!=0) {
            System.out.print("Seminarios participantes: ");
            for (Seminario aux : seminarios) {
                System.out.print(aux.getTitulo() + ", ");
            }
            return;
        }
        System.out.println("Professor nao esta inscrito em nenhum seminario.");

    }


    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
