package br.com.stockflow.stockmanager_api.adapter.repository.mapper;

import br.com.stockflow.stockmanager_api.adapter.repository.entity.ProdutoEntity;
import br.com.stockflow.stockmanager_api.domain.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoEntityMapper {

    public Produto converter(ProdutoEntity produtoEntity){
        Produto produto = new Produto();
        produto.setNome(produtoEntity.getNome());
        produto.setId(produtoEntity.getId());
        produto.setDescricao(produtoEntity.getDescricao());
        produto.setValor(produtoEntity.getValor());
        return produto;
    }
}
