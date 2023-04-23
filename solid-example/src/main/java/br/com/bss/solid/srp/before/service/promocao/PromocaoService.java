package br.com.bss.solid.srp.before.service.promocao;

import br.com.bss.solid.srp.before.exception.ValidacaoException;
import br.com.bss.solid.srp.before.model.Cargo;
import br.com.bss.solid.srp.before.model.Funcionario;

public class PromocaoService {
    public void promover(Funcionario funcionario, boolean metaBatida){
        var cargoAtual = funcionario.getCargo();

        if(Cargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerentes não podem ser promovidos!");
        }

        if(metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionario não bateu a meta!");
        }

    }
}
