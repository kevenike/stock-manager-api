package br.com.stockflow.stockmanager_api.adapter.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Table(name = "tbl_produto")
@Entity(name = "produto")
public class ProdutoEntity {
    private String id;
    private String nome;
    private String descricao;
    private BigDecimal valor;
}
