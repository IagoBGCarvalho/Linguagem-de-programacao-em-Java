package negocio;

public class Produto {
	// Propriedades da classe
	private String nome = "";
	private Tipo objTipo = null;
	private double preco = 0;
	
	// Métodos construtores da classe
	public Produto() {
		super();
	}

	public Produto(String nome, Tipo objTipo, double preco) {
		super();
		this.nome = nome;
		this.objTipo = objTipo;
		this.preco = preco;
	}
	
	// Métodos de acesso da classe

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getObjTipo() {
		return objTipo;
	}

	public void setObjTipo(Tipo objTipo) {
		this.objTipo = objTipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
