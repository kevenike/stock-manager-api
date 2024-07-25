package br.com.stockflow.stockmanager_api.domain.ports.in;

public interface ProdutoPortIn<Entrada, Saida> {

    Saida cadastrarProduto(Entrada entrada);

    Saida listarProduto();

    Saida atualizaProduto(String id, Entrada obj);

    Saida deletarProduto(String id);

    Saida detalharProduto(String id);

}
