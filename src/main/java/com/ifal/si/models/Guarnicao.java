import java.util.ArrayList;
import java.util.List;

public class Guarnicao {
    private String nome;
    private List<String> fiscaisNaGuarnicao;
    private String responsavelPelaGuarnicao;
    private List<String> carrosMotosNaGuarnicao;
    private String responsavel;
    
    public Guarnicao(String nome, String responsavelPelaGuarnicao, String responsavel) {
        this.nome = nome;
        this.responsavelPelaGuarnicao = responsavelPelaGuarnicao;
        this.responsavel = responsavel;
        this.fiscaisNaGuarnicao = new ArrayList<>();
        this.carrosMotosNaGuarnicao = new ArrayList<>();
    }
    
    // Métodos para gerenciar fiscais
    public void adicionarFiscal(String fiscal) {
        fiscaisNaGuarnicao.add(fiscal);
        System.out.println("Fiscal " + fiscal + " adicionado à guarnição " + nome);
    }
    
    public void removerFiscal(String fiscal) {
        fiscaisNaGuarnicao.remove(fiscal);
        System.out.println("Fiscal " + fiscal + " removido da guarnição " + nome);
    }
    
    // Métodos para gerenciar veículos
    public void adicionarVeiculo(String veiculo) {
        carrosMotosNaGuarnicao.add(veiculo);
        System.out.println("Veículo " + veiculo + " adicionado à guarnição " + nome);
    }
    
    public void removerVeiculo(String veiculo) {
        carrosMotosNaGuarnicao.remove(veiculo);
        System.out.println("Veículo " + veiculo + " removido da guarnição " + nome);
    }
    
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public List<String> getFiscaisNaGuarnicao() { return fiscaisNaGuarnicao; }
    public void setFiscaisNaGuarnicao(List<String> fiscaisNaGuarnicao) { 
        this.fiscaisNaGuarnicao = fiscaisNaGuarnicao; 
    }
    
    public String getResponsavelPelaGuarnicao() { return responsavelPelaGuarnicao; }
    public void setResponsavelPelaGuarnicao(String responsavelPelaGuarnicao) { 
        this.responsavelPelaGuarnicao = responsavelPelaGuarnicao; 
    }
    
    public List<String> getCarrosMotosNaGuarnicao() { return carrosMotosNaGuarnicao; }
    public void setCarrosMotosNaGuarnicao(List<String> carrosMotosNaGuarnicao) { 
        this.carrosMotosNaGuarnicao = carrosMotosNaGuarnicao; 
    }
    
    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }
}
