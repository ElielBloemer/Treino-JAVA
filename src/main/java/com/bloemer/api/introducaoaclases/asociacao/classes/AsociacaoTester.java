package com.bloemer.api.introducaoaclases.asociacao.classes;

import java.util.Arrays;
import java.util.Scanner;

public class AsociacaoTester {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");

        //Aluno aluno = new Aluno("Eliel",27);

        //              ALUNO 1
        Aluno aluno = new Aluno();
        aluno.setNome(var.nextLine());
        System.out.println("Digite a idade do aluno: ");
        aluno.setIdade(var.nextInt());
        var.nextLine();//queimo uma linha
        //Aluno aluno2 = new Aluno("Ruth Lazon", 28);

        //               ALUNO 2
        Aluno aluno2 =new Aluno();
        System.out.println("Digite o nome do segundo aluno(a): ");
        aluno2.setNome(var.nextLine());
        System.out.println("Digite a idade do segundo aluno(a): ");
        aluno2.setIdade(var.nextInt());

        Seminario sem = new Seminario("Profecias Biblicas");
        Local local = new Local("Av Castanhares", "Parque chacabuco");
        Professor prof = new Professor("Luis Gonçalves", "Profecias");

        aluno.setSeminario(sem);//estou passando o que se deve guardar na variavel de referencia
        aluno2.setSeminario(sem);

        //sem.setAluno(new Aluno[]{aluno, aluno2});
        //sem.setLocal(local);
        sem.setProfessor(prof);

        Seminario[] semArray = new Seminario[1];//marco no começo e devo sempre colocar o tam do array
        semArray[0] = sem;

        prof.setSeminarios(semArray);
       // aluno.print();
       // aluno2.print();
        System.out.println();
        sem.print();
        System.out.println();
        prof.print();
        System.out.println();
        local.print();
    }
}
