package br.com.stockflow.stockmanager_api.domain.model;

import br.com.stockflow.stockmanager_api.adapter.repository.entity.ProdutoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private BigDecimal valor;


    public Produto(ProdutoEntity entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.descricao = entity.getDescricao();
        this.valor = entity.getValor();
    }

}
