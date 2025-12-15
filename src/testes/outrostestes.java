package testes;

import Guarnicao.GuarnicaoException;
import Multa.MultaException;
import Operacao.OperacaoException;
import Veiculo.VeiculoException;
import Veiculo.Veiculo;
import Permissionario.Permissionario;
import Excecoes.*;

import static testes.TestRunner.*;

// ============================================
// TESTES: GuarnicaoException
// ============================================
class GuarnicaoExceptionTest implements TesteSuite {
    @Override
    public void executarTodos() {
        testeCriarGuarnicaoValida();
        testeNomeVazio();
        testeResponsavelVazio();
        testeAdicionarFiscal();
        testeRemoverFiscal();
        testeAdicionarVeiculo();
        testeRemoverVeiculo();
    }
    
    private void testeCriarGuarnicaoValida() {
        try {
            GuarnicaoException g = new GuarnicaoException(
                "Guarnição Centro",
                "João Silva",
                "Chefe João"
            );
            assertNotNull("Guarnição válida criada", g);
        } catch (Exception e) {
            assertFalse("Erro ao criar guarnição: " + e.getMessage(), true);
        }
    }
    
    private void testeNomeVazio() {
        assertThrows("Deve lançar exceção para nome vazio",
            CampoVazioException.class,
            () -> new GuarnicaoException("", "Resp", "Chefe")
        );
    }
    
    private void testeResponsavelVazio() {
        assertThrows("Deve lançar exceção para responsável vazio",
            CampoVazioException.class,
            () -> new GuarnicaoException("Nome", "Resp", "")
        );
    }
    
    private void testeAdicionarFiscal() {
        try {
            GuarnicaoException g = new GuarnicaoException("G1", "R1", "C1");
            g.adicionarFiscal("Fiscal João");
            assertTrue("Fiscal adicionado com sucesso", true);
        } catch (Exception e) {
            assertFalse("Erro: " + e.getMessage(), true);
        }
    }
    
    private void testeRemoverFiscal() {
        try {
            GuarnicaoException g = new GuarnicaoException("G1", "R1", "C1");
            g.adicionarFiscal("Fiscal João");
            g.removerFiscal("Fiscal João");
            assertTrue("Fiscal removido com sucesso", true);
        } catch (Exception e) {
            assertFalse("Erro: " + e.getMessage(), true);
        }
    }
    
    private void testeAdicionarVeiculo() {
        try {
            GuarnicaoException g = new GuarnicaoException("G1", "R1", "C1");
            g.adicionarVeiculo("ABC1234");
            assertTrue("Veículo adicionado com sucesso", true);
        } catch (Exception e) {
            assertFalse("Erro: " + e.getMessage(), true);
        }
    }
    
    private void testeRemoverVeiculo() {
        try {
            GuarnicaoException g = new GuarnicaoException("G1", "R1", "C1");
            g.adicionarVeiculo("ABC1234");
            g.removerVeiculo("ABC1234");
            assertTrue("Veículo removido com sucesso", true);
        } catch (Exception e) {
            assertFalse("Erro: " + e.getMessage(), true);
        }
    }
}

// ============================================
// TESTES: MultaException
// ============================================
class MultaExceptionTest implements TesteSuite {
    @Override
    public void executarTodos() {
        testeCriarMultaValida();
        testeInfracaoVazia();
        testeValorMultaZero();
        testeValorMultaNegativo();
        testePontosDefesaNegativos();
    }
    
    private void testeCriarMultaValida() {
        try {
            Veiculo v = new Veiculo("ABC1234", "Fiat", "ATIVO", 0, null);
            MultaException m = new MultaException(
                "Estacionamento irregular",
                "Leve",
                "Observação",
                3,
                "2025-12-31",
                50.0,
                "2025-12-14",
                1,
                v
            );
            assertNotNull("Multa válida criada", m);
        } catch (Exception e) {
            assertFalse("Erro: " + e.getMessage(), true);
        }
    }
    
