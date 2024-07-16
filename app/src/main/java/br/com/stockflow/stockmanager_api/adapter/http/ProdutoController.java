package br.com.stockflow.stockmanager_api.adapter.http;

import br.com.stockflow.stockmanager_api.domain.model.Produto;
import br.com.stockflow.stockmanager_api.domain.ports.in.ProdutoPortIn;
import org.springframework.http.MediaType;
import org.springframework.util.MimeType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController implements ProdutoPortIn {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public List<Produto> listarProduto() {
        List<Produto> listaProduto = new ArrayList<>();

        return listaProduto;

    }
}
