package br.com.gastronomia.padrao;

public class Venda {
	
	private String cliente;
	private String dataVenda;
	private double horaVenda;
	private Pedido pedidoVendido;
	
	public Venda(String cliente, String dataVenda, double horaVenda, Pedido pedidoVendido) {
		
		this.cliente = cliente;
		this.dataVenda = dataVenda;
		this.horaVenda = horaVenda;
		this.pedidoVendido = pedidoVendido;
		
	}
	
	public String getCliente() {
		
		return this.cliente;
		
	}
	
	public void setCliente(String cliente) {
		
		this.cliente = cliente;
		
	}
	
	public String getDataVenda() {
		
		return this.dataVenda;
		
	}
	
	public void setDataVenda(String dataVenda) {
		
		this.dataVenda = dataVenda;
		
	}
	
	public double getHoraVenda() {
		
		return this.horaVenda;
		
	}
	
	public void setHoraVenda(double horaVenda) {
		
		this.horaVenda = horaVenda;
		
	}
	
	public Pedido getPedidoVendido() {
		
		return this.pedidoVendido;
		
	}
	
	public void setPedidoVendido(Pedido pedidoVendido) {
		
		this.pedidoVendido = pedidoVendido;
		
	}
	

}
