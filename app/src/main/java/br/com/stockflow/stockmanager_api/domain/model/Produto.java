package br.com.stockflow.stockmanager_api.domain.model;

import br.com.stockflow.stockmanager_api.adapter.repository.entity.ProdutoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private BigDecimal valor;

    public Produto(){
       this.id = UUID.randomUUID().toString();
    }

    public Produto(ProdutoEntity entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.descricao = entity.getDescricao();
        this.valor = entity.getValor();
    }
}
