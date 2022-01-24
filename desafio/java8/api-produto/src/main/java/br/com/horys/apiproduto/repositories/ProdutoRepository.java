package br.com.horys.apiproduto.repositories;

import br.com.horys.apiproduto.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, String> {


}
