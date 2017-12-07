package br.com.gastronomia.padrao;

public class Prato {
	
	private int id;
	private String nome;
	private String ingredientes;
	private Venda venda;
	
	
	public Prato(int id, String nome, String ingredientes, Venda venda) {
		
		this.id = id;
		this.nome = nome;
		this.ingredientes = ingredientes;
		this.venda = venda;
		
	}
	
	public int getId() {
		
		return id;
		
	}
	
	public void setId(int id) {
		
		this.id = id;
		
	}
	
	public String getNome() {
		
		return nome;
		
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	
	public String getIngredientes() {
		
		return ingredientes;
		
	}
	
	public void setIngredientes(String ingredientes) {
		
		this.ingredientes = ingredientes;
		
	}
	
	public Venda getVenda() {
		
		return venda;
		
	}
	
	public void setVenda(Venda venda) {
		
		this.venda = venda;
		
	}


}
