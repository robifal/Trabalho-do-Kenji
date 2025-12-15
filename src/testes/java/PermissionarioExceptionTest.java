package testes;

import Permissionario.PermissionarioException;
import Veiculo.Veiculo;
import Excecoes.CampoVazioException;

import static testes.TestRunner.*;

/**
 * TESTES UNITÁRIOS - PermissionarioException
 */
public class PermissionarioExceptionTest implements TesteSuite {
    
    @Override
    public void executarTodos() {
        testeCriarPermissionarioValido();
        testeNomeRazaoSocialVazio();
        testeNomeRazaoSocialNulo();
        testeCpfCnpjVazio();
        testeCpfCnpjNulo();
        testeCriarVeiculo();
        testeGetters();
    }
    
    private void testeCriarPermissionarioValido() {
        try {
            PermissionarioException perm = new PermissionarioException(
                "João da Silva",
                "12345678901",
                "CRLV123456"
            );
            
            assertNotNull("Permissionário válido não deve ser null", perm);
            assertTrue("Permissionário válido criado com sucesso", true);
            
        } catch (Exception e) {
            assertFalse("Não deveria lançar exceção para dados válidos: " + e.getMessage(), true);
        }
    }
    
    private void testeNomeRazaoSocialVazio() {
        assertThrows(
            "Deve lançar CampoVazioException para nome/razão social vazio",
            CampoVazioException.class,
            () -> new PermissionarioException(
                "",  // ← Vazio
                "12345678901",
                "CRLV123"
            )
        );
    }
    
    private void testeNomeRazaoSocialNulo() {
        assertThrows(
            "Deve lançar CampoVazioException para nome/razão social nulo",
            CampoVazioException.class,
            () -> new PermissionarioException(
                null,  // ← Null
                "12345678901",
                "CRLV123"
            )
        );
    }
    
    private void testeCpfCnpjVazio() {
        assertThrows(
            "Deve lançar CampoVazioException para CPF/CNPJ vazio",
            CampoVazioException.class,
            () -> new PermissionarioException(
                "João Silva",
                "",  // ← Vazio
                "CRLV123"
            )
        );
    }
    
    private void testeCpfCnpjNulo() {
        assertThrows(
            "Deve lançar CampoVazioException para CPF/CNPJ nulo",
            CampoVazioException.class,
            () -> new PermissionarioException(
                "João Silva",
                null,  // ← Null
                "CRLV123"
            )
        );
    }
    
    private void testeCriarVeiculo() {
        try {
            PermissionarioException perm = new PermissionarioException(
                "João Silva",
                "12345678901",
                "CRLV123"
            );
            
            Veiculo veiculo = perm.criarVeiculo(
                "ABC1234",
                "Fiat Uno",
                "ATIVO",
                0
            );
            
            assertNotNull("Veículo criado não deve ser null", veiculo);
            assertEquals("Placa do veículo deve ser ABC1234", "ABC1234", veiculo.getPlaca());
            
        } catch (Exception e) {
            assertFalse("Erro ao testar criarVeiculo(): " + e.getMessage(), true);
        }
    }
    
    private void testeGetters() {
        try {
            PermissionarioException perm = new PermissionarioException(
                "Empresa X Ltda",
                "12345678000190",
                "CRLV999"
            );
            
            assertEquals("getNomeRazaoSocial() deve retornar valor correto", 
                         "Empresa X Ltda", 
                         perm.getNomeRazaoSocial());
            
            assertEquals("getCpfCnpj() deve retornar valor correto", 
                         "12345678000190", 
                         perm.getCpfCnpj());
            
            assertEquals("getCrlvne() deve retornar valor correto", 
                         "CRLV999", 
                         perm.getCrlvne());
            
            assertEquals("getQuantidadeMultasPendentes() deve iniciar com 0", 
                         0, 
                         perm.getQuantidadeMultasPendentes());
            
        } catch (Exception e) {
            assertFalse("Erro ao testar getters: " + e.getMessage(), true);
        }
    }
}