package com.bloemer.api.introducaoaclases.colecoes;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ListTest {
    public static void main(String[] args) throws IOException {
        List<Aluno> aluno = new ArrayList<>();
        Scanner cap = new Scanner(System.in);
        Aluno alunonuevo = new Aluno();

        /*System.out.println("-------------- INFORMAÇÂO ALUNO ------------- ");
        //System.out.println("  Quantos alunos voce deseja adicionar ?");
        System.out.println("Digite as informaçoes do aluno. ");
        System.out.print("Digite o nome do aluno: ");
        alunonuevo.setNome(cap.nextLine());
        System.out.print("digite a idade do aluno: ");
        alunonuevo.setEdade(cap.nextInt());
        cap.nextLine();//queimo uma linha
        System.out.print("Digite a matricula do aluno(a): ");
        alunonuevo.setMatricula(cap.nextInt());
        cap.nextLine();//queimo uma linha
        System.out.print("Digite RG do aluno(a): ");
        alunonuevo.setRg(cap.nextLine());
        aluno.add(alunonuevo);

        arquivarAluno(alunonuevo);*/

        //mostrarAlunos(aluno);
        leerArquivo();
    }

    public static void mostrarAlunos(List<Aluno> aluno) {
        System.out.println("\n ----------- ALUNO(S) REGISTRADOS NO SISTEMA -----------------");
        for (Aluno alunoMostrar : aluno) {
            System.out.println("Nome: " + alunoMostrar.getNome());
            System.out.println("Idade: " + alunoMostrar.getEdade());
            System.out.println("Matricula: " + alunoMostrar.getMatricula());
            System.out.println("RG: " + alunoMostrar.getRg());
        }

    }

    public static void arquivarAluno(Aluno alunonuevo) {

        //para escrever Objetos em um arquivo é diferente
        //quando eu tenho o try evaluado dentro da funcao o close faz automaticamente
        try (ObjectOutputStream escrever = new ObjectOutputStream(new FileOutputStream("ArquivoAluno.txt", true))) {
            escrever.writeObject(alunonuevo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(" Arquivo criado e aluno registrado! ");
        //crie o arquivo estabelecendo o Buffer
       /* File arquivoALuno = new File("ArquivoAluno.txt");

        //quando eu mando escrever ele já cria o arquivo
        FileWriter escrever = new FileWriter(arquivoALuno, true);

        //escrevo o aluno no arquivo
        escrever.write(String.valueOf(alunonuevo));
        escrever.flush();
        escrever.close();*/


    }

    public static void leerArquivo() {

        try (ObjectInputStream leer = new ObjectInputStream(new FileInputStream("ArquivoAluno.txt"))) {
            Aluno alunoleer;
            while ((alunoleer = (Aluno) leer.readObject()) != null) {
                System.out.println(alunoleer);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        //crie o arquivo estabelecendo o Buffer
        /*File arquivoALuno = new File("ArquivoAluno.txt");

        //vou abrir o arquivo para leitura
        FileReader leer = new FileReader(arquivoALuno);
        String alunoLeitura ;

        // como faço para o JAVA ler arquivos de objetos
        while((alunoLeitura = leer.readline) != null){

        }*/

    }
}
