package br.com.stockflow.stockmanager_api.adapter.repository.entity;

import br.com.stockflow.stockmanager_api.domain.model.Produto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Table(name = "tbl_produto")
@Entity(name = "produto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoEntity {

    @Id
    @Column(name = "id_produto", unique = true, nullable = false)
    private String id;

    @Column(name = "nome_produto", nullable = false)
    private String nome;

    @Column(name = "descricao_produto")
    private String descricao;

    @Column(name = "valor_produto", nullable = false)
    private BigDecimal valor;

    public ProdutoEntity(Produto produto) {
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.valor = produto.getValor();
    }
}
