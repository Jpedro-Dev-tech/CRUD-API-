package com.example.produtos.service;

import com.example.produtos.Repository.ProdutosRepository;
import com.example.produtos.model.Produto;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private ProdutosRepository produtoRepository;
    public ProdutoService(ProdutosRepository produtosRepository) {
        this.produtoRepository = produtosRepository;
    }
    public String exibirProdutos(Integer id) {
        // Lógica para exibir produtos com base no ID
        return "Exibindo produto com ID: " + id;
    }

    public Produto adicionarProduto(Produto produto) {
        // Lógica para adicionar um novo produto
        return produtoRepository.save(produto);
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto atualizarProduto(Integer id, Produto produto) {


    }
    public void deletarProduto(Integer id) {

        }
    }
}
