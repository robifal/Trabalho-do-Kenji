package com.ifal.si.fiscalizacao.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "veiculos")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String placa;
    private String marca;
    private String situacao;
    private int quantidadeMultas;
    private String crvlne;

    @ManyToOne
    @JoinColumn(name = "permissionario_id")
    private Permissionario permissionario;

    @OneToMany(mappedBy = "veiculo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Multa> multas = new ArrayList<>();

    public Veiculo() {}

    public Veiculo(String placa, String marca, String situacao, Permissionario permissionario) {
        this.placa = placa;
        this.marca = marca;
        this.situacao = situacao;
        this.permissionario = permissionario;
        this.quantidadeMultas = 0;
    }

    // getters/setters
    public Long getId() { return id; }
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
    public int getQuantidadeMultas() { return quantidadeMultas; }
    public void setQuantidadeMultas(int quantidadeMultas) { this.quantidadeMultas = quantidadeMultas; }
    public String getCrlvne(){return crvlne;}
    public void setCrlv(String crlvne){this.crvlne = crlvne;}
    public Permissionario getPermissionario() { return permissionario; }
    public void setPermissionario(Permissionario permissionario) { this.permissionario = permissionario; }
    public List<Multa> getMultas() { return multas; }
    public void setMultas(List<Multa> multas) { this.multas = multas; }
}