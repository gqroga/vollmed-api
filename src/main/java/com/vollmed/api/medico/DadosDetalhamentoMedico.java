package com.vollmed.api.medico;

import com.vollmed.api.endereco.Endereco;

public record DadosDetalhamentoMedico(
        Long id,
        String nome,
        String crm,
        String telefone,
        String medicoTelefone, Especialidade especialidade,
        Endereco endereco) {

    public DadosDetalhamentoMedico (Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
