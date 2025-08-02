package com.vollmed.api.controllers;

import com.vollmed.api.domain.consulta.AgendaDeConsultas;
import com.vollmed.api.domain.consulta.DadosAgendamentoConsulta;
import com.vollmed.api.domain.consulta.DadosCancelamentoConsulta;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("consultas")
@SecurityRequirement(name = "bearer-key")
public class ConsultaController {

    @Autowired
    private AgendaDeConsultas agendaDeConsultas;

    @PostMapping
    @Transactional
    public ResponseEntity agendarConsulta (@RequestBody @Valid DadosAgendamentoConsulta dados) {
        var dto = agendaDeConsultas.agendarConsulta(dados);
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping
    @Transactional
    public ResponseEntity cancelarConsulta (@RequestBody @Valid DadosCancelamentoConsulta dados) {
        agendaDeConsultas.cancelarConsulta(dados);
        return ResponseEntity.noContent().build();
    }
}
