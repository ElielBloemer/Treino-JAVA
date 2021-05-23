package com.bloemer.api.introducaoaclases.archivos;

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

    }
}
