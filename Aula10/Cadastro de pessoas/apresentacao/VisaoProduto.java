package apresentacao;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.Tipo;

public class VisaoProduto extends JFrame {
	// Propiedades da classe
	private static final long serialVersionUID = 1L;
	
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	private JLabel lblPreco = new JLabel("Preço");
	private JTextField txtPreco = new JTextField();
	
	private JLabel lblTipo = new JLabel("Tipo");
	private JComboBox<String> cboTipo = new JComboBox<String>();
	
	private JCheckBox chkPerecivel = new JCheckBox("Perecível");
	
	private JLabel lblDescricao = new JLabel("Descrição");
	private JTextArea txtDescricao = new JTextArea();
	private JScrollPane jspDescricao = new JScrollPane(txtDescricao);
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new VisaoProduto().setVisible(true);
	}
	
	// Método construtor da classe
	public VisaoProduto() {
		// Confuguração da janela
		setTitle("Cadastro de produtos");
		setSize(400, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// Nome
		lblNome.setBounds(10, 10, 200, 20);
		add(lblNome);
		txtNome.setBounds(10, 30, 365, 20);
		add(txtNome);
		
		// Preço
		lblPreco.setBounds(10, 60, 200, 20);
		add(lblPreco);
		txtPreco.setBounds(10, 80, 100, 20);
		add(txtPreco);
		
		// Tipo
		lblTipo.setBounds(10, 110, 200, 20);
		add(lblTipo);
		cboTipo.setBounds(10, 130, 200, 20);
		add(cboTipo);
		cboTipo.addItem("");
		try {
			for (Tipo objTipo : Tipo.getTodos()) {
				cboTipo.addItem(objTipo.getDescricao());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		// Perecível
		chkPerecivel.setBounds(10, 160, 200, 20);
		add(chkPerecivel);
		
		// Descrição
		lblDescricao.setBounds(10, 190, 200, 20);
		add(lblDescricao);
		jspDescricao.setBounds(10, 210, 365, 200);
		add(jspDescricao);
		txtDescricao.setLineWrap(true);
		
		// Botões
		btnGravar.setBounds(20, 420, 100, 30);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtNome, txtPreco, cboTipo, chkPerecivel, txtDescricao));
		
		btnLimpar.setBounds(140, 420, 100, 30);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(txtNome, txtPreco, cboTipo, chkPerecivel, txtDescricao));
		
		btnSair.setBounds(260, 420, 100, 30);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
	}
}
