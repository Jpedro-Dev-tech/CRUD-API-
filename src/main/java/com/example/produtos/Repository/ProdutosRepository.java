package com.example.produtos.Repository;

import com.example.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutosRepository extends JpaRepository<Produto, Integer> {
}
