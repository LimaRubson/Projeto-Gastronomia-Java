package br.com.gastronomia.padrao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Caret;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gastronomia extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoData;
	private JTextField campoHora;
	private JTextField campoNomePrato;
	private JTextField campoIdPrato;
	private JTextField campoIngredientes;
	Venda venda = new Venda("", "", "");
	Prato prato = new Prato(0, "", "", venda);
	PedidoAbstrato pedido = new Pedido(0, 0, prato, 0, 0);
	private JLabel IdDoPrato;
	private JTextField campoPedido;
	private JLabel nomePedido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gastronomia frame = new Gastronomia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gastronomia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		campoNome = new JTextField();
		campoNome.setBounds(60, 22, 101, 20);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		JLabel nome = new JLabel("Nome:");
		nome.setBounds(10, 25, 46, 14);
		contentPane.add(nome);
		
		JLabel data = new JLabel("Data:");
		data.setBounds(10, 56, 46, 14);
		contentPane.add(data);
		
		campoData = new JTextField();
		campoData.setBounds(60, 53, 101, 20);
		contentPane.add(campoData);
		campoData.setColumns(10);
		
		JLabel hora = new JLabel("Hora");
		hora.setBounds(10, 88, 37, 14);
		contentPane.add(hora);
		
		campoHora = new JTextField();
		campoHora.setBounds(60, 85, 101, 20);
		contentPane.add(campoHora);
		campoHora.setColumns(10);
		
		JLabel nomePrato = new JLabel("Nome do prato:");
		nomePrato.setBounds(176, 56, 81, 14);
		contentPane.add(nomePrato);
		
		campoNomePrato = new JTextField();
		campoNomePrato.setBounds(267, 53, 101, 20);
		contentPane.add(campoNomePrato);
		campoNomePrato.setColumns(10);
		
		campoIdPrato = new JTextField();
		campoIdPrato.setBounds(267, 19, 101, 20);
		contentPane.add(campoIdPrato);
		campoIdPrato.setColumns(10);
		
		JLabel ingredientes = new JLabel("Ingredientes:");
		ingredientes.setBounds(176, 88, 70, 14);
		contentPane.add(ingredientes);
		
		campoIngredientes = new JTextField();
		campoIngredientes.setBounds(267, 85, 101, 20);
		contentPane.add(campoIngredientes);
		campoIngredientes.setColumns(10);
		
		IdDoPrato = new JLabel("ID do Prato:");
		IdDoPrato.setBounds(176, 25, 64, 14);
		contentPane.add(IdDoPrato);
		
		campoPedido = new JTextField();
		campoPedido.setBounds(126, 175, 183, 76);
		contentPane.add(campoPedido);
		campoPedido.setColumns(10);
		
		JButton AdicionarPedido = new JButton("Adicionar pedido");
		AdicionarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				venda.setCliente(campoNome.getText());
				venda.setDataVenda(campoData.getText());
				venda.setHoraVenda(campoHora.getText());
				
				prato.setId(campoIdPrato.getColumns());
				prato.setNome(campoNomePrato.getText());
				prato.setIngredientes(campoIngredientes.getText());
				prato.setVenda(venda);
				
				pedido.setQuantidadePrato(4);
				pedido.setPrato(prato);
				pedido.setValorTotal(25);
				pedido.setQuantidadeItensPedidos(1);
				pedido.setValorTotalPedidos(100);
				
				campoPedido.setText(pedido.toString().toString());
				
			}
		});
		AdicionarPedido.setBounds(152, 127, 133, 23);
		contentPane.add(AdicionarPedido);
		
		nomePedido = new JLabel("Pedido:");
		nomePedido.setBounds(199, 161, 46, 14);
		contentPane.add(nomePedido);
		
		
	}
}
