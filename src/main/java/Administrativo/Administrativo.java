package Administrativo;

import Usuario.Usuario;
import Fiscal.Fiscal;

public class Administrativo extends Usuario {
    
    public Administrativo(String nome, String matricula, String cpf, String cnh, String dataAdmissao) {
        super(nome, matricula, cpf, cnh, dataAdmissao);
    }
    
    public void fazEscala() {
        System.out.println("Administrativo " + getNome() + " criou uma nova escala.");
    }
    
    public void controlOperacoes() {
        System.out.println("Administrativo " + getNome() + " está controlando as operações.");
    }
    
    public Fiscal criaFiscal(String nome, String matricula, String cpf, String cnh, String dataAdmissao, String guarnição) {
        return new Fiscal(nome, matricula, cpf, cnh, dataAdmissao, guarnição);
    }
}