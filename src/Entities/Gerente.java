package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerente extends Pessoa{

    private static Integer count = 0;

    private static List<Gerente> listaGerente = new ArrayList<>();

    Documento documento = new Documento();

    public Gerente(String nome, String sobrenome, String dataNascimento, String cpf, String enderecoCompleto) {
        super(count++,nome, sobrenome, dataNascimento, cpf, enderecoCompleto);
    }
    public Gerente(){
        super();

    }

    public List<Gerente> getListaGerente() {
        return listaGerente;
    }

    public void setListaGerente(List<Gerente> listaGerente) {
        this.listaGerente = listaGerente;
    }

    public void cadastrarGerente(Gerente gerente){

        listaGerente.add(gerente);


    }
public void ListarTodosDocumentos(int idGerente){
    documento.getDocumentos().forEach(r -> System.out.println(r.toString()));


}
    public void tratarDocumento(int id) {


        System.out.println("Utilize 1-Arquivar / 2-Desarquivar Documento / 3-Sair");
        Scanner scan = new Scanner(System.in);
        int opcao = Integer.parseInt(scan.nextLine());
        if (opcao == 1) {
           documento.getDocumentos().get(id).setEstadoDocumento("Ativo/Arquivado");


        } else if (opcao == 2) {
            documento.getDocumentos().get(id).setEstadoDocumento("Ativo/Desarquivado");
        }



    }





}

