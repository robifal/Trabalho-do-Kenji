package com.ifal.si.fiscalizacao.dtos.veiculo;

import jakarta.*;
import jakarta.validation.constraints.NotBlank;

public class VeiculoCreateDTO {

    @NotBlank
    private String placa;

    @NotBlank
    private String marca;

    @NotBlank
    private String situacao;

    @NotBlank
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
