package br.com.gastronomia.padrao;

public class RepItensPedidos {
	
	private int quantidadePrato;
	private Prato prato;
	private double valorTotal;
	
	public RepItensPedidos(int quantidadePrato, Prato prato, double valorTotal) {

		this.quantidadePrato = quantidadePrato;
		this.prato = prato;
		this.valorTotal = valorTotal;
		
	}
	
	public int getQuantidadePrato() {
		
		return quantidadePrato;
		
	}
	
	public void setQuantidadePrato(int quantidadePrato) {
		
		this.quantidadePrato = quantidadePrato;
		
	}
	
	public Prato getPrato() {
		
		return prato;
		
	}
	
	public void setPrato(Prato prato) {
		
		this.prato = prato;
		
	}
	
	public double getValorTotal() {
		
		return valorTotal;
		
	}
	
	public void setValorTotal(double valorTotal) {
		
		this.valorTotal = valorTotal;
		
	}


}
