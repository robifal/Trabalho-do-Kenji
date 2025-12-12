package com.ifal.si.fiscalizacao.dtos.escala;

import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

public class EscalaUpdateDTO {

    @NotBlank
    private String nome;

    @NotBlank
    private String matricula;

    @NotBlank
    private LocalDate dataAdmissao;

    // getters e setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getDataAdmissao() { return dataAdmissao; }
    public void setDataAdmissao(String dataAdmissao) { this.dataAdmissao = dataAdmissao; }
}
