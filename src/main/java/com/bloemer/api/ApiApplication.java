package com.bloemer.api;

import com.bloemer.api.introducaoaclases.asociacao.classes.MenuPrincipal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.swing.JOptionPane;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
		//print();
		//printEndereco();
		//printTrabalhador();
        //printSoma();

		MenuPrincipal menu = new MenuPrincipal();

        int opcion = 0;
        do {
            opcion = menu.menuPrincipal();
        } while (opcion != 10);

        System.out.println("FINALIZADO PROGRAMA OBRIGADO! ");
	}
   /*
    private static void printSoma() {
	    int numero1=10;
	    int numero2= 20;
	    System.out.println(" A soma é "+(numero2+numero1));
    }

    private static void printTrabalhador() {
	    System.out.println("---------------------------------------------------------------------------------");
	    System.out.println("                                DATOS TRABALHADOR                                ");
	    Scanner var = new Scanner(System.in);
	    System.out.println("Digite o nome : ");
	    String nome = var.nextLine();
	    System.out.println("Digite o salario R$ : ");
	    float salario = var.nextFloat();
	    System.out.println("Digite o sexo : ");
	    char sexo = var.next().charAt(0);
        System.out.println("Digite o estado civil :");
        String estadoCivil = var.next();
	    System.out.println("Digite a idade :");
	    int idade = var.nextInt();
	    System.out.println(" O trabalhador(a) "+ nome+" do sexo "+sexo+", idade "+idade+", estado civil "+estadoCivil+" e salario R$ "+salario+" escontrase empregado em este estabelecimento. ");

    }

    private static void printEndereco(){
	    System.out.println("Digite o nome : ");
	    Scanner var = new Scanner(System.in);
	    String nome = var.nextLine();
	    System.out.println("Digite o endereço : ");
        String endereco = var.nextLine();
        System.out.println("Digite o telefone : ");
        int telefone = var.nextInt();
        System.out.println(" O "+nome+" domicialiado no endereço "+endereco+" e telefone "+telefone+" não possui nenhuma pendencia .");

    }
	private static void print() {
		//System.out.println("eliel bloemer correa");
	//	Date now = new Date();
	//	System.out.println(now);
		//setPessoa();// USO O MODULO PRINT PARA LER ESA CLASE
		//setPessoaFisica();// USO O MODULO PRINT PARA LER ESA CLASE
       // setPessoaJuridica();
		//buildCarro();
		//buildNavio();
		//buildTrem();

        /*Scanner s = new Scanner(System.in);
        System.out.println("quantos anos voce tem : ");
        int idade = s.nextInt();
        //System.out.println("voce tem "+idade+" anos. ");
        System.out.println("Digite seu nome : ");
        s.nextLine();// queimo uma linha, não sei por que depois de pedir um inteiro ele pula, ignorando o pedido anterior...
        String nome = s.nextLine();
        System.out.println(" seu nome é "+nome+" e voce tem "+idade+" anos. ");*/


	}

	/*public void setPessoa(){
	    Pessoa pessoa1 = new Pessoa();
	    pessoa1.setConta(12452);
	    pessoa1.setNome("Eliel Bloemer");

	    Pessoa pessoa2 = new Pessoa();
	    pessoa2.setConta(645231);
	    pessoa2.setNome("Carlos Aguilar");

	    System.out.println(pessoa1.getNome());
	    System.out.println(pessoa1.getConta());

        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getConta());

    }*/

    /*public void setPessoaFisica(){

	    PessoaFisica pessoa1 = new PessoaFisica(); //POO
	    pessoa1.setNome("Maria luz rodriguez");
	    pessoa1.setConta(12446);
	    pessoa1.setCpf(33745);

	    PessoaFisica pessoa2 = new PessoaFisica();//AQUI CRIO ESPAÇO NA MEMORIA
	    pessoa2.setNome("Thiago Bloemer Correa");// A set FAZ O RETURN DA DA VARIAVEL
	    pessoa2.setConta(98754);
	    pessoa2.setCpf(98754);

	    System.out.println(pessoa1.getNome()); // JA O get FAZ A LEITURA COMO UM VOID, HABILITEI PARA LER O NOME PESSOA 1
	    System.out.println(pessoa1.getConta()); // HABILITO PARA LER A CONTA PESSOA 1
	    System.out.println(pessoa1.getCpf()); // HABILITO PARA LER O CPF PESSOA 1

	    System.out.println(pessoa2.getNome()); //  HABILITO PARA LER O NOME DA PESSOA 2
	    System.out.println(pessoa2.getConta());// HABILITO PARA LER A CONTA DA PESSOA 2
	    System.out.println(pessoa2.getCpf());// HABILITO PARA LER O CPF DA PESSOA 2
    }*/

    // PRECISO CRIAR FUNCAO QUE VAI ASIGINAR VALORES AS CLASES PESSOAS

   /* public void setPessoaJuridica(){

	    PessoaJuridica pessoa1 = new PessoaJuridica(); // CRIO EM MEMORIA HEAP
	    pessoa1.setNome(" NOME : Paulo cortez");// ASGINO O NOME A PESSOA1 JURIDICA
	    pessoa1.setConta(56289);
	    pessoa1.setCnpj(987564238);

	    PessoaJuridica pessoa2 = new PessoaJuridica();// CRIO MEMORIA HEAD
	    pessoa2.setNome(" Nome : Elivelton Correa");//ASGINO O NOME A PESSOA2 JURIDICA
	    pessoa2.setConta(987548);
	    pessoa2.setCnpj(6542831);

      // HABILITO PARA LER OS DATOS DA CLASE ASGINADOS NESSA FUNCAO
                   //PESSOA1
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getConta());
        System.out.println(pessoa1.getCnpj());
                   //PESSOA2
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getConta());
        System.out.println(pessoa2.getCnpj());

    }

                        // Clase CARRO
    public void buildCarro(){
		Carro carro1 = new Carro();// new usamos para OOP
		Scanner teclado = new Scanner(System.in);
        System.out.println("--------------------------------------------------------- ");
        System.out.println("               Digite as informaçoes (CARRO 1)            ");
		carro1.setNomePiloto("Nome Motorista : Julio Souza");
		carro1.setModeloCarro("Modelo : Ford Fiesta.");
		carro1.setManutencaoMensal("Manutenção Mensal : SIM.");
		carro1.setPlaca(12578);
		carro1.setAnoDeFabricao(2005);
        carro1.setCantPasajeros(3);
        carro1.setTipoDeCombustivel("Gasolina ");// tentando pedir por console
        carro1.setPaisDeFabricacao(" United Stats of America ");
        carro1.setCantPortas(2);
        carro1.setServicoABordo("NÃO");


		// ASIGNO VALOR A MEMORIA HEAD

		Carro carro2 = new Carro();
		carro2.setNomePiloto(" Oguimar Flores.");
		carro2.setModeloCarro(" Volkswagem GOL.");
		carro2.setManutencaoMensal(" NÃO");
		carro2.setAnoDeFabricao(2008);
		carro2.setPlaca(98754);
		carro2.setCantPasajeros(4);
		carro2.setPaisDeFabricacao("Alemanha");
		carro2.setCantPortas(4);
		carro2.setTipoDeCombustivel("Gasolina Premiun ");
        carro2.setServicoABordo("NÃO");
		// OJO ACORDARSE DE HABILITAR PARA LECTURA!!!

        // OJO ACORDARSE DE HABILITAR LA LECTURA POR PANTALLA
        System.out.println("--------------------------------------------------------- ");
        System.out.println("                  INFORMAÇÂO CARRO 1                      ");
        System.out.println(carro1.getNomePiloto());
        System.out.println(carro1.getModeloCarro());
        System.out.println(carro1.getManutencaoMensal());
        System.out.println("Numero da placa : "+String.valueOf(carro1.getPlaca()));
        System.out.println("Ano de fabricação : "+String.valueOf(carro1.getAnoDeFabricao()));
        System.out.println("Pais de fabricação : "+carro1.getPaisDeFabricacao());
        System.out.println("Quantidade de portas : "+String.valueOf(carro1.getCantPortas()));
        System.out.println("Tipo de combustivel : "+carro1.getTipoDeCombustivel());
        System.out.println("Serviço a bordo : "+carro1.getServicoABordo());
        carro1.percorrer();
        System.out.println("---------------------------------------------------------");
        System.out.println("\n");


		System.out.println("---------------------------------------------------------");
		System.out.println("                  INFORMAÇÂO CARRO 2                      ");
		System.out.println("Nome :"+carro2.getNomePiloto());
		System.out.println("Modelo : "+carro2.getModeloCarro());
		System.out.println("Manutenção Mensal : "+carro2.getManutencaoMensal());
		System.out.println("Ano de fabricação : "+String.valueOf(carro2.getAnoDeFabricao()));
		System.out.println("Pais de fabricação : "+carro2.getPaisDeFabricacao());
		System.out.println("Placa do carro : "+String.valueOf(carro2.getPlaca()));
		System.out.println("Quantidade de pasajeiros : "+String.valueOf(carro2.getCantPasajeros()));
        System.out.println("Quantidade de portas : "+String.valueOf(carro2.getCantPortas()));
        System.out.println("Tipo de combustivel : "+carro2.getTipoDeCombustivel());
        System.out.println("Serviço a bordo : "+carro2.getServicoABordo());
        carro2.percorrer();/*só envoco a função!! não mando ler pq dentro da função ja esta
		 a saida por console*/
		//System.out.println("---------------------------------------------------------");
	//}

	//                       CLASE NAVIO
	/*public  void buildNavio (){
     Navio naviodatos =  new Navio();
     Scanner teclado = new Scanner(System.in);
     System.out.println("----------------------------------------------------------------------------");
     System.out.println("                           Digite as informaçoes(navio 1)                   ");
     System.out.println("Digite o nome do piloto : ");
     naviodatos.setNomePiloto(teclado.nextLine());
     System.out.println("Quantidade de pasajeiros ?");
     naviodatos.setCantPasajeros(teclado.nextInt());
     System.out.println("Ano de fabricação ?");
     naviodatos.setAnoDeFabricao(teclado.nextInt());
     System.out.println("Quantidade de botes ?");
     naviodatos.setCantBotes(teclado.nextInt());
     System.out.println("Quantidade de motores ?");
     naviodatos.setCantMotores(teclado.nextInt());
     teclado.nextLine();//queimo uma linha
     System.out.println("Tipo de combustivel ?");
     naviodatos.setTipoDeCombustivel(teclado.next());
     System.out.println("Pais de fabricação ? ");
     naviodatos.setPaisDeFabricacao(teclado.next());
     System.out.println("Possue serviço de bordo ?");
     naviodatos.setServicoABordo(teclado.next());
     System.out.println("----------------------------------------------------------------------------");



     Navio naviodatos2 = new Navio();
     System.out.println("----------------------------------------------------------------------------");
     System.out.println("                         Digite as informaçoes(navio 2)                     ");
     teclado.nextLine();//queimo uma linha...
     System.out.println("Nome piloto? ");
     naviodatos2.setNomePiloto(teclado.nextLine());
     System.out.println("Quantidade de pasajeiros ?");
     naviodatos2.setCantPasajeros(teclado.nextInt());
     System.out.println("Ano de fabricação ?");
     naviodatos2.setAnoDeFabricao(teclado.nextInt());
     System.out.println("Quantidade de botes ?");
     naviodatos2.setCantBotes(teclado.nextInt());
     System.out.println("Quantidade de motores ? ");
     naviodatos2.setCantMotores(teclado.nextInt());
     System.out.println("Tipo de combustivel ? ");
     naviodatos2.setTipoDeCombustivel(teclado.next());
     System.out.println("Pais de fabricação ? ");
     naviodatos2.setPaisDeFabricacao(teclado.next());
     System.out.println("Possue serviço de bordo ? ");
     naviodatos2.setServicoABordo(teclado.next());

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                             INFORMAÇÂO BARCO 1                              ");
        System.out.println(naviodatos.getNomePiloto());
        System.out.println(" Quantidade de pasajeros : "+String.valueOf(naviodatos.getCantPasajeros()));
        System.out.println(" Ano de fabricação : "+String.valueOf(naviodatos.getAnoDeFabricao()));
        System.out.println(" Quantidade de botes : "+String.valueOf(naviodatos.getCantBotes()));
        System.out.println(" Quantidade de motores : "+String.valueOf(naviodatos.getCantMotores()));
        System.out.println(" Tipo de combustivel : "+naviodatos.getTipoDeCombustivel());
        System.out.println(" Pais de fabricação : "+naviodatos.getPaisDeFabricacao());
        System.out.println(" Serviço a bordo : "+naviodatos.getServicoABordo());
        naviodatos.percorrer();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\n");

     System.out.println("----------------------------------------------------------------------------");
     System.out.println("                             INFORMAÇÂO BARCO 2                              ");
     System.out.println(naviodatos2.getNomePiloto());
     System.out.println("Quantidade de pasajeiros : "+String.valueOf(naviodatos2.getCantPasajeros()));
     System.out.println("Ano de fabricação : "+String.valueOf(naviodatos2.getAnoDeFabricao()));
     System.out.println("Quantidade de botes : "+String.valueOf(naviodatos2.getCantBotes()));
     System.out.println("Quantidade de motores : "+String.valueOf(naviodatos2.getCantMotores()));
     System.out.println("Tipo de combustivel : "+ naviodatos2.getTipoDeCombustivel());
     System.out.println("Pais de fabricação : "+naviodatos2.getPaisDeFabricacao());
     System.out.println("Serviço a bordo : "+naviodatos2.getServicoABordo());
     naviodatos.percorrer();
     System.out.println("----------------------------------------------------------------------------");

     /* String tresString = new String("3");
     int tresInt = 3;
     String concat = String.valueOf(tresInt)+tresString;
	 int parse = Integer.parseInt(tresString);
		System.out.println(concat);
        System.out.println(parse+tresInt);*/



        // TUDO NO JAVA SE CRIA COMO CLASE teclado faz referencia entrada por console

     /*Scanner teclado = new Scanner(System.in);
     System.out.println("Digite sua Idade : ");
     int idade = teclado.nextInt();
     System.out.println("Digite sua idade é de "+String.valueOf(idade)+" anos. ");*/

    //}

    //                       CLASE TREM
   /* public  void buildTrem()
	{
		Trem trem1 = new Trem();//crio a clase para leer
		Scanner teclado = new Scanner(System.in);//Crio a clase para receber os nomes
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                        PREENCHA OS FORMULARIO(TREM 1)                     ");
		System.out.print("Digite o nome do maquinista : ");
		trem1.setNomePiloto(teclado.nextLine()) ;// PARA A INDO PEÇO DENTRO
		System.out.println("Digite o que irá cargar o trem : ");
		trem1.setTipoDeCarga(teclado.nextLine())  ;
		System.out.println("Digite o ano de fabricação do trem : ");
		trem1.setAnoDeFabricao(teclado.nextInt())  ;
		System.out.println("Digite a quantidade de vagoes do trem : ");
		trem1.setCantVagoes(teclado.nextInt()) ;
		teclado.nextLine();//queimo uma linha...
		System.out.println("Digite o Pais de fabricação do trem : ");
		trem1.setPaisDeFabricacao(teclado.nextLine()) ;
		System.out.println("Esse serviço possue serviço de bordo ?");
		trem1.setServicoABordo(teclado.next()) ;
		System.out.println("Tipo de combustivel do Vehiculo ? ");
		trem1.setTipoDeCombustivel(teclado.next()) ;
		System.out.println("Quantidade de Pasajeiros ? ");
		trem1.setCantPasajeros(teclado.nextInt());
        teclado.nextLine();//queimo uma linha...

        Trem trem2 = new Trem();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                        PREENCHA OS FORMULARIO(TREM 2)                     ");
        System.out.println("Digite o nome do motorista :" );
        trem2.setNomePiloto(teclado.nextLine()) ;
        System.out.println("Digite o tipo de carga do trem : ");
        trem2.setTipoDeCarga(teclado.next()) ;
        System.out.println("Quantidade de vagoes ? ");
        trem2.setCantVagoes(teclado.nextInt());
        teclado.nextLine();//queimo uma linha...
        System.out.println("Quantidade de pasajeiros ? ");
        trem2.setCantPasajeros(teclado.nextInt()) ;
        teclado.nextLine();//queimo uma linha...
        System.out.println("Esse serviço possue serviço de bordo ? ");
        trem2.setServicoABordo(teclado.next());
        System.out.println("Tipo de combustivel ? ");
        trem2.setTipoDeCombustivel(teclado.next()) ;
        System.out.println("Pais de fabricação do trem ? ");
        trem2.setPaisDeFabricacao(teclado.next());
        System.out.println("Ano de fabricação do trem ?");
        trem2.setAnoDeFabricao(teclado.nextInt());


		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                          INFORMAÇÂO TREM 1                              ");
		System.out.println(" Nome piloto : "+trem1.getNomePiloto());
		System.out.println(" Tipo de carga : "+trem1.getTipoDeCarga());
		System.out.println(" Ano de fabricação : "+trem1.getAnoDeFabricao());
		System.out.println(" Quantidade de vagões : "+trem1.getCantVagoes());
		System.out.println(" Pais de fabricação : "+trem1.getPaisDeFabricacao());
		System.out.println(" Serviço a bordo : "+trem1.getServicoABordo());
		System.out.println(" Tipo de combustivel : "+trem1.getTipoDeCombustivel());
		System.out.println(" Quantidade de pasajeiros : "+trem1.getCantPasajeros());
		trem1.percorrer();
		System.out.println("-------------------------------------------------------------------------");



		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                          INFORMAÇÂO TREM 2                               ");
        System.out.println("Nome piloto : "+trem2.getNomePiloto());
        System.out.println("Tipo de carga : "+trem2.getTipoDeCarga());
        System.out.println("Quantidade de vagões : "+String.valueOf(trem2.getCantVagoes()));
        System.out.println("Quantidade de pasajeiros : "+String.valueOf(trem2.getCantPasajeros()));
        System.out.println("Serviço a bordo : "+trem2.getServicoABordo());
        System.out.println("Tipo de combustivel : "+trem2.getTipoDeCombustivel());
        System.out.println("Pais de fabricação : "+trem2.getPaisDeFabricacao());
        System.out.println("Ano de fabricação : "+trem2.getAnoDeFabricao());
        trem2.percorrer();
		System.out.println("-------------------------------------------------------------------------");
	}*/
//}

