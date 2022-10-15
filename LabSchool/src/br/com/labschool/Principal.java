package br.com.labschool;

import br.com.labschool.cli.Display;
import br.com.labschool.exception.InputException;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String opcao = null;

        while (opcao == null || !opcao.equals("7")) {
            Display display = new Display();
            Scanner scan = new Scanner(System.in);
            display.menu();
            opcao = display.capturaInputDoUsuario();

            switch (opcao) {
                case "1":

                    System.out.print("\nNome do aluno:");
                    String nome = display.capturaInputDoUsuario();

                    System.out.print("\nTelefone:");
                    String telefone = display.capturaInputDoUsuario();

                    System.out.print("\nData de nascimento (01/01/1900):");
                    String dataDeNascimento = display.capturaInputDoUsuario();

                    System.out.print("\nCPF (sem pontos ou hífens):");
                    String cpf = display.capturaInputDoUsuario();

                    System.out.print("\nSituação da matrícula:");
                    String situacaoDaMatricula = display.menuSituacaoDaMatricula();

                    System.out.print("\nNota:");
                    double nota = scan.nextDouble();

                    display.cadastrarAluno(nome, telefone, dataDeNascimento, cpf, situacaoDaMatricula, nota);


                    break;
                case "2":
                    System.out.print("\nNome do Aluno: ");
                    nome = display.capturaInputDoUsuario();
                    situacaoDaMatricula = display.menuSituacaoDaMatricula();

                    display.alterarSituacaoDeMatricula(nome, situacaoDaMatricula);


                    break;
                case "3":
                    System.out.print("\nNome do Professor: ");
                    nome = display.capturaInputDoUsuario();

                    System.out.print("\nTelefone:");
                    telefone = display.capturaInputDoUsuario();

                    System.out.print("\nData de nascimento (01/01/1900): ");
                    dataDeNascimento = display.capturaInputDoUsuario();

                    System.out.print("\nCPF (sem pontos ou hífens):");
                    cpf = display.capturaInputDoUsuario();

                    System.out.print("\nFormação Acadêmica: ");
                    String formacaoAcademica = display.menuFormacaoAcademica();

                    System.out.print("\nExperiência de desenvolvimento: ");
                    String experiencia = display.menuExperienciaDesenvolvimento();

                    System.out.print("\n Ativo? s/n ");
                    Boolean estado = false;
                    String input = display.capturaInputDoUsuario().toUpperCase();

                    if (input.equals("S")) {
                        estado = true;

                    }

                    display.cadastrarProfessor(nome, telefone, dataDeNascimento, cpf, formacaoAcademica, experiencia, estado);


                    break;
                case "4":
                    System.out.print("\nNome do pedagogo:");
                    nome = display.capturaInputDoUsuario();

                    System.out.print("\nTelefone:");
                    telefone = display.capturaInputDoUsuario();

                    System.out.print("\nData de nascimento (01/01/1900):");
                    dataDeNascimento = display.capturaInputDoUsuario();

                    System.out.print("\nCPF (sem pontos ou hífens):");
                    cpf = display.capturaInputDoUsuario();

                    display.cadastrarPedagogo(nome, telefone, dataDeNascimento, cpf);

                    break;
                case "5":
                    System.out.println();
                    System.out.println("Nome do Aluno: ");
                    String nomeAluno = display.capturaInputDoUsuario();
                    System.out.println("Nome do Pedagogo");
                    String nomePedagogo = display.capturaInputDoUsuario();

                    display.registrarAtendimento(nomeAluno, nomePedagogo);


                    break;
                case "6":
                    display.menuRelatorios();

                    break;
                case "7":
                    System.out.println("\u001B[41mSaiu do programa\u001B[0m");
                    break;
                default:
                    try {
                        throw new InputException("\u001B[31mVocê digitou uma opção inválida, vamos tentar novamente...");

                    } catch (InputException e) {
                        System.err.println(e.getMessage());
                        ;
                    }
                    break;
            }


        }

    }
}
