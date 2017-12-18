package br.com.gastronomia.padrao;

public class ControlePedidos {
	
	RepositorioItensPedidos pedidos = new RepositorioPedidosArquivo(); 
	
	public void cadastrar(PedidoAbstrato pedido) {
		pedidos.inserir(pedido);
	}
	
	public void remover (String numero) {
		pedidos.remover(numero);
	}
	
	public PedidoAbstrato procurar(String numero) {
		return pedidos.procurar(numero);
	}

}
