-- Active: 1712273957933@@pg-33ad0904-professorbossini.a.aivencloud.com@12956@defaultdb@public

CREATE TABLE tb_usuario_psc_quinta(
  cod_usuario SERIAL PRIMARY KEY,
  login VARCHAR(200) NOT NULL,
  senha VARCHAR(200) NOT NULL
);
SELECT * FROM tb_usuario_psc_quinta;
--cadastrar um usuário
INSERT INTO tb_usuario_psc_quinta
(login, senha) VALUES
('comum', 'comum');

SELECT  *
FROM tb_usuario_psc_quinta;

UPDATE tb_usuario_psc_quinta SET
login='Admin',senha='Admin'
WHERE cod_usuario = 1;

DELETE FROM tb_usuario_psc_quinta
WHERE cod_usuario = 2;

UPDATE tb_usuario_psc_quinta SET
senha='' WHERE cod_usuario = 1;