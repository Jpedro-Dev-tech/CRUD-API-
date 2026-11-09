package com.example.produtos;
import com.example.produtos.model.Produto;
import com.example.produtos.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProdutoController {
    private ProdutoService produtoService;
    //private ProdutosRepository produtosRepository;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping("/produtos")
    public List<Produto> listarProdutos() {
        return produtoService.listarProdutos();
    }

    @PostMapping("/produtos")
    public Produto adicionarProduto(@RequestBody Produto produto) {
        return produtoService.adicionarProduto(produto);
    }

    @PutMapping("/produtos/{id}")
    public Produto atualizarProduto(@PathVariable Integer id, @RequestBody Produto produto) {
        return produtoService.atualizarProduto(id,produto);
    }

    @DeleteMapping("/produtos/{id}")
    public ResponseEntity<Void>deletarProduto(@PathVariable Integer id) {
         produtoService.deletarProduto(id);
         return ResponseEntity.noContent().build();
    }
}
