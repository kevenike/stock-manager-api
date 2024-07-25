package br.com.stockflow.stockmanager_api.adapter.http.dto.erros;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseErrors {

    private String campo;
    private String mensagem;
}
