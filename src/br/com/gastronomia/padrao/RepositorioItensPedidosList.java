package br.com.gastronomia.padrao;

public interface RepositorioItensPedidosList {
	
	public boolean inserirPedido(PedidoAbstrato pedido);
	public boolean removerPedido(String nomePedido);
	public String procurarPedido(String nomePedido);

}
