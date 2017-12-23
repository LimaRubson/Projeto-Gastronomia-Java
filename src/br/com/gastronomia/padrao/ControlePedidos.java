package br.com.gastronomia.padrao;

public class ControlePedidos {
	
	RepositorioItensPedidos pedidos =  new RepositorioPedidosArquivo();
	
	public void cadastrar(PedidoAbstrato pedido) {
		
		pedidos.inserirPedido(pedido);
		
	}
	
	public void remover(String nomePedido) {
		
		pedidos.removerPedido(nomePedido);
	}
	
	public PedidoAbstrato procurar(String nomePedido) throws PratoIndisponivelException {
		
		if(pedidos.procurarPedido(nomePedido) != null) {
			
			return pedidos.procurarPedido(nomePedido);
			
		}else {
			
			PratoIndisponivelException e;
			e = new PratoIndisponivelException(nomePedido);
			
			throw e;
			
		}
		
	}

}
