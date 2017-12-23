package br.com.gastronomia.padrao;

public class PratoIndisponivelException extends Exception {
	
	private String nomePrato;

	public PratoIndisponivelException(String nomePrato) {
		
		super("Prato Indisponível");
		this.nomePrato = nomePrato;
		
	}

	public String getNomePrato() {
		return nomePrato;
	}

	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}
	
	
	
	
	
}
