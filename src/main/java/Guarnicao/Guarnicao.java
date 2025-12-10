package Guarnicao;

import java.util.ArrayList;
import java.util.List;

public class Guarnicao {
    private String nome;
    private List<String> fiscaisNaGuarnição;
    private String responsavelPelaGuarnição;
    private List<String> carrosMotosNaGuarnição;
    private String responsavel;
    
    public Guarnicao(String nome, String responsavelPelaGuarnição, String responsavel) {
        this.nome = nome;
        this.responsavelPelaGuarnição = responsavelPelaGuarnição;
        this.responsavel = responsavel;
        this.fiscaisNaGuarnição = new ArrayList<>();
        this.carrosMotosNaGuarnição = new ArrayList<>();
    }
    
    // Métodos para gerenciar fiscais
    public void adicionarFiscal(String fiscal) {
        fiscaisNaGuarnição.add(fiscal);
        System.out.println("Fiscal " + fiscal + " adicionado à guarnição " + nome);
    }
    
    public void removerFiscal(String fiscal) {
        fiscaisNaGuarnição.remove(fiscal);
        System.out.println("Fiscal " + fiscal + " removido da guarnição " + nome);
    }
    
    // Métodos para gerenciar veículos
    public void adicionarVeiculo(String veiculo) {
        carrosMotosNaGuarnição.add(veiculo);
        System.out.println("Veículo " + veiculo + " adicionado à guarnição " + nome);
    }
    
    public void removerVeiculo(String veiculo) {
        carrosMotosNaGuarnição.remove(veiculo);
        System.out.println("Veículo " + veiculo + " removido da guarnição " + nome);
    }
    
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public List<String> getFiscaisNaGuarnição() { return fiscaisNaGuarnição; }
    public void setFiscaisNaGuarnição(List<String> fiscaisNaGuarnição) { 
        this.fiscaisNaGuarnição = fiscaisNaGuarnição; 
    }
    
    public String getResponsavelPelaGuarnição() { return responsavelPelaGuarnição; }
    public void setResponsavelPelaGuarnição(String responsavelPelaGuarnição) { 
        this.responsavelPelaGuarnição = responsavelPelaGuarnição; 
    }
    
    public List<String> getCarrosMotosNaGuarnição() { return carrosMotosNaGuarnição; }
    public void setCarrosMotosNaGuarnição(List<String> carrosMotosNaGuarnição) { 
        this.carrosMotosNaGuarnição = carrosMotosNaGuarnição; 
    }
    
    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }
}
