# Android-DesafioStonePagamentos
Projeto desenvolvido para concorrer à vaga de desenvolvedor Android na Stone Pagamentos.

Desafio Mobile
O desafio consiste em criar uma loja de itens de Star Wars que o usuário é capaz de adicionar os itens desejados em um carrinho de compras e finalizar a compra com uma simulação de transação e-commerce.

O candidato deve dar fork neste repositório e após o termino do desenvolvimento, realizar um pull request para análise do time.

Para obter os itens da loja, sua aplicação deverá realizar uma chamada GET na URL https://raw.githubusercontent.com/stone-pagamentos/desafio-mobile/master/store/products.json

A lista de itens deve exibir as seguintes informações:

Nome [title]
Preço [price]
Vendedor [seller]
Foto do item [thumbnailHd]
Após o usuário adicionar todos os itens no carrinho, ele deverá finalizar a compra. Para finalizar a compra, aconselhamos que use o Apiary como API nessa etapa.

Simulação E-commerce
Sua aplicação deve realizar um POST com os seguintes atributos:

Número do cartão (máximo de 16 números - XXXX XXXX XXXX XXXX)
Nome do portador do cartão
Vencimento do cartão (MM/yy)
CVV (código encontrado na parte traseira do cartão)
Valor da transação (total dos itens no carrinho)
{  
   "card_number":"1234123412341234",
   "value":7990,
   "cvv":789,
   "card_holder_name":"Luke Skywalker",
   "exp_date":"12/24"
}
Banco de dados
Todas as transações realizadas devem ser salvas em um banco interno com os seguintes campos:

Valor
Data e hora
Últimos 4 dígitos do cartão
Nome do portador do cartão
Lista de Transações
A aplicação deverá conter uma tela para exibir as transações que foram salvas em seu banco de dados (SQLite).  

### Imagens do App desenvolvido.

![Alt text](./android1.jpg)
![Alt text](./android2.jpg)
![Alt text](./android3.jpg)
![Alt text](./android4.jpg)
![Alt text](./android5.jpg)
![Alt text](./android6.jpg)
