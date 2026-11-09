package com.example.produtos.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table (name = "pedidos")
public class Produto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Nome_produto")
    private String nome;
    @Column(name = "Preco")
    private BigDecimal preco;
    @Column(length = 20)
    private String quantidade;
    @Column(length = 100)
    private String categoria;

    public Produto(Integer id, String nome, BigDecimal preco, String quantidade, String categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Produto() {

    }
}
