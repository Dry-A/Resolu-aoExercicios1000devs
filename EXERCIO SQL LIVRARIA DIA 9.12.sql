CREATE DATABASE livraria;
USE livraria;

-- CRIANDO TABELAS

CREATE TABLE livros(
	id_livro INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(50) NOT NULL,
    autor VARCHAR(100),
    ano_publicacao SMALLINT,
    preco DECIMAL(10,2),
    data_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE clientes(
	id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(200) NOT NULL,
    email VARCHAR(150) UNIQUE,
    idade INT,
    data_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE vendas(
	id_venda INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT,
    livro_id INT,
    data_venda DATETIME DEFAULT CURRENT_TIMESTAMP,
    quantidade INT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id_cliente),
    FOREIGN KEY (livro_id) REFERENCES livros(id_livro)
);

-- INSERINDO DADOS NAS TABELAS

INSERT INTO livros(titulo,autor,ano_publicacao,preco)
VALUES('O Senhor dos Anéis', 'J.R.R. Tolkien', 1954, 49.90),
	('Pinóquio', 'Walt Disney', 1920, 29.90),
    ('O diário de Biloca', 'Fernanda Montenegro', 1994, 32.90),
    ('Dom Casmurro', 'Machado de Assis', 1899, 65.90),
    ('O Hobbit', 'J.R.R. Tolkien', 1949, 49.90),
    ('Nada pode me ferir', 'David Gogginsb', 2020, 35.70),
	('Como Fazer amigos e Influenciar pessoas', 'Dale Carnegie' , 2023, 41.00  );

INSERT INTO clientes(nome, email, idade)
VALUES('Nazaré Tedesco', 'nazare@email.com', 25),
	  ('Ronaldo Barcelos', 'ronaldo@email.com', 37),
      ('Clara Magalhaes', 'clarinhapapaleguas@email.com', 55),
      ('Simone de Simaria', 'simoninha@email.com', 44),
      ('CCristian William', 'criswill@email.com', 42);
      
INSERT INTO clientes(nome, email, idade)
VALUES('Pablo Scobar', 'pablo@email.com', 25),
	  ('Vitoria Secrets', 'vitoria@email.com', 25),
      ('Santos dumont', 'santos@email.com', 34),
      ('Rainha da Sucata', 'rainha@email.com', 37);
      
INSERT INTO vendas(cliente_id, livro_id, quantidade)
VALUES(3, 1, 10);

      
INSERT INTO vendas(cliente_id, livro_id, quantidade)
VALUES(3,4,2),
      (1,2,3),
      (7,2,5);
	
INSERT INTO vendas(cliente_id, livro_id, quantidade)
VALUES(8,4,20),
      (11,6,4),
      (9,7,2);

-- Adicionando coluna a uma tabela existente
ALTER TABLE clientes ADD COLUMN telefone VARCHAR(18);

-- Renomear coluna existente
ALTER TABLE clientes CHANGE COLUMN telefone contato VARCHAR(15);
ALTER TABLE livros CHANGE COLUMN preco valor DECIMAL(10,2);
ALTER TABLE vendas CHANGE COLUMN id_venda id_pedido INT;

-- Modificar TIPO de coluna existente:
ALTER TABLE clientes MODIFY COLUMN email VARCHAR(50) UNIQUE;

-- Remover uma coluna:
ALTER TABLE clientes DROP COLUMN contato;

-- Deletar um Registro Específico:
DELETE FROM clientes;


-- USANDO SELECTS

-- ordenando de forma Crescente
SELECT * FROM livros ORDER BY titulo ASC;

-- com operadores de comparação 
SELECT titulo, valor FROM livros WHERE valor BETWEEN 30 AND 40;

-- Operadores lógicos
SELECT * FROM livros WHERE (valor > 30) AND (titulo = 'Dom Casmurro');
SELECT * FROM livros WHERE (valor < 30) OR autor = 'Dale Carnegie';
SELECT titulo,preco FROM livros WHERE preco > 30;
SELECT * FROM clientes  WHERE NOT nome LIKE '%a';

-- Like (Busca por termo)
SELECT * FROM livros WHERE titulo LIKE 'A%'; 

-- Funcoes de Agregação

-- contando o total de registros de clientes
SELECT COUNT(*) AS total_clientes FROM clientes;

-- idade média dos clientes
SELECT AVG(idade) as media_idade FROM clientes;

-- idade máxima dos clientes
SELECT MAX(idade) as idade_maxima FROM clientes;

-- idade mínima
SELECT MIN(idade) as idade_minima FROM clientes;

-- soma das idades
SELECT SUM(idade) AS soma_idades FROM clientes;

SELECT COUNT(*) AS total_livros FROM livros;
SELECT COUNT(*) AS total_livros FROM livros where preco > 40;

-- agrupando clientes pela idade
SELECT idade, COUNT(*) as total_clientes FROM clientes GROUP BY idade;

-- select encadeado
SELECT nome, idade FROM clientes WHERE idade > (SELECT AVG(idade) FROM clientes);

-- atualizando a idade pelo id
UPDATE clientes SET idade = 31 WHERE id_cliente = 11;

-- atualizando o nome pelo id
UPDATE clientes SET nome = 'Cristiano Ronaldo' WHERE id_cliente = 8;

select * from clientes;
Select *from livros;
SELECT * from vendas;

-- Joins - buscas 
-- seleciona o nome na tabela clientes, o titulo da tabela livros, de onde? da tabela de Vendas
SELECT clientes.nome, clientes.id_cliente as 'ID_cliente',
livros.titulo, livros.id_livro AS 'ID_livro', 
vendas.id_venda AS 'ID Venda' FROM vendas 
INNER JOIN clientes ON vendas.cliente_id = clientes.id_cliente 
INNER JOIN  livros ON vendas.livro_id = livros.id_livro;
-- fazendo o join primeiro da tabela de clientes, usando o ON ( quando) o cliente_id em VENDAS for igual ao id_cliente em clientes
-- verificando 


-- simplificado:
SELECT clientes.nome, livros.titulo, vendas.id_pedido  FROM vendas 
INNER JOIN clientes ON vendas.cliente_id = clientes.id_cliente 
INNER JOIN  livros ON vendas.livro_id = livros.id_livro;

-- a) Listar todos os livros vendidos e os clientes que compraram cada um.

