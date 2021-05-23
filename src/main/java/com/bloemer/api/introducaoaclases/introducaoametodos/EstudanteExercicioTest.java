package com.bloemer.api.introducaoaclases.introducaoametodos;

import com.bloemer.api.introducaoaclases.clases.EstudanteExercicio;

import java.util.Arrays;
import java.util.Scanner;

public class EstudanteExercicioTest {
    public static void main(String[] args) {
        EstudanteExercicio aluno = new EstudanteExercicio();

        Scanner aux = new Scanner(System.in);
        System.out.println("-------------- INFORMAÇÂO ALUNO ------------- ");
        System.out.println("Digite as informaçoes do aluno. ");
        System.out.print("Digite o nome do aluno: ");

        aluno.setNome(aux.nextLine());

        //aluno.nome=aux.nextLine();
        System.out.print("Digite a idade do aluno: ");
        aluno.setIdade(aux.nextInt());

        //aux.nextInt();//QUEIMO UMA LINHA
        System.out.println("Digite as 3 notas do aluno: ");

        //float[] notas= new float[];
        /*float soma=0;
        for(int i=0;i<3;i++){
            aluno.nota=aux.nextFloat();//pego as 3 notas
            soma=aluno.somandoAlunoVarArgs(aluno.nota,soma);//manda nota por nota a somar para tirar a media
            //System.out.println("Soma no main [" +(1+i)+"] = "+soma);
        }
        aluno.mostrandoInfoAluno(soma);
        System.out.println(" Fim do programa, obrigado ");*/

        float[] auxnotas = new float[3];

        for (int i = 0; i < 3; i++) {
            auxnotas[i] = aux.nextFloat();//coloco as notas no array
        }

        aluno.setNota(auxnotas);
        //aluno.nota = auxnotas;
       // System.out.println("nome : " + aluno.getNome());
       // System.out.println("idade: " + aluno.getIdade());

      //  for(float auxNasNotas : (aluno.getNota())){
     //       System.out.println("Notas : " + auxNasNotas);
     //   }

        aluno.mostrarAluno();
        aluno.tirarMedia();//ja faço referencia ao array nota
        System.out.println("Obrigado ");
    }

    // EU PRECISO USAR O GET SEMPRE PARA MOSTRAR POR CONSOLA?????OU FAÇO UM METODO MOSTRAR????
}
