package br.com.gastronomia.padrao;

public class ClienteVip extends Pessoa {
	
	
	private int idClienteVip;
	private Prato prato;
	
	public ClienteVip(String nome, String cpf, String rg, char sexo, Endereco endereco, String email, String telefone,
			String observacoes, int idClienteVip, Prato prato) {
		super(nome, cpf, rg, sexo, endereco, email, telefone, observacoes);
		
		this.idClienteVip = idClienteVip;
		this.prato = prato;
		
	}

	public int getIdClienteVip() {
		return idClienteVip;
	}

	public void setIdClienteVip(int idClienteVip) {
		this.idClienteVip = idClienteVip;
	}

	public Prato getPrato() {
		return prato;
	}

	public void setPrato(Prato prato) {
		this.prato = prato;
	}
	
	
	
	
	
	
	
	

}
