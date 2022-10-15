package br.com.labschool.model;

import java.time.LocalDate;
import java.util.Comparator;

public class Pedagogo extends Pessoa implements Comparator, Comparable {
    public int atendimentosPedagogicosRealizados;

    public Pedagogo() {
    }

    public Pedagogo(String nome, String telefone, LocalDate dataDeNascimento, String cpf) {
        super(nome, telefone, dataDeNascimento, cpf);
        this.atendimentosPedagogicosRealizados = 0;
    }

    public Pedagogo Cadastrar(String nome, String telefone, LocalDate dataDeNascimento, String cpf) {
        return new Pedagogo(nome, telefone, dataDeNascimento, cpf);
    }

    public void realizarAtendimento() {
        this.atendimentosPedagogicosRealizados++;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Atendimentos Realizados=" + atendimentosPedagogicosRealizados;
    }

    @Override
    public int compareTo(Object o) {
        if (this.getAtendimentosPedagogicosRealizados() < (((Pedagogo) o).getAtendimentosPedagogicosRealizados())) {
            return -1;
        } else if (this.getAtendimentosPedagogicosRealizados() > (((Pedagogo) o).getAtendimentosPedagogicosRealizados())) {
            return 1;

        }


        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return ((Pedagogo) o1).getAtendimentosPedagogicosRealizados().compareTo(((Pedagogo) o2).getAtendimentosPedagogicosRealizados());
    }

    public Integer getAtendimentosPedagogicosRealizados() {
        return atendimentosPedagogicosRealizados;
    }


}
