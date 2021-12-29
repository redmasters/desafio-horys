package br.com.horys.apipagamento.service;

import br.com.horys.apipagamento.repository.UsuarioRepository;

public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


}
