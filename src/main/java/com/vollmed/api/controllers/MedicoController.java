package com.vollmed.api.controllers;

import com.vollmed.api.medico.DadosCadastroMedico;
import com.vollmed.api.medico.DadosListagemMedico;
import com.vollmed.api.medico.Medico;
import com.vollmed.api.medico.MedicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    @Transactional
    public void cadastrarMedico(@RequestBody @Valid DadosCadastroMedico dados) {
        medicoRepository.save(new Medico(dados));
    }

    @GetMapping
    public List<DadosListagemMedico> listarMedicos() {
        return medicoRepository.findAll().stream().map(DadosListagemMedico::new).toList();
    }
}