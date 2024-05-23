-- Active: 1715899212322@@127.0.0.1@5432@20241_usjt_psc_quinta@public

-- ALTER TABLE tb_usuario_psc_quinta ADD COLUMN tipo INT;
CREATE TABLE tb_usuario_psc_quinta(
  cod_usuario SERIAL PRIMARY KEY,
  login VARCHAR(200),
  senha VARCHAR(200),
  tipo INT
);

INSERT INTO tb_usuario_psc_quinta (login, senha, tipo)
VALUES
('admin', 'admin', 1),
('comum', 'comum', 2);

SELECT * FROM tb_usuario_psc_quinta;

CREATE TABLE tb_evento_psc_quinta(
  cod_evento SERIAL PRIMARY KEY,
  nome VARCHAR(200) NOT NULL,
  descricao VARCHAR(1000) NOT NULL,
  data_inicio TIMESTAMP NOT NULL,
  data_fim TIMESTAMP NOT NULL
);

INSERT INTO tb_evento_psc_quinta
(nome, descricao, data_inicio, data_fim)
VALUES
(
  'Evento1', 
  'Esse é o evento 1', 
  CURRENT_TIMESTAMP,
  CURRENT_TIMESTAMP
),
(
  'Evento 2',
  'Esse é o evento 2',
  CURRENT_TIMESTAMP,
  CURRENT_TIMESTAMP
);

SELECT * FROM tb_evento_psc_quinta;