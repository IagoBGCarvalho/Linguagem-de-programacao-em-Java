package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	// Propriedades da classe
	private JTextField txtNome = null;
	private JRadioButton optMasculino = null;
	private JTextField txtEndereco = null;
	private JComboBox<String> cboUf = null;
	
	// Método construtor cheio
	public ControladorLimpar(JTextField txtNome, JRadioButton optMasculino, JTextField txtEndereco,
			JComboBox<String> cboUf) {
		super();
		this.txtNome = txtNome;
		this.optMasculino = optMasculino;
		this.txtEndereco = txtEndereco;
		this.cboUf = cboUf;
	}
	
	// Método sobrescrito da interface
	public void actionPerformed(ActionEvent e) {
		txtNome.setText("");
		optMasculino.setSelected(true);
		txtEndereco.setText("");
		cboUf.setSelectedIndex(0);
	}

}
