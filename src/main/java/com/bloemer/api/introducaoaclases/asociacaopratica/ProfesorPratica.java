package com.bloemer.api.introducaoaclases.asociacaopratica;

public class ProfesorPratica {
    private String nome;
    private String especialidade;
    private SeminarioPratica[] seminarios;//o profesor pode ter varios seminarios

    //faco os construtores com parametros e sem parametros

    // construtor com parametro
    public ProfesorPratica(String nome, String especialidade, SeminarioPratica[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    //construtor sem parametro
    public ProfesorPratica() {
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

    public SeminarioPratica[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(SeminarioPratica[] seminarios) {
        this.seminarios = seminarios;
    }

    public void print(){
        System.out.println("--------------------------- RELATORIO PROFESOR ---------------------------");
        System.out.println("                                    ");
        System.out.println("Nome: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        System.out.println("Seminario(s): ");
        if(this.seminarios!=null && this.seminarios.length!=0) {
            for (SeminarioPratica aux : seminarios) {

                System.out.println(aux.getTitulo());
            }
        }
        else
            System.out.println("Professor não se encontra inscrito em nenhum seminario");
    }
}
