package br.com.labschool.repository;

import br.com.labschool.model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class PessoasRepository {
    public static List<Pessoa> Pessoas = new ArrayList<Pessoa>();

    public static void RegistrarAtendimento(String nomeAluno, String nomePedagogo) {
        for (int i = 0; i < Pessoas.size(); i++) {
            if (nomeAluno.toUpperCase().equals(Pessoas.get(i).getNome().toUpperCase()) && Pessoas.get(i) instanceof Aluno) {
                Aluno aluno = (Aluno) Pessoas.get(i);
                aluno.registraAtendimento();
                aluno.setSituacaoDaMatricula("Atendimento Pedagógico");
            }
            if (nomePedagogo.toUpperCase().equals(Pessoas.get(i).getNome().toUpperCase()) && Pessoas.get(i) instanceof Pedagogo) {
                Pedagogo pedagogo = (Pedagogo) Pessoas.get(i);
                pedagogo.realizarAtendimento();
            }

        }
    }

    public static void listarTodos() {
        for (int i = 0; i < Pessoas.size(); i++) {
            System.out.println(Pessoas.get(i).toString());


        }
    }

    public static void listarTodosAlunos() {
        Pessoas.stream().filter(pessoa -> pessoa instanceof Aluno).sorted(Comparator.comparing(pessoa -> ((Aluno) pessoa).getTotalDeAtendimentosPedagogicos()).reversed()).forEach(pessoa -> System.out.println(pessoa));

    }

    public static void listarAlunosPorMatricula(String situacao) {
        Pessoas.stream().filter(pessoa -> pessoa instanceof Aluno && ((Aluno) pessoa).getSituacaoDaMatricula() == situacao).toList().forEach(pessoa -> System.out.println(pessoa));

    }

    public static Aluno retornaAlunoPorNome(String nomeAluno) {
        Aluno aluno = new Aluno();
        for (int i = 0; i < Pessoas.size(); i++) {
            if (nomeAluno.toUpperCase().equals(Pessoas.get(i).getNome().toUpperCase()) && Pessoas.get(i) instanceof Aluno) {
                aluno = (Aluno) Pessoas.get(i);

                return aluno;

            }
        }
        return aluno;

    }

    public static void listarTodosProfessores() {
        Pessoas.stream().filter(pessoa -> pessoa instanceof Professor).toList().forEach(pessoa -> System.out.println(pessoa));

    }

    public static void listarTodosProfessoresPorExperiencia(String experiencia) {
        Pessoas.stream().filter(pessoa -> pessoa instanceof Professor && ((Professor) pessoa).getExperiencia() == experiencia).toList().forEach(pessoa -> System.out.println(pessoa));

    }

    public static void listarPedagogos() {
        Pessoas.stream().filter(pessoa -> pessoa instanceof Pedagogo).sorted(Comparator.comparing(pessoa -> ((Pedagogo) pessoa).getAtendimentosPedagogicosRealizados()).reversed()).forEach(pessoa -> System.out.println(pessoa));

    }


}
