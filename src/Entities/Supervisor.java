package Entities;

import java.util.ArrayList;

public class Supervisor extends Pessoa{
    private static Integer count = 0;


    private ArrayList<Supervisor> listaSupervisor = new ArrayList<>();


    public Supervisor(String nome, String sobrenome, String dataNascimento, String cpf, String enderecoCompleto) {
        super(count++,nome, sobrenome, dataNascimento, cpf, enderecoCompleto);


    }

    public Supervisor() {
        super();
    }
    public void cadastrarSupervisor(Supervisor supervisor){

        listaSupervisor.add(supervisor);


    }
    public void relatorioSupervisor(){
        listaSupervisor.forEach(r-> System.out.println(r.toString()));
    }


public void supervisoresDisponiveis(){
   listaSupervisor.forEach(r ->
                   System.out.printf("Nome: %s, ID: %d\n",r.getNome(),r.getIdentificador())
           );
}

    public ArrayList<Supervisor> getListaSupervisor() {
        return listaSupervisor;
    }

    public void setListaSupervisor(ArrayList<Supervisor> listaSupervisor) {
        this.listaSupervisor = listaSupervisor;
    }
}




