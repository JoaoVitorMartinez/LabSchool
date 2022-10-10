package br.com.labschool.model;

import java.time.LocalDate;

public class Aluno extends Pessoa{

    private String situacaoDaMatricula;
    private double nota;
    private int totalDeAtendimentosPedagogicos;

    public Aluno() {
    }

    public Aluno(String nome, String telefone, LocalDate dataDeNascimento, String cpf) {
        super(nome, telefone, dataDeNascimento, cpf);
    }

    public Aluno(String nome, String telefone, LocalDate dataDeNascimento, String cpf, String situacaoDaMatricula, double nota) {
        super(nome, telefone, dataDeNascimento, cpf);
        this.situacaoDaMatricula = situacaoDaMatricula;
        this.nota = nota;
        this.totalDeAtendimentosPedagogicos = 0;
    }

    public Aluno Cadastrar(String nome, String telefone, LocalDate dataDeNascimento, String cpf, String situacaoDaMatricula, double nota){
        return new Aluno(nome, telefone, dataDeNascimento, cpf, situacaoDaMatricula, nota);
    }

    public void registraAtendimento(){
        this.totalDeAtendimentosPedagogicos++;
    }

    @Override
    public String toString() {
        return "Código= " +
                super.getCodigo()+
                ", Nome= "+
                super.getNome()+
                ", Nota=" + nota +
                ", AtendimentosPedagogicos= " + totalDeAtendimentosPedagogicos;
    }

    public String getSituacaoDaMatricula() {
        return this.situacaoDaMatricula;
    }

    public double getNota() {
        return this.nota;
    }

    public int getTotalDeAtendimentosPedagogicos() {
        return this.totalDeAtendimentosPedagogicos;
    }

    public void setSituacaoDaMatricula(String situacaoDaMatricula) {
        this.situacaoDaMatricula = situacaoDaMatricula;
    }
}
