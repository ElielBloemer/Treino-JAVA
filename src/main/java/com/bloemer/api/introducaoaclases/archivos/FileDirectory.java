package com.bloemer.api.introducaoaclases.archivos;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDirectory {
    public static void main(String[] args) throws IOException {
        /*File diretorio = new File("folder");
        try {
            file.createNewFile();//criei o arquivo e trato a exceção
        } catch (IOException e) {
            e.printStackTrace();
        }
         boolean mkdir = diretorio.mkdir();
        System.out.println("diretorio criado :" + mkdir);

        File arquivo = new File(diretorio,"arquivo.txt");
        boolean newFile = arquivo.createNewFile();
        System.out.println("arquivo criado : "+newFile);

        File arquivoNovoNome = new File(diretorio,"arquivoRenomeado.txt");
        boolean renamedArquivo = arquivo.renameTo(arquivoNovoNome);
        System.out.println("arquivo renomeado: " + renamedArquivo);

        File diretorioRenomeado = new File("folder2");
        boolean diretoriorenamed = diretorio.renameTo(diretorioRenomeado);
        System.out.println("diretorio renomeado: " + diretoriorenamed);*/

        buscarArquivos();

    }

    public static void buscarArquivos(){
        File file = new File("folder2");
        String[] list= file.list();//devolve como uma lista de String
        System.out.println("Arquivo(s): ");
        for(String arquivo : list){
            System.out.println(arquivo);
        }
    }
}
