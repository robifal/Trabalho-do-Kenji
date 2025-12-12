package Operacao;

import Excecoes.CampoVazioException;
import Excecoes.OperacaoInvalidaException;

public class OperacaoException {
    private String nome;
    private String dataASerExecutada;
    private String guarnicao;
    private String finalidade;
    private String responsavel;
    
    public OperacaoException(String nome, String dataASerExecutada, String guarnicao, 
                    String finalidade, String responsavel)
            throws CampoVazioException, OperacaoInvalidaException {

        if (nome == null || nome.isBlank()) {
            throw new CampoVazioException("O nome da operação não pode ser vazio.");
        }
        if (finalidade != null && finalidade.length() < 3) {
            throw new OperacaoInvalidaException("Finalidade muito curta.");
        }

        this.nome = nome;
        this.dataASerExecutada = dataASerExecutada;
        this.guarnicao = guarnicao;
        this.finalidade = finalidade;
        this.responsavel = responsavel;
    }

    // getters e setters permanecem iguais
}
