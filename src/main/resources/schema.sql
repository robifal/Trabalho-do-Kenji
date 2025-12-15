---------------------------------------------------------
-- TABELA: usuarios (superclasse)
---------------------------------------------------------
CREATE TABLE usuarios (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    login VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    nome VARCHAR(255) NOT NULL,
    matricula VARCHAR(255),
    cpf VARCHAR(20),
    cnh VARCHAR(20),
    data_admissao DATE,
    role VARCHAR(50)
);

---------------------------------------------------------
-- TABELA: fiscais (subclasse de Usuario)
-- PK herdada via usuario_id
---------------------------------------------------------
CREATE TABLE fiscais (
    usuario_id BIGINT PRIMARY KEY,
    CONSTRAINT fk_fiscal_usuario
        FOREIGN KEY (usuario_id)
        REFERENCES usuarios(id)
        ON DELETE CASCADE
);

---------------------------------------------------------
-- TABELA: permissionarios
---------------------------------------------------------
CREATE TABLE permissionarios (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nome_razao_social VARCHAR(255) NOT NULL,
    cpf_cnpj VARCHAR(30) NOT NULL,
    crlvne VARCHAR(50),
    quantidade_multas_pendentes INT DEFAULT 0
);

---------------------------------------------------------
-- TABELA: veiculos
---------------------------------------------------------
CREATE TABLE veiculos (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    placa VARCHAR(20) NOT NULL,
    marca VARCHAR(100),
    situacao VARCHAR(50),
    quantidade_multas INT DEFAULT 0,
    permissionario_id BIGINT,
    CONSTRAINT fk_veiculo_permissionario
        FOREIGN KEY (permissionario_id)
        REFERENCES permissionarios(id)
);

---------------------------------------------------------
-- TABELA: guarnicoes
---------------------------------------------------------
CREATE TABLE guarnicoes (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    responsavel_id BIGINT,
    CONSTRAINT fk_guarnicao_responsavel
        FOREIGN KEY (responsavel_id)
        REFERENCES usuarios(id)
);

---------------------------------------------------------
-- TABELA DE ASSOCIAÇÃO: guarnicao_fiscal
-- Many-to-Many Guarnicao <-> Fiscal
---------------------------------------------------------
CREATE TABLE guarnicao_fiscal (
    guarnicao_id BIGINT NOT NULL,
    fiscal_id BIGINT NOT NULL,
    PRIMARY KEY (guarnicao_id, fiscal_id),
    
    CONSTRAINT fk_gf_guarnicao
        FOREIGN KEY (guarnicao_id)
        REFERENCES guarnicoes(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_gf_fiscal
        FOREIGN KEY (fiscal_id)
        REFERENCES fiscais(usuario_id)
        ON DELETE CASCADE
);

---------------------------------------------------------
-- TABELA: operacoes
---------------------------------------------------------
CREATE TABLE operacoes (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nome VARCHAR(255),
    data_aser_executada DATE,
    finalidade VARCHAR(255),
    guarnicao_id BIGINT,
    responsavel_id BIGINT,

    CONSTRAINT fk_operacao_guarnicao
        FOREIGN KEY (guarnicao_id)
        REFERENCES guarnicoes(id),

    CONSTRAINT fk_operacao_responsavel
        FOREIGN KEY (responsavel_id)
        REFERENCES usuarios(id)
);

---------------------------------------------------------
-- TABELA: multas
---------------------------------------------------------
CREATE TABLE multas (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    infracao VARCHAR(255),
    tipo_multa VARCHAR(50),
    observacao VARCHAR(500),
    pontos INT,
    data_vencimento DATE,
    valor_multa DECIMAL(10,2),
    data_atualizacao DATE,
    motoristas_receberam INT,
    veiculo_id BIGINT,
    operacao_id BIGINT,

    CONSTRAINT fk_multa_veiculo
        FOREIGN KEY (veiculo_id)
        REFERENCES veiculos(id),

    CONSTRAINT fk_multa_operacao
        FOREIGN KEY (operacao_id)
        REFERENCES operacoes(id)
);

---------------------------------------------------------
-- TABELA: escalas
---------------------------------------------------------
CREATE TABLE escalas (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    dia_da_semana VARCHAR(20),
    inicio_servico TIME,
    fim_servico TIME,

    usuario_id BIGINT,
    veiculo_id BIGINT,
    guarnicao_id BIGINT,

    CONSTRAINT fk_escala_usuario
        FOREIGN KEY (usuario_id)
        REFERENCES usuarios(id),

    CONSTRAINT fk_escala_veiculo
        FOREIGN KEY (veiculo_id)
        REFERENCES veiculos(id),

    CONSTRAINT fk_escala_guarnicao
        FOREIGN KEY (guarnicao_id)
        REFERENCES guarnicoes(id)
);
