package com.bloemer.api.introducaoaclases.colecoes;

import java.util.Arrays;

public class EqualsTest {
    public static void main(String[] args) {
        String nome1 = "Eliel Bloemer";
        String nome2 = new String("Eliel Bloemer");
        System.out.println(nome1.equals(nome2));// essa comparação é falsa pq o nome2 esta criado na memoria head e o
        //nome1 esta criado no pool de string

       // Integer int1 = 5;
        //Integer int2 = new Integer(5);
        //System.out.println(int1.equals(int2));//int1 esta criado em outra locaçao de memoria de int2

        Celular c1 = new Celular("Iphone","1243");
        Celular c2 = new Celular("Iphone","1243");

        System.out.println(c1.equals(c2));
    }
}
