package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Uf {
	// Propriedades da classe
	private String sigla = "";
	
	// Métodos construtores da classe

	public Uf(String sigla) {
		super();
		this.sigla = sigla;
	}

	public Uf() {
		super();
	}
	
	// Métodos de acesso da classe
	
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	// Métodos da classe
	public Collection<Uf> getTodos() throws Exception {
		ArrayList<Uf> colecao = new ArrayList<Uf>();
		
		colecao.add(new Uf("AC"));
		colecao.add(new Uf("BA"));
		colecao.add(new Uf("CE"));
		colecao.add(new Uf("DF"));
		colecao.add(new Uf("ES"));
		colecao.add(new Uf("GO"));
		colecao.add(new Uf("SP"));
		
		return colecao;	
	}
}
