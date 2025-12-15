package com.ifal.si.fiscalizacao.dtos.permissionario;

<<<<<<< HEAD
import jakarta.validation.constraints.NotBlank;
=======
<<<<<<< HEAD
import jakarta.validation.constraints.NotBlank;
=======
import jakarta.validation.constraints.NotBlank*;
>>>>>>> 00225041e850c3d423c159e604fd9cbb82648c00
>>>>>>> 8682a62fc5494d02922c283b6f429e1409feb10e

public class PermissionarioCreateDTO {

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
