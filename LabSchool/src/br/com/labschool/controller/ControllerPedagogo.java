package br.com.labschool.controller;

import br.com.labschool.model.Pedagogo;
import br.com.labschool.repository.PessoasRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ControllerPedagogo {
    private Pedagogo pedagogo = new Pedagogo();

    public ControllerPedagogo() {
    }

    public void cadastrarPedagogo(String nome, String telefone, String dataDeNascimento, String cpf) {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDeNascimentoConvertida = LocalDate.parse(dataDeNascimento, formatar);
        Pedagogo pedagogoPronto = pedagogo.Cadastrar(nome, telefone, dataDeNascimentoConvertida, cpf);
        PessoasRepository.Pessoas.add(pedagogoPronto);
    }

}
