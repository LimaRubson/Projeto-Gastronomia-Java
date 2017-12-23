package br.com.gastronomia.padrao;

import java.io.Serializable;

public abstract class PedidoAbstrato implements Serializable {
	
	private double valorTotalPedidos;
	private int quantidadePrato;
	private Prato prato;
	private double valorTotal;
	private int quantidadeItensPedidos;
	
	public PedidoAbstrato(double valorTotalPedidos, int quantidadePrato, Prato prato, double valorTotal,
			int quantidadeItensPedidos) {
		super();
		this.valorTotalPedidos = valorTotalPedidos;
		this.quantidadePrato = quantidadePrato;
		this.prato = prato;
		this.valorTotal = valorTotal;
		this.quantidadeItensPedidos = quantidadeItensPedidos;
	}
	
	
	public double getValorTotalPedidos() {
		return valorTotalPedidos;
	}
	public void setValorTotalPedidos(double valorTotalPedidos) {
		this.valorTotalPedidos = valorTotalPedidos;
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
	public int getQuantidadeItensPedidos() {
		return quantidadeItensPedidos;
	}
	public void setQuantidadeItensPedidos(int quantidadeItensPedidos) {
		this.quantidadeItensPedidos = quantidadeItensPedidos;
	}
	
}
