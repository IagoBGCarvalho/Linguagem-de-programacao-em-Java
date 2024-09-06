package negocio;

public class OldFashion extends Drink implements Mixer {
	public void misturar() {
		super.adicionar(new Ingrediente("Whiskey", 50, "ml"));
		super.adicionar(new Ingrediente("Açucar", 1, "torrão"));
		super.adicionar(new Ingrediente("Laranja", 1, "fatia"));
		super.adicionar(new Ingrediente("Bitter", 1, "ml"));
		super.adicionar(new Ingrediente("Gelo", 1, "cubo"));
	}
}