package com.ifal.si.fiscalizacao.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "fiscais")
@PrimaryKeyJoinColumn(name = "usuario_id")
public class Fiscal extends Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToMany(mappedBy = "fiscais")
    private List<Guarnicao> guarnicoes;

    public Fiscal() { super(); }

    public Fiscal(String login, String senha, String nome, String matricula, String cpf, String cnh, java.time.LocalDate dataAdmissao) {
        super(login, senha, nome, matricula, cpf, cnh, dataAdmissao, "FISCAL");
    }

    public List<Guarnicao> getGuarnicoes() { return guarnicoes; }
    public void setGuarnicoes(List<Guarnicao> guarnicoes) { this.guarnicoes = guarnicoes; }
}
