package br.com.gastronomia.padrao;

import java.util.ArrayList;

public class RepositorioPedidosArrayList implements RepositorioItensPedidosList {
	
	ArrayList<PedidoAbstrato> listaPedidos = new ArrayList<PedidoAbstrato>();



	@Override
	public boolean inserirPedido(PedidoAbstrato pedido) {
		
		try {
			
			listaPedidos.add(pedido);
			
		} catch (Exception e) {
			
			return false;
			
		}
		
		return true;
		
	}

	@Override
	public boolean removerPedido(String nomePedido) {
		
		for(int i = 0; i < listaPedidos.size(); i++) {
			
			if(listaPedidos.get(i).getPrato().getNome() == nomePedido) {
				
				listaPedidos.remove(i).getPrato();
				
				return true;
				
			}
			
		}
		
		return false;
	}

	@Override
	public String procurarPedido(String nomePedido) {
		
		String pedido = null;
		
		for(int i = 0; i < listaPedidos.size(); i++) {
			
			if(listaPedidos.get(i).getPrato().getNome() == nomePedido) {
				
				pedido = listaPedidos.get(i).getPrato().getNome();
				
			}
			
		}
		
		return pedido;
	}
	
}
