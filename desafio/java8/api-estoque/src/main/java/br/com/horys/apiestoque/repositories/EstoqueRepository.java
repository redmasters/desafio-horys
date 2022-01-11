package br.com.horys.apiestoque.repositories;

import br.com.horys.apiestoque.models.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

    List<Estoque> findAllByCategoriaOrderById(String categoria);

    List<Estoque> findAllByCodigo(Long codigo);

}
