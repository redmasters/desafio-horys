package br.com.horys.apipagamento.controller;

import br.com.horys.apipagamento.model.Pagamento;
import br.com.horys.apipagamento.model.UsuarioProduto;
import br.com.horys.apipagamento.service.PagamentoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pagamento")
public class PagamentoController {
    private PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping("/pagar")
    public Pagamento realizarPagamento(@RequestBody UsuarioProduto usuarioProduto) {
        return pagamentoService.realizarPagamento(usuarioProduto);
    }

}
