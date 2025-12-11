package com.ifal.si.models;

public class Chefe extends Administrativo {
    private String cargo;

    public Chefe(String nome, String matricula, String cpf, String cnh, String dataAdmissao, String cargo) {
        super(nome, matricula, cpf, cnh, dataAdmissao);
        this.cargo = cargo;
    }
    
    public void prendeVeiculo() {
        System.out.println("Chefe " + getNome() + " autorizou a apreensão de veículo.");
    }
    
    // Getters e Setters
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
}