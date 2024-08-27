package negocio;

public abstract class Ave extends Animal {
	// Propriedades da classe
	private int quantidadeOvos = 0;
	
	// Métodos construtores da classe
	public Ave() {
		super();
	}

	public Ave(String nome, double peso, double altura, int quantidadeOvos) {
		super(nome, peso, altura);
		this.quantidadeOvos = quantidadeOvos;
	}
	
	// Métodos de acesso da classe
	public int getQuantidadeOvos() {
		return quantidadeOvos;
	}

	public void setQuantidadeOvos(int quantidadeOvos) {
		this.quantidadeOvos = quantidadeOvos;
	}
}
