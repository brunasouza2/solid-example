package br.com.bss.solid.srp.before.service.reajuste;

import br.com.bss.solid.srp.before.exception.ValidacaoException;
import br.com.bss.solid.srp.before.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste{
    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        var dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        var dataAtual = LocalDate.now();

        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);

        if(mesesDesdeUltimoReajuste< 6){
            throw new ValidacaoException("Intervalo entre reajustes deve ser de no mínimo 6 meses!");
        }
    }
}
