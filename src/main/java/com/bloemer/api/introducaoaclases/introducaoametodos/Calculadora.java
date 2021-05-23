package com.bloemer.api.introducaoaclases.introducaoametodos;

import java.util.Arrays;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(5+5);
    }
    public void multiplcandoNumeros(int num1,int num2){
        System.out.println(" Multiplicação = "+ num1 * num2);
    }
    public double divisaoDeNumeros( double num1,double num2){
        if(num2!=0){
        return num1/num2;}
        return 0;
    }
    public void somaArray(int[] numeros){
        int soma=0;//INICIALIZAR A VARIVEL!!
        for(int aux:numeros){
            soma += aux;
        }
        System.out.println("soma = " +soma);
    }
    public void somaVarArgs(int...num){
        int soma=0;
        for(int aux:num){
            soma+=aux;
        }
        System.out.println("soma = " +soma);
    }
}
