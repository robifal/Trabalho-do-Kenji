package com.ifal.si.models;
// import java.util.ArrayList;
// import java.util.List;

public class Permissionario {
    private String nomeRazaoSocial;
    private String cpfCnpj;
    private String crlvne;
    private int quantidadeMultasPendentes;
    // private List<String> submodalidades;
    
    public Permissionario(String nomeRazaoSocial, String cpfCnpj, String crlvne) {
        this.nomeRazaoSocial = nomeRazaoSocial;
        this.cpfCnpj = cpfCnpj;
        this.crlvne = crlvne;
        this.quantidadeMultasPendentes = 0;
        // this.submodalidades = new ArrayList<>();
    }
    
    public Veiculo criarVeiculo(String placa, String marca, String situacao, int quantidadeMultas) {
        return new Veiculo(placa, marca, situacao, quantidadeMultas, this);
    }
    
    // public void adicionarSubmodalidade(String submodalidade) {
    //     this.submodalidades.add(submodalidade);
    // }
    
    public String getNomeRazaoSocial() {
        return nomeRazaoSocial;
    }
    
    public String getCpfCnpj() {
        return cpfCnpj;
    }
    
    public String getCrlvne() {
        return crlvne;
    }
    
    public int getQuantidadeMultasPendentes() {
        return quantidadeMultasPendentes;
    }
    
    public void setQuantidadeMultasPendentes(int quantidade) {
        this.quantidadeMultasPendentes = quantidade;
    }
    
    // public List<String> getSubmodalidades() {
    //     return submodalidades;
    // }
    
    @Override
    public String toString() {
        return "Permissionario{" +
                "nome='" + nomeRazaoSocial + '\'' +
                ", cpfCnpj='" + cpfCnpj + '\'' +
                ", multasPendentes=" + quantidadeMultasPendentes +
                '}';
    }
}