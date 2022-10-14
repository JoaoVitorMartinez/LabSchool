package br.com.labschool.repository;

import br.com.labschool.model.Aluno;
import br.com.labschool.model.Pedagogo;
import br.com.labschool.model.Pessoa;
import br.com.labschool.model.Professor;

import java.util.ArrayList;
import java.util.List;

public class PessoasRepository {
    public static List<Pessoa> Pessoas = new ArrayList<Pessoa>();
    public static List<Pessoa> Nova = new ArrayList<Pessoa>();


    public static void RegistrarAtendimento(String nomeAluno, String nomePedagogo){
        for (int i = 0; i < Pessoas.size(); i++) {
            if (nomeAluno.equals(Pessoas.get(i).getNome())) {
                Aluno aluno = (Aluno) Pessoas.get(i);
                aluno.registraAtendimento();
                aluno.setSituacaoDaMatricula("Atendimento Pedagógico");
            }
            if (nomePedagogo.equals(Pessoas.get(i).getNome())) {
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
        System.out.println(Pessoas.stream().filter(pessoa -> pessoa instanceof Aluno).toList().toString());

    }
    public static void listarAlunosPorMatricula(String situacao){
        System.out.println(Pessoas.stream().filter(pessoa -> pessoa instanceof Aluno && ((Aluno) pessoa).getSituacaoDaMatricula() == situacao).toList().toString());

    }

    public static void listarTodosProfessores(){
        System.out.println(Pessoas.stream().filter(pessoa -> pessoa instanceof Professor).toList().toString());

    }

    public static void listarTodosProfessoresPorExperiencia(String experiencia){
        System.out.println(Pessoas.stream().filter(pessoa -> pessoa instanceof Professor && ((Professor) pessoa).getExperiencia() == experiencia).toList().toString());

    }

    public static void listarPedagogos(){
        System.out.println(Pessoas.stream().filter(pessoa -> pessoa instanceof Pedagogo).toList().toString());

    }


}
