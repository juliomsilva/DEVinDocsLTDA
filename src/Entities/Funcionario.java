package Entities;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa{
    private static Integer count = 0;


    private static List<Funcionario> listaFuncionario = new ArrayList<>();

    public Funcionario(String nome, String sobrenome, String dataNascimento, String cpf, String enderecoCompleto) {
        super(count++,nome, sobrenome, dataNascimento, cpf, enderecoCompleto);
    }
    public Funcionario(){
        super();

    }


    public void cadastrarFuncionario(Funcionario funcionario){

        listaFuncionario.add(funcionario);


    }

    public List<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public void setListaFuncionario(List<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }
}
