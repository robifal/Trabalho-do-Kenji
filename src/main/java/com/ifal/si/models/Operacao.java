package com.ifal.si.models;
public class Operacao {
    private String nome;
    private String dataASerExecutada;
    private String guarnicao;
    private String finalidade;
    private String responsavel;
    
    public Operacao(String nome, String dataASerExecutada, String guarnicao, 
                    String finalidade, String responsavel) {
        this.nome = nome;
        this.dataASerExecutada = dataASerExecutada;
        this.guarnicao = guarnicao;
        this.finalidade = finalidade;
        this.responsavel = responsavel;
    }
    
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getDataASerExecutada() { return dataASerExecutada; }
    public void setDataASerExecutada(String dataASerExecutada) { 
        this.dataASerExecutada = dataASerExecutada; 
    }
    
    public String getGuarnicao() { return guarnicao; }
    public void setGuarnicao(String guarnicao) { this.guarnicao = guarnicao; }
    
    public String getFinalidade() { return finalidade; }
    public void setFinalidade(String finalidade) { this.finalidade = finalidade; }
    
    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }
}
