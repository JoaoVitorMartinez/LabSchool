package br.com.labschool.controller;

import br.com.labschool.model.Aluno;
import br.com.labschool.repository.PessoasRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControllerAluno {
    private Aluno aluno = new Aluno();


    public ControllerAluno() {
    }

    public void cadastrarAluno(String nome, String telefone, String dataDeNascimento, String cpf, String situacaoDaMatricula, double nota) {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDeNascimentoConvertida = LocalDate.parse(dataDeNascimento, formatar);
        Aluno alunoPronto = aluno.Cadastrar(nome, telefone, dataDeNascimentoConvertida, cpf, situacaoDaMatricula, nota);
        PessoasRepository.Pessoas.add(alunoPronto);

    }

    public void alterarSituacaoDeMatricula(String nomeAluno, String situacaoDaMatricula) {
        aluno = PessoasRepository.retornaAlunoPorNome(nomeAluno);
        aluno.setSituacaoDaMatricula(situacaoDaMatricula);

        if (situacaoDaMatricula == "Atendimento Pedagógico") {
            System.out.println("Nome do Pedagogo:");
            Scanner scan = new Scanner(System.in);

            String nomePedagogo = scan.nextLine();
            registrarAtendimento(nomeAluno, nomePedagogo);
        }
    }

    public void registrarAtendimento(String nomeAluno, String nomePedagogo) {
        PessoasRepository.RegistrarAtendimento(nomeAluno, nomePedagogo);
    }

    public void registraAtendimento() {
        aluno.registraAtendimento();
    }


}