package br.com.bss.solid.srp.before.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {
    BigDecimal valor();
    LocalDate data();
}
