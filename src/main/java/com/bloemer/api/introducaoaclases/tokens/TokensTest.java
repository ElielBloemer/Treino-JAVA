package com.bloemer.api.introducaoaclases.tokens;

import java.util.Arrays;

public class TokensTest {
    public static void main(String[] args) {
        String str = "William,paulo,johana,mateus";
        String[] tokens = str.split(",");
        System.out.println("Nomes colocados como array");
        for(String arr: tokens){
            System.out.println(arr);
        }
    }
}
