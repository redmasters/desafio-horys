package br.com.horys.apipagamento.service;

import br.com.horys.apipagamento.model.Usuario;
import br.com.horys.apipagamento.repository.UsuarioRepository;
import br.com.horys.apipagamento.requests.UsuarioPostRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

    public Usuario inserirUsuario(UsuarioPostRequest request){
        Usuario novoUsuario= new Usuario();
        novoUsuario.setNome(request.getNome());
        novoUsuario.setEndereco(request.getEndereco());
        return usuarioRepository.save(novoUsuario);
    }




}
