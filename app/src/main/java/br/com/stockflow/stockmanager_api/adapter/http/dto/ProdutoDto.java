package br.com.stockflow.stockmanager_api.adapter.http.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDto {

    @JsonProperty("nome_produto")
    private String nome;

    @JsonProperty("descricao_produto")
    private String descricao;

    @JsonProperty("valor_produto")
    private BigDecimal valor;
}
