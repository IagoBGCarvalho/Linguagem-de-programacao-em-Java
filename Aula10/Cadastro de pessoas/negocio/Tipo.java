package negocio;

import java.util.Collection;
import java.util.LinkedList;

public class Tipo {
	// Propriedades da classe
	private String descricao = "";
	
	// Métodos construtores da classe
	public Tipo() {
		super();
	}

	public Tipo(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	// Métodos de acesso da classe
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	// Métodos da classe
	public static Collection<Tipo> getTodos() throws Exception {
		LinkedList<Tipo> colecao = new LinkedList<Tipo>();
		
		colecao.add(new Tipo("Livraria"));
		colecao.add(new Tipo("Eletrodoméstico"));
		colecao.add(new Tipo("Informática"));
		colecao.add(new Tipo("Vestuário"));
		colecao.add(new Tipo("Cosmético"));
		
		return colecao;
	}
	

}
