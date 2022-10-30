package Entities;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Documento {
    Funcionario funcionario = new Funcionario();


    private static List<Documento> Documentos = new ArrayList<>();


    private static long count = 0;
    private long identificador;
    private int identificadorResponsavel;
    private int identificadorCriador;
    private String linkDocumento;
    private String estadoDocumento;
    private Date criacaoDoc;

    private String Status;

    private static SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");


    public Documento(int identificadorResponsavel, int identificadorCriador, String linkDocumento) {

        this.identificador = count ++;
        this.identificadorResponsavel = identificadorResponsavel;
        this.identificadorCriador = identificadorCriador;
        this.linkDocumento = linkDocumento;
        this.estadoDocumento = "Ativo/Desarquivado";
        this.Status = "Pendente de Aprovação";
       this.criacaoDoc = new Date();

    }

    public Documento() {

    }


    public void setStatus(String status) {
        Status = status;
    }


    public String getEstadoDocumento() {
        return estadoDocumento;
    }

    public void setEstadoDocumento(String estadoDocumento) {
        this.estadoDocumento = estadoDocumento;
    }


    @Override
    public String toString() {
        return
                "ID=" + identificador +
                ", identificadorResponsavel=" + identificadorResponsavel +
                ", identificadorCriador=" + identificadorCriador +
                ", linkDocumento='" + linkDocumento + '\'' +
                ", estadoDocumento='" + estadoDocumento + '\''+
                ", StatusDocumento='" + Status+ '\'' +
                 ", Data de Criação='" + dateformat.format(criacaoDoc)+ '\'';
    }

    public List<Documento> getDocumentos() {
        return Documentos;
    }


    public void cadastrarDocumento(Documento documento) {

        Documentos.add(documento);



    }
    List<Funcionario> listadosFuncionarios = funcionario.getListaFuncionario();

    public void listarDocumentoFuncionario(int id) {
        try {

            if (Documentos.size() == 0) {
                System.out.println("Não existem documentos cadastrados");
            } else {
                Documentos.forEach(r -> {
                    if (id == r.identificadorCriador) {
                        System.out.println(r.toString());
                    }
                });
                listadosFuncionarios.contains(listadosFuncionarios.get(id));
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Este colaborador não trabalha aqui!");
        }
    }



    public void listarDocumentos(int id){
        if(Documentos.size() == 0){
            System.out.println("Não existem documentos cadastrados");
        }else {
            Documentos.forEach(r -> {
                if (id == r.identificadorResponsavel && r.estadoDocumento != "Ativo/Arquivado") {
                    System.out.println(r.toString());
                }

            });

        }

    }
    public void aprovarDocumento(int id) {


            System.out.println("Utilize 1-Aprovar Documento / 2-Reprovar Documento / 3-Sair");
            Scanner scan = new Scanner(System.in);
            int opcao = Integer.parseInt(scan.nextLine());
            if (opcao == 1) {
                Documentos.get(id).setStatus("Aprovado");


            } else if (opcao == 2) {
                Documentos.get(id).setStatus("Reprovado");
            }



    }



}

