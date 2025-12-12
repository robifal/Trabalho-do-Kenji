package com.ifal.si.fiscalizacao.models;

import jakarta.persistence.*;

@Entity
@Table(name = "funcionarios")
@PrimaryKeyJoinColumn(name = "usuario_id")
public class Funcionario extends Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String setor;

    public Funcionario() { super(); }

    public Funcionario(String login, String senha, String nome, String matricula, String cpf, String cnh, java.time.LocalDate dataAdmissao, String setor) {
        super(login, senha, nome, matricula, cpf, cnh, dataAdmissao, "FUNCIONARIO");
        this.setor = setor;
    }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }
}
