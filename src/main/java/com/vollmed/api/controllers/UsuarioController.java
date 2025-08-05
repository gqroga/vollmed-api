package com.vollmed.api.controllers;

import com.vollmed.api.domain.usuario.DadosCadastroUsuario;
import com.vollmed.api.domain.usuario.Usuario;
import com.vollmed.api.domain.usuario.UsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrarUsuario(@RequestBody @Valid DadosCadastroUsuario dados, UriComponentsBuilder uriBuilder) {

        if (usuarioRepository.existsByLogin(dados.login())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Usuário já existe");
        }

        String senhaHasheada = passwordEncoder.encode(dados.senha());

        Usuario usuario = new Usuario();
        usuario.setLogin(dados.login());
        usuario.setSenha(senhaHasheada);

        usuarioRepository.save(usuario);

        var uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();

        return ResponseEntity.created(uri).body(usuario);
    }
}
