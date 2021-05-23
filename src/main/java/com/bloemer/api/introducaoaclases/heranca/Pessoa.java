package com.bloemer.api.introducaoaclases.heranca;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;


    /*public void print(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF :"+this.cpf);
        if(this.endereco!=null){
            System.out.println("Rua: "+this.endereco.getRua());
            System.out.println("Numero: "+this.endereco.getNumero());
            System.out.println("Bairro: "+this.endereco.getBairro());
        }
        else
            System.out.println("Endereço não registrado. ");
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
