package Guarnicao;

import java.util.ArrayList;
import java.util.List;
import Excecoes.CampoVazioException;
import Excecoes.GuarnicaoException;

public class GuarnicaoException {
    private String nome;
    private List<String> fiscaisNaGuarnicao;
    private String responsavelPelaGuarnicao;
    private List<String> carrosMotosNaGuarnicao;
    private String responsavel;
    
    public GuarnicaoException(String nome, String responsavelPelaGuarnicao, String responsavel)
            throws CampoVazioException {

        if (nome == null || nome.isBlank()) {
            throw new CampoVazioException("Nome da guarnição não pode ser vazio.");
        }
        if (responsavel == null || responsavel.isBlank()) {
            throw new CampoVazioException("Responsável não pode ser vazio.");
        }

        this.nome = nome;
        this.responsavelPelaGuarnicao = responsavelPelaGuarnicao;
        this.responsavel = responsavel;
        this.fiscaisNaGuarnicao = new ArrayList<>();
        this.carrosMotosNaGuarnicao = new ArrayList<>();
    }
    
    public void adicionarFiscal(String fiscal) throws GuarnicaoException {
        if (fiscal == null || fiscal.isBlank()) {
            throw new GuarnicaoException("Fiscal não pode ser vazio.");
        }
        fiscaisNaGuarnicao.add(fiscal);
        System.out.println("Fiscal " + fiscal + " adicionado à guarnição " + nome);
    }
    
    public void removerFiscal(String fiscal) throws GuarnicaoException {
        if (!fiscaisNaGuarnicao.contains(fiscal)) {
            throw new GuarnicaoException("Fiscal não encontrado na guarnição.");
        }
        fiscaisNaGuarnicao.remove(fiscal);
        System.out.println("Fiscal " + fiscal + " removido da guarnição " + nome);
    }
    
    public void adicionarVeiculo(String veiculo) throws GuarnicaoException {
        if (veiculo == null || veiculo.isBlank()) {
            throw new GuarnicaoException("Veículo inválido.");
        }
        carrosMotosNaGuarnicao.add(veiculo);
        System.out.println("Veículo " + veiculo + " adicionado à guarnição " + nome);
    }
    
    public void removerVeiculo(String veiculo) throws GuarnicaoException {
        if (!carrosMotosNaGuarnicao.contains(veiculo)) {
            throw new GuarnicaoException("Veículo não encontrado.");
        }
        carrosMotosNaGuarnicao.remove(veiculo);
        System.out.println("Veículo " + veiculo + " removido da guarnição " + nome);
    }

    // Getters e setters permanecem iguais...
}
