package negocio;

public abstract class Animal {
	// Propriedades da classe
	private String nome = "";
	private double peso = 0;
	private double altura = 0;
	
	// Métodos construtores da classe
	public Animal() {
		super();
	}
	public Animal(String nome, double peso, double altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	
	// Métodos de acesso da classe
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	// Métodos da classe
	public double calcularIMC() {
		return (getPeso() / Math.pow(getAltura(), 2));
	}
}
