package com.bloemer.api.introducaoaclases.interfaces.interfacestester;

import com.bloemer.api.introducaoaclases.interfaces.clases.Produto;

import java.util.Arrays;

public class interfaceTester {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook",4,3000);
        p.calcularImposto();
        p.calcularFrete();
        System.out.println(p);

    }
}
