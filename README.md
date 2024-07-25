# REST API - Controle de Estoque

stock manager api
API de gestão de estoque.

## Install

    mvn install

## Criando contrainer de banco de dados usando docker

    - Navegue até o diretório de infra ./infra/database
    - Execute o comando docker compose up

    Será criado um container com o banco de dados suficiente para suportar a aplicação,
     informações relacionadas a bind de porta (container/host) e conexão com o banco de dados é possível acessar analisando o arquivo ./infra/database/docker-compose


## Run the tests

    mvn test