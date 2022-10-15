package br.com.labschool.cli;

import br.com.labschool.controller.*;
import br.com.labschool.exception.InputException;
import br.com.labschool.repository.PessoasRepository;

import java.util.Scanner;

public class Display {
    private final ControllerAluno alunoControl = new ControllerAluno();
    private final ControllerPedagogo pedagogoControl = new ControllerPedagogo();
    private final ControllerProfessor professorControl = new ControllerProfessor();


    public String capturaInputDoUsuario() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }


    public void menu() {
        System.out.println("\u001B[32m");
        System.out.println("=-=-=-=-=-=-=-=-=-Lab School-=-=-=-=-=-=-=-=-=");
        System.out.println("\u001B[0m");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Atualizar Situação da Matrícula do Aluno");
        System.out.println("3 - Cadastrar Professor");
        System.out.println("4 - Cadastrar Pedagogo");
        System.out.println("5 - Cadastrar Atendimento Pedagógico");
        System.out.println("6 - Relatórios");
        System.out.println("7 - Sair");
        System.out.println();
    }

    public void cadastrarAluno(String nome, String telefone, String dataDeNascimento, String cpf, String situacaoDaMatricula, double nota) {

        alunoControl.cadastrarAluno(nome, telefone, dataDeNascimento, cpf, situacaoDaMatricula, nota);


    }

    public void alterarSituacaoDeMatricula(String nomeAluno, String situacaoDaMatricula) {

        alunoControl.alterarSituacaoDeMatricula(nomeAluno, situacaoDaMatricula);
    }

    public String menuSituacaoDaMatricula() {
        System.out.println();
        System.out.println("""
                \u001B[32mQual a situação da matrícula do aluno:\u001B[0m
                1 - Ativo
                2 - Inativo
                3 - Irregular
                4 - Atendimento Pedagógico
                """);
        String opcao = capturaInputDoUsuario();
        String situacaoDaMatricula = "";

        switch (opcao) {
            case "1":
                situacaoDaMatricula = "Ativo";
                break;
            case "2":
                situacaoDaMatricula = "Inativo";
                break;

            case "3":
                situacaoDaMatricula = "Irregular";
                break;

            case "4":
                situacaoDaMatricula = "Atendimento Pedagógico";
                alunoControl.registraAtendimento();
                break;

            default:
                try {
                    throw new InputException("Você digitou uma opção inválida, vamos tentar novamente...");

                } catch (InputException e) {
                    System.out.println(e.getMessage());
                }
                break;
        }

        return situacaoDaMatricula;
    }

    public String menuFormacaoAcademica() {
        System.out.println();
        System.out.println("""
                Qual a formação acadêmica do professor?
                1 - Graduação incompleta
                2 - Graduação completa
                3 - Mestrado
                4 - Doutorado
                """);
        String opcao = capturaInputDoUsuario();
        String formacaoAcademica;

        switch (opcao) {
            case "1" -> formacaoAcademica = "Graduação incompleta";
            case "2" -> formacaoAcademica = "Graduação completa";
            case "3" -> formacaoAcademica = "Mestrado";
            case "4" -> {
                formacaoAcademica = "Doutorado";
                alunoControl.registraAtendimento();
            }
            default -> {
                try {
                    throw new InputException("Você digitou uma opção inválida, vamos tentar novamente...");

                } catch (InputException e) {
                    System.out.println(e.getMessage());

                }
                formacaoAcademica = menuFormacaoAcademica();
            }
        }

        return formacaoAcademica;
    }

    public String menuExperienciaDesenvolvimento() {
        System.out.println();
        System.out.println("""
                Qual a experiência de desenvolvimento do professor:
                1 - Front-End
                2 - Back-End
                3 - Full-Stack
                """);
        String opcao = capturaInputDoUsuario();
        String experiencia;

        switch (opcao) {
            case "1" -> experiencia = "Front-End";
            case "2" -> experiencia = "Back-End";
            case "3" -> experiencia = "Full-Stack";
            default -> {
                try {
                    throw new InputException("Você digitou uma opção inválida, vamos tentar novamente...");

                } catch (InputException e) {
                    System.out.println(e.getMessage());

                }
                experiencia = menuExperienciaDesenvolvimento();
            }
        }

        return experiencia;

    }


    public void cadastrarPedagogo(String nome, String telefone, String dataDeNascimento, String cpf) {

        pedagogoControl.cadastrarPedagogo(nome, telefone, dataDeNascimento, cpf);


    }

    public void cadastrarProfessor(String nome, String telefone, String dataDeNascimento, String cpf, String formacaoAcademica, String experiencia, Boolean estado) {

        professorControl.cadastrarProfessor(nome, telefone, dataDeNascimento, cpf, formacaoAcademica, experiencia, estado);


    }

    public void registrarAtendimento(String nomeAluno, String nomePedagogo) {
        alunoControl.registrarAtendimento(nomeAluno, nomePedagogo);

    }

    public void menuRelatorios() {
        System.out.println();
        System.out.println("Relatórios:");
        System.out.println("1 - Alunos");
        System.out.println("2 - Professores");
        System.out.println("3 - Pedagogo");
        System.out.println("4 - Todos");

        String opcao = capturaInputDoUsuario();
        imprimirRelatorio(opcao);

    }

    public void imprimirRelatorio(String opcao) {
        switch (opcao) {
            case "1" -> {
                System.out.println();
                System.out.println("Situação da matrícula:");
                System.out.println("1 - Ativo");
                System.out.println("2 - Inativo");
                System.out.println("3 - Irregular");
                System.out.println("4 - Atendimento Pedagógico");
                System.out.println("5 - Todos");
                String input = capturaInputDoUsuario();
                imprimirRelatorioAlunos(input);
            }
            case "2" -> {
                System.out.println();
                System.out.println("Experiência em desenvolvimento: ");
                System.out.println("1 - Front-End");
                System.out.println("2 - Back-End");
                System.out.println("3 - Full-Stack");
                System.out.println("4 - Todos");

                imprimirRelatorioProfessores(capturaInputDoUsuario());
            }
            case "3" -> PessoasRepository.listarPedagogos();
            case "4" -> PessoasRepository.listarTodos();
            default -> {
                try {
                    throw new InputException("Você digitou uma opção inválida, vamos tentar novamente...");

                } catch (InputException e) {
                    System.out.println(e.getMessage());

                }
                menuRelatorios();
            }
        }
    }

    public void imprimirRelatorioAlunos(String opcao) {
        switch (opcao) {
            case "1" -> PessoasRepository.listarAlunosPorMatricula("Ativo");
            case "2" -> PessoasRepository.listarAlunosPorMatricula("Inativo");
            case "3" -> PessoasRepository.listarAlunosPorMatricula("Irregular");
            case "4" -> PessoasRepository.listarAlunosPorMatricula("Atendimento Pedagógico");
            case "5" -> PessoasRepository.listarTodosAlunos();
            default -> {
                try {
                    throw new InputException("Você digitou uma opção inválida, vamos tentar novamente...");

                } catch (InputException e) {
                    System.out.println(e.getMessage());

                }
                imprimirRelatorio("1");
            }
        }

    }

    public void imprimirRelatorioProfessores(String opcao) {
        switch (opcao) {
            case "1" -> PessoasRepository.listarTodosProfessoresPorExperiencia("Front-End");
            case "2" -> PessoasRepository.listarTodosProfessoresPorExperiencia("Back-End");
            case "3" -> PessoasRepository.listarTodosProfessoresPorExperiencia("Full-Stack");
            case "4" -> PessoasRepository.listarTodosProfessores();
            default -> {
                try {
                    throw new InputException("Você digitou uma opção inválida, vamos tentar novamente...");

                } catch (InputException e) {
                    System.out.println(e.getMessage());

                }
                imprimirRelatorio("2");
            }
        }


    }


}
