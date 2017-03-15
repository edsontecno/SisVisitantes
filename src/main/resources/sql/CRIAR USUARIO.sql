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
