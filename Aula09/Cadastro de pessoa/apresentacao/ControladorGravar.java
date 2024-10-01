package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Pessoa;
import negocio.Uf;

public class ControladorGravar implements ActionListener {
	// Propriedades da classe
	private JTextField txtNome = null;
	private JRadioButton optMasculino = null;
	private JRadioButton optFeminino = null;
	private JTextField txtEndereco = null;
	private JComboBox<String> cboUf = null;
	
	// Método construtor cheio
	public ControladorGravar(JTextField txtNome, JRadioButton optMasculino, JRadioButton optFeminino,
			JTextField txtEndereco, JComboBox<String> cboUf) {
		super();
		this.txtNome = txtNome;
		this.optMasculino = optMasculino;
		this.optFeminino = optFeminino;
		this.txtEndereco = txtEndereco;
		this.cboUf = cboUf;
	}
	
	// Método implementado da interface
	public void actionPerformed(ActionEvent e) {
		// Críticas de dados
		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo nome obrigatório !");
			return;
		}
		
		if (txtEndereco.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo endereço obrigatório !");
			return;
		}
		
		if (cboUf.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo UF obrigatório!");
			return;
		}
		
		// Composição do objeto
		Pessoa objPessoa = new Pessoa();
		
		objPessoa.setNome(txtNome.getText());
		
		if (optMasculino.isSelected()) {
			objPessoa.setSexo("Masculino");
		} else if (optFeminino.isSelected()) {
			objPessoa.setSexo("Feminino");
		} else {
			objPessoa.setSexo("Não sei");
		}
		
		objPessoa.setEndereco(txtEndereco.getText());
		
		objPessoa.setObjUf(new Uf(cboUf.getSelectedItem().toString()));
		
		// Simulação de gravação
		JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso! \n\n" + "Nome: " + objPessoa.getNome() +
				"\n" + "Sexo: " + objPessoa.getSexo() + "\n" + "Endereço: " + objPessoa.getEndereco() + "\n" + 
				"UF: " + objPessoa.getObjUf().getSigla());
	}

}
