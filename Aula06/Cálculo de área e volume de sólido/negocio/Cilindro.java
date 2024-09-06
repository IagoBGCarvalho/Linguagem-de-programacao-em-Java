package negocio;

public class Cilindro implements Solido {
	//Propriedades da classe
	private double raio = 0;
	private double altura = 0;
	
	//Metodos construtores da classe
	public Cilindro() {
		super();
	}

	public Cilindro(double raio, double altura) {
		super();
		this.raio = raio;
		this.altura = altura;
	}

	//Metodos de acesso da classe
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Metodos implementados da interface
	public double calcularArea() {
		return (2 * Math.PI * Math.pow(getRaio(),  2) + 2 * Math.PI * getRaio() * getAltura());
	}
	
	public double calcularVolume() {
		return (Math.PI * Math.pow(getRaio(), 2) * getAltura());
	}
}