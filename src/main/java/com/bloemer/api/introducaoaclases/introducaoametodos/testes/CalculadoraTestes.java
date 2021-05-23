package com.bloemer.api.introducaoaclases.introducaoametodos.testes;

import com.bloemer.api.introducaoaclases.introducaoametodos.Calculadora;

import java.util.Arrays;
import java.util.Scanner;

public class CalculadoraTestes {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
       /* calc.somaDoisNumeros();
        Scanner aux = new Scanner(System.in);
        System.out.println("Digite 2 numeros, para calcular a multiplicação e divisão: ");
        int num1 = aux.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = aux.nextInt();
        calc.multiplcandoNumeros(num1,num2);
        double resultDivisao = calc.divisaoDeNumeros(num1,num2);
        if(resultDivisao!=0){
        System.out.println(" Divisao = "+resultDivisao);}
        else{
            System.out.println(" divisor = "+num2+", Numero incorreto.");
        }*/
        int []num = {1,2,3,4,5};
        //calc.somaArray(num);
        calc.somaVarArgs(1,2,2);// VarArgas aceita um objeto array ou varios numeros.
        System.out.println(" FIM ");
    }
}
