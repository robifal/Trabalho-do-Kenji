package com.ifal.si.fiscalizacao.dtos.permissionario;

import jakarta.validation.constraints.NotBlank;

public class PermissionarioUpdateDTO {

    @NotBlank
    private String nomeRazaoSocial;

    @NotBlank
    private String crlvne;

    // getters e setters
    public String getNomeRazaoSocial() { return nomeRazaoSocial; }
    public void setNomeRazaoSocial(String nomeRazaoSocial) { this.nomeRazaoSocial = nomeRazaoSocial; }

    public String getCrlvne() { return crlvne; }
    public void setCrlvne(String crlvne) { this.crlvne = crlvne; }
}
