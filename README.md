# Sistema de Gestão de Multas de Trânsito

Sistema completo para gerenciamento de fiscalização, infrações e multas de trânsito, desenvolvido para órgãos municipais de fiscalização.

## 📋 Sobre o Sistema

O sistema oferece uma solução integrada para o controle de operações de fiscalização de trânsito, desde o planejamento das escalas até a emissão e acompanhamento de multas. Permite gestão completa de equipes, veículos fiscalizados e infrações registradas.

## 🚀 Funcionalidades

### Gestão de Usuários
- Cadastro de usuários com autenticação (login/senha)
- Perfis diferenciados: Fiscal e Administrativo
- Validação por CPF e CNH
- Controle de matrícula funcional
- Sistema de permissões baseado em perfil

### Gestão de Funcionários

**Fiscal:**
- Realização de multas e observações
- Registro de ocorrências em campo
- Vinculação a escalas de trabalho

**Administrativo:**
- Facilitação do sistema
- Controle de operações
- Criação e gerenciamento de fiscais
- Gestão de CNH (matrícula dos 3 primeiros dígitos do CPF)

### Operações de Fiscalização
- Planejamento de operações com:
  - Nome da operação
  - Data de execução
  - Definição de guarnição
  - Fiscal responsável
  - Fiscalizante designado
- Acompanhamento do status das operações

### Guarnições (Equipes)
- Organização de equipes de fiscalização
- Definição de responsáveis por guarição
- Controle de corridas/modos de operação
- Gestão de responsável geral

### Escalas de Trabalho
- Programação por dia da semana
- Alocação de veículos para fiscalização
- Definição de locais de fiscalização
- Controle de horários:
  - Horário de início de serviço
  - Horário de término de serviço
- Visualização de escalas por usuário

### Gestão de Multas
Registro completo de infrações com:
- Tipo de infração
- Tipo de multa
- Valor da multa
- Data de vencimento
- Prazo para defesa
- Observações detalhadas
- Fiscal responsável
- Data de autuação
- Placa do veículo
- Identificação do motorista infrator
- Situação da multa
- Associação com operação que gerou a multa

### Controle de Veículos
- Cadastro de veículos fiscalizados
- Informações: placa, tipo, situação
- Histórico de multas por veículo
- Quantidade total de multas
- Criação e contratação de carros/operações

### Gestão de Motoristas
- Cadastro com CNH
- Associação com proprietários
- Vínculo com multas recebidas

### Proprietários
- Identificação por nome/razão social e CPF/CNPJ
- Controle de dívidas
- Quantidade de funcionários
- Quantidade de carros
- Operações de criação de carros e contratação de funcionários

## 👥 Perfis de Usuário

### Usuário Comum (Cidadão)
- Consulta de multas
- Visualização de escalas
- Acesso limitado a informações pessoais

### Fiscal
- Todas as funcionalidades de usuário comum
- Registro de multas em campo
- Registro de observações
- Consulta de operações designadas

### Administrativo
- Todas as funcionalidades anteriores
- Gerenciamento de fiscais
- Controle de operações
- Gestão de guarnições e escalas
- Administração completa do sistema

## 🔐 Segurança

- Autenticação obrigatória por login e senha
- Validação de CPF e CNH
- Controle de acesso baseado em perfis
- Rastreabilidade de todas as operações (fiscais responsáveis registrados)

## 📊 Relatórios e Consultas

O sistema permite:
- Visualização de escalas de trabalho
- Consulta de multas por veículo
- Histórico de operações
- Acompanhamento de guarnições
- Relatórios de fiscalização por período

## 🎯 Casos de Uso Principais

1. **Planejamento de Fiscalização**: Administrativo cria escalas, define locais, horários e aloca fiscais
2. **Execução de Operação**: Fiscal realiza ronda conforme escala e registra infrações
3. **Registro de Multa**: Sistema vincula infração ao veículo, motorista e operação
4. **Acompanhamento**: Proprietário ou motorista consulta multas e prazos
5. **Gestão Administrativa**: Controle geral de operações, equipes e resultados

## 📝 Observações Importantes

- Uma guarnição pode ter vários carros mais
- Um veículo pode receber múltiplas multas
- Cada multa está vinculada a uma operação específica
- O sistema mantém histórico completo de todas as ações
- Prazos de defesa são controlados automaticamente

## 🔄 Fluxo do Sistema

```
Planejamento (Escala) → Operação → Fiscalização → Registro de Multa → Notificação → Acompanhamento
```

---

**Nota:** Este sistema foi modelado para atender às necessidades específicas de órgãos municipais de trânsito, garantindo eficiência na fiscalização e transparência no processo de aplicação de multas.
