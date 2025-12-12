package com.ifal.si.fiscalizacao.dtos.chefe;

import jakarta.validation.constraints.NotBlank;

public class ChefeCreateDTOS {

    @NotBlank
    private String nomeRazaoSocial;

    @NotBlank
    private String cpfCnpj;

    @NotBlank
    private String crlvne;

    // getters e setters
    public String getNomeRazaoSocial() { return nomeRazaoSocial; }
    public void setNomeRazaoSocial(String nomeRazaoSocial) { this.nomeRazaoSocial = nomeRazaoSocial; }

    public String getCpfCnpj() { return cpfCnpj; }
    public void setCpfCnpj(String cpfCnpj) { this.cpfCnpj = cpfCnpj; }

    public String getCrlvne() { return crlvne; }
    public void setCrlvne(String crlvne) { this.crlvne = crlvne; }
}
