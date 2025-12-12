package com.ifal.si.fiscalizacao.models;

import jakarta.persistence.*;
import java.time.LocalTime;
import java.time.DayOfWeek;

@Entity
@Table(name = "escalas")
public class Escala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private DayOfWeek diaDaSemana;

    private LocalTime inicioServico;
    private LocalTime fimServico;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name = "guarnicao_id")
    private Guarnicao guarnicao;

    public Escala() {}

    // getters/setters
    public Long getId() { return id; }
    public DayOfWeek getDiaDaSemana() { return diaDaSemana; }
    public void setDiaDaSemana(DayOfWeek diaDaSemana) { this.diaDaSemana = diaDaSemana; }
    public LocalTime getInicioServico() { return inicioServico; }
    public void setInicioServico(LocalTime inicioServico) { this.inicioServico = inicioServico; }
    public LocalTime getFimServico() { return fimServico; }
    public void setFimServico(LocalTime fimServico) { this.fimServico = fimServico; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }
    public Guarnicao getGuarnicao() { return guarnicao; }
    public void setGuarnicao(Guarnicao guarnicao) { this.guarnicao = guarnicao; }
}
