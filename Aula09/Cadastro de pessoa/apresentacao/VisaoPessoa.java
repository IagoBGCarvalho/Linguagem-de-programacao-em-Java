package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Uf;

public class VisaoPessoa extends JFrame {
	
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	private JLabel lblSexo = new JLabel("Sexo");
	private ButtonGroup btgSexo = new ButtonGroup();
	private JRadioButton optMasculino = new JRadioButton("Masculino");
	private JRadioButton optFeminino = new JRadioButton("Feminino");
	private JRadioButton optNaoSei = new JRadioButton("Não sei");
	
	private JLabel lblEndereco = new JLabel("Endereço");
	private JTextField txtEndereco = new JTextField();
	
	private JLabel lblUf = new JLabel("UF");
	private JComboBox<String> cboUf = new JComboBox<String>();
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new VisaoPessoa().setVisible(true);
	}
	
	// Método construtor da classe
	public VisaoPessoa() {
		// Configuração da janela
		setTitle("Cadastro de Pessoas");
		setSize(400, 270);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// Nome
		lblNome.setBounds(10, 10, 200, 20);
		add(lblNome);
		txtNome.setBounds(10, 30, 365, 20);
		add(txtNome);
		
		// Sexo
		lblSexo.setBounds(10, 60, 200, 20);
		add(lblSexo);
		optMasculino.setBounds(10, 80, 100, 20);
		add(optMasculino);
		optFeminino.setBounds(110, 80, 100, 20);
		add(optFeminino);
		optNaoSei.setBounds(210, 80, 100, 20);
		add(optNaoSei);
		btgSexo.add(optMasculino);
		btgSexo.add(optFeminino);
		btgSexo.add(optNaoSei);
		optMasculino.setSelected(true);
		
		// Endereço
		lblEndereco.setBounds(10, 110, 200, 20);
		add(lblEndereco);
		txtEndereco.setBounds(10, 130, 365, 20);
		add(txtEndereco);
		
		// UF
		lblUf.setBounds(10, 160, 200, 20);
		add(lblUf);
		cboUf.setBounds(10, 180, 80, 20);
		add(cboUf);
		cboUf.addItem("--- UF ---");
		try {
			for (Uf objUf : new Uf().getTodos()) {
				cboUf.addItem(objUf.getSigla());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		// Botões
		btnGravar.setBounds(20,  220, 100, 30);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtNome, optMasculino, optFeminino, txtEndereco, cboUf));
		
		btnLimpar.setBounds(140,  220, 100, 30);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(txtNome, optMasculino, txtEndereco, cboUf));
		
		btnSair.setBounds(260,  220, 100, 30);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
	}
}
