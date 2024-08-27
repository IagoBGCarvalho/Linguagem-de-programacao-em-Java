package negocio;

public abstract class Mamifero extends Animal {
	// Propriedades da classe
	private int litrosLeite = 0;
	
	// Métodos construtores da classe
	public Mamifero() {
		super();
	}

	public Mamifero(String nome, double peso, double altura, int litrosLeite) {
		super(nome, peso, altura);
		this.litrosLeite = litrosLeite;
	}
	
	// Métodos de acesso da classe
	public int getLitrosLeite() {
		return litrosLeite;
	}

	public void setLitrosLeite(int litrosLeite) {
		this.litrosLeite = litrosLeite;
	}
}
