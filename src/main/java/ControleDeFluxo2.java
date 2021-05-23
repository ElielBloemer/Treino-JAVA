import java.util.Arrays;
import java.util.Scanner;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        ///int diaDaSemana;
        System.out.println("Digite o dia da semana :");
        int diaDaSemana = var.nextInt();
        //var.nextLine();//queimo uma linha
        //os tipos de variaveis que vao dentro do switch sao char,short, int, String(apartir do java7)
        //crie um programa que leia dia de semana e diga se e fim de semana o dia util
        switch (diaDaSemana) {
            case 1:
                System.out.println("Hoje é domingo, fim de semana");
                break;
            case 2:
                System.out.println("Hoje é segunda-feira,dia útil");
                break;
            case 3:
                System.out.println("Hoje é terça-feira,dia útil ");
                break;
            case 4:
                System.out.println("Hoje é quarta-feira, dia útil ");
                break;
            case 5:
                System.out.println("Hoje é quinta-feira,dia útil");
                break;
            case 6:
                System.out.println("Hoje é sexta-feira,dia útil");
                break;
            case 7:
                System.out.println("Hoje é Sabado o dia do senhor! Feliz sabado");
                break;
            default: // quando a opção é invalida
                System.out.println("Opção invalida");
        }
        //System.out.println("Obrigado por digitar o dia da semana! :D");
    }
}
