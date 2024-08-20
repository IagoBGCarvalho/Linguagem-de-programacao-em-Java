package negocio;

public class Aluno {
	
	// Propriedades da classe
	private int matrícula = 0;
	private String nome = "";
	
	// Métodos construtores da classe
	public Aluno() {
		super();
	}
	public Aluno(int matrícula, String nome) {
		super();
		this.matrícula = matrícula;
		this.nome = nome;
	}
	
	// Métodos de acesso da classe
	public int getMatrícula() {
		return matrícula;
	}
	public void setMatrícula(int matrícula) {
		this.matrícula = matrícula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
