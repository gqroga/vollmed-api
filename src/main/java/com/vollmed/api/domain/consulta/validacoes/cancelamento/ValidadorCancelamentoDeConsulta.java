package com.vollmed.api.domain.consulta.validacoes.cancelamento;

import com.vollmed.api.domain.consulta.DadosCancelamentoConsulta;

public interface ValidadorCancelamentoDeConsulta {

    void validar(DadosCancelamentoConsulta dados);
}
