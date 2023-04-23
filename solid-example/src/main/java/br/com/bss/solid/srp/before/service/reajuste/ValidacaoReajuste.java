package br.com.bss.solid.srp.before.service.reajuste;

import br.com.bss.solid.srp.before.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal aumento);
}
