package com.bloemer.api.introducaoaclases.asociacao.classes;


import com.bloemer.api.introducaoaclases.asociacaopratica.AlunoPratica;
import com.bloemer.api.introducaoaclases.asociacaopratica.LocalPratica;
import com.bloemer.api.introducaoaclases.asociacaopratica.ProfesorPratica;
import com.bloemer.api.introducaoaclases.asociacaopratica.SeminarioPratica;


import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MenuPrincipal {

    // LISTAS CRIADAS
    public ArrayList<AlunoPratica> listaAluno = new ArrayList<AlunoPratica>(); //criei a lista == null public
    public ArrayList<LocalPratica> listaLocal = new ArrayList<LocalPratica>();//criei a lista de local == null
    public ArrayList<SeminarioPratica> listaSeminario = new ArrayList<SeminarioPratica>(); // == null
    public ArrayList<ProfesorPratica> listaProfessor = new ArrayList<ProfesorPratica>(); // == null


    public AlunoPratica buscarAluno(String nomeAluno) {

        if (listaAluno.size() != 0) {
            System.out.println("entrei na funcao buscar aluno...");

            for (AlunoPratica aux : listaAluno) {
                if (aux.getNome().equals(nomeAluno)) {
                    return aux;
                }
            }
        } else
            System.out.println("LISTA VACIA");
        return null;//sempre devo retornar null
    }

    public String verificarNomeNaLista(String nomeABuscar) {

        for (AlunoPratica aux : listaAluno) {
            if (aux.getNome() == nomeABuscar) {
                return aux.getNome();
            }
        }
        return null;
    }

    public void clearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println("\n");
        }
    }

    public String verificarProfe(String nomeprofe, String nomeEspec) {
        for (ProfesorPratica aux : listaProfessor) {
            if ((aux.getNome().equals(nomeprofe)) && (aux.getEspecialidade().equals(nomeEspec))) {
                System.out.println(" metodo verificar professor Registraré el professor ");
                return nomeprofe;
            }
        }
        return null;
    }

    public static void load() {
        Scanner in = new Scanner(System.in);
        System.out.print("\n Clique enter para continuar...");
        in.nextLine();
        System.out.print("\n");
    }

    public void actualizarInformacion() {

        //aux.getNome().equals(nomeAluno)
        for (SeminarioPratica auxSem : listaSeminario) {

            //Seminario <--> profesor
            for (ProfesorPratica auxProf : listaProfessor) {

                //comparo si o professor para colocar no relatorio seminario
                if ((auxProf.getSeminarios()).equals(auxSem.getTitulo())) {
                    auxSem.setProfessor(auxProf);//carrego o professor no Seminario
                }
            }

            // Seminario  <--> local
            for (LocalPratica auxLoc : listaLocal) {
                if (auxLoc.getSeminarioQueSeDara().equals(auxSem.getTitulo())) {
                    auxSem.setLocal(auxLoc);
                }
                System.out.println(" sai tranquilo do foreach do local ");
            }

            //Seminario <--> Aluno
            for (AlunoPratica auxAlun : listaAluno) {
                if (auxAlun.getSeminario().equals(auxSem.getTitulo())) {
                    //int tam = auxSem.getAlunos().length;
                    //System.out.println("tamanho del vector alunos: "+ tam);
                    auxSem.setAlunos(new AlunoPratica[]{auxAlun});//passei o aluno para os seminario
                }
            }

        }
    }

    public int menuPrincipal() {
        int opcion;

        Scanner var = new Scanner(System.in);
        int bandera = 0;
        System.out.println("-------------------------------------------------");
        System.out.println("             MENU PRINCIPAL ");
        System.out.println("            DIGITE UMA OPÇÂO:");
        System.out.println(" 1 - REGISTRAR ALUNO. ");
        System.out.println(" 2 - REGISTRAR LOCAL. ");
        System.out.println(" 3 - REGISTRAR SEMINARIO. ");
        System.out.println(" 4 - REGISTRAR PROFESSOR. ");
        System.out.println(" 5 - VISUALIZAR RELATORIO DO(S) ALUNO(S). ");
        System.out.println(" 6 - VISUALIZAR RELATORIO DO LOCAL.");
        System.out.println(" 7 - VISUALIZAR RELATORIO DO(S) SEMINARIO(S). ");
        System.out.println(" 8 - VISUALIZAR RELATORIO PROFESSOR(A). ");
        System.out.println(" 9 - BUSCAR ALUNO. ");
        System.out.println(" 10 - SALIR. ");
        System.out.println("-------------------------------------------------");
        do {
            opcion = var.nextInt();
        } while (opcion != 10 && !(opcion >= 1 && opcion <= 9));

        clearScreen();

        var.nextLine();//queimo uma linha

        switch (opcion) {
            case 1: {
                //registro aluno
                AlunoPratica aluno = new AlunoPratica();
                System.out.println("DIGITE O NOME DO ALUNO:");

                // si es ==null no tengo en la lista o aluno e posso continuar registrando
                String nomeAux = var.nextLine();// tive que fazer isso q se nao pediria nos 2 lugares...

                if (verificarNomeNaLista(nomeAux) == null) {//aqui...
                    aluno.setNome(nomeAux);// e aqui...
                    System.out.println("DIGITE A IDADE DO ALUNO: ");
                    aluno.setIdade(var.nextInt());

                    // se a idade for menor de 18 anos NÃO pode comparecer no seminario

                    //SeminarioPratica sem = new SeminarioPratica();

                    if (aluno.getIdade() >= 18) {
                        var.nextLine();//queimo uma linha

                        System.out.println("DIGITE O SEMINARIO QUE O ALUNO PARTICIPARA: ");
                        String sem = var.nextLine().toUpperCase();

                        if (aluno.getNome() != null && aluno.getIdade() != 0) {
                            aluno.setSeminario(sem);
                            listaAluno.add(aluno);
                            System.out.println("ALUNO(A) REGISTRADO(A) CON EXITO!");
                            bandera = 1;
                        } else
                            System.out.println("FALLA AL REGISTRAR ALUMNO! ");
                    } else System.out.println("EDAD INCORRECTA, NO PUEDE SER MENOR DE EDAD! ");
                } else
                    System.out.println(" Aluno já registrado na lista. ");
                load();
                break;
            }
            case 2: {
                //REGISTRO LOCAL
                LocalPratica local = new LocalPratica();
                System.out.println("DIGITE O NUMERO DO LOCAL : ");
                local.setNumero(var.nextInt());
                var.nextLine();//queimo uma linha,pq
                if (local.getNumero() > 0) {
                    System.out.println("DIGITE A RUA DO LOCAL: ");
                    local.setRua(var.nextLine());
                    System.out.println("DIGITE O BAIRRO DO LOCAL: ");
                    local.setBairro(var.nextLine());
                    System.out.println("DIGITE O NOME DO SEMINARIO");
                    local.setSeminarioQueSeDara(var.nextLine().toUpperCase());

                    if (local.getRua() != null && local.getBairro() != null) {
                        System.out.println("LOCAL REGISTRADO CON EXITO!");
                        listaLocal.add(local);
                        bandera = 1;
                    }
                } else
                    System.out.println("NUMERO INCORRECTO! FALLA AL REGISTRAR  ");
                load();
                break;
            }
            case 3: {
                // registro seminario
                SeminarioPratica seminario = new SeminarioPratica();
                System.out.println("DIGITE O TITULO DO SEMINARIO: ");

                seminario.setTitulo(var.nextLine().toUpperCase());
                if (seminario.getTitulo() != null) {
                    listaSeminario.add(seminario);
                    System.out.println("SEMINARIO REGISTRADO CON EXITO!");
                    bandera = 1;
                } else
                    System.out.println("FALLA AL REGISTRAR SEMINARIO");
                load();
                break;
            }
            case 4: {
                //crio o professor
                ProfesorPratica prof = new ProfesorPratica();
                System.out.println("DIGITE O NOME DO PROFESSOR: ");
                //prof.setNome(var.nextLine());
                String nomeProfe = var.nextLine();
                System.out.println("DIGITE A ESPECIALIDADE DO PROFESSOR: ");
                //prof.setEspecialidade(var.nextLine());
                String especProfe = var.nextLine();


                if (verificarProfe(nomeProfe, especProfe) == null) {
                    prof.setNome(nomeProfe);
                    prof.setEspecialidade(especProfe);

                    SeminarioPratica sem = new SeminarioPratica();//crio o seminario...
                    System.out.println("DIGITE O SEMINARIO A DITAR-SE");
                    sem.setTitulo(var.nextLine().toUpperCase());

                    SeminarioPratica[] seminArray = new SeminarioPratica[1]; // e agora faço o array de seminario
                    seminArray[0] = sem;

                    prof.setSeminarios(seminArray);

                    listaProfessor.add(prof);
                    System.out.println("PROFESSOR REGISTRADO CON EXITO!");
                    bandera = 1;
                } else
                    System.out.println(" FALLA AL REGISTRAR PROFESSOR, REGISTRADO CON LA MISMA ESPECIALIDAD");
                load();
                break;
            }
            case 5:
                //MOSTRAR RELATORIO ALUNOS
                if (listaAluno.size() != 0) {
                    for (AlunoPratica aux : listaAluno) {
                        aux.print();
                    }
                } else {
                    System.out.println(" LISTA ALUNO VACIA. ");
                }
                load();
                break;
            case 6:
                //RELATORIO DO LOCAL
                if (listaLocal.size() != 0) {
                    for (LocalPratica aux : listaLocal) {
                        aux.print();
                    }
                } else {
                    System.out.println("LISTA DE LOCALES VACIA. ");
                }
                load();
                break;
            case 7:
                //RELATORIO SEMINARIO
                if (listaSeminario.size() != 0) {
                    for (SeminarioPratica aux : listaSeminario) {
                        aux.print();
                    }
                } else {
                    System.out.println("LISTA DE SEMINARIO VACIO. ");
                }
                load();
                break;
            case 8:
                //relatorio professor
                if (listaProfessor.size() != 0) {
                    for (ProfesorPratica aux : listaProfessor) {
                        aux.print();
                    }
                } else {
                    System.out.println("-------------- RELATORIO PROFESSOR ------------");
                    System.out.println("LISTA DE PROFESSOR VACIA. ");
                }
                load();
                break;
            case 9:
                System.out.println("DIGITE O NOME DO ALUNO A BUSCAR");
                String alunoABuscar = var.nextLine();
                AlunoPratica aux = new AlunoPratica();
                aux = buscarAluno(alunoABuscar);
                if (aux != null)
                    aux.print();
                load();
        }
        if (bandera == 1) {
            actualizarInformacion();
            System.out.println(" Entrei e atualizei! ");
        }
        return opcion;
    }
}
