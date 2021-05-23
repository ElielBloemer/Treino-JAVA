import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntroducao {
    public static void main(String[] args) {

       // int [] num = new int[5];//quando crio o array devo usar memoria head
        //crio usando o tipo de dato que vou usar
        //devo declarar sempre o tamanho do array

        /*System.out.println("----- Digite 10 numeros ------" );
        for(int i=0;i<num.length;i++){
            Scanner var = new Scanner(System.in);
            System.out.println("num[" +(i+1)+"] = ");
            num[i]= var.nextInt();
        }
        System.out.println(" ---- NUMEROS INGRESADOS ---- ");*/
        /*for(int i=0;i<num.length;i++){
            System.out.println("num["+(i+1)+"] = " +num[i]);
        }*/
        //foreach utilizo uma variavel local para passar o que tenho no vetor

      /*  for(int aux: num){
            System.out.println("num = "+aux);
        }*/

        /*String[] nomes = new String[4];

        System.out.println(" ------ DIGITE 4 NOMES ------ ");
        for(int i=0;i<nomes.length;i++)
        {
            Scanner var=new Scanner(System.in);
            System.out.println("nome ["+(i+1)+"] = ");
            nomes[i]=var.nextLine();
        }
        System.out.println(" ---- NOMES DIGITADOS ----- ");
        for(String aux: nomes){
            System.out.println(aux);
        }
        System.out.println(" Obrigado! " );*/



        Scanner var = new Scanner(System.in);
        System.out.println(" ------ DIGITE OS NUMEROS DA MATRIZ ------ ");
        int k=1;
        System.out.print(" digite a cantidade de columnas : ");
        int columna = var.nextInt();
        System.out.print(" Digite a quantidade de filas : ");
        int filas = var.nextInt();
        int[][] num = new int[columna][filas];
        for(int i=0;i< num.length;i++){
            for(int j=0;j< num[i].length;j++){
                System.out.print("num ["+k+"] = ");
                num[i][j]=var.nextInt();
                k++;
            }
        }

        System.out.println("----- MATRIZ --------- ");
        for(int i=0;i< num.length;i++){
            for(int j=0;j< num[i].length;j++)
            {
                System.out.print(num[i][j]+"\t");
            }
            System.out.println("\n");
        }

        int[] dias = {0,1,2};//inicialização array simples
        int[][] dias2 = {{0,0},{1,2,3},{0,0,0,0}};//inicialização array matriz


        // NO JAVA ESTA O print E O println

       /* Scanner pedir = new Scanner(System.in);
        int columnas, filas;
        System.out.println("Escribe el numero de Filas");
        filas =pedir.nextInt();
        System.out.println("Escribe el numero de Columnas");
        columnas =pedir.nextInt();
        int numPrimos[][] = new int [filas][columnas];
        /* Declaración de k en la inicialización del for padre*/
        /*for(int i = 0,k=0;i< numPrimos.length;i++){
            for(int j = 0;j < numPrimos[i].length;j++)
                numPrimos[i][j]=++k;
        }
        /* Imprimir */
        /*for(int i = 0;i<numPrimos.length;i++){
            for(int j = 0;j <numPrimos[i].length;j++)
                System.out.print(numPrimos[i][j] + "\t");
            System.out.print("\n");
        }*/
    }
}
