package com.bloemer.api.introducaoaclases.asociacaopratica;

import com.bloemer.api.ApiApplication;
import com.bloemer.api.introducaoaclases.asociacao.classes.MenuPrincipal;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

import java.util.Arrays;
import java.util.Scanner;
@SpringBootApplication


public class AsociacaoPraticaTester {

   /* public static int menuPrincipal() {
        int opcion;

        Scanner var = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("             MENU PRINCIPAL ");
        System.out.println("            DIGITE UMA OPÇÂO:");
        System.out.println(" 1 - REGISTRAR ALUNO. ");
        System.out.println(" 2 - REGISTRAR LOCAL.");
        System.out.println(" 3 - REGISTRAR SEMINARIO. ");
        System.out.println(" 4 - REGISTRAR PROFESSOR. ");
        System.out.println(" 5 - VISUALIZAR RELATORIO DO(S) ALUNO(S). ");
        System.out.println(" 6 - VISUALIZAR RELATORIO DO LOCAL.");
        System.out.println(" 7 - VISUALIZAR RELATORIO DO(S) SEMINARIO(S). ");
        System.out.println(" 8 - VISUALIZAR RELATORIO PROFESSOR(A). ");
        System.out.println(" 9 - SALIR. ");
        System.out.println("-------------------------------------------------");
        do {
            opcion = var.nextInt();
        } while (opcion != 9 && !(opcion >= 1 && opcion <= 8));

        var.nextLine();//queimo uma linha
        switch (opcion) {
            case 1:{
                //registro aluno
                AlunoPratica aluno = new AlunoPratica();
                System.out.println("DIGITE O NOME DO ALUNO:");
                aluno.setNome(var.nextLine());
                System.out.println("DIGITE A IDADE DO ALUNO: ");
                aluno.setIdade(var.nextInt());
                // se a idade for menor de 18 anos pode comparecer no seminario
                if (aluno.getIdade() >= 18) {
                    if (aluno.getNome() != null && aluno.getIdade() != 0){
                        aluno.print();
                        System.out.println("ALUNO(A) REGISTRADO(A) CON EXITO!");}
                    else
                        System.out.println("FALLA AL REGISTRAR ALUMNO! ");
                } else System.out.println("EDAD INCORRECTA, NO PUEDE SER MENOR DE EDAD! ");

                break;}
            case 2:{
                //registro local
                LocalPratica local = new LocalPratica();
                System.out.println("DIGITE O NUMERO DO LOCAL : ");
                local.setNumero(var.nextInt());
                var.nextLine();//queimo uma linha
                if (local.getNumero() > 0) {
                    System.out.println("DIGITE A RUA DO LOCAL: ");
                    local.setRua(var.nextLine());
                    System.out.println("DIGITE O BAIRRO DO LOCAL: ");
                    local.setBairro(var.nextLine());
                    if (local.getRua() != null && local.getBairro() != null){
                        local.print();
                        System.out.println("LOCAL REGISTRADO CON EXITO!");}
                } else
                    System.out.println("NUMERO INCORRECTO! FALLA AL REGISTRAR  ");

                break;}
            case 3:{
                // registro seminario
                SeminarioPratica seminario = new SeminarioPratica();
                System.out.println("DIGITE O TITULO DO SEMINARIO: ");
                seminario.setTitulo(var.nextLine());
                if (seminario.getTitulo() != null){
                    seminario.print();
                    System.out.println("SEMINARIO REGISTRADO CON EXITO!");}
                else
                    System.out.println("FALLA AL REGISTRAR SEMINARIO");
                break;}
            case 4:{
                //crio o professor
                ProfesorPratica prof = new ProfesorPratica();
                System.out.println("DIGITE O NOME DO PROFESSOR: ");
                prof.setNome(var.nextLine());
                System.out.println("DIGITE A ESPECIALIDADE DO PROFESSOR: ");
                prof.setEspecialidade(var.nextLine());
                if (prof.getNome() != null && prof.getEspecialidade() != null){
                    prof.print();
                    System.out.println("PROFESSOR REGISTRADO CON EXITO!");}
                else
                    System.out.println("FALLA AL REGISTRAR PROFESSOR.");
                break;}
            case 5:
                //MOSTRAR RELATORIO ALUNOS
                AlunoPratica aluno = new AlunoPratica();
                aluno.print();
                break;
            case 6:
                //RELATORIO DO LOCAL
                LocalPratica local = new LocalPratica();
                local.print();
                break;
            case 7:
                //relatorio seminario
                SeminarioPratica seminario = new SeminarioPratica();
                seminario.print();
                break;
            case 8:
                //relatorio professor
                ProfesorPratica prof = new ProfesorPratica();
                prof.print();
                break;
        }
        return opcion;
    }*/

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);

        MenuPrincipal menu = new MenuPrincipal();
        int opcion = 0;
        do {
            opcion = menu.menuPrincipal();
        } while (opcion != 9);

        System.out.println("FINALIZADO PROGRAMA OBRIGADO! ");
    }
}
// pq cuando vuelvo queriendo ler los datos lo pierdo´´ é pelo motivo que as variaveis morrem quando volto ao main``