    private void testeInfracaoVazia() {
        try {
            Veiculo v = new Veiculo("ABC1234", "Fiat", "ATIVO", 0, null);
            assertThrows("Deve lançar exceção para infração vazia",
                CampoVazioException.class,
                () -> new MultaException("", "Leve", "Obs", 3, "2025-12-31", 50.0, "2025-12-14", 1, v)
            );
        } catch (Exception e) {
            assertFalse("Erro ao preparar teste: " + e.getMessage(), true);
        }
    }
    
    private void testeValorMultaZero() {
        try {
            Veiculo v = new Veiculo("ABC1234", "Fiat", "ATIVO", 0, null);
            assertThrows("Deve lançar exceção para valor zero",
                ValorInvalidoException.class,
                () -> new MultaException("Infração", "Leve", "Obs", 3, "2025-12-31", 0.0, "2025-12-14", 1, v)
            );
        } catch (Exception e) {
            assertFalse("Erro: " + e.getMessage(), true);
        }
    }
    
    private void testeValorMultaNegativo() {
        try {
            Veiculo v = new Veiculo("ABC1234", "Fiat", "ATIVO", 0, null);
            assertThrows("Deve lançar exceção para valor negativo",
                ValorInvalidoException.class,
                () -> new MultaException("Infração", "Leve", "Obs", 3, "2025-12-31", -10.0, "2025-12-14", 1, v)
            );
        } catch (Exception e) {
            assertFalse("Erro: " + e.getMessage(), true);
        }
    }
    
    private void testePontosDefesaNegativos() {
        try {
            Veiculo v = new Veiculo("ABC1234", "Fiat", "ATIVO", 0, null);
            assertThrows("Deve lançar exceção para pontos negativos",
                MultaInvalidaException.class,
                () -> new MultaException("Infração", "Leve", "Obs", -5, "2025-12-31", 50.0, "2025-12-14", 1, v)
            );
        } catch (Exception e) {
            assertFalse("Erro: " + e.getMessage(), true);
        }
    }
}

// ============================================
// TESTES: OperacaoException
// ============================================
class OperacaoExceptionTest implements TesteSuite {
    @Override
    public void executarTodos() {
        testeCriarOperacaoValida();
        testeNomeVazio();
        testeFinalidadeCurta();
    }
    
    private void testeCriarOperacaoValida() {
        try {
            OperacaoException op = new OperacaoException(
                "Operação Rota Segura",
                "2025-12-31",
                "Guarnição Centro",
                "Fiscalização de velocidade",
                "Chefe João"
            );
            assertNotNull("Operação válida criada", op);
        } catch (Exception e) {
            assertFalse("Erro: " + e.getMessage(), true);
        }
    }
    
    private void testeNomeVazio() {
        assertThrows("Deve lançar exceção para nome vazio",
            CampoVazioException.class,
            () -> new OperacaoException("", "2025-12-31", "G1", "Finalidade", "Chefe")
        );
    }
    
    private void testeFinalidadeCurta() {
        assertThrows("Deve lançar exceção para finalidade muito curta",
            OperacaoInvalidaException.class,
            () -> new OperacaoException("Operação", "2025-12-31", "G1", "AB", "Chefe")
        );
    }
}

// ============================================
// TESTES: VeiculoException
// ============================================
class VeiculoExceptionTest implements TesteSuite {
    @Override
    public void executarTodos() {
        testeCriarVeiculoValido();
        testePlacaVazia();
        testePlacaCurta();
    }
    
    private void testeCriarVeiculoValido() {
        try {
            VeiculoException v = new VeiculoException(
                "ABC1234",
                "Fiat Uno",
                "ATIVO",
                0,
                null
            );
            assertNotNull("Veículo válido criado", v);
        } catch (Exception e) {
            assertFalse("Erro: " + e.getMessage(), true);
        }
    }
    
    private void testePlacaVazia() {
        assertThrows("Deve lançar exceção para placa vazia",
            CampoVazioException.class,
            () -> new VeiculoException("", "Fiat", "ATIVO", 0, null)
        );
    }
    
    private void testePlacaCurta() {
        assertThrows("Deve lançar exceção para placa com menos de 7 caracteres",
            VeiculoInvalidoException.class,
            () -> new VeiculoException("ABC12", "Fiat", "ATIVO", 0, null)
        );
    }
}