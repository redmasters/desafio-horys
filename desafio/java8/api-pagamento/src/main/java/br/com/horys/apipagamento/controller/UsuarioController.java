package br.com.horys.apipagamento.controller;

import br.com.horys.apipagamento.model.Usuario;
import br.com.horys.apipagamento.requests.UsuarioPostRequest;
import br.com.horys.apipagamento.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/v1/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> listarUsuarios(){
        return usuarioService.listarTodos();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Usuario UsuarioController(@RequestBody UsuarioPostRequest request){
        return usuarioService.inserirUsuario(request);

    }

}
