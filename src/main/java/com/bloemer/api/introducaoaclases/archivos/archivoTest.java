package com.bloemer.api.introducaoaclases.archivos;

<<<<<<< HEAD
import java.io.*;
import java.util.Arrays;

public class archivoTest {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("arquivo txt");
        //esse tipo de leitura e escritura usando o bufferead o bufferwrite otimiza muito
       /* try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);//crio o buffer e uso para optimizacao

            bw.write("escrevendo no arquivo por primeira vez");
            bw.newLine();//pula a linha dentro do arquivo
            bw.write("escrevendo uma linha  no arquivo");
            bw.flush();
            bw.close();

            //boolean a = file.createNewFile();
            //System.out.println("arquivo criado..."+ a );
            FileReader rd = new FileReader(file);
            BufferedReader br = new BufferedReader(rd);
            String linha = null;//aqui crio a variavel na qual eu vou usar para ler o arquivo

            System.out.print("args = ");
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
       /* boolean b = file.exists();
        if(b){
            System.out.println("arquivo deletado... " + file.delete());
        }*/

        //codigo utilizando o try if resourcing ficando muito mais otimizado

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file))) {
            bw.write("escrevendo no arquivo por primeira vez");
            bw.newLine();//pula a linha dentro do arquivo
            bw.write("escrevendo uma linha  no arquivo");
            bw.flush();
            bw.close();

            String linha;//não preciso inicializar aqui já que vai inicializar sempre em baixo

            System.out.print("args = ");
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
=======
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class archivoTest {
    public static void main(String[] args) {
        File file = new File("arquivo txt");
        try {
            boolean a = file.createNewFile();
            System.out.println("arquivo criado..."+ a );
        } catch (IOException e) {
            e.printStackTrace();
            }
        boolean b = file.exists();
        if(b){
            System.out.println("arquivo deletado... " + file.delete());
        }

>>>>>>> refs/remotes/origin/main
    }
}
