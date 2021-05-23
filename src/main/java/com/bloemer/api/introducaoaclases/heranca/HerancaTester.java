package com.bloemer.api.introducaoaclases.heranca;

import com.bloemer.api.introducaoaclases.sobreescrever.PessoaReescrever;

public class HerancaTester {
    public static void main(String[] args) {
       /* Pessoa p1= new Pessoa();
        p1.setNome("Eliel Bloemer Correa");
        p1.setCpf("03378742127");
        Endereco end = new Endereco();
        end.setRua("Av Castanhares");
        end.setBairro("Parque Chacabuco");
        end.setNumero(2067);
        p1.setEndereco(end);//prenchi a clase endereço e aqui passo a classe pessoa
        Funcionario f = new Funcionario();
        f.setNome("Ruth Lazon Aguilar");
        f.setSalario(2500);
        f.setEndereco(end);
        p1.print();//imprimo pessoa
        System.out.println("----------------------------------------------- "+"\n");
        f.print();//imprimo funcionario
        System.out.println(" FIM DO PROGRAMA ");*/

        PessoaReescrever pes = new PessoaReescrever();
        pes.setNome("Eliel Bloemer");
        pes.setIdade(27);
        System.out.println(pes);
    }
}
