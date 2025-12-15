package com.ifal.si.fiscalizacao.dtos.permissionario;

public class PermissionarioResponseDTO {
    private Long id;
    private String nomeRazaoSocial;
    private String cpfCnpj;
    private String crlvne;
    private int quantidadeMultasPendentes;

    // getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomeRazaoSocial() { return nomeRazaoSocial; }
    public void setNomeRazaoSocial(String nomeRazaoSocial) { this.nomeRazaoSocial = nomeRazaoSocial; }

    public String getCpfCnpj() { return cpfCnpj; }
    public void setCpfCnpj(String cpfCnpj) { this.cpfCnpj = cpfCnpj; }

    public String getCrlvne() { return crlvne; }
    public void setCrlvne(String crlvne) { this.crlvne = crlvne; }

    public int getQuantidadeMultasPendentes() { return quantidadeMultasPendentes; }
    public void setQuantidadeMultasPendentes(int quantidade) { this.quantidadeMultasPendentes = quantidade; }
}