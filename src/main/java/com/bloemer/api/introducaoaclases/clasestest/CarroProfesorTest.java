package com.bloemer.api.introducaoaclases.clasestest;

import com.bloemer.api.introducaoaclases.clases.CarroProfesor;

import java.util.Arrays;
import java.util.Scanner;

public class CarroProfesorTest {
    public static void main(String[] args) {
        CarroProfesor carro1 = new CarroProfesor();
        Scanner aux= new Scanner(System.in);
        System.out.println(" Digite o modelo do carro : ");
        carro1.modelo=aux.nextLine();
        System.out.println(" Digite a placa do carro : ");
        carro1.placa=aux.nextLine();
        System.out.println(" Digite a velocidade maxima do carro KM: ");
        carro1.VelocidadMaxima=aux.nextFloat();
        System.out.println(" Digite o ano de fabricação do carro: ");
        carro1.anoDeFabricacao= aux.nextInt();

        System.out.println( "------------------ INFORMAÇÃO CARRO --------------------" );
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Placa: " + carro1.placa);
        System.out.println("Velocidade Maxima: " + carro1.VelocidadMaxima+" km ");
        System.out.println("Ano de fabricação:" + carro1.anoDeFabricacao);
    }
}
