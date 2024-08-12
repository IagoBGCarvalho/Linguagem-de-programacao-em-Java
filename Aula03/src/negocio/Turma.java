package negocio;

public class Turma {
	// Propriedades da classe
	private Cadeira objCadeira = null;
	private Professor objProfessor = null;
	private String letra = "";
	private Aluno[] colecao = new Aluno[50];
	
	// Métodos construtores da classe
	public Turma() {
		super();
	}
	
	public Turma(Cadeira objCadeira, Professor objProfessor, String letra, Aluno[] colecao) {
		super();
		this.objCadeira = objCadeira;
		this.objProfessor = objProfessor;
		this.letra = letra;
		this.colecao = colecao;
	}
	
	// Métodos de acesso da classe
	public Cadeira getObjCadeira() {
		return objCadeira;
	}
	public void setObjCadeira(Cadeira objCadeira) {
		this.objCadeira = objCadeira;
	}
	public Professor getObjProfessor() {
		return objProfessor;
	}
	public void setObjProfessor(Professor objProfessor) {
		this.objProfessor = objProfessor;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public Aluno[] getColecao() {
		return colecao;
	}
	public void setColecao(Aluno[] colecao) {
		this.colecao = colecao;
	}
	
	// Métodos da classe
	private int matricula = 0;
	
	public void adicionarAluno(Aluno objAluno) {
		colecao[matricula] = objAluno;
		matricula ++;
	}
	
	public void listarAlunos() {
		System.out.println("Matrícula \t Nome");
		for (int i = 0; i < matricula; i++) {
			System.out.println(colecao[i].getMatrícula() + " \t " + colecao[i].getNome());
		}
	}
}
