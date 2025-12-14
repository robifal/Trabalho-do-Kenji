package Fiscal;

import Usuario.Usuario;
import Excecoes.CampoVazioException;
import Excecoes.FiscalInvalidoException;

public class FiscalException extends Usuario {   // ← Nome alterado
    private String guarnicao;
    
    public FiscalException(String nome, String matricula, String cpf, String cnh,   // ← Nome alterado
                  String dataAdmissao, String guarnicao) 
                  throws CampoVazioException, FiscalInvalidoException {
        
        super(nome, matricula, cpf, cnh, dataAdmissao);

        if (guarnicao == null || guarnicao.isBlank()) {
            throw new CampoVazioException("A guarnição não pode estar vazia.");
        }
        if (guarnicao.length() < 3) {
            throw new FiscalInvalidoException("Guarnição inválida: nome muito curto.");
        }

        this.guarnicao = guarnicao;
    }
    
    public void realizaMulta() {
        System.out.println("Fiscal " + getNome() + " realizou uma multa.");
    }
    
    public void realizaObservacao() {
        System.out.println("Fiscal " + getNome() + " realizou uma observação.");
    }
    
    public String getGuarnicao() {
        return guarnicao;
    }

    public void setGuarnição(String guarnicao) throws CampoVazioException {
        if (guarnicao == null || guarnicao.isBlank()) {
            throw new CampoVazioException("Guarnição não pode ser vazia.");
        }
        this.guarnicao = guarnicao;
    }
}
