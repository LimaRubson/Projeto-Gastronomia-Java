package br.com.gastronomia.padrao;

import java.util.ArrayList;
import java.util.LinkedList;

public class Aplicacao {

	public static void main(String[] args) {
		
		RepositorioPedidosArrayList ArrayList = new RepositorioPedidosArrayList();
		
		Venda venda = new Venda("Rubson Lima", "18/12/2017", "15:00");
		Prato prato = new Prato(1, "TortaSalgada", "Ovos, farinha-de-trigo e frango", venda);
		PedidoAbstrato pedido = new Pedido(2, 4, prato, 100, 2);
		
		Fachada.getInstance().cadastrar(pedido);
		
		System.out.println("\nArquivo: " + Fachada.getInstance().procurar(pedido.getPrato().getNome()).getPrato().getNome());
		
		ArrayList.inserirPedido(pedido);
		
		System.out.println("\nArrayList: " + ArrayList.procurarPedido(pedido.getPrato().getNome()));
		

	}

}
