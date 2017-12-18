package br.com.gastronomia.padrao;

public class Fachada {
	
	private ControlePedidos pedidos;
	private static Fachada instance;
	
	public Fachada() {
		
		pedidos = new ControlePedidos();
		
	}
	
	public static Fachada getInstance(){
		
		if (Fachada.instance == null){
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
		
	}
	
	public void cadastrar(PedidoAbstrato conta) {
		
		pedidos.cadastrar(conta);
		
	}
	
	public PedidoAbstrato procurar(String numero) {
		
		return pedidos.procurar(numero);
		
	}

}
