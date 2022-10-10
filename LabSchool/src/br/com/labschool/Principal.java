package br.com.labschool;

import br.com.labschool.cli.Display;
import br.com.labschool.model.Aluno;
import br.com.labschool.model.Pedagogo;
import br.com.labschool.model.Pessoa;
import br.com.labschool.repository.PessoasRepository;

import javax.management.ObjectInstance;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String opcao = null;

        while (opcao == null || !opcao.equals("7")) {
            Display display = new Display();
            Scanner scan = new Scanner(System.in);
            display.menu();
            opcao = scan.nextLine();

            switch (opcao) {
                case "1":

                    System.out.print("\nNome do aluno:");
                    String nome = scan.nextLine();

                    System.out.print("\nTelefone:");
                    String telefone = scan.nextLine();

                    System.out.print("\nData de nascimento (01/01/1900):");
                    String dataDeNascimento = scan.nextLine();

                    System.out.print("\nCPF:");
                    String cpf = scan.nextLine();

                    System.out.print("\nSituação da matrícula:");
                    String situacaoDaMatricula = display.menuSituacaoDaMatricula();

                    System.out.print("\nNota:");
                    double nota = scan.nextDouble();

                    display.cadastrarAluno(nome, telefone, dataDeNascimento, cpf, situacaoDaMatricula, nota);




                    break;
                case "2":



                    break;
                case "3":
                    System.out.print("\nNome do Professor: ");
                    nome = scan.nextLine();

                    System.out.print("\nTelefone:");
                    telefone = scan.nextLine();

                    System.out.print("\nData de nascimento (01/01/1900): ");
                    dataDeNascimento = scan.nextLine();

                    System.out.print("\nCPF:");
                    cpf = scan.nextLine();

                    System.out.print("\nFormação Acadêmica: ");
                    String formacaoAcademica = display.menuFormacaoAcademica();

                    System.out.print("\nExperiência de desenvolvimento: " );
                    String experiencia = display.menuExperienciaDesenvolvimento();

                    System.out.print("\n Ativo? s/ ");
                    Boolean estado = false;
                    String input = scan.nextLine().toUpperCase();

                    if( input.equals("S")){
                        estado = true;

                    }
                    System.out.println(estado);

                    display.cadastrarProfessor(nome, telefone, dataDeNascimento, cpf, formacaoAcademica, experiencia, estado);



                    break;
                case "4":
                    System.out.print("\nNome do pedagogo:");
                    nome = scan.nextLine();

                    System.out.print("\nTelefone:");
                    telefone = scan.nextLine();

                    System.out.print("\nData de nascimento (01/01/1900):");
                    dataDeNascimento = scan.nextLine();

                    System.out.print("\nCPF:");
                    cpf = scan.nextLine();

                    display.cadastrarPedagogo(nome, telefone, dataDeNascimento, cpf);

                    break;
                case "5":
                    System.out.println();
                    System.out.println("Nome do Aluno: ");
                    String nomeAluno = scan.nextLine();
                    System.out.println("Nome do Pedagogo");
                    String nomePedagogo = scan.nextLine();

                    display.registrarAtendimento(nomeAluno, nomePedagogo);



                    break;
                case "6":
                    display.menuRelatorios();
                    input = scan.nextLine();
                    display.imprimirRelatorio(input);

                    display.imprimirRelatorioAlunos(input);


                    break;
                case "7":
                    System.out.println("Saiu do programa");
                    break;
                default:
                    try {
                        throw new Exception();

                    } catch (Exception e) {
                        System.out.println("Você digitou uma opção inválida, vamos tentar novamente...");
                    }
                    break;
            }


        }

    }
}
