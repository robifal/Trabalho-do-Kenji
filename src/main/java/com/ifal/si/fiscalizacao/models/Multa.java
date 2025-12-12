package com.ifal.si.fiscalizacao.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "multas")
public class Multa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String infracao;
    private String tipoMulta;
    @Column(length = 1000)
    private String observacao;
    private int pontos;
    private LocalDate dataVencimento;
    private double valorMulta;
    private LocalDate dataAtualizacao;
    private int motoristasReceberam;

    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name = "operacao_id")
    private Operacao operacao;

    public Multa() {}

    // getters/setters
    public Long getId() { return id; }
    public String getInfracao() { return infracao; }
    public void setInfracao(String infracao) { this.infracao = infracao; }
    public String getTipoMulta() { return tipoMulta; }
    public void setTipoMulta(String tipoMulta) { this.tipoMulta = tipoMulta; }
    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }
    public int getPontos() { return pontos; }
    public void setPontos(int pontos) { this.pontos = pontos; }
    public LocalDate getDataVencimento() { return dataVencimento; }
    public void setDataVencimento(LocalDate dataVencimento) { this.dataVencimento = dataVencimento; }
    public double getValorMulta() { return valorMulta; }
    public void setValorMulta(double valorMulta) { this.valorMulta = valorMulta; }
    public LocalDate getDataAtualizacao() { return dataAtualizacao; }
    public void setDataAtualizacao(LocalDate dataAtualizacao) { this.dataAtualizacao = dataAtualizacao; }
    public int getMotoristasReceberam() { return motoristasReceberam; }
    public void setMotoristasReceberam(int motoristasReceberam) { this.motoristasReceberam = motoristasReceberam; }
    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }
    public Operacao getOperacao() { return operacao; }
    public void setOperacao(Operacao operacao) { this.operacao = operacao; }
}
