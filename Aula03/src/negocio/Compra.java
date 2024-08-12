package negocio;

public class Compra {
	// Propriedades da classe
	private Produto objProduto = null;
	private int quantidade = 0;
	private String data = "";
	private String carta = "";
	
	// Métodos construtores da classe
	
	public Compra() {
		super();
	}
	
	public Compra(Produto objProduto, int quantidade, String data, String carta) {
		super();
		this.objProduto = objProduto;
		this.quantidade = quantidade;
		this.data = data;
		this.carta = carta;
	}
	
	// Métodos de acesso da classe

	public Produto getObjProduto() {
		return objProduto;
	}

	public void setObjProduto(Produto objProduto) {
		this.objProduto = objProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCarta() {
		return carta;
	}

	public void setCarta(String carta) {
		this.carta = carta;
	}
}
