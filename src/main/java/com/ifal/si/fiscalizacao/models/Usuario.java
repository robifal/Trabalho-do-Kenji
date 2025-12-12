package com.ifal.si.fiscalizacao.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usuarios")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String login;
    private String senha;
    private String nome;
    private String matricula;
    @Column(unique = true)
    private String cpf;
    private String cnh;
    private LocalDate dataAdmissao;
    private String role; // ex: "FISCAL","ADMIN","COMUM"

    public Usuario() {}

    public Usuario(String login, String senha, String nome, String matricula, String cpf, String cnh, LocalDate dataAdmissao, String role) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.cnh = cnh;
        this.dataAdmissao = dataAdmissao;
        this.role = role;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getCnh() { return cnh; }
    public void setCnh(String cnh) { this.cnh = cnh; }
    public LocalDate getDataAdmissao() { return dataAdmissao; }
    public void setDataAdmissao(LocalDate dataAdmissao) { this.dataAdmissao = dataAdmissao; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
