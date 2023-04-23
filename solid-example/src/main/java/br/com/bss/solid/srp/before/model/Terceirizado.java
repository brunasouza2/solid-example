package br.com.bss.solid.srp.before.model;

import br.com.bss.solid.srp.before.exception.ValidacaoException;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Terceirizado {

    private DadosPessoais dadosPessoais;

    private String empresa;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String emrpesa) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
        this.empresa = emrpesa;
    }
}
