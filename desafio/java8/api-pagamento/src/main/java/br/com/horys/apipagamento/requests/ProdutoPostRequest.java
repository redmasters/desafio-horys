package br.com.horys.apipagamento.requests;

public class ProdutoPostRequest {
    private Long id;
    private String nome;
    private Long estoque;
    private Double price;

    public ProdutoPostRequest(Long id, String nome, Long estoque, Double price) {
        this.id = id;
        this.nome = nome;
        this.estoque = estoque;
        this.price = price;
    }

    public ProdutoPostRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getEstoque() {
        return estoque;
    }

    public void setEstoque(Long estoque) {
        this.estoque = estoque;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
