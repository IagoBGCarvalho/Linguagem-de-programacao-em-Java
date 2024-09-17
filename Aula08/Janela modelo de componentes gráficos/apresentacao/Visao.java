package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Visao extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JMenuBar barraDeMenu = new JMenuBar();
	private JMenu mnuArquivo = new JMenu("Arquivo");
	private JMenuItem mniNovo = new JMenuItem("Novo");
	private JMenuItem mniAbrir = new JMenuItem("Abrir");
	private JMenuItem mniSair = new JMenuItem("Sair");
	private JMenu mnuEditar = new JMenu("Editar");
	private JMenuItem mniCopiar = new JMenuItem("Copiar");
	private JMenuItem mniColar = new JMenuItem("Colar");
	
	private JButton btnSair = new JButton("Sair");
	
	private JLabel lblTexto = new JLabel("Texto");
	private JTextField txtTexto = new JTextField();
	
	private JLabel lblTextoGrande = new JLabel("Texto grande");
	private JTextArea txtTextoGrande = new JTextArea();
	private JScrollPane jspTextoGrande = new JScrollPane(txtTextoGrande);
	
	private JLabel lblOpcoes = new JLabel("Opções");
	private JComboBox<String> cboOpcoes = new JComboBox<String>();
	
	private JCheckBox chkVerificacao = new JCheckBox("Verificação");
	
	private JLabel lblResposta = new JLabel("Resposta");
	private JRadioButton optSim = new JRadioButton("Sim");
	private JRadioButton optNao = new JRadioButton("Não");
	private JRadioButton optTalvez = new JRadioButton("Talvez");
	private ButtonGroup btgResposta = new ButtonGroup();
	
	private JLabel lblOpcoesAbertas = new JLabel("Opções Abertas");
	private JList<String> lstOpcoesAbertas = new JList<String>();
	private DefaultListModel<String> dlmOpcoesAbertas = new DefaultListModel<String>();
	private JScrollPane jspOpcoesAbertas = new JScrollPane(lstOpcoesAbertas);
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new Visao().setVisible(true);
	}
	
	// Método construtor da classe
	public Visao() {
		// Configuração da janela
		setTitle("Janela Exemplo de Utilização de Controles");
		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// Configuração do menu
		setJMenuBar(barraDeMenu);
		barraDeMenu.add(mnuArquivo);
		barraDeMenu.add(mnuEditar);
		mnuArquivo.add(mniNovo);
		mnuArquivo.add(mniAbrir);
		mnuArquivo.addSeparator();
		mnuArquivo.add(mniSair);
		mnuEditar.add(mniCopiar);
		mnuEditar.add(mniColar);
		
		// Configuração do action listener
		mniSair.addActionListener(new ControladorSair());
		mniCopiar.addActionListener(new ControladorCopiar());
		
		// Configuração do botão
		btnSair.setBounds(870, 650, 100, 30);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
		
		// Configuração da caixa de texto
		lblTexto.setBounds(10, 10, 200, 10);
		add(lblTexto);
		txtTexto.setBounds(10, 30, 500, 20);
		add(txtTexto);
		
		// Configuração da caixa de texto grande
		lblTextoGrande.setBounds(10, 60, 200, 20);
		add(lblTextoGrande);
		jspTextoGrande.setBounds(10, 80, 800, 200);
		add(jspTextoGrande);
		txtTextoGrande.setLineWrap(true);
		
		// Configuração da caixa de opções
		lblOpcoes.setBounds(10, 290, 200, 20);
		add(lblOpcoes);
		cboOpcoes.setBounds(10, 310, 200, 20);
		add(cboOpcoes);
		cboOpcoes.addItem("");
		cboOpcoes.addItem("Opção 1");
		cboOpcoes.addItem("Opção 2");
		cboOpcoes.addItem("Opção 3");
		cboOpcoes.addItem("Opção 4");
		cboOpcoes.addItem("Opção 5");
		
		// Configuração da check box
		chkVerificacao.setBounds(10, 340, 200, 20);
		add(chkVerificacao);
		
		// Configuração dos radio buttons
		lblResposta.setBounds(10, 370, 200, 20);
		add(lblResposta);
		optSim.setBounds(10, 390, 100, 20);
		add(optSim);
		optNao.setBounds(110, 390, 100, 20);
		add(optNao);
		optTalvez.setBounds(210, 390, 100, 20);
		add(optTalvez);
		btgResposta.add(optSim);
		btgResposta.add(optNao);
		btgResposta.add(optTalvez);
		optSim.setSelected(true);
		
		// COnfigurações da lista
		lblOpcoesAbertas.setBounds(10, 420, 200, 20);
		add(lblOpcoesAbertas);
		jspOpcoesAbertas.setBounds(10, 440, 800, 100);
		add(jspOpcoesAbertas);
		lstOpcoesAbertas.setModel(dlmOpcoesAbertas);
		dlmOpcoesAbertas.addElement("Opção 1");
		dlmOpcoesAbertas.addElement("Opção 2");
		dlmOpcoesAbertas.addElement("Opção 3");
		dlmOpcoesAbertas.addElement("Opção 4");
		dlmOpcoesAbertas.addElement("Opção 5");
		dlmOpcoesAbertas.addElement("Opção 6");
	}
}
