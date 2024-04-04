--criar uma tabela para usuário
CREATE TABLE tb_usuario(
 cod_usuario SERIAL PRIMARY KEY,
 login VARCHAR(200) NOT NULL,
 senha VARCHAR(200) NOT NULL
);

--cadastrar um usuário
INSERT INTO tb_usuario
(login, senha) VALUES
('admin', 'admin');

-- listar usuários existentes
SELECT * FROM tb_usuario;
-- apenas duas colunas(projeção)
SELECT login, senha FROM tb_usuario;
--pegando dados apenas da Ana
SELECT * FROM tb_usuario WHERE cod_usuario = 2;

SELECT * FROM tb_usuario ORDER BY login;
--atualizar dados de um usuário
UPDATE tb_usuario SET login = 'Ana Paula'
	WHERE cod_usuario = 2;
--apagar um usuário
DELETE FROM tb_usuario WHERE cod_usuario = 1;

