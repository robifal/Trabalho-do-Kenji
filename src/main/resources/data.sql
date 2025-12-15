--------------------------------------
-- 1) USUÁRIOS (superclasse)
--------------------------------------
INSERT INTO usuarios
(id, login, senha, nome, matricula, cpf, cnh, data_admissao, role)
VALUES
(1,'admin','admin123','Administrador Municipal','ADM001','12345678901','CNH0001','2020-01-10','ADMINISTRATIVO'),
(2,'fiscal01','fiscal01','José Fiscal','FIS001','11122233344','CNH1001','2021-03-05','FISCAL'),
(3,'fiscal02','fiscal02','Maria Fiscal','FIS002','22233344455','CNH1002','2022-06-15','FISCAL'),
(4,'chefe','chefe123','Chefe Setor','CHF001','33344455566','CNH2001','2019-11-20','CHEFE');


--------------------------------------
-- 2) FISCAIS (subclasse)
-- PK é usuario_id, herdado de usuarios
--------------------------------------
INSERT INTO fiscais (usuario_id)
VALUES
(2),
(3);


--------------------------------------
-- 3) PERMISSIONÁRIOS
--------------------------------------
INSERT INTO permissionarios
(id, nome_razao_social, cpf_cnpj, crlvne, quantidade_multas_pendentes)
VALUES
(1,'Empresa Alpha','11111111000101','CRLVNE001',0),
(2,'Cooperativa Beta','22222222000102','CRLVNE002',0);


--------------------------------------
-- 4) VEÍCULOS
--------------------------------------
INSERT INTO veiculos
(id, placa, marca, situacao, quantidade_multas, permissionario_id)
VALUES
(1,'ABC1234','Honda CG 160','ATIVO',0,1),
(2,'XYZ5678','Yamaha Fazer','ATIVO',0,1),
(3,'KLM4321','Toyota Corolla','ATIVO',0,2);


--------------------------------------
-- 5) GUARNIÇÕES
--------------------------------------
INSERT INTO guarnicoes
(id, nome, responsavel_id)
VALUES
(1,'Guarnição Alfa',4),
(2,'Guarnição Bravo',4);


--------------------------------------
-- 6) JOIN TABLE (Guarnição x Fiscal)
--------------------------------------
INSERT INTO guarnicao_fiscal (guarnicao_id, fiscal_id)
VALUES
(1,2),  -- José Fiscal na Guarnição Alfa
(1,3),  -- Maria Fiscal na Guarnição Alfa
(2,3);  -- Maria Fiscal na Guarnição Bravo


--------------------------------------
-- 7) OPERAÇÕES
--------------------------------------
INSERT INTO operacoes
(id, nome, data_aser_executada, finalidade, guarnicao_id, responsavel_id)
VALUES
(1,'Operação Centro','2024-12-10','Fiscalização urbana',1,4),
(2,'Operação Rodoviária','2024-12-12','Fiscalização em rodovias',2,4);


--------------------------------------
-- 8) MULTAS
--------------------------------------
INSERT INTO multas
(id, infracao, tipo_multa, observacao, pontos, data_vencimento, valor_multa, data_atualizacao,
 motoristas_receberam, veiculo_id, operacao_id)
VALUES
(1,'Estacionamento proibido','MEDIA','Veículo em local indevido',4,'2025-01-15',130.16,'2024-12-05',1,1,1),
(2,'Alta velocidade','GRAVE','Velocidade 25% acima do limite',5,'2025-02-01',195.23,'2024-12-06',2,1,1),
(3,'Documentação irregular','GRAVISSIMA','CRLV vencido',7,'2025-01-20',293.47,'2024-12-10',1,2,2);


--------------------------------------
-- 9) ESCALAS
--------------------------------------
INSERT INTO escalas
(id, dia_da_semana, inicio_servico, fim_servico, usuario_id, veiculo_id, guarnicao_id)
VALUES
(1,'MONDAY','08:00','12:00',2,1,1),
(2,'WEDNESDAY','14:00','18:00',3,2,1),
(3,'FRIDAY','07:00','13:00',2,3,2);
