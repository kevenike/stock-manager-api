package br.com.stockflow.stockmanager_api.domain.service;

import br.com.stockflow.stockmanager_api.adapter.repository.entity.ProdutoEntity;
import br.com.stockflow.stockmanager_api.domain.model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {

    // assinatura do metodo
    void cadastrar(Produto produto);

    List<Produto> listarProdutos();

    Optional<Produto> atualizarProduto(String id, Produto produto);

    boolean deletarProdutoPorid(String id);

    Produto detalharProduto(String id);

}
