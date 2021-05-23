package com.bloemer.api.introducaoaclases.heranca;

public class Funcionario extends Pessoa{//extendes vinculo as clases para herdar de outra clase atributos

    private double salario;

    public void print(){
        //super.print();//super é o jeito de chamar um metodo da clase mae...
        System.out.println("Salario: "+this.salario);
        imprimePagamento();
    }
    public void imprimePagamento(){
        System.out.println("---------------------------------------------------");
        System.out.println("          FOLHA DE PAGAMENTO      ");
        System.out.println("Eu "+super.nome+" recebi o salario de R$ "+this.salario+" referente ao mes de março.");
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
