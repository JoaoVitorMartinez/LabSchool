package br.com.labschool.controller;


import br.com.labschool.model.Professor;
import br.com.labschool.repository.PessoasRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ControllerProfessor {

    private Professor professor = new Professor();

    public ControllerProfessor() {
    }

    public void cadastrarProfessor(String nome, String telefone, String dataDeNascimento, String cpf, String formacaoAcademica, String experiencia, Boolean estado) {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDeNascimentoConvertida = LocalDate.parse(dataDeNascimento, formatar);
        Professor professorPronto = professor.Cadastrar(nome, telefone, dataDeNascimentoConvertida, cpf, formacaoAcademica, experiencia, estado);
        PessoasRepository.Pessoas.add(professorPronto);
    }


}
