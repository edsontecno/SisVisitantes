CREATE TABLE perfil (
    id_perfil BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE permissao (
    id_permissao BIGINT(20) PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE usuario (
    id_usuario BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    senha VARCHAR(120) NOT NULL,
    ativo BOOLEAN DEFAULT TRUE,
    data_nascimento DATE,
    id_perfil BIGINT(20) NOT NULL,
    FOREIGN KEY (id_perfil) REFERENCES perfil(id_perfil)
) ENGINE=INNODB DEFAULT CHARSET=utf8;


CREATE TABLE perfil_permissao (
    id_permissao BIGINT(20) NOT NULL,
    id_perfil BIGINT(20) NOT NULL,
    PRIMARY KEY (id_permissao, id_perfil),
    FOREIGN KEY (id_permissao) REFERENCES permissao(id_permissao),
    FOREIGN KEY (id_perfil) REFERENCES perfil(id_perfil)
) ENGINE=INNODB DEFAULT CHARSET=utf8;


--SENHA É TESTE123
insert into `perfil` (`id_perfil`, `nome`) values('1','Administrador');
insert into `permissao` (`id_permissao`, `nome`) values('1','CADASTRAR_USUARIO');
insert into `perfil_permissao` (`id_permissao`, `id_perfil`) values('1','1');
insert into `usuario` (`id_usuario`, `nome`, `email`, `senha`, `ativo`, `data_nascimento`, `id_perfil`) values('1','Edson','edsontecno@gmail.com','$2a$10$bWmqoFDMm33tNT30uy84fugTPPqOFUr39wUMAXEpgRSaKPV7GrK16','1',NULL,'1');

