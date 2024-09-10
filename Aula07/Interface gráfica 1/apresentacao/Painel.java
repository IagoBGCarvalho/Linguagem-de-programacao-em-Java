package apresentacao;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	// Método sobrescrito da classe
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Céu
		g.setColor(Color.cyan);
		g.fillRect(0, 0, 800, 400);
		
		// Chão
		g.setColor(Color.green);
		g.fillRect(0, 400, 800, 200);
		
		// Sol
		g.setColor(Color.orange);
		g.fillOval(610, 40, 130, 130);
		g.setColor(Color.yellow);
		g.fillOval(630, 60, 90, 90);
		
		// Frente da casa
		g.setColor(Color.black);
		g.drawRect(40, 300, 150, 200);
		
		// Telhado da frente da casa
		g.drawLine(40, 300, 100, 140);
		g.drawLine(190, 300, 100, 140);
		
		// Lateral da casa
		g.drawLine(190, 300, 400, 250);
		g.drawLine(190, 500, 400, 450);
		g.drawLine(400, 250, 400, 450);
		
		// Telhado da lateral da casa
		g.drawLine(100, 140, 360, 100);
		g.drawLine(360, 100, 400, 250);
		
		// Boneco cabeçudo
		g.fillOval(540, 300, 50, 50); // Cabeça
		g.drawLine(565, 300, 565, 400); // Corpo
		g.drawLine(565, 400, 540, 450); // Perna esquerda
		g.drawLine(565, 400, 580, 450); // Perna Direita
		g.drawLine(530, 380, 600, 380); // Braços
	}
}
