package com.ifal.si.fiscalizacao.dtos.escala;

public class EscalaResponseDTO {
    private Long id;
    private String nome;
    private String matricula;
    private String dataAdmissao;

    // getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getDataAdmissao() { return dataAdmissao; }
    public void setCrlvne(String dataAdmissao) { this.dataAdmissao = dataAdmissao; }
}