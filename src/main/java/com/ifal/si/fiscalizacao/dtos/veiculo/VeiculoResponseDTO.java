package com.ifal.si.fiscalizacao.dtos.veiculo;

public class VeiculoResponseDTO {
    private Long id;
    private String placa;
    private String marca;
    private String situacao;
    private int quantidadeMultas;

    // getters e setters
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }

    public int getQuantidadeMultas() { return quantidadeMultas; }
    public void setQuantidadeMultas(int quantidadeMultas) { this.quantidadeMultas = quantidadeMultas; }
}
