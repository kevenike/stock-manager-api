package br.com.stockflow.stockmanager_api.domain.ports.out;

import br.com.stockflow.stockmanager_api.adapter.repository.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoPortOut extends JpaRepository<ProdutoEntity, String> {

}
