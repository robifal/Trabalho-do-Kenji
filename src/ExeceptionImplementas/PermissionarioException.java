package Permissionario;

import Veiculo.Veiculo;
import Excecoes.CampoVazioException;

public class PermissionarioException {
    private String nomeRazaoSocial;
    private String cpfCnpj;
    private String crlvne;
    private int quantidadeMultasPendentes;
    
    public PermissionarioException(String nomeRazaoSocial, String cpfCnpj, String crlvne) 
            throws CampoVazioException {

        if (nomeRazaoSocial == null || nomeRazaoSocial.isBlank()) {
            throw new CampoVazioException("Nome/Razão Social não pode ser vazio.");
        }
        if (cpfCnpj == null || cpfCnpj.isBlank()) {
            throw new CampoVazioException("CPF/CNPJ não pode ser vazio.");
        }

        this.nomeRazaoSocial = nomeRazaoSocial;
        this.cpfCnpj = cpfCnpj;
        this.crlvne = crlvne;
        this.quantidadeMultasPendentes = 0;
    }
    
    public Veiculo criarVeiculo(String placa, String marca, String situacao, int quantidadeMultas) {
        return new Veiculo(placa, marca, situacao, quantidadeMultas, this);
    }

    // getters permanecem iguais
}
