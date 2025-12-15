package testes;

public class TestRunner {
    
    private static int totalTestes = 0;
    private static int testesPassaram = 0;
    private static int testesFalharam = 0;
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║   EXECUTOR DE TESTES UNITÁRIOS            ║");
        System.out.println("║   Sistema: Sinal Verde                    ║");
        System.out.println("╚════════════════════════════════════════════╝\n");
        
        long inicio = System.currentTimeMillis();
        
        // Executar todos os testes
        executarTeste("FiscalException", new FiscalExceptionTest());
        executarTeste("GuarnicaoException", new GuarnicaoExceptionTest());
        executarTeste("MultaException", new MultaExceptionTest());
        executarTeste("OperacaoException", new OperacaoExceptionTest());
        executarTeste("PermissionarioException", new PermissionarioExceptionTest());
        executarTeste("VeiculoException", new VeiculoExceptionTest());
        
        long fim = System.currentTimeMillis();
        long duracao = fim - inicio;
        
        // Relatório final
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║   RELATÓRIO FINAL                         ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.println("Total de Testes: " + totalTestes);
        System.out.println("✓ Passaram: " + testesPassaram);
        System.out.println("✗ Falharam: " + testesFalharam);
        System.out.println("Tempo: " + duracao + "ms");
        
        if (testesFalharam == 0) {
            System.out.println("\n🎉 TODOS OS TESTES PASSARAM!");
        } else {
            System.out.println("\n⚠️ ALGUNS TESTES FALHARAM!");
            System.exit(1);
        }
    }
    
    private static void executarTeste(String nomeTeste, TesteSuite suite) {
        System.out.println("\n▶ Executando: " + nomeTeste);
        System.out.println("─────────────────────────────────────────────");
        
        try {
            suite.executarTodos();
        } catch (Exception e) {
            System.err.println("✗ ERRO CRÍTICO ao executar " + nomeTeste);
            e.printStackTrace();
            testesFalharam++;
        }
        
        System.out.println();
    }
    
    /**
     * Verifica se condição é verdadeira
     */
    public static void assertTrue(String mensagem, boolean condicao) {
        totalTestes++;
        if (condicao) {
            System.out.println("  ✓ " + mensagem);
            testesPassaram++;
        } else {
            System.err.println("  ✗ " + mensagem + " - FALHOU");
            testesFalharam++;
        }
    }
    
    /**
     * Verifica se condição é falsa
     */
    public static void assertFalse(String mensagem, boolean condicao) {
        assertTrue(mensagem, !condicao);
    }
    
    /**
     * Verifica se dois objetos são iguais
     */
    public static void assertEquals(String mensagem, Object esperado, Object atual) {
        totalTestes++;
        if ((esperado == null && atual == null) || 
            (esperado != null && esperado.equals(atual))) {
            System.out.println("  ✓ " + mensagem);
            testesPassaram++;
        } else {
            System.err.println("  ✗ " + mensagem + " - FALHOU");
            System.err.println("     Esperado: " + esperado);
            System.err.println("     Atual: " + atual);
            testesFalharam++;
        }
    }
    
    /**
     * Verifica se objeto não é nulo
     */
    public static void assertNotNull(String mensagem, Object objeto) {
        totalTestes++;
        if (objeto != null) {
            System.out.println("  ✓ " + mensagem);
            testesPassaram++;
        } else {
            System.err.println("  ✗ " + mensagem + " - Objeto é NULL");
            testesFalharam++;
        }
    }
    
    /**
     * Verifica se exceção foi lançada
     */
    public static void assertThrows(String mensagem, Class<? extends Exception> excecaoEsperada, Executavel acao) {
        totalTestes++;
        try {
            acao.executar();
            System.err.println("  ✗ " + mensagem + " - Exceção NÃO foi lançada");
            testesFalharam++;
        } catch (Exception e) {
            if (excecaoEsperada.isInstance(e)) {
                System.out.println("  ✓ " + mensagem + " (" + e.getClass().getSimpleName() + ")");
                testesPassaram++;
            } else {
                System.err.println("  ✗ " + mensagem + " - Exceção errada");
                System.err.println("     Esperada: " + excecaoEsperada.getSimpleName());
                System.err.println("     Lançada: " + e.getClass().getSimpleName());
                testesFalharam++;
            }
        }
    }
    
    /**
     * Interface funcional para executar ações que podem lançar exceções
     */
    @FunctionalInterface
    public interface Executavel {
        void executar() throws Exception;
    }
}

/**
 * Interface base para suítes de teste
 */
interface TesteSuite {
    void executarTodos();
}