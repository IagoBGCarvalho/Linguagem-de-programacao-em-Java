package negocio;

public class Pessoa {
	
	// Propriedades da classe
	private String nome = "";
	private String sexo = "";
	private String endereco = "";
	private Uf objUf = null;
	
	// Métodos conmstrutores da classe
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String sexo, String endereco, Uf objUf) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.endereco = endereco;
		this.objUf = objUf;
	}
	
	// Métodos de acesso da classe
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Uf getObjUf() {
		return objUf;
	}

	public void setObjUf(Uf objUf) {
		this.objUf = objUf;
	}
}
