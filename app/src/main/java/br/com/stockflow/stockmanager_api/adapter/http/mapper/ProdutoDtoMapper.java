package br.com.stockflow.stockmanager_api.adapter.http.mapper;

import br.com.stockflow.stockmanager_api.adapter.http.dto.ProdutoDto;
import br.com.stockflow.stockmanager_api.domain.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoDtoMapper {

    public Produto converter(ProdutoDto produtoDto){
        Produto produto = new Produto();
        produto.setNome(produtoDto.getNome());
        produto.setDescricao(produtoDto.getDescricao());
        produto.setValor(produtoDto.getValor());
        return produto;
    }




}
