package br.com.horys.apiestoque.services;

import br.com.horys.apiestoque.models.Estoque;
import br.com.horys.apiestoque.repositories.EstoqueRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class EstoqueService {
    private EstoqueRepository estoqueRepository;

    public EstoqueService(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }

    public List<Estoque> listarProdutos(){
        return estoqueRepository.findAll();
    }

    public List<Estoque> listarProdutosCategoria(String categoria){
        return estoqueRepository.findAllByCategoriaOrderById(categoria);
    }

    public List<Estoque> listarProduto(Long codigo){
        return estoqueRepository.findAllByCodigo(codigo);
    }
    public void baixaProduto(Long id){
        estoqueRepository.deleteById(id);
    }
}

