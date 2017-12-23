package br.com.gastronomia.padrao;

public class Fachada {
	
	private ControlePedidos pedidos;
	private static Fachada instance;
	
	
	public Fachada() {
		
		pedidos = new ControlePedidos();
		
	}
	
	public static Fachada getInstance() {
		
		if(Fachada.instance == null) {
			
			Fachada.instance = new Fachada();
			
		}
		
		return Fachada.instance;
	}
	
	public void cadastrar(PedidoAbstrato pedido) {
		
		pedidos.cadastrar(pedido);
		
	}
	
	
	public PedidoAbstrato procurar(String nomePedido) throws PratoIndisponivelException {
		
		return pedidos.procurar(nomePedido);
		
	}
	
	public void remover(String nomePedido) {
		
		pedidos.remover(nomePedido);
		
	}

}
