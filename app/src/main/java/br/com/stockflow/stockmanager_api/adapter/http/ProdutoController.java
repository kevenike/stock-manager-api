package br.com.stockflow.stockmanager_api.adapter.http;

import br.com.stockflow.stockmanager_api.adapter.http.dto.ProdutoDto;
import br.com.stockflow.stockmanager_api.adapter.http.mapper.ProdutoDtoMapper;
import br.com.stockflow.stockmanager_api.domain.model.Produto;
import br.com.stockflow.stockmanager_api.domain.ports.in.ProdutoPortIn;
import br.com.stockflow.stockmanager_api.domain.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController implements ProdutoPortIn {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private ProdutoDtoMapper produtoMapper;


    @PostMapping
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody ProdutoDto produtoDto){

        Produto produto = produtoMapper.converter(produtoDto);

        produtoService.cadastrar(produto);
        return ResponseEntity.ok(produto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public List<Produto> listarProduto() {

        return produtoService.listarProdutos();

    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizaProduto(@PathVariable String id, @RequestBody Produto produto){

        //TODO usar DTO e converter para domain Produto.

        Optional<Produto> atualizado = produtoService.atualizarProduto(id, produto);
        if (atualizado.isPresent()) {
            return ResponseEntity.ok(atualizado.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Produto> deletarProduto(@PathVariable String id){
        boolean deletado = produtoService.deletarProdutoPorid(id);
        if (deletado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
