public class Fiscal extends Usuario {
    private String guarnicao;
    
    public Fiscal(String nome, String matricula, String cpf, String cnh, String dataAdmissao, String guarnicao) {
        super(nome, matricula, cpf, cnh, dataAdmissao);
        this.guarnicao = guarnicao;
    }
    
    public void realizaMulta() {
        System.out.println("Fiscal " + getNome() + " realizou uma multa.");
    }
    
    public void realizaObservacao() {
        System.out.println("Fiscal " + getNome() + " realizou uma observação.");
    }
    
    // Getters e Setters
    public String getGuarnicao() { return guarnicao; }
    public void setGuarnição(String guarnicao) { this.guarnicao = guarnicao; }
}
