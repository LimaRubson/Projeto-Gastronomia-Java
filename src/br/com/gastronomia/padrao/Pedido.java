package br.com.gastronomia.padrao;

public class Pedido {
	
	private double valorTotalPedidos;
	private RepItensPedidos itemPedido;
	
	public Pedido(double valorTotalPedidos, RepItensPedidos itemPedido) {
		
		this.valorTotalPedidos = valorTotalPedidos;
		this.itemPedido = itemPedido;
		
	}
	
	public double getValorTotalPedidos() {
		
		return valorTotalPedidos;
		
	}
	
	public void setValorTotalPedidos(double valorTotalPedidos) {
		
		this.valorTotalPedidos = valorTotalPedidos;
		
	}
	
	public RepItensPedidos getItemPedido() {
		
		return itemPedido;
		
	}
	
	public void setItemPedido(RepItensPedidos itemPedido) {
		
		this.itemPedido = itemPedido;
		
	}

	

}
