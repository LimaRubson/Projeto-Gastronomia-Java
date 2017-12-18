package br.com.gastronomia.padrao;

import java.util.ArrayList;

public interface RepositorioItensPedidosList {
	
	public boolean inserirPedido(PedidoAbstrato pedido);
	public boolean removerPedido(String nomePedido);
	public String procurarPedido(String nomePedido);

}
