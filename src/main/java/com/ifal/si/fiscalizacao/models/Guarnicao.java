package com.ifal.si.fiscalizacao.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "guarnicoes")
public class Guarnicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany
    @JoinTable(name = "guarnicao_fiscal",
            joinColumns = @JoinColumn(name = "guarnicao_id"),
            inverseJoinColumns = @JoinColumn(name = "fiscal_id"))
    private List<Fiscal> fiscais = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "guarnicao_id")
    private List<Veiculo> carrosMotos = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "responsavel_id")
    private Usuario responsavel;

    public Guarnicao() {}

    public Guarnicao(String nome, Usuario responsavel) {
        this.nome = nome;
        this.responsavel = responsavel;
    }

    // getters/setters
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public List<Fiscal> getFiscais() { return fiscais; }
    public void setFiscais(List<Fiscal> fiscais) { this.fiscais = fiscais; }
    public List<Veiculo> getCarrosMotos() { return carrosMotos; }
    public void setCarrosMotos(List<Veiculo> carrosMotos) { this.carrosMotos = carrosMotos; }
    public Usuario getResponsavel() { return responsavel; }
    public void setResponsavel(Usuario responsavel) { this.responsavel = responsavel; }
}
