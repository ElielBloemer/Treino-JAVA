package com.bloemer.api.introducaoaclases.sobrecargametodos.estudantetester;

import com.bloemer.api.introducaoaclases.sobrecargametodos.clases.Estudante;

public class EstudantesTester {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Eliel Bloemer", "1549-EHN", new double[]{5, 9, 7},"02/03/2021");
        estudante1.imprime();
    }
}
