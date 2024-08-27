package negocio;

public class Aguia extends Ave {
	// Propriedades da classe
	private double autonomiaVoo = 0;
	
	// Métodos construtores da classe
	public Aguia() {
		super();
	}

	public Aguia(String nome, double peso, double altura, int quantidadeOvos, double autonomiaVoo) {
		super(nome, peso, altura, quantidadeOvos);
		this.autonomiaVoo = autonomiaVoo;
	}
	
	// Métodos de acesso da classe
	public double getAutonomiaVoo() {
		return autonomiaVoo;
	}

	public void setAutonomiaVoo(double autonomiaVoo) {
		this.autonomiaVoo = autonomiaVoo;
	}
	
	// Métodos da classe
	public void voar() {
		System.out.println("Voando ! voando !");
	}

}
