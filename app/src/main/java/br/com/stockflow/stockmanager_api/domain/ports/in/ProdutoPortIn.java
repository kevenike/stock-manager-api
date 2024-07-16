package br.com.stockflow.stockmanager_api.domain.ports.in;

import br.com.stockflow.stockmanager_api.domain.model.Produto;

import java.util.List;

public interface ProdutoPortIn {

    List<Produto> listarProduto();
}
