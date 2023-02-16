# soli-api
API para gerenciar os produtos de uma loja. É possível fazer a inclusão, alteração, consulta, listagem e exclusão de produtos. 

## Tech
➡︎ Java 17 <br>
➡︎ Maven <br>
➡︎ IDE Intellij <br>
➡︎ Postman <br>

## Testando a API
 - Para incluir um novo produto: localhost:8080/home
 ```
  {
    "name": "Vela Aromática - Lavanda",
    "price": 12.20,
    "quantity": 9
  }
 ```
 - Para listar todos os produtos: localhost:8080/home
 - Para selecionar um produto: localhost:8080/home/3 <br>
 obs: Route + id
 - Para atualizar um produto: localhost:8080/home/3 <br>
 ```
 {
    "id": 3,
    "name": "Mochila LOL",
    "price": 65.72,
    "quantity": 4
 }
 ```
  - Para deletar um produto: localhost:8080/home/1 <br>
