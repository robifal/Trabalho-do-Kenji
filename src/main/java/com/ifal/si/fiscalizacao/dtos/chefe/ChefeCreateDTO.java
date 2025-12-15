package com.ifal.si.fiscalizacao.dtos.chefe;

import jakarta.validation.constraints.NotBlank;

public class ChefeCreateDTO {

    @NotBlank
    private String nivelGestao;

    // getters e setters
    public String getNivelGestao() { return nivelGestao; }
    public void setNivelGestao(String nivelGestao) { this.nivelGestao = nivelGestao; }
    
}
