package br.com.bss.solid.srp.before.service.reajuste;

import br.com.bss.solid.srp.before.exception.ValidacaoException;
import br.com.bss.solid.srp.before.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes){
        this.validacoes = validacoes;
    }
    public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {

        ValidacaoPercentualReajuste validacaoPercentualReajuste = new ValidacaoPercentualReajuste();
        validacaoPercentualReajuste.validar(funcionario, aumento);

        this.validacoes.forEach(v-> v.validar(funcionario, aumento));

        var salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
