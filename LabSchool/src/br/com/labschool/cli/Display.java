package br.com.labschool.cli;

import br.com.labschool.model.Aluno;
import br.com.labschool.model.Pedagogo;
import br.com.labschool.model.Professor;
import br.com.labschool.repository.PessoasRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Display {
    private Aluno aluno = new Aluno();
    private Pedagogo pedagogo = new Pedagogo();
    private Professor professor = new Professor();

    Scanner scan = new Scanner(System.in);




    public void menu(){
        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-MENU-=-=-=-=-=-=-=-=-=");
        System.out.println();
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Atualizar Situação da Matrícula do Aluno");
        System.out.println("3 - Cadastrar Professor");
        System.out.println("4 - Cadastrar Pedagogo");
        System.out.println("5 - Cadastrar Atendimento Pedagógico");
        System.out.println("6 - Relatórios");
        System.out.println("7 - Sair");
        System.out.println();
    }

    public void cadastrarAluno(String nome, String telefone, String dataDeNascimento, String cpf, String situacaoDaMatricula, double nota){

        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDeNascimentoConvertida = LocalDate.parse(dataDeNascimento, formatar);
        Aluno alunoPronto = aluno.Cadastrar(nome, telefone, dataDeNascimentoConvertida, cpf, situacaoDaMatricula, nota);
        PessoasRepository.Pessoas.add(alunoPronto);



    }

    public String menuSituacaoDaMatricula(){
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a situação da matrícula do aluno:\n" +
                "1 - Ativo\n" +
                "2 - Inativo\n" +
                "3 - Irregular\n" +
                "4 - Atendimento Pedagógico\n");
        String opcao = scan.nextLine();
        String situacaoDaMatricula = "";

        switch (opcao){
            case "1":
                situacaoDaMatricula ="Ativo";
                break;
            case "2":
                situacaoDaMatricula ="Inativo";
                break;

            case "3":
                situacaoDaMatricula ="Irregular";
                break;

            case "4":
                situacaoDaMatricula ="Atendimento Pedagógico";
                aluno.registraAtendimento();
                break;

            default:
                System.out.println("Opção inválida! Tente novamente...");
                menuSituacaoDaMatricula();
                break;
        }

        return situacaoDaMatricula;
    }

    public String menuFormacaoAcademica(){
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a formação acadêmica do professor:\n" +
                "1 - Graduação incompleta\n" +
                "2 - Graduação completa\n" +
                "3 - Mestrado\n" +
                "4 - Doutorado\n");
        String opcao = scan.nextLine();
        String formacaoAcademica = "";

        switch (opcao){
            case "1":
                formacaoAcademica ="Graduação incompleta";
                break;
            case "2":
                formacaoAcademica ="Graduação completa";
                break;

            case "3":
                formacaoAcademica ="Mestrado";
                break;

            case "4":
                formacaoAcademica ="Doutorado";
                aluno.registraAtendimento();
                break;

            default:
                System.out.println("Opção inválida! Tente novamente...");
                formacaoAcademica = menuFormacaoAcademica();
                break;
        }

        return formacaoAcademica;
    }

    public String menuExperienciaDesenvolvimento(){
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a experiência de desenvolvimento do professor:\n" +
                "1 - Front-End\n" +
                "2 - Back-End\n" +
                "3 - Full-Stack\n");
        String opcao = scan.nextLine();
        String experiencia = "";
        TESTED:
        switch (opcao){
            case "1":
                experiencia ="Front-End";
                break;
            case "2":
                experiencia ="Back-End";
                break;

            case "3":
                experiencia ="Full-Stack";
                break;


            default:
                experiencia = menuExperienciaDesenvolvimento();

                System.out.println("Opção inválida! Tente novamente...");

                break;
        }

        return experiencia;

    }


    public void cadastrarPedagogo(String nome, String telefone, String dataDeNascimento, String cpf){

        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDeNascimentoConvertida = LocalDate.parse(dataDeNascimento, formatar);
        Pedagogo pedagogoPronto = pedagogo.Cadastrar(nome, telefone, dataDeNascimentoConvertida, cpf);
        PessoasRepository.Pessoas.add(pedagogoPronto);



    }

    public void cadastrarProfessor(String nome, String telefone, String dataDeNascimento, String cpf, String formacaoAcademica, String experiencia, Boolean estado){

        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDeNascimentoConvertida = LocalDate.parse(dataDeNascimento, formatar);
        Professor professorPronto = professor.Cadastrar(nome, telefone, dataDeNascimentoConvertida, cpf, formacaoAcademica, experiencia, estado);
        PessoasRepository.Pessoas.add(professorPronto);




    }

    public void registrarAtendimento(String nomeAluno, String nomePedagogo){
        PessoasRepository.RegistrarAtendimento(nomeAluno, nomePedagogo);

    }
    
    public void menuRelatorios(){
        System.out.println();
        System.out.println("Relatórios:");
        System.out.println("1 - Alunos");
        System.out.println("2 - Professores");
        System.out.println("3 - Pedagogo");
        System.out.println("4 - Todos");

        String opcao = scan.nextLine();
        imprimirRelatorio(opcao);
        
    }

    public void imprimirRelatorio(String opcao){
        switch (opcao){
            case "1":
                System.out.println();
                System.out.println("Situação da matrícula:");
                System.out.println("1 - Ativo");
                System.out.println("2 - Inativo");
                System.out.println("3 - Irregular");
                System.out.println("4 - Atendimento Pedagógico");
                System.out.println("5 - Todos");

                String input = scan.nextLine();
                imprimirRelatorioAlunos(input);

                break;
            case "2":
                System.out.println();
                System.out.println("Experiência em desenvolvimento: ");
                System.out.println("1 - Front-End");
                System.out.println("2 - Back-End");
                System.out.println("3 - Full-Stack");
                System.out.println("4 - Todos");

                input = scan.nextLine();
                imprimirRelatorioProfessores(input);
                break;
            case "3":
                PessoasRepository.listarPedagogos();

                break;
            case "4":
                PessoasRepository.listarTodos();
                break;
            default:
                System.out.println("Opção inválida! Tente novamente...");
                menuRelatorios();


                break;
        }
    }
    public void imprimirRelatorioAlunos(String opcao){
        switch (opcao){
            case "1":
                PessoasRepository.listarAlunosPorMatricula("Ativo");

                break;
            case "2":
                PessoasRepository.listarAlunosPorMatricula("Inativo");
                break;
            case "3":
                PessoasRepository.listarAlunosPorMatricula("Irregular");
                break;
            case "4":
                PessoasRepository.listarAlunosPorMatricula("Atendimento Pedagógico");

                break;
            case "5":
                PessoasRepository.listarTodosAlunos();
                break;
            default:
                System.out.print("Digite uma opção válida!");
                imprimirRelatorio("1");
                Scanner scan = new Scanner(System.in);
                opcao = scan.nextLine();
                imprimirRelatorioAlunos(opcao);



                break;

        }

    }

    public void imprimirRelatorioProfessores(String opcao){
        switch (opcao){
            case "1":
                PessoasRepository.listarTodosProfessoresPorExperiencia("Front-End");

                break;
            case "2":
                PessoasRepository.listarTodosProfessoresPorExperiencia("Back-End");
                break;
            case "3":
                PessoasRepository.listarTodosProfessoresPorExperiencia("Full-Stack");
                break;
            case "4":
                PessoasRepository.listarTodosProfessores();
                break;
            default:
                System.out.print("Digite uma opção válida!");
                imprimirRelatorio("2");

                break;

        }


    }



}
