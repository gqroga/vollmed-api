package com.vollmed.api.controllers;

import com.vollmed.api.paciente.DadosCadastroPaciente;
import com.vollmed.api.paciente.DadosListagemPaciente;
import com.vollmed.api.paciente.Paciente;
import com.vollmed.api.paciente.PacienteRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional
    public void cadastrarPaciente(@RequestBody @Valid DadosCadastroPaciente dados) {
        pacienteRepository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<DadosListagemPaciente> listarPacientes (@PageableDefault(size = 10, sort = "nome")Pageable paginacao) {
       return pacienteRepository.findByAtivoTrue(paginacao).map(DadosListagemPaciente::new);
    }
}
