package Veiculo;

import Permissionario.Permissionario;
import Multa.Multa;

public class Veiculo {
    private String placa;
    private String marca;
    private String situacao;
    private int quantidadeMultas;
    private Permissionario permissionario;
    
    public Veiculo(String placa, String marca, String situacao, int quantidadeMultas, Permissionario permissionario) {
        this.placa = placa;
        this.marca = marca;
        this.situacao = situacao;
        this.quantidadeMultas = quantidadeMultas;
        this.permissionario = permissionario;
    }
    
    public Multa criarMulta(String infracao, String tipoMulta, String observacao, 
                            int gravePontos, String dataVencimento, double valorMulta, 
                            String dataAtualizacao, int motoristasReceberam) {
        return new Multa(infracao, tipoMulta, observacao, gravePontos, dataVencimento, 
                        valorMulta, dataAtualizacao, motoristasReceberam, this);
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getSituacao() {
        return situacao;
    }
    
    public int getQuantidadeMultas() {
        return quantidadeMultas;
    }
    
    public void setQuantidadeMultas(int quantidade) {
        this.quantidadeMultas = quantidade;
    }
    
    public Permissionario getPermissionario() {
        return permissionario;
    }
    
    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", situacao='" + situacao + '\'' +
                ", quantidadeMultas=" + quantidadeMultas +
                '}';
    }
}
