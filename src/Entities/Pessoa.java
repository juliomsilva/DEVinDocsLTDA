package Entities;

import java.util.Date;

public class Pessoa {
    private static long count = 0;
    private Integer identificador;
    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private String cpf;
    private String enderecoCompleto;

    public Pessoa(Integer identificador,String nome, String sobrenome, String dataNascimento, String cpf, String enderecoCompleto) {
        this.identificador = identificador;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.enderecoCompleto = enderecoCompleto;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return
                "ID=" + identificador +
                ", Nome='" + nome + '\'' +
                ", Sobrenome='" + sobrenome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", CPF='" + cpf + '\'' +
                ", Endereço='" + enderecoCompleto + '\'';
    }

}
