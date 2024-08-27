package negocio;

public class Leopardo extends Mamifero {
	// Propriedades da classe
	private double velocidade = 0;
	
	// Métodos construtores da classe
	public Leopardo() {
		super();
	}

	public Leopardo(String nome, double peso, double altura, int litrosLeite, double velocidade) {
		super(nome, peso, altura, litrosLeite);
		this.velocidade = velocidade;
	}
	
	// Métodos de acesso da classe
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	// Métodos da classe
	public void correr() {
		System.out.println("Run Forest !!!");
	}
}
