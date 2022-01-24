package br.com.horys.apiproduto.services;

import br.com.horys.apiproduto.exception.BadRequestException;
import br.com.horys.apiproduto.models.Produto;
import br.com.horys.apiproduto.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto produto(String id) {
        return produtoRepository.findById(id).orElseThrow(() -> new BadRequestException("Produto não encontrado"));

    }

    public void baixaProduto(String id) {
        produtoRepository.deleteById(id);
    }

    public Produto salvarProduto(Produto produto){
        Produto novoProduto = new Produto();
        novoProduto.setNome(produto.getNome());
        novoProduto.setCategoria(produto.getCategoria());
        novoProduto.setPreco(produto.getPreco());
        return produtoRepository.save(novoProduto);
    }


}

