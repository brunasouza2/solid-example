package br.com.bss.solid.srp.before.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuenio implements Reajuste{

    private BigDecimal valor;
    private LocalDate data;

    @Override
    public BigDecimal valor() {
        return this.valor;
    }

    @Override
    public LocalDate data() {
        return this.data;
    }
}
