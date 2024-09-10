package apresentacao;

import javax.swing.JFrame;

public class Visao extends JFrame{
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	private Painel objPainel = new Painel();
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new Visao().setVisible(true);
	}
	
	// Método construtor da classe
	public Visao() {
		// Configuração da janela
		setTitle("Minha primeira janela Java");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// Configuração do painel
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
	}
}
