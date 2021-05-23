import org.springframework.beans.factory.annotation.Autowired;//

import java.util.Arrays;
import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
       /* int idade =20;
        String status;

        status = idade<18 ? " adulto " : "nao adulto ";
        System.out.println(status);*/

        // ejercicio DEVDOJO controle de fluxo
        //crie uma variavel salario e mostre seu imposto:
        //salario <1000 5%
        //salario >= 1000 && salario <2000 10%
        //salario >=2000 && salario < 5000 15%
        //salario >=5000 20%

        //float salario;
        Scanner var = new Scanner (System.in);
        System.out.println("Digite o salario : ");
        float imposto;
        float salario = var.nextFloat();
        if(salario<1000){
            //imposto = (float) (salario + (salario*0.05));
            System.out.println(" O imposto encima do seu salario de U$S "+salario+"é de 5% U$S "+(salario*0.05));
        }
        else if(salario>=1000 && salario<2000){
            //imposto = (float) (salario + (salario*0.10));
            System.out.println("O imposto sobre seu salario de U$S "+salario+"é de 10% U$S  " + (salario*0.10));
        }
        else if(salario>=2000 && salario<5000){
           // imposto = (float)( salario+(salario*0.15));
            System.out.println("O imposto sobre seu salario de U$S " + salario+" é de 15% U$S "+(salario*0.15));
        }
        else{
            //imposto = (float) (salario+(salario*0.20));
            System.out.println("O imposto sobre seu salario de U$S " +salario+" é de 20% U$S "+(salario*0.20));
        }

    }
}
