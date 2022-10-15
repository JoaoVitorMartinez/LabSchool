package br.com.labschool.model;

import br.com.labschool.repository.PessoasRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private int codigo;
    private String nome;
    private String telefone;
    private LocalDate dataDeNascimento;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, LocalDate dataDeNascimento, String cpf) {
        this.codigo = PessoasRepository.Pessoas.size() + 1;
        this.nome = nome;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "Codigo= " + codigo + ", Nome= " + nome + ", CPF= " + cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }


}
