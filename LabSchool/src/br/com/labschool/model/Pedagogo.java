package br.com.labschool.model;

import java.time.LocalDate;

public class Pedagogo extends Pessoa{
    public  int atendimentosPedagogicosRealizados;

    public Pedagogo() {
    }

    public Pedagogo(String nome, String telefone, LocalDate dataDeNascimento, String cpf) {
        super(nome, telefone, dataDeNascimento, cpf);
        this.atendimentosPedagogicosRealizados = 0;
    }

    public Pedagogo Cadastrar(String nome, String telefone, LocalDate dataDeNascimento, String cpf){
        return new Pedagogo(nome, telefone, dataDeNascimento, cpf);
    }

    public void realizarAtendimento(){
        this.atendimentosPedagogicosRealizados++;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", Atendimentos Realizados=" + atendimentosPedagogicosRealizados;
    }
}
