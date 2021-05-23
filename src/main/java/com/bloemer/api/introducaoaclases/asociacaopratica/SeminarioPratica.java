package com.bloemer.api.introducaoaclases.asociacaopratica;

public class SeminarioPratica {
    private String titulo;
    private ProfesorPratica professor;
    private LocalPratica local;
    private AlunoPratica[] alunos;

    //faço os construtores

    public SeminarioPratica(String titulo, ProfesorPratica professor, LocalPratica local, AlunoPratica[] alunos) {
        this.titulo = titulo;
        this.professor = professor;
        this.local = local;
        this.alunos = alunos;
    }

    public SeminarioPratica() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ProfesorPratica getProfessor() {
        return professor;
    }

    public void setProfessor(ProfesorPratica professor) {
        this.professor = professor;
    }

    public LocalPratica getLocal() {
        return local;
    }

    public void setLocal(LocalPratica local) {
        this.local = local;
    }

    public AlunoPratica[] getAlunos() {
        return alunos;
    }

    public void setAlunos(AlunoPratica[] alunos) {
        this.alunos = alunos;
    }

    public void print(){
        System.out.println("-------------------------- RELATORIO SEMINARIOS --------------------------");
        System.out.println("NOME SEMINARIO: "+this.titulo);
        if(this.professor!=null){//por ser una clase externa debo preguntarme que pasa si es nula!!!
            System.out.println("Professor: "+this.professor.getNome());
        }
        else
            System.out.println("Professor ainda não registrado.");

        System.out.println("ALUNO(S): ");
        if(this.alunos!=null && this.alunos.length!=0){// clase externa,OJO puede ser nula!!
            for(AlunoPratica aux: this.alunos){
                System.out.println("NOME: "+aux.getNome());
                System.out.println("IDADE: "+aux.getIdade());
            }
        }
        else{
            System.out.println("NÂO SE ENCONTROU NENHUM REGISTRO DE ALUNO(S)");

        }
        if(this.local!=null){//clase externa OJO, puede ser nula!!
            System.out.println("LOCAL, RUA: "+this.local.getRua()+", BAIRRO: "+this.local.getBairro()+", NUMERO: "+this.local.getNumero());
            System.out.println("----------------------------------------------------");
        }
        else {System.out.println("LOCAL NÂO REGISTRADO.");
            System.out.println("----------------------------------------------------");}
    }
}
