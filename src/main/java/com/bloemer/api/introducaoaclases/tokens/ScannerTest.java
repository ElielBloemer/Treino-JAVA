package com.bloemer.api.introducaoaclases.tokens;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("1 true 100 oi ");
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }

        System.out.println("********************************************************" );
        Scanner scanner2 = new Scanner("1 true 100 oi");

        while(scanner2.hasNext()){
            if(scanner2.hasNextInt()){
                int num = scanner2.nextInt();
                System.out.println("num: "+num);
            }else if(scanner2.hasNextBoolean()){
                boolean a = scanner2.nextBoolean();
                System.out.println("bool: " + a);
            }else{
                System.out.println("String: "+ scanner2.next());
            }
        }
    }

}
