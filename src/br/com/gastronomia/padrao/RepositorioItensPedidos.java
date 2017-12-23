package br.com.gastronomia.padrao;

public interface RepositorioItensPedidos {
	
	public void inserirPedido(PedidoAbstrato pedido);
	public void atualizarPedido(PedidoAbstrato pedido);
	public PedidoAbstrato procurarPedido(String nomePedido);
	public void removerPedido(String nomePedido);
	
}
