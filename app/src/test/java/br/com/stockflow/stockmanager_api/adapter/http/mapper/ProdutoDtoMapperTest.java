package br.com.stockflow.stockmanager_api.adapter.http.mapper;

import br.com.stockflow.stockmanager_api.adapter.http.dto.ProdutoDto;
import br.com.stockflow.stockmanager_api.domain.model.Produto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ProdutoDtoMapperTest {

    private final ProdutoDtoMapper produtoDtoMapper = new ProdutoDtoMapper();

    @Test
    public void deveConverterProdutoDtoParaProduto() {

        //Cenario
        ProdutoDto produtoDto = new ProdutoDto();
        produtoDto.setNome("Camiseta");
        produtoDto.setDescricao("Camiseta polo Lacoste");
        produtoDto.setValor(BigDecimal.valueOf(300));

        //Execução
        Produto produtoConvertido = produtoDtoMapper.converter(produtoDto);

        //Validação

        Assertions.assertEquals(produtoDto.getNome(), produtoConvertido.getNome());
        Assertions.assertEquals(produtoDto.getDescricao(), produtoConvertido.getDescricao());
        Assertions.assertEquals(produtoDto.getValor(), produtoConvertido.getValor());

    }


}