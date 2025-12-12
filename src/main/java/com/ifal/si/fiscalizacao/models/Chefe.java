package com.ifal.si.fiscalizacao.models;

import jakarta.persistence.*;

@Entity
@Table(name = "chefes")
@PrimaryKeyJoinColumn(name = "usuario_id")
public class Chefe extends Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Campos extras se desejar (ex: nivelGestao)
    private String nivelGestao;

    public Chefe() { super(); }

    public Chefe(String login, String senha, String nome, String matricula, String cpf, String cnh, java.time.LocalDate dataAdmissao, String nivelGestao) {
        super(login, senha, nome, matricula, cpf, cnh, dataAdmissao, "CHEFE");
        this.nivelGestao = nivelGestao;
    }

    public String getNivelGestao() { return nivelGestao; }
    public void setNivelGestao(String nivelGestao) { this.nivelGestao = nivelGestao; }
}
