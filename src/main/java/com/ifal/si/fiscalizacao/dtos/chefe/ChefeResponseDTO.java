package com.ifal.si.fiscalizacao.dtos.chefe;

public class ChefeResponseDTO {
    private Long id;
    private String nivelGestao;

    // getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNivelGestao() { return nivelGestao; }
    public void setNivelGestao(String nivelGestao) { this.nivelGestao = nivelGestao; }
}