package Fiscal;

import Usuario.Usuario;

public class Fiscal extends Usuario {
    private String guarnição;
    
    public Fiscal(String nome, String matricula, String cpf, String cnh, String dataAdmissao, String guarnição) {
        super(nome, matricula, cpf, cnh, dataAdmissao);
        this.guarnição = guarnição;
    }
    
    public void realizaMulta() {
        System.out.println("Fiscal " + getNome() + " realizou uma multa.");
    }
    
    public void realizaObservacao() {
        System.out.println("Fiscal " + getNome() + " realizou uma observação.");
    }
    
    // Getters e Setters
    public String getGuarnição() { return guarnição; }
    public void setGuarnição(String guarnição) { this.guarnição = guarnição; }
}