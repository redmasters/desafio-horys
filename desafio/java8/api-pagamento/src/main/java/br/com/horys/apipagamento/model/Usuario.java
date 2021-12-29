package br.com.horys.apipagamento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "endereco")
    private String endereco;

    public Usuario(Long id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Usuario() {
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
