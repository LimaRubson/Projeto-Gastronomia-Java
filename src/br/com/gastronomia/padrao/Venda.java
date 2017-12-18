package br.com.gastronomia.padrao;

import java.io.Serializable;

public class Venda implements Serializable {
	
	private String cliente;
	private String dataVenda;
	private String horaVenda;
	
	public Venda(String cliente, String dataVenda, String horaVenda) {
		
		this.cliente = cliente;
		this.dataVenda = dataVenda;
		this.horaVenda = horaVenda;
		
		
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
	
	public String getHoraVenda() {
		
		return this.horaVenda;
		
	}
	
	public void setHoraVenda(String horaVenda) {
		
		this.horaVenda = horaVenda;
		
	}
	
	
	

}
