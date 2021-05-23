import java.util.Arrays;

public class ControleDeFluxo3 {
    public static void main(String[] args) {
        int cont=10;
        while(cont>0){// o while a condição precisa ter um valor booleano
            System.out.println("num["+(cont)+"]" );
            if(cont==5){continue;}
            cont--;
        }

       /* do{cont++;
            System.out.println("num["+cont+"]" );
        }while(cont<=10);
        cont=0;
        System.out.println("---------- Numeros pares ---------");
        for(int i=0; i<=20;i++){
            if((i%2)!=0){
            System.out.println("num = " +i);}*/
        //}
    }
}
