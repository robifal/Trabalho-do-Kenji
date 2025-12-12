package Veiculo;

import Permissionario.Permissionario;
import Multa.Multa;
import Excecoes.CampoVazioException;
import Excecoes.VeiculoInvalidoException;

public class VeiculoException {
    private String placa;
    private String marca;
    private String situacao;
    private int quantidadeMultas;
    private Permissionario permissionario;
    
    public VeiculoException (String placa, String marca, String situacao, int quantidadeMultas, 
                   Permissionario permissionario)
            throws CampoVazioException, VeiculoInvalidoException {

        if (placa == null || placa.isBlank()) {
            throw new CampoVazioException("Placa não pode ser vazia.");
        }
        if (placa.length() < 7) {
            throw new VeiculoInvalidoException("Placa inválida (mínimo 7 caracteres).");
        }

        this.placa = placa;
        this.marca = marca;
        this.situacao = situacao;
        this.quantidadeMultas = quantidadeMultas;
        this.permissionario = permissionario;
    }
    
    // resto igual...
}
