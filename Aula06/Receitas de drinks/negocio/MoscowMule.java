package negocio;

public class MoscowMule extends Drink implements Mixer {
	public void misturar() {
		super.adicionar(new Ingrediente("Vodka", 50, "ml"));
		super.adicionar(new Ingrediente("Limão", 4, "rodelas"));
		super.adicionar(new Ingrediente("Açucar", 5, "g"));
		super.adicionar(new Ingrediente("Gengibre", 15, "g"));
		super.adicionar(new Ingrediente("Gelo", 4, "pedras"));
		super.adicionar(new Ingrediente("Espuma de Gengibre", 20, "ml"));
	}
}