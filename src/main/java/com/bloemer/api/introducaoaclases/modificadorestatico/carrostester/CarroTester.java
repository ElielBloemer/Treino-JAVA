package com.bloemer.api.introducaoaclases.modificadorestatico.carrostester;

import com.bloemer.api.introducaoaclases.modificadorestatico.carro.Carro;

import java.util.Arrays;

public class CarroTester {
    public static void main(String[] args) {
        //AO TER UM CONSTRUTOR POSSO INICIALIZAR A VARIAVEL DENTRO DOS ()
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Ford", 270);
        Carro c3 = new Carro("Chevrolet", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("###########################");

        Carro.velocidadeLimite=250;

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