select 
	livros.titulo as Livro,
    clientes.nome as Cliente
from
	vendas
join
	livros on vendas.livro_id = livros.id_livro
join
	clientes on vendas.cliente_id = clientes.id_cliente;


-- b) Listar todos os clientes, incluindo aqueles que não compraram nenhum livro.

select
	clientes.nome as Clientes,
    livros.titulo as Livro
from 
	clientes
left join
	vendas on clientes.id_cliente = vendas.cliente_id
left join
	livros on vendas.livro_id = livros.id_livro;
 
-- c) Contar quantos livros foram comprados por cada cliente.

select
	clientes.nome as Cliente,
    sum(vendas.quantidade) as Livros_Comprados
from
	clientes
left join
	vendas on clientes.id_cliente = vendas.cliente_id
group by
	clientes.id_cliente;
    
-- d) Listar os livros mais vendidos (maior quantidade comprada).

select
	livros.titulo as Livro,
    sum(vendas.quantidade) as Quantidade_Vendida
from
	vendas
join
	livros on vendas.livro_id = livros.id_livro
group by
	livros.id_livro
order by
	Quantidade_Vendida DESC;


-- e) Listar os clientes que gastaram mais de R$100,00 em compras.

select
	clientes.nome as Cliente,
    SUM(livros.valor * vendas.quantidade) AS Total_Gasto
from
	vendas
join
	clientes on vendas.cliente_id = clientes.id_cliente
join
	livros on vendas.livro_id = livros.id_livro
group by
	clientes.id_cliente
having
	total_gasto >100;

