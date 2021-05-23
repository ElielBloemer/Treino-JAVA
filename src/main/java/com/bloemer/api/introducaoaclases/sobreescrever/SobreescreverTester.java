package com.bloemer.api.introducaoaclases.sobreescrever;

import java.util.Arrays;

public class SobreescreverTester {
    public static void main(String[] args) {

        PessoaReescrever pes1 = new PessoaReescrever();
        pes1.setNome("Eliel Bloemer");
        pes1.setIdade(27);
        System.out.println(pes1);

        PessoaReescrever pes2 = new PessoaReescrever();
        pes2.setNome("Carlos Aguilar ");
        pes2.setIdade(25);
        System.out.println(pes2);
    }
}
