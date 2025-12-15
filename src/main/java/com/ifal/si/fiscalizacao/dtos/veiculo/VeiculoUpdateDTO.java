package com.ifal.si.fiscalizacao.dtos.veiculo;

import jakarta.validation.constraints.NotBlank;

public class VeiculoUpdateDTO {

    @NotBlank
    private String placa;

    @NotBlank
    private String marca;

    @NotBlank
    private String situacao;

    @NotBlank
    private int quantidadeMultas;

    @NotBlank String crlvne;

    // getters e setters
    public String getNomeRazaoSocial() { return placa; }
    public void setNomeRazaoSocial(String nomeRazaoSocial) { this.placa = nomeRazaoSocial; }

    public String getCrlvne() { return crlvne; }
    public void setCrlvne(String crlvne) { this.crlvne = crlvne;}

    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }

    public int getQuantidadeMultas() { return quantidadeMultas; }
    public void setQuantidadeMultas(int quantidadeMultas) { this.quantidadeMultas = quantidadeMultas; }
}
