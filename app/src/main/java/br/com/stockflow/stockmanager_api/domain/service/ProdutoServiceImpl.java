package br.com.stockflow.stockmanager_api.domain.service;

import br.com.stockflow.stockmanager_api.adapter.repository.entity.ProdutoEntity;
import br.com.stockflow.stockmanager_api.domain.model.Produto;
import br.com.stockflow.stockmanager_api.domain.ports.out.ProdutoPortOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
    private ProdutoPortOut produtoPortOut;


    @Override
    public void cadastrar(Produto produto) {
        ProdutoEntity produtoEntity;
        produtoEntity = new ProdutoEntity(produto);
        produtoPortOut.save(produtoEntity);
    }

    @Override
    public List<Produto> listarProdutos() {
        List<ProdutoEntity> produtoEntities = produtoPortOut.findAll();

        List<Produto> produtos = new ArrayList<>();

        for (ProdutoEntity produtoEntity : produtoEntities) {

            Produto produto = new Produto();
            produto.setNome(produtoEntity.getNome());
            produto.setId(produtoEntity.getId());
            produto.setDescricao(produtoEntity.getDescricao());
            produto.setValor(produtoEntity.getValor());

            produtos.add(produto);

        }

        return produtos;
    }

    public Optional<Produto> atualizarProduto(String id, Produto produto){
        Optional<ProdutoEntity> produtoExistente = produtoPortOut.findById(id);
        if (produtoExistente.isPresent()){
            ProdutoEntity atualizado = produtoExistente.get();
            atualizado.setNome(produto.getNome());
            atualizado.setDescricao(produto.getDescricao());
            atualizado.setValor(produto.getValor());

            ProdutoEntity entidadeAtualizada = produtoPortOut.save(atualizado);
            return Optional.of(new Produto(entidadeAtualizada));
        }else {
            return Optional.empty();
        }

    }

    @Override
    public boolean deletarProdutoPorid(String id) {
        Optional<ProdutoEntity> produtoExistente = produtoPortOut.findById(id);
        if (produtoExistente.isPresent()) {
            produtoPortOut.deleteById(id);
            return true;
        } else {
            return false;
        }
    }


}
