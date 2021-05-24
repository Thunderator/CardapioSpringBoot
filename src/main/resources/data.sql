-- inserts sem os ids, para deixar o proprio mysql decidir
-- Entity: GeneratedValue (strategy = GenerationType.IDENTITY)
-- Ao usar o AUTO, acaba usando IDENTITY (que estoura excecao porque o id nao tem um valor default)
insert into cardapio (nome, descricao, img, preco) values ('X-Burguer', 'Pão, carne, queijo e presunto', 'http://www.spacefood-delivery.com.br/wp-content/uploads/2016/05/XBurguer-Delivery.jpg', '10.00');
insert into cardapio (nome, descricao, img, preco) values ('X-Salada', 'Pão, carne, queijo, presunto, alface, tomate, milho e ervilha', 'http://www.spacefood-delivery.com.br/wp-content/uploads/2016/04/XSalada-Delivery.jpg', '13.50');