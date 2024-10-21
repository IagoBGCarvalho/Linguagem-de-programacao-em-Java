package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	// Propriedades da classe
	private JComboBox<String> cboFabricante = null;
	private JTextField txtModelo = null;
	private JComboBox<String> cboCor = null;
	private JCheckBox chkTetoSolar = null;
	
	// Método construtor cheio da classe
	public ControladorLimpar(JComboBox<String> cboFabricante, JTextField txtModelo, JComboBox<String> cboCor,
			JCheckBox chkTetoSolar) {
		super();
		this.cboFabricante = cboFabricante;
		this.txtModelo = txtModelo;
		this.cboCor = cboCor;
		this.chkTetoSolar = chkTetoSolar;
	}

	// Método implementado da interface
	public void actionPerformed(ActionEvent e) {
		cboFabricante.setSelectedIndex(0);
		txtModelo.setText("");
		cboCor.setSelectedIndex(0);
		chkTetoSolar.setSelected(false);
	}
}
