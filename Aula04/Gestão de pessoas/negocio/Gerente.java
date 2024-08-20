package negocio;

public class Gerente extends Colaborador{
	// Propriedades da classe
	private double bonus = 0;
	
	// Métodos construtores da classe

	public Gerente() {
		super();
	}

	public Gerente(int matricula, String nome, double salario, double bonus) {
		super(matricula, nome, salario); // Selecionar as prorpiedades da classe pai também
		this.bonus = bonus;
	}
	
	// Métodos de acesso da classe
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	// Métodos sobrescritos da classe
	public double getSalario() {
		return (super.getSalario() + this.getBonus());
	}
	
}
