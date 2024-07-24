package br.com.stockflow.stockmanager_api.adapter.http.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDto {

    @JsonProperty("nome_produto")
    @NotBlank
    private String nome;

    @JsonProperty("descricao_produto")
    @NotBlank
    private String descricao;

    @JsonProperty("valor_produto")
    @NotNull
    private BigDecimal valor;
}
