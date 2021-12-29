package br.com.horys.apipagamento.service;

import br.com.horys.apipagamento.model.Pagamento;
import br.com.horys.apipagamento.model.UsuarioProduto;
import br.com.horys.apipagamento.repository.ProdutoRepository;
import br.com.horys.apipagamento.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {
    private final UsuarioRepository usuarioRepository;
    private final ProdutoRepository produtoRepository;

    public PagamentoService(UsuarioRepository usuarioRepository,
                            ProdutoRepository produtoRepository) {
        this.usuarioRepository = usuarioRepository;
        this.produtoRepository = produtoRepository;
    }

    public Pagamento realizarPagamento(UsuarioProduto usuarioProduto){
        String name = "New";
        return name;
    }
}
