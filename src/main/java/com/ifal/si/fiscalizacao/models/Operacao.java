package com.ifal.si.fiscalizacao.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "operacoes")
public class Operacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private LocalDate dataASerExecutada;
    private String finalidade;

    @ManyToOne
    @JoinColumn(name = "guarnicao_id")
    private Guarnicao guarnicao;

    @ManyToOne
    @JoinColumn(name = "responsavel_id")
    private Usuario responsavel;

    @OneToMany(mappedBy = "operacao", cascade = CascadeType.ALL)
    private List<Multa> multas = new ArrayList<>();

    public Operacao() {}

    // getters/setters
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public LocalDate getDataASerExecutada() { return dataASerExecutada; }
    public void setDataASerExecutada(LocalDate dataASerExecutada) { this.dataASerExecutada = dataASerExecutada; }
    public String getFinalidade() { return finalidade; }
    public void setFinalidade(String finalidade) { this.finalidade = finalidade; }
    public Guarnicao getGuarnicao() { return guarnicao; }
    public void setGuarnicao(Guarnicao guarnicao) { this.guarnicao = guarnicao; }
    public Usuario getResponsavel() { return responsavel; }
    public void setResponsavel(Usuario responsavel) { this.responsavel = responsavel; }
    public List<Multa> getMultas() { return multas; }
    public void setMultas(List<Multa> multas) { this.multas = multas; }
}
