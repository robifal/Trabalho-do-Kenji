// public package Usuario;

public class Usuario {
    private String login;
    private String senha;
    private String nome;
    private String matricula;
    private String cpf;
    private String cnh;
    private String dataAdmissao;
    
    public Usuario(String nome, String matricula, String cpf, String cnh, String dataAdmissao) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.cnh = cnh;
        this.dataAdmissao = dataAdmissao;
        this.login = cpf.substring(0, 3); // 3 primeiros dígitos do CPF
        this.senha = cpf; // senha padrão = CPF completo
    }
    
    public void visualizarEscala() {
        System.out.println("Visualizando escala do usuário: " + nome);
    }
    
    // Getters e Setters
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
    
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    
    public String getCnh() { return cnh; }
    public void setCnh(String cnh) { this.cnh = cnh; }
    
    public String getDataAdmissao() { return dataAdmissao; }
    public void setDataAdmissao(String dataAdmissao) { this.dataAdmissao = dataAdmissao; }
}
