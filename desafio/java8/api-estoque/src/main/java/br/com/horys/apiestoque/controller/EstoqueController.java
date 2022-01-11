package br.com.horys.apiestoque.controller;

import br.com.horys.apiestoque.models.Estoque;
import br.com.horys.apiestoque.services.EstoqueService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/estoque/produto")
public class EstoqueController {
    private EstoqueService estoqueService;

    public EstoqueController(EstoqueService estoqueService) {
        this.estoqueService = estoqueService;
    }

    @GetMapping
    public List<Estoque> listarProdutos(){
        return estoqueService.listarProdutos();
    }

    @GetMapping ("/categoria/{categoria}")
    public List<Estoque> listarProdutosCategoria(@PathVariable String categoria){
        return estoqueService.listarProdutosCategoria(categoria);
    }

    @GetMapping("/{codigo}")
    public List<Estoque> listarProduto(@PathVariable Long codigo){
        return estoqueService.listarProduto(codigo);
    }

    @DeleteMapping("/{id}")
    public void baixaProduto(@PathVariable Long id){
        estoqueService.baixaProduto(id);
    }

}
