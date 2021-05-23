package com.bloemer.api.introducaoaclases.clasestest;

import com.bloemer.api.introducaoaclases.clases.Profesor;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class ProfesorTest {
    public static void main(String[] args) throws IOException,InterruptedException {
        // devo criar obejtos en memoria uso o new
        Profesor professor1 = new Profesor();
        System.out.println("----------- DATOS  --------------");
        Scanner var = new Scanner(System.in);// uso para pedir a info por consola
        System.out.println(" DIGITE AS SEGUINTES INFORMAÇOES: ");
        System.out.print(" Nome : ");
        professor1.nome=var.nextLine();
        System.out.print(" Materia : ");
        professor1.materia=var.nextLine();
        System.out.print(" Escola :");
        professor1.escola=var.nextLine();
        System.out.print(" Matricula : ");
        professor1.matricula =var.nextInt();

        professor1.imprimir();
        var.nextLine();// queimo uma linha
        System.out.println(" DIGITE AS SEGUINTES INFORMAÇOES PROFE 2 : ");
        System.out.print(" Nome : ");
        professor1.nome=var.nextLine();
        System.out.print(" Materia : ");
        professor1.materia=var.nextLine();
        System.out.print(" Escola :");
        professor1.escola=var.nextLine();
        System.out.print(" Matricula : ");
        professor1.matricula =var.nextInt();
        professor1.imprimir();

        // NAO sei como solucionar isso...
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

        //System.out.println(" Digite uma opção : ");
        //System.out.println("5 - sair");

       /* int opcion ;
        do {
            opcion = var.nextInt();
            if(opcion==5)
                break;
        }while (opcion!=5);*/

        //System.out.flush();
        //final Process cls = Runtime.getRuntime().exec("cls");

        /*System.out.println("------------- INFORMAÇÃO PROFESSOR -----------------");
        System.out.println("NOME :"+professor1.nome );
        System.out.println("MATRICULA : " +professor1.matricula);
        System.out.println("MATERIA : " + professor1.materia);
        System.out.println("ESCOLA : " + professor1.escola);*/

    }
}
