package br.com.labschool.model;

import java.time.LocalDate;

public class Professor extends Pessoa {
    private String formacaoAcademica;
    private String experiencia;
    private Boolean estado;

    public Professor() {
    }

    public Professor(String nome, String telefone, LocalDate dataDeNascimento, String cpf) {
        super(nome, telefone, dataDeNascimento, cpf);
    }

    public Professor(String nome, String telefone, LocalDate dataDeNascimento, String cpf, String formacaoAcademica, String experiencia, Boolean estado) {
        super(nome, telefone, dataDeNascimento, cpf);
        this.formacaoAcademica = formacaoAcademica;
        this.experiencia = experiencia;
        this.estado = estado;
    }

    public Professor Cadastrar(String nome, String telefone, LocalDate dataDeNascimento, String cpf, String formacaoAcademica, String experiencia, Boolean estado) {
        return new Professor(nome, telefone, dataDeNascimento, cpf, formacaoAcademica, experiencia, estado);
    }

    @Override
    public String toString() {
        return "Código= " +
                super.getCodigo() +
                ", Nome= " +
                super.getNome() +
                ", Formação Acadêmica= " +
                formacaoAcademica +
                ", Experiencia= " + experiencia + '\'' +
                ", Estado= " + estado;
    }


    public String getExperiencia() {
        return experiencia;
    }

}
