package Multa;

import Veiculo.Veiculo;

public class Multa {
    private String infracao;
    private String tipoMulta;
    private String observacao;
    private int gravePontosDefesa;
    private String dataVencimento;
    private double valorMulta;
    private String dataAtualizacao;
    private int motoristasReceberam;
    private Veiculo veiculo;
    
    public Multa(String infracao, String tipoMulta, String observacao, int gravePontosDefesa,
                 String dataVencimento, double valorMulta, String dataAtualizacao, 
                 int motoristasReceberam, Veiculo veiculo) {
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
    
    public String getInfracao() {
        return infracao;
    }
    
    public String getTipoMulta() {
        return tipoMulta;
    }
    
    public String getObservacao() {
        return observacao;
    }
    
    public int getGravePontosDefesa() {
        return gravePontosDefesa;
    }
    
    public String getDataVencimento() {
        return dataVencimento;
    }
    
    public double getValorMulta() {
        return valorMulta;
    }
    
    public String getDataAtualizacao() {
        return dataAtualizacao;
    }
    
    public int getMotoristasReceberam() {
        return motoristasReceberam;
    }
    
    public Veiculo getVeiculo() {
        return veiculo;
    }
    
    @Override
    public String toString() {
        return "Multa{" +
                "infracao='" + infracao + '\'' +
                ", tipo='" + tipoMulta + '\'' +
                ", valor=" + valorMulta +
                ", vencimento='" + dataVencimento + '\'' +
                '}';
    }
}
