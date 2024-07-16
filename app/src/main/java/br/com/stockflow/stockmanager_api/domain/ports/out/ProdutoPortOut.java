package br.com.stockflow.stockmanager_api.domain.ports.out;

import br.com.stockflow.stockmanager_api.adapter.repository.entity.ProdutoEntity;

public interface ProdutoPortOut {

    void salvarProduto(ProdutoEntity produtoEntity);
}
