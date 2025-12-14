package Multa;

import Veiculo.Veiculo;
import Excecoes.MultaInvalidaException;
import Excecoes.ValorInvalidoException;
import Excecoes.CampoVazioException;

public class MultaException {
    private String infracao;
    private String tipoMulta;
    private String observacao;
    private int gravePontosDefesa;
    private String dataVencimento;
    private double valorMulta;
    private String dataAtualizacao;
    private int motoristasReceberam;
    private Veiculo veiculo;
    
    public MultaException (String infracao, String tipoMulta, String observacao, int gravePontosDefesa,
                 String dataVencimento, double valorMulta, String dataAtualizacao, 
                 int motoristasReceberam, Veiculo veiculo)
            throws CampoVazioException, MultaInvalidaException, ValorInvalidoException {

        if (infracao == null || infracao.isBlank()) {
            throw new CampoVazioException("A infração não pode ser vazia.");
        }
        if (valorMulta <= 0) {
            throw new ValorInvalidoException("O valor da multa deve ser maior que zero.");
        }
        if (gravePontosDefesa < 0) {
            throw new MultaInvalidaException("Pontos de defesa não podem ser negativos.");
        }

        this.infracao = infracao;
        this.tipoMulta = tipoMulta;
        this.observacao = observacao;
        this.gravePontosDefesa = gravePontosDefesa;
        this.dataVencimento = dataVencimento;
        this.valorMulta = valorMulta;
        this.dataAtualizacao = dataAtualizacao;
        this.motoristasReceberam = motoristasReceberam;
        this.veiculo = veiculo;
    }

    // getters e toString permanecem iguais
}
