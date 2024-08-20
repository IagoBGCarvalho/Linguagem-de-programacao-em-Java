package negocio;

public class Pessoa {
    // Propriedades da classe
    private String nome = "";
    private String endereco = "";
    private String telefone = "";

    // Métodos cosntrutores da classe
    public Pessoa() {

    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome; // this. = propriedade da classe
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Métodos de acesso da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}