package Escala;

import Fiscal.Fiscal;

public class Escala {
    private String diaDaSemana;
    private String veiculo;
    private String localDeFiscalizacao;
    private String horarioInicioServico;
    private String horarioTerminoServico;
    
    public Escala(String diaDaSemana, String veiculo, String localDeFiscalizacao, 
                  String horarioInicioServico, String horarioTerminoServico) {
        this.diaDaSemana = diaDaSemana;
        this.veiculo = veiculo;
        this.localDeFiscalizacao = localDeFiscalizacao;
        this.horarioInicioServico = horarioInicioServico;
        this.horarioTerminoServico = horarioTerminoServico;
    }
    
    public void fazEscala() {
        System.out.println("Escala criada para " + diaDaSemana + " no local: " + localDeFiscalizacao);
    }
    
    public void controlaOperacoes() {
        System.out.println("Controlando operações da escala de " + diaDaSemana);
    }
    
    public Fiscal criaFiscal(String nome, String matricula, String cpf, String cnh, 
                            String dataAdmissao, String guarnicao) {
        return new Fiscal(nome, matricula, cpf, cnh, dataAdmissao, guarnicao);
    }
    
    // Getters e Setters
    public String getDiaDaSemana() { return diaDaSemana; }
    public void setDiaDaSemana(String diaDaSemana) { this.diaDaSemana = diaDaSemana; }
    
    public String getVeiculo() { return veiculo; }
    public void setVeiculo(String veiculo) { this.veiculo = veiculo; }
    
    public String getLocalDeFiscalizacao() { return localDeFiscalizacao; }
    public void setLocalDeFiscalizacao(String localDeFiscalizacao) { 
        this.localDeFiscalizacao = localDeFiscalizacao; 
    }
    
    public String getHorarioInicioServico() { return horarioInicioServico; }
    public void setHorarioInicioServico(String horarioInicioServico) { 
        this.horarioInicioServico = horarioInicioServico; 
    }
    
    public String getHorarioTerminoServico() { return horarioTerminoServico; }
    public void setHorarioTerminoServico(String horarioTerminoServico) { 
        this.horarioTerminoServico = horarioTerminoServico; 
    }
}
