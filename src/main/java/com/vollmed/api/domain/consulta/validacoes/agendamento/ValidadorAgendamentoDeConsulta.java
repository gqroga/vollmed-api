package com.vollmed.api.domain.consulta.validacoes.agendamento;

import com.vollmed.api.domain.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {

    void validar(DadosAgendamentoConsulta dados);
}
