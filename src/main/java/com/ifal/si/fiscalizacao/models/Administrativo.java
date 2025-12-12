package com.ifal.si.fiscalizacao.models;

import jakarta.persistence.*;

@Entity
@Table(name = "administrativos")
@PrimaryKeyJoinColumn(name = "usuario_id")
public class Administrativo extends Usuario {
    // Campos específicos se necessário
    public Administrativo() { super(); }

    public Administrativo(String login, String senha, String nome, String matricula, String cpf, String cnh, java.time.LocalDate dataAdmissao) {
        super(login, senha, nome, matricula, cpf, cnh, dataAdmissao, "ADMINISTRATIVO");
    }
}
