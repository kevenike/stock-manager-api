package br.com.stockflow.stockmanager_api.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private BigDecimal valor;
}
