package br.com.horys.apipagamento.repository;

import br.com.horys.apipagamento.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long>{
}
