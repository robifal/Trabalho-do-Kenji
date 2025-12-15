package com.ifal.si.fiscalizacao.dtos.escala;

import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.*;
import java.time.LocalTime;

import com.ifal.si.fiscalizacao.models.Guarnicao;
import com.ifal.si.fiscalizacao.models.Usuario;
import com.ifal.si.fiscalizacao.models.Veiculo;

import java.time.DayOfWeek;

public class EscalaCreateDTO {

    @NotBlank
    private DayOfWeek diaDaSemana;

    @NotBlank
    private LocalTime inicioServico;

    @NotBlank
    private LocalTime fimServico;

    @NotBlank
    private Usuario usuario;

    @NotBlank
    private Veiculo veiculo;
    @NotBlank
    private Guarnicao guarnicao;

    // getters e setters
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
    public void setGuarnicao(Guarnicao guarnicao) { this.guarnicao = guarnicao;}
}
