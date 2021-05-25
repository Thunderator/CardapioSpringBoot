-- inserts sem os ids, para deixar o proprio mysql decidir
-- Entity: GeneratedValue (strategy = GenerationType.IDENTITY)
-- Ao usar o AUTO, acaba usando IDENTITY (que estoura excecao porque o id nao tem um valor default)
insert into cardapio (nome, descricao, img, preco) values ('X-Burguer', 'Pão, carne e 2x fatias de queijo', 'https://burgerx.com.br/assets/img/galeria/burgers/x-burger.jpg', '10.00');
insert into cardapio (nome, descricao, img, preco) values ('X-Salada', 'Pão, carne, 2x fatias de queijo, alface e tomate', 'https://burgerx.com.br/assets/img/galeria/burgers/x-salada.jpg', '13.50');