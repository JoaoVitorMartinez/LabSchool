package br.com.labschool.repository;

import br.com.labschool.model.Aluno;
import br.com.labschool.model.Pedagogo;
import br.com.labschool.model.Pessoa;
import br.com.labschool.model.Professor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PessoasRepository{
    public static List<Pessoa> Pessoas = new ArrayList<Pessoa>();

    public static void RegistrarAtendimento(String nomeAluno, String nomePedagogo){
        for (int i = 0; i < Pessoas.size(); i++) {
            if (nomeAluno.toUpperCase().equals(Pessoas.get(i).getNome().toUpperCase()) && Pessoas.get(i) instanceof Aluno) {
                Aluno aluno = (Aluno) Pessoas.get(i);
                aluno.registraAtendimento();
                aluno.setSituacaoDaMatricula("Atendimento Pedagógico");
            }
            if (nomePedagogo.toUpperCase().equals(Pessoas.get(i).getNome().toUpperCase())  && Pessoas.get(i) instanceof Pedagogo) {
                Pedagogo pedagogo = (Pedagogo) Pessoas.get(i);
                pedagogo.realizarAtendimento();
            }

        }
    }

    public static void listarTodos(){
        for (int i = 0; i < Pessoas.size(); i++) {
            System.out.println(Pessoas.get(i).toString());


        }
    }
    public static void listarTodosAlunos(){
        Pessoas.stream().filter(pessoa -> pessoa instanceof Aluno).sorted(Comparator.comparing(pessoa -> ((Aluno) pessoa).getTotalDeAtendimentosPedagogicos()).reversed())
                .forEach(pessoa -> System.out.println(pessoa.toString()));

    }
    public static void listarAlunosPorMatricula(String situacao){
        System.out.println(Pessoas.stream().filter(pessoa -> pessoa instanceof Aluno && ((Aluno) pessoa).getSituacaoDaMatricula() == situacao).toList().toString());

    }

    public  static Aluno retornaAlunoPorNome(String nomeAluno){
        Aluno aluno = new Aluno();
        for (int i = 0; i < Pessoas.size(); i++) {
            if (nomeAluno.toUpperCase().equals(Pessoas.get(i).getNome().toUpperCase()) && Pessoas.get(i) instanceof Aluno) {
                aluno = (Aluno) Pessoas.get(i);

                return aluno;

            }
        }
        return aluno;

    }

    public static void listarTodosProfessores(){
        System.out.println(Pessoas.stream().filter(pessoa -> pessoa instanceof Professor).toList().toString());

    }

    public static void listarTodosProfessoresPorExperiencia(String experiencia){
        System.out.println(Pessoas.stream().filter(pessoa -> pessoa instanceof Professor && ((Professor) pessoa).getExperiencia() == experiencia).toList().toString());

    }

    public static void listarPedagogos(){
        Pessoas.stream().filter(pessoa -> pessoa instanceof Pedagogo).sorted(Comparator.comparing(pessoa -> ((Pedagogo) pessoa).getAtendimentosPedagogicosRealizados()).reversed())
                .forEach(pessoa -> System.out.println(pessoa.toString()));

    }



}
