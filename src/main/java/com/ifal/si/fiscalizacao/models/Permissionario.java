package com.ifal.si.fiscalizacao.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "permissionarios")
public class Permissionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeRazaoSocial;
    @Column(unique = true)
    private String cpfCnpj;
    private String crlvne;
    private int quantidadeMultasPendentes;

    @OneToMany(mappedBy = "permissionario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Veiculo> veiculos = new ArrayList<>();

    public Permissionario() {}

    public Permissionario(String nomeRazaoSocial, String cpfCnpj, String crlvne) {
        this.nomeRazaoSocial = nomeRazaoSocial;
        this.cpfCnpj = cpfCnpj;
        this.crlvne = crlvne;
        this.quantidadeMultasPendentes = 0;
    }

    // getters/setters
    public Long getId() { return id; }
    public String getNomeRazaoSocial() { return nomeRazaoSocial; }
    public void setNomeRazaoSocial(String nomeRazaoSocial) { this.nomeRazaoSocial = nomeRazaoSocial; }
    public String getCpfCnpj() { return cpfCnpj; }
    public void setCpfCnpj(String cpfCnpj) { this.cpfCnpj = cpfCnpj; }
    public String getCrlvne() { return crlvne; }
    public void setCrlvne(String crlvne) { this.crlvne = crlvne; }
    public int getQuantidadeMultasPendentes() { return quantidadeMultasPendentes; }
    public void setQuantidadeMultasPendentes(int quantidadeMultasPendentes) { this.quantidadeMultasPendentes = quantidadeMultasPendentes; }
    public List<Veiculo> getVeiculos() { return veiculos; }
    public void setVeiculos(List<Veiculo> veiculos) { this.veiculos = veiculos; }
}
