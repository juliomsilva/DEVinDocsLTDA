package App;
import javax.swing.*;
import Entities.Documento;
import Entities.Funcionario;
import Entities.Gerente;
import Entities.Supervisor;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento();
        Funcionario funcionario = new Funcionario();
        Supervisor supervisor = new Supervisor();
        Gerente gerente = new Gerente();

        List<Funcionario> listaFuncionarios = funcionario.getListaFuncionario();
        List<Supervisor> listaSupervisores = supervisor.getListaSupervisor();
        List<Documento> listaDocumentos = documento.getDocumentos();
        List<Gerente> listaGerentes = gerente.getListaGerente();

        Documento padrao1 = new Documento(0,0,"Link1");
        Documento padrao2 = new Documento(0,0,"Link2");
        Documento padrao3 = new Documento(0,1,"Link3");

        documento.cadastrarDocumento(padrao1);
        documento.cadastrarDocumento(padrao2);
        documento.cadastrarDocumento(padrao3);

        Funcionario funcionarioPadrao = new Funcionario("Diego","Antunes","09/02/1998","31738630030","Rua José Sardinha, 10");
        Funcionario funcionarioPadrao2 = new Funcionario("Lorenzo","Anthony","11/02/1953","01784656070","Rua Corbelia, 932");

        funcionario.cadastrarFuncionario(funcionarioPadrao2);
        funcionario.cadastrarFuncionario(funcionarioPadrao);

        Supervisor superPadrao1 = new Supervisor("William","Barbosa","06/07/1995","55949103017","Praça Estudante Orlando Geisel, 865");
        Supervisor superPadrao2 = new Supervisor("Antonia","Carolina","21/07/1995","93382659000","Rua João Nicolau, 994");
        supervisor.cadastrarSupervisor(superPadrao1);
        supervisor.cadastrarSupervisor(superPadrao2);

        Gerente gerente1 = new Gerente("Julio","Cesar","09/02/1996","56464733060","Rua do Kalanchoê, 138");
        gerente.cadastrarGerente(gerente1);





        JOptionPane.showMessageDialog(null,"Bem vindo ao gerenciador de documentos DEVinDocs LTDA ","DevinHouse", JOptionPane.INFORMATION_MESSAGE);

        boolean sair = false;

        while (!sair) {
            System.out.println("Escolha uma das opções abaixo para utilizar o sistema: ");
            System.out.println("1-Cadastrar Funcionário\n2-Cadastrar Supervisor\n3-Cadastro de Gerente\n4-Cadastrar Novo Documento\n5-Listar Documentos (Funcionário)\n6-Listar Documentos (Supervisor)\n7-Listar Documentos (Gerente)\n8-Relatórios\n9-sair");
            Scanner scan = new Scanner(System.in);
            int opcao = Integer.parseInt(scan.nextLine());
            switch (opcao){
                case 1:
                    System.out.println("Cadastro de Novo Funcionário");
                    System.out.print("Nome: ");
                    String nome = scan.nextLine();
                    System.out.print("Sobrenome: ");
                    String sobrenome = scan.nextLine();
                    System.out.print("Data de nascimento utilize dd/MM/yyyy: ");
                    String nascimento = scan.nextLine();
                    System.out.print("Cpf: ");
                    String cpf = scan.nextLine();
                    if (cpf.length() != 11){
                        System.out.println("CPF inválido, por gentileza corrija");
                        break;
                    }
                    System.out.print("Endereço Completo: ");
                    String endereco = scan.nextLine();
                    Funcionario cadastrarFuncionario = new Funcionario(nome, sobrenome, nascimento, cpf, endereco);
                    funcionario.cadastrarFuncionario(cadastrarFuncionario);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Cadastro de Novo Supervisor");
                    System.out.print("Nome: ");
                    String nomeSupervisor = scan.nextLine();
                    System.out.print("Sobrenome: ");
                    String sobrenomeSupervisor = scan.nextLine();
                    System.out.print("Data de nascimento utilize dd/MM/yyyy: ");
                    String nascimentoSupervisor = scan.nextLine();
                    System.out.print("Cpf: ");
                    String cpfSupervisor = scan.nextLine();
                    System.out.print("Endereço Completo: ");
                    String enderecoSupervisor = scan.nextLine();
                    Supervisor cadastrarSupervisor = new Supervisor(nomeSupervisor, sobrenomeSupervisor, nascimentoSupervisor, cpfSupervisor, enderecoSupervisor);
                    supervisor.cadastrarSupervisor(cadastrarSupervisor);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Cadastro de Novo Gerente");
                    System.out.print("Nome: ");
                    String nomeGerente = scan.nextLine();
                    System.out.print("Sobrenome: ");
                    String sobrenomeGerente = scan.nextLine();
                    System.out.print("Data de nascimento utilize dd/MM/yyyy: ");
                    String nascimentoGerente = scan.nextLine();
                    System.out.print("Cpf: ");
                    String cpfGerente = scan.nextLine();
                    System.out.print("Endereço Completo: ");
                    String enderecoGerente = scan.nextLine();
                    Gerente cadastrarGerente = new Gerente(nomeGerente, sobrenomeGerente, nascimentoGerente, cpfGerente, enderecoGerente);
                    gerente.cadastrarGerente(cadastrarGerente);
                    System.out.println();
                    break;
                case 4:
                    try{
                        int tamanhoFuncionario = funcionario.getListaFuncionario().size() ;
                        int tamanhoSupervisor = supervisor.getListaSupervisor().size();
                        if (tamanhoFuncionario == 0 || tamanhoSupervisor == 0){
                            System.out.println("Não existem Funcionários ou Supervisores cadastrados, para usar o sistema cadastre os dois");
                            System.out.println();
                        }
                        else{
                            System.out.println("Cadastro de Novo Documento");
                            System.out.println("ID do supervisor a ser enviado");
                            supervisor.supervisoresDisponiveis();
                            int idSuper = Integer.parseInt(scan.nextLine());
                            listaSupervisores.contains(listaSupervisores.get(idSuper));
                            System.out.println("Digite o ID do criador do documento: ");
                            int idCriador = Integer.parseInt(scan.nextLine());
                            listaFuncionarios.contains(listaFuncionarios.get(idCriador));
                            System.out.println("Insira o link para o documento: ");
                            String linkDocumento = scan.nextLine();
                            Documento inserirDocumento = new Documento(idSuper, idCriador, linkDocumento);
                            documento.cadastrarDocumento(inserirDocumento);
                            System.out.println("Cadastro realizado, documento enviado para aprovação!");
                            System.out.println();
                        }
                    }catch(IndexOutOfBoundsException e){
                        System.out.println("Este colaborador não trabalha aqui!");
                        System.out.println();
                    }

                    break;
                case 5:

                    System.out.println("Aviso: Serão listados somente os documentos criados por você");
                    System.out.println("Insira o seu Identificador");
                    int matricula = Integer.parseInt(scan.nextLine());
                    documento.listarDocumentoFuncionario(matricula);
                    System.out.println();
                    break;

                case 6:
                    try{  System.out.println("Lista de Documentos Cadastrados");
                        System.out.println("Aviso: Serão listados somente os documentos enviados a você");
                        System.out.println("Insira o seu Identificador");
                        int matriculaSuper = Integer.parseInt(scan.nextLine());
                        listaSupervisores.contains(listaSupervisores.get(matriculaSuper));
                        documento.listarDocumentos(matriculaSuper);
                        System.out.println("Digite o id de um documento para aprovar/reprovar");
                        int idDoc = Integer.parseInt(scan.nextLine());
                        listaDocumentos.contains(listaDocumentos.get(idDoc));
                        documento.aprovarDocumento(idDoc);
                        System.out.println();
                    }catch(IndexOutOfBoundsException e){
                        System.out.println("Este colaborador não trabalha aqui ou não existe este documento cadastrado!");
                        System.out.println();
                        break;
                    }



                    break;
                case 7:
                try{  System.out.println("Lista de Documentos Cadastrados");
                    System.out.println("Como gerente, você poderá ver todos os documentos no sistema");
                    System.out.println("Insira a sua matricula");
                    int matriculaGerente = Integer.parseInt(scan.nextLine());
                    listaGerentes.contains(listaGerentes.get(matriculaGerente));
                    gerente.ListarTodosDocumentos(matriculaGerente);
                    System.out.println("Digite o id e um documento para arquivar/desarquivar");
                    int iddocumento = Integer.parseInt(scan.nextLine());
                    listaDocumentos.contains(listaDocumentos.get(iddocumento));
                    gerente.tratarDocumento(iddocumento);
                    System.out.println();
                    break;
                }catch (IndexOutOfBoundsException e){
                    System.out.println("Este colaborador não trabalha aqui ou não existe este documento cadastrado!");
                    System.out.println();
                    break;
                }
                case 8:
                    System.out.println("Lista de Documentos: ");
                    listaDocumentos.forEach(r-> System.out.println(r.toString()));
                    System.out.println();
                    System.out.println("Funcionários: ");
                    listaFuncionarios.forEach(r -> System.out.println(r.toString()));
                    System.out.println();
                    System.out.println("Supervisores: ");
                    listaSupervisores.forEach(r -> System.out.println(r.toString()));
                    System.out.println();
                    System.out.println("Gerentes: ");
                    listaGerentes.forEach(r -> System.out.println(r.toString()));
                    System.out.println();
                    System.out.println("Documentos Arquivados: ");
                    int ContarDocs = 0;
                    for (Documento listaDocumento : listaDocumentos) {
                        if (listaDocumento.getEstadoDocumento().equals("Ativo/Arquivado")) {
                            ContarDocs++;
                        }
                    }
                    System.out.println(ContarDocs);
                    System.out.println();
                    System.out.println();


                    break;

                case 9:
                    sair = true;
                    System.out.println("Saindo do Sistema");
                    break;




            }

        }

    }
}

