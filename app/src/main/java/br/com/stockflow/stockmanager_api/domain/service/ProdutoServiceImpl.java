package br.com.stockflow.stockmanager_api.domain.service;

import br.com.stockflow.stockmanager_api.adapter.repository.entity.ProdutoEntity;
import br.com.stockflow.stockmanager_api.adapter.repository.mapper.ProdutoEntityMapper;
import br.com.stockflow.stockmanager_api.domain.model.Produto;
import br.com.stockflow.stockmanager_api.domain.ports.out.ProdutoPortOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
    private ProdutoPortOut produtoPortOut;

    @Autowired
    private ProdutoEntityMapper produtoEntityMapper;


    @Override
    public void cadastrar(Produto produto) {
        ProdutoEntity produtoEntity = new ProdutoEntity(produto);
        produtoPortOut.save(produtoEntity);
    }

    @Override
    public List<Produto> listarProdutos() {
        List<ProdutoEntity> produtoEntities = produtoPortOut.findAll();

        List<Produto> produtos = new ArrayList<>();

        for (ProdutoEntity produtoEntity : produtoEntities) {

            Produto produto = produtoEntityMapper.converter(produtoEntity);

            produtos.add(produto);

        }

        return produtos;
    }

    public Optional<Produto> atualizarProduto(String id, Produto produto){
        Optional<ProdutoEntity> produtoExistente = produtoPortOut.findById(id);
        if (produtoExistente.isPresent()){
            ProdutoEntity atualizado = produtoExistente.get();
            produtoEntityMapper.atualizarProdutoEntity(atualizado, produto);

            ProdutoEntity entidadeAtualizada = produtoPortOut.save(atualizado);
            Produto produtoAtualizado = produtoEntityMapper.converter(entidadeAtualizada);
            return Optional.of(produtoAtualizado);


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

    @Override
    public Produto detalharProduto(String id) {
        Optional<ProdutoEntity> produtoDetalhado = produtoPortOut.findById(id);

        return produtoDetalhado.map(produtoEntityMapper::converter).orElse(null);
    }

}
