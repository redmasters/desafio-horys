package br.com.horys.apipagamento.controller;

import br.com.horys.apipagamento.model.Usuario;
import br.com.horys.apipagamento.requests.UsuarioRequest;
import br.com.horys.apipagamento.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/v1/usuario")
public class UsuarioController {
    private UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(CREATED)
    public UsuarioController(@RequestBody UsuarioRequest aluno){
        return usuarioService.inserirUsuario(aluno);

    }

}
