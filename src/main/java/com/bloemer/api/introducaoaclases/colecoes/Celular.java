package com.bloemer.api.introducaoaclases.colecoes;

public class Celular {
    private String nome;
    private String IMEI;

    @Override
    public int hashCode() {
        return IMEI!=null ? IMEI.hashCode() : 1;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;//se o obj e nulo falso
        if(this == obj) return  true;// agora se estão na mesma direção de memoria true
        if(this.getClass() != obj.getClass()) return false; // aqui getClass verifica si as clases sao iguais
        Celular otroCelular = (Celular) obj;
        return IMEI!=null && IMEI.equals(otroCelular.getIMEI());// coloco o IMEI pq é o responsavel pela comparação
    }

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
