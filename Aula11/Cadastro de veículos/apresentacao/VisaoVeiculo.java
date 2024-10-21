package apresentacao;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Fabricante;

public class VisaoVeiculo extends JFrame {
	
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JLabel lblFabricante = new JLabel("Fabricante");
	private JComboBox<String> cboFabricante = new JComboBox<String>();
	
	private JLabel lblModelo = new JLabel("Modelo");
	private JTextField txtModelo = new JTextField();
	
	private JLabel lblCor = new JLabel("Cor");
	private JComboBox<String> cboCor = new JComboBox<String>();
	
	private JCheckBox chkTetoSolar = new JCheckBox("Teto Solar");
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new VisaoVeiculo().setVisible(true);
	}
	
	// Método construtor da classe
	public VisaoVeiculo() {
		// Configuração da Janela
		setTitle("Cadastro de VeÍculos");
		setSize(400, 270);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// Fabricante
		lblFabricante.setBounds(10, 10, 200, 20);
		add(lblFabricante);
		cboFabricante.setBounds(10, 30, 200, 20);
		add(cboFabricante);
		cboFabricante.addItem("Selecione o fabricante");
		try {
			for (Fabricante objFabricante : Fabricante.getTodos()) {
				cboFabricante.addItem(objFabricante.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		// Modelo
		lblModelo.setBounds(10, 60, 200, 20);
		add(lblModelo);
		txtModelo.setBounds(10, 80, 365, 20);
		add(txtModelo);
		
		// Cor
		lblCor.setBounds(10, 110, 200, 10);
		add(lblCor);
		cboCor.setBounds(10, 130, 200, 20);
		add(cboCor);
		cboCor.addItem("-- Cor --");
		cboCor.addItem("Amarelo");
		cboCor.addItem("Azul");
		cboCor.addItem("Branco");
		cboCor.addItem("Cinza");
		cboCor.addItem("Prata");
		cboCor.addItem("Preto");
		cboCor.addItem("Vermelho");
		
		// Teto solar
		chkTetoSolar.setBounds(10, 160, 200, 20);
		add(chkTetoSolar);
		
		// Botões
		btnGravar.setBounds(20, 190, 100, 30);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(cboFabricante, txtModelo, cboCor, chkTetoSolar));
		
		btnLimpar.setBounds(140, 190, 100, 30);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(cboFabricante, txtModelo, cboCor, chkTetoSolar));
		
		btnSair.setBounds(260, 190, 100, 30);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
	}
}
