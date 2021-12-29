package br.com.horys.apipagamento.repository;

import br.com.horys.apipagamento.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario deleteUsuarioById(Long id);

}
