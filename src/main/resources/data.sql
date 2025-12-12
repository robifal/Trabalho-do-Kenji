-- Usuarios (administrativo e fiscais)
INSERT INTO usuarios (id, login, senha, nome, matricula, cpf, cnh, dataAdmissao, role) VALUES
(1,'admin','admin123','Administrador Municipal','ADM001','12345678901','CNH0001','2020-01-10','ADMINISTRATIVO'),
(2,'fiscal01','fiscal01','José Fiscal','FIS001','11122233344','CNH1001','2021-03-05','FISCAL'),
(3,'fiscal02','fiscal02','Maria Fiscal','FIS002','22233344455','CNH1002','2022-06-15','FISCAL'),
(4,'chefe','chefe123','Chefe Setor','CHF001','33344455566','CNH2001','2019-11-20','CHEFE');

-- Permissionários
INSERT INTO permissionarios (id, nome_razao_social, cpf_cnpj, crlvne, quantidade_multas_pendentes) VALUES
(1,'João da Silva','98765432100','CRLV123','0'),
(2,'Empresa X Ltda','12312312312','CRLV456','1');

-- Veículos
INSERT INTO veiculos (id, placa, marca, situacao, quantidade_multas, permissionario_id) VALUES
(1,'ABC1234','Fiat Uno','ATIVO',0,1),
(2,'XYZ9876','Ford Ka','ATIVO',1,2);

-- Guarnições
INSERT INTO guarnicoes (id, nome, responsavel_id) VALUES
(1,'Guarnição Centro',2),
(2,'Guarnição Zona Norte',3);

-- Operações
INSERT INTO operacoes (id, nome, data_a_ser_executada, finalidade, guarnicao_id, responsavel_id) VALUES
(1,'Operação Rota Segura','2025-06-01','Fiscalização de velocidade',1,2),
(2,'Operação Fiscalização Estacionamento','2025-06-02','Fiscalização estacionamento irregular',2,3);

-- Multas (uma multa associada ao veículo 2)
INSERT INTO multas (id, infracao, tipo_multa, observacao, pontos, data_vencimento, valor_multa, data_atualizacao, motoristas_receberam, veiculo_id, operacao_id)
VALUES
(1,'Estacionamento irregular','Leve','Estacionado em local proibido',0,'2025-07-10',50.00,'2025-06-02',1,2,2);

-- Escalas (exemplo)
INSERT INTO escalas (id, dia_da_semana, inicio_servico, fim_servico, usuario_id, veiculo_id, guarnicao_id) VALUES
(1,'MONDAY','08:00:00','12:00:00',2,1,1),
(2,'TUESDAY','13:00:00','17:00:00',3,2,2);

-- Relacionamentos many-to-many (guarnicao_fiscal)
INSERT INTO guarnicao_fiscal (guarnicao_id, fiscal_id) VALUES
(1,2),
(2,3);